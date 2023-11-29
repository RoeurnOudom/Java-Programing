package AWT;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
public class Employee extends Frame implements ActionListener, WindowListener, MouseListener {
    Label label;
    JLabel lbImage;
    TextField txtId, txtName, txtSalary, txtImage;
    JRadioButton rbMale, rbFemale;
    ButtonGroup groupGender = new ButtonGroup();

    JTable table;
    DefaultTableModel defaultTableModel;
    JScrollPane js;
    Button btnImage, btnAdd, btnEdit, btnDelete, btnClear, btnExit;

    public void designLabel(Label label, int fontSize, Color fontColor) {
        label.setFont(new Font("Time New Romen", Font.BOLD, fontSize));
        label.setForeground(fontColor);
    }

    public void designTextField(TextField textField, int fontSize, Color fontColor) {
        textField.setFont(new Font("Time New Romen", Font.BOLD, fontSize));
        textField.setForeground(fontColor);
    }

    public void designButton(Button button, Color backgroudColor, int fontSize, Color fontColor) {
        button.setFont(new Font("Time New Romen", Font.PLAIN, fontSize));
        button.setForeground(fontColor);
        button.setBackground(backgroudColor);
    }

    Employee() {
        // title
        label = new Label("Employee Information");
        label.setBounds(450, 60, 350, 60);
        designLabel(label, 30, new Color(231, 25, 25));
        add(label);

        // information field
        // field id
        label = new Label("ID");
        label.setBounds(150, 150, 150, 30);
        designLabel(label, 20, new Color(0, 0, 0));
        add(label);

        txtId = new TextField();
        txtId.setBounds(300, 150, 300, 30);
        designTextField(txtId, 20, new Color(0, 0, 0));
        add(txtId);

        // field name
        label = new Label("Name");
        label.setBounds(150, 200, 150, 30);
        designLabel(label, 20, new Color(0, 0, 0));
        add(label);

        txtName = new TextField();
        txtName.setBounds(300, 200, 300, 30);
        designTextField(txtName, 20, new Color(0, 0, 0));
        add(txtName);

        // field gender
        label = new Label("Gender");
        label.setBounds(150, 250, 150, 30);
        designLabel(label, 20, new Color(0, 0, 0));
        add(label);
        
        // radio button male
        rbMale = new JRadioButton("Male");
        rbMale.setBackground(null);
        rbMale.setBounds(300, 250, 150, 30);
        rbMale.setFont(new Font("Time New Romen", Font.BOLD, 20));
        rbMale.setForeground(new Color(0, 0, 0));
        add(rbMale);
        groupGender.add(rbMale);
        
        // radio button male
        rbFemale = new JRadioButton("Female");
        rbFemale.setBackground(null);
        rbFemale.setBounds(450, 250, 150, 30);
        rbFemale.setFont(new Font("Time New Romen", Font.BOLD, 20));
        rbFemale.setForeground(new Color(0, 0, 0));
        add(rbFemale);
        groupGender.add(rbFemale);

        // field salary
        label = new Label("Salary");
        label.setBounds(150, 300, 150, 30);
        designLabel(label, 20, new Color(0, 0, 0));
        add(label);

        txtSalary = new TextField();
        txtSalary.setBounds(300, 300, 300, 30);
        designTextField(txtSalary, 20, new Color(0, 0, 0));
        add(txtSalary);

        // image
        lbImage = new JLabel();
        lbImage.setBounds(800, 150, 150, 150);
        lbImage.setBorder(BorderFactory.createLineBorder(Color.decode("#090A0C")));
        add(lbImage);

        btnImage = new Button("Brawe");
        btnImage.setBounds(800, 310, 150, 30);
        designButton(btnImage, Color.decode("#c0c0c0"), 18, Color.decode("#000000"));
        add(btnImage);

        txtImage = new TextField();
        setBounds(1, 1, 1, 1);
        add(txtImage);

        // table
        String[] header = {"Id", "Name", "Gender", "Salary", "Image"};
        table = new JTable();
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.setColumnIdentifiers(header);
        table.setModel(defaultTableModel);
        js = new JScrollPane(table);
        js.setBounds(150, 350, 900, 300);
        add(js);
        
        // btn add
        btnAdd = new Button("Add");
        btnAdd.setBounds(150, 680, 150, 30);
        designButton(btnAdd, Color.decode("#c0c0c0"), 18, Color.decode("#000000"));
        add(btnAdd);
        
        // btn edit
        btnEdit = new Button("Edit");
        btnEdit.setBounds(320, 680, 150, 30);
        designButton(btnEdit, Color.decode("#c0c0c0"), 18, Color.decode("#000000"));
        add(btnEdit);
        
        // btn delete
        btnDelete = new Button("Delete");
        btnDelete.setBounds(490, 680, 150, 30);
        designButton(btnDelete, Color.decode("#c0c0c0"), 18, Color.decode("#000000"));
        add(btnDelete);
        
        // btn clear
        btnClear = new Button("Clear");
        btnClear.setBounds(660, 680, 150, 30);
        designButton(btnClear, Color.decode("#c0c0c0"), 18, Color.decode("#000000"));
        add(btnClear);
        
        // btn exit
        btnExit = new Button("Exit");
        btnExit.setBounds(830, 680, 150, 30);
        designButton(btnExit, Color.decode("#c0c0c0"), 18, Color.decode("#000000"));
        add(btnExit);
        
        //add action
        btnAdd.addActionListener(this);
        btnClear.addActionListener(this);
        btnDelete.addActionListener(this);
        btnEdit.addActionListener(this);
        btnImage.addActionListener(this);
        btnExit.addActionListener(this);
        table.addMouseListener(this);

        setSize(1200, 800);
        setLayout(null);
        setLocationRelativeTo(this);
        setVisible(true);
        addWindowListener(this);
    }
    
