import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMI_Calculator extends JFrame implements ActionListener {
    private JTextField txtHeight, txtWeight, txtBMI;
    private JButton btnCalculate;
    
    public BMI_Calculator() {
        setTitle("BMI Calculator");
        setSize(397, 224);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel lblHeight = new JLabel("Chiều cao (m): ");
        txtHeight = new JTextField();
        inputPanel.add(lblHeight);
        inputPanel.add(txtHeight);
        
        JLabel lblWeight = new JLabel("Cân nặng (kg):");
        txtWeight = new JTextField();
        inputPanel.add(lblWeight);
        inputPanel.add(txtWeight);
        
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        
        btnCalculate = new JButton("Tính");
        btnCalculate.addActionListener(this);
        buttonPanel.add(btnCalculate);
        
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel lblBMI = new JLabel("BMI: ");
        txtBMI = new JTextField();
        txtBMI.setEditable(false);
        resultPanel.add(lblBMI, BorderLayout.WEST);
        resultPanel.add(txtBMI, BorderLayout.CENTER);
        
        getContentPane().add(resultPanel, BorderLayout.SOUTH);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            calculateBMI();
        }
    }
    
    private void calculateBMI() {
        try {
            double height = Double.parseDouble(txtHeight.getText());
            double weight = Double.parseDouble(txtWeight.getText());
            
            double bmi = weight / (height * height);
            txtBMI.setText(String.format("%.2f", bmi));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid height and weight.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
