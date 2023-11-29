package component;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Alert {
    static public void showSuccess(String title,String message){
        JOptionPane.showMessageDialog(null, message, title, 1, new ImageIcon("D:/Moblie App/Java/GUI/src/component/icons8-success.gif"));
    }
    static public void showError(String title,String message){
        JOptionPane.showMessageDialog(null, message, title, 1, new ImageIcon("D:/Moblie App/Java/GUI/src/component/icons8-error.gif"));
    }
    static public int showWaring(String title,String message){
        return JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
}
