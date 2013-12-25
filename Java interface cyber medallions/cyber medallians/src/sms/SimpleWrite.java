/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;

import java.io.*;
import java.util.*;
import org.smslib.helper.CommPortIdentifier;
import org.smslib.helper.SerialPort;

public class SimpleWrite extends Thread{
    static Enumeration portList;
    static CommPortIdentifier portId;
    static String messageString;
    static SerialPort serialPort;
    static OutputStream outputStream;

    @Override
	public void run()
	{
	}

    public OutputStream simpleWrite(String message) {
        System.out.println(message);
        portList = CommPortIdentifier.getPortIdentifiers();
	messageString=message;
        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                 if (portId.getName().equals("COM5")) {


                        serialPort = (SerialPort)portId.open("SimpleWrite", 2000);



                        outputStream = serialPort.getOutputStream();




                        serialPort.setSerialPortParams(9600,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
			serialPort.setFlowControlMode( SerialPort.FLOWCONTROL_RTSCTS_IN |SerialPort.FLOWCONTROL_RTSCTS_OUT);




                    try {


                        System.out.println("Giyaaa");
			outputStream.write(messageString.getBytes());
			serialPort.close();
                    } catch (IOException e)
			{
			System.out.println(e);
			}
                }
            }
        }return outputStream;

 }
}
