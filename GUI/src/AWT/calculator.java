package AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calculator extends Frame implements ActionListener{
    Label lable;
    TextField txtNum1,txtNum2,txtResult;
    Button btnClear,btnSum,btnMul,btnDev,btnExit,btnsub;
    public void setLable(Label label,int size,Color color){
        lable.setForeground(color);
        lable.setFont(new Font("", Font.BOLD, size));
    }
    public void setTextField(TextField textField,int size, Color color){
        textField.setForeground(color);
        textField.setFont(new Font("",Font.BOLD,size));   
    }
    public void setButton(Button btn,int size,Color fontColor,Color bgColor){
        btn.setForeground(fontColor);
        btn.setBackground(bgColor);
        btn.setFont(new Font("",Font.BOLD,size));
    }
    public calculator(){
        //title caculator
        lable = new Label ("CALCULATOR");
        lable.setBounds(350, 50, 210, 40);
        setLable(lable, 30, Color.WHITE);
        add(lable);
        
        //text file 1
        lable = new Label("Input X");
        lable.setBounds(100, 150, 100, 50);
        setLable(lable, 28, Color.WHITE);
        add(lable);
        
        txtNum1 = new TextField();
        txtNum1.setBounds(250, 150, 350, 40);
        setTextField(txtNum1, 28, Color.BLACK);
        add(txtNum1);
        //text file 2
        lable = new Label("Input Y");
        lable.setBounds(100, 230, 100, 50);
        setLable(lable, 28, Color.WHITE);
        add(lable);
        
        txtNum2 = new TextField();
        txtNum2.setBounds(250, 230, 350, 40);
        setTextField(txtNum2, 28, Color.BLACK);
        add(txtNum2);
        //Result
        lable = new Label("Result");
        lable.setBounds(100, 300, 100, 50);
        setLable(lable, 28, Color.WHITE);
        add(lable);
        
        txtResult = new TextField();
        txtResult.setBounds(250, 300, 350, 40);
        setTextField(txtResult, 28, Color.BLACK);
        add(txtResult);
        //btn dev
        
        btnDev = new Button("%");
        btnDev.setBounds(650, 150, 100, 40);
        setButton(btnDev, 28, Color.BLACK, Color.WHITE);
        add(btnDev);
        btnDev.addActionListener(this);
        //btn mul
        btnMul = new Button("X");
         btnMul.setBounds(650, 230, 100, 40);
        setButton( btnMul, 28, Color.BLACK, Color.WHITE);
        add( btnMul);
        btnMul.addActionListener(this);
        
        //btn sub
        btnsub= new Button("-");
        btnsub.setBounds(650, 300, 100, 40);
        setButton(  btnsub, 28, Color.BLACK, Color.WHITE);
        add(  btnsub);
        btnsub.addActionListener(this);
        
        //btn sum
        btnSum= new Button("+");
        btnSum.setBounds(650, 370, 100, 40);
        setButton(  btnSum, 28, Color.BLACK, Color.WHITE);
        add(  btnSum);
        btnSum.addActionListener(this);
        
         //btn clear
        btnClear= new Button("Clear");
        btnClear.setBounds(250, 370, 350, 40);
        setButton(  btnClear, 28, Color.BLACK, Color.WHITE);
        add(  btnClear); 
        btnClear.addActionListener(this);
        
        //btn exit
        btnExit= new Button("Exit");
        btnExit.setBounds(780, 540, 70, 40);
        setButton(  btnExit, 28, Color.BLACK, Color.WHITE);
        add(  btnExit);   
        btnExit.addActionListener(this);
        setSize(900,600);
        setLayout(null);
        setTitle("Calculator");
        setBackground(Color.BLUE);
        setLocationRelativeTo(this);
        setVisible(true);
    }
    public static void main(String[] args) {
        new calculator();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== btnExit){
            System.exit(0);
        }else if(e.getSource()==btnClear){
            txtNum1.setText("");
            txtNum2.setText("");
            txtResult.setText("");
       }else if(e.getSource()==btnSum){
           double x = Double.parseDouble(txtNum1.getText());
           double y = Double.parseDouble(txtNum2.getText());
           double sum = x+y;
           txtResult.setText(String.valueOf(sum));
       }else if(e.getSource()==btnMul){
           double x = Double.parseDouble(txtNum1.getText());
           double y = Double.parseDouble(txtNum2.getText());
           double sum = x*y;
           txtResult.setText(String.valueOf(sum));
       }else if(e.getSource()==btnsub){
           double x = Double.parseDouble(txtNum1.getText());
           double y = Double.parseDouble(txtNum2.getText());
           double sum = x-y;
           txtResult.setText(String.valueOf(sum));
       }else if(e.getSource()==btnDev){
           double x = Double.parseDouble(txtNum1.getText());
           double y = Double.parseDouble(txtNum2.getText());
           double sum = x%y;
           txtResult.setText(String.valueOf(sum));
       }
    }
}
