package AWT;
import java.awt.*;
    public class Test extends Frame{
        Label label;
        Button btn;
    public Test(){
        label = new Label("Hello World");
        label.setBounds(150, 190, 120, 20);
        //add font
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        //add color
        label.setForeground(Color.red);
        add(label);
        //add button
        btn = new Button("Click");
        btn.setBounds(130, 220, 120, 30);
        btn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn.setBackground(new Color(242, 152, 167));
        add(btn);
        //show
        setSize(400, 400);
        setLayout(null);
        //middle
        setLocationRelativeTo(this);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }
}