    //get data
    void getData() {
        for (int i = 0; i < employee_model.list.size(); i++) {
            Object row[] = {
                employee_model.list.get(i).getId(),
                employee_model.list.get(i).getName(),
                employee_model.list.get(i).getGender(),
                employee_model.list.get(i).getSalary(),
                employee_model.list.get(i).getImage()
            };
            defaultTableModel.addRow(row);
        }
    }
    //clear data
    void clearData() {
        txtId.setText("");
        txtName.setText("");
        groupGender.clearSelection();
        txtSalary.setText("");
        txtImage.setText("");
        lbImage.setIcon(null);
    }

    public static void main(String[] args) {
        new Employee();

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnImage) {
            //add image
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            File file = fileChooser.getSelectedFile();
            String fileName = file.getAbsolutePath();
            txtImage.setText(fileName);
            ImageIcon imageIcon = new ImageIcon(fileName);
            Image scaledImage = imageIcon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
            lbImage.setIcon(new ImageIcon(scaledImage));
        } else if (e.getSource() == btnAdd) {
            //add data
                int id = Integer.parseInt(txtId.getText());
                String name = txtName.getText();
                String gender = (rbMale.isSelected()) ? "Male" : "Female";
                double salary = Double.parseDouble(txtSalary.getText());
                String image = txtImage.getText();
                employee_model.list.add(new employee_model(id, name, gender, salary, image));
                defaultTableModel.setRowCount(0);
                getData();
                clearData();
        } else if (e.getSource() == btnEdit) {
            //edit data
            int id = Integer.parseInt(txtId.getText());
            String name = txtName.getText();
            String gender = (rbMale.isSelected()) ? "Male" : "Female";
            double salary = Double.parseDouble(txtSalary.getText());
            String image = txtImage.getText();
            int row = table.getSelectedRow();
            employee_model.list.set(row, new employee_model(id, name, gender, salary, image));
            defaultTableModel.setRowCount(0);
            getData();
            clearData();
        } else if (e.getSource() == btnDelete) {
            //delete data
            int row = table.getSelectedRow();
            employee_model.list.remove(row);
            defaultTableModel.setRowCount(0);
            getData();
            clearData();
        } else if (e.getSource() == btnClear) {
            //clear data
            employee_model.list.clear();
            getData();
            defaultTableModel.setRowCount(0);
            clearData();
        } else if (e.getSource() == btnExit) {
            //exit data
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        DefaultTableModel newModel = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        txtId.setText(newModel.getValueAt(row, 0).toString());
        txtName.setText(newModel.getValueAt(row, 1).toString());
        String gender = (newModel.getValueAt(row, 2).toString());
        if ("Male".equals(gender)) {
            rbMale.setSelected(true);
        } else {
            rbFemale.setSelected(true);
        }
        txtSalary.setText(newModel.getValueAt(row, 3).toString());
        txtImage.setText(newModel.getValueAt(row, 4).toString());
        ImageIcon imageIcon = new ImageIcon(newModel.getValueAt(row, 4).toString());
        Image scaledImage = imageIcon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
        lbImage.setIcon(new ImageIcon(scaledImage));

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
