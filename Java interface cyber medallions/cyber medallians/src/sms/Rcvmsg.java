/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.smslib.AGateway;
import org.smslib.AGateway.GatewayStatuses;
import org.smslib.AGateway.Protocols;
import org.smslib.GatewayException;
import org.smslib.ICallNotification;
import org.smslib.IGatewayStatusNotification;
import org.smslib.IInboundMessageNotification;
import org.smslib.IOrphanedMessageNotification;
import org.smslib.InboundMessage;
import org.smslib.InboundMessage.MessageClasses;
import org.smslib.Library;
import org.smslib.Message.MessageTypes;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.smslib.crypto.AESKey;
import org.smslib.modem.SerialModemGateway;

public class Rcvmsg {
    public String msg2;
    public String getMessage() throws Exception {
        String port=new GetPort().comport();

        //  String port=new GetPort().comport();
        // Define a list which will hold the read messages.
        List<InboundMessage> msgList;
        // Create the notification callback method for inbound & status report
        // messages.
        InboundNotification inboundNotification = new InboundNotification();
        // Create the notification callback method for inbound voice calls.
        CallNotification callNotification = new CallNotification();
        //Create the notification callback method for gateway statuses.
        GatewayStatusNotification statusNotification = new GatewayStatusNotification();
        OrphanedMessageNotification orphanedMessageNotification = new OrphanedMessageNotification();
        try {

            System.out.println(Library.getLibraryDescription());
            System.out.println("Version: " + Library.getLibraryVersion());
            // Create the Gateway representing the serial GSM modem.
            SerialModemGateway gateway = new SerialModemGateway("modem."+port, port, 115200, "Huawei", "");
            // Set the modem protocol to PDU (alternative is TEXT). PDU is the default, anyway...
            gateway.setProtocol(Protocols.PDU);
            // Do we want the Gateway to be used for Inbound messages?
            gateway.setInbound(true);
            // Do we want the Gateway to be used for Outbound messages?
            gateway.setOutbound(true);
            // Let SMSLib know which is the SIM PIN.
            gateway.setSimPin("0000");
            // Set up the notification methods.
            Service.getInstance().setInboundMessageNotification(inboundNotification);
            Service.getInstance().setCallNotification(callNotification);
            Service.getInstance().setGatewayStatusNotification(statusNotification);
            Service.getInstance().setOrphanedMessageNotification(orphanedMessageNotification);
            // Add the Gateway to the Service object.
            Service.getInstance().addGateway(gateway);
            // Similarly, you may define as many Gateway objects, representing
            // various GSM modems, add them in the Service object and control all of them.
            // Start! (i.e. connect to all defined Gateways)
            Service.getInstance().startService();
            // Printout some general information about the modem.
                       /* Date date1=new Date();
            SimpleDateFormat sd1=new SimpleDateFormat("HH:mm:ss");
            // SimpleDateFormat sd2=new SimpleDateFormat("yyyy/MM/dd");
            String time= sd1.format(date1);
            // String date= sd2.format(date1);*/

            System.out.println();
            System.out.println("Modem Information:");
            System.out.println("  Manufacturer: " + gateway.getManufacturer());
            System.out.println("  Model: " + gateway.getModel());
            System.out.println("  Serial No: " + gateway.getSerialNo());
            System.out.println("  SIM IMSI: " + gateway.getImsi());
            System.out.println("  Signal Level: " + gateway.getSignalLevel() + " dBm");
            System.out.println("  Battery Level: " + gateway.getBatteryLevel() + "%");
            System.out.println();
            // In case you work with encrypted messages, its a good time to declare your keys.
            // Create a new AES Key with a known key value.
            // Register it in KeyManager in order to keep it acti.ve. SMSLib will then automatically
            // encrypt / decrypt all messages send to / received from this number.
            //Service.getInstance().getKeyManager().registerKey("+306948494037", new AESKey(new SecretKeySpec("0011223344556677".getBytes(), "AES")));
            // Read Messages. The reading is done via the Service object and
            // affects all Gateway objects defined. This can also be more directed to a specific
            // Gateway - look the JavaDocs for information on the Service method calls.
            msgList = new ArrayList<InboundMessage>();

            //Service.getInstance().readMessages(msgList, MessageClasses.ALL);
            for (InboundMessage msg : msgList) {
                //if(sd1.format(msg.getDate()).equals(time
               // Service.getInstance().deleteMessage(msg);
               // System.out.println(msg.getText());



                //   }

            }
            // Sleep now. Emulate real world situation and give a chance to the notifications
            // methods to be called in the event of message or voice call reception.
            System.out.println("Now Sleeping - Hit <enter> to stop service.");
            System.in.read();
            System.in.read();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Please Connect The GSM Modem");
        } finally {
            Service.getInstance().stopService();
        }
        return msg2;
    }

    public class InboundNotification implements IInboundMessageNotification {

        public void process(AGateway gateway, MessageTypes msgType, InboundMessage msg) {
            if (msgType == MessageTypes.INBOUND) {
                System.out.println(">>> New Inbound message detected from Gateway: " + gateway.getGatewayId());
            } else if (msgType == MessageTypes.STATUSREPORT) {
                System.out.println(">>> New Inbound Status Report message detected from Gateway: " + gateway.getGatewayId());
            }
            System.out.println(msg.getText());
            msg2=msg.getText();
           // MsgIdentifier msin=new MsgIdentifier();
            
                try {
                    Service.getInstance().deleteMessage(msg);
                } catch (TimeoutException ex) {
                    Logger.getLogger(Rcvmsg.class.getName()).log(Level.SEVERE, null, ex);
                } catch (GatewayException ex) {
                    Logger.getLogger(Rcvmsg.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Rcvmsg.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Rcvmsg.class.getName()).log(Level.SEVERE, null, ex);
                }
           

        }
    }

    public class CallNotification implements ICallNotification {

        public void process(AGateway gateway, String callerId) {
            System.out.println(">>> New call detected from Gateway: " + gateway.getGatewayId() + " : " + callerId);
        }
    }

    public class GatewayStatusNotification implements IGatewayStatusNotification {

        public void process(AGateway gateway, GatewayStatuses oldStatus, GatewayStatuses newStatus) {
            System.out.println(">>> Gateway Status change for " + gateway.getGatewayId() + ", OLD: " + oldStatus + " -> NEW: " + newStatus);
        }
    }

    public class OrphanedMessageNotification implements IOrphanedMessageNotification {

        public boolean process(AGateway gateway, InboundMessage msg) {
            System.out.println(">>> Orphaned message part detected from " + gateway.getGatewayId());
            

            // Since we are just testing, return FALSE and keep the orphaned message part.
            return false;
        }
    }

    public static void main(String args[]){
     //   Rcvmsg app = new Rcvmsg();
       
      
            try {
          //  app.getMessage();
        } catch (Exception exception) {
        exception.printStackTrace();
        }
     
    }
}
