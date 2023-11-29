package Demo;

import javax.swing.JOptionPane;

public class Test3 {
    public static void main(String[] args) {
        String start, middle, end, result;
        start="Talk is cheap.";
        middle="Show me the code.";
        end="-Linus Torvalds";
        
        result= start + middle + end;
        JOptionPane.showMessageDialog(null, result); //
    }
}
