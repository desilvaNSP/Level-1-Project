/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author DELL
 */
public class ApplyTheme {
    public static void Theme2(){
        try {
            try {
                UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(ApplyTheme.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ParseException ex) {
            Logger.getLogger(ApplyTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Theme(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApplyTheme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ApplyTheme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ApplyTheme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ApplyTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void Themen(){
        try {
            UIManager.setLookAndFeel(new SynthLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ApplyTheme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
