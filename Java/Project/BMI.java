import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame {
    private static Container container;
    private static Font font;
    private static JPanel panel;
    private static ImageIcon icon;
    private double number1, number2;

    BMI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.green);
        this.setTitle("BMI Calculation");
        body();

    }
    public static void body() {
        panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBounds(0, 2, 600, 100);
        font = new Font("Bahnschrift Light", Font.BOLD, 60);
        JLabel label = new JLabel();
        label.setText("Body Mass Index");
        label.setBounds(0, 0, 800, 50);
        label.setFont(font);
        panel.add(label);
        container.add(panel);

        Font font2 = new Font("Bahnschrift Light", Font.BOLD, 30);
        JLabel label2 = new JLabel();
        label2.setBounds(50, 70, 150, 150);
        label2.setText("Weight");
        label2.setFont(font2);
        container.add(label2);
        JTextField textField1 = new JTextField();
        textField1.setBounds(165, 130, 180, 40);
        container.add(textField1);

        JLabel label3 = new JLabel();
        label3.setText("Height");
        label3.setBounds(50, 130, 150, 150);
        label3.setFont(font2);
        container.add(label3);
        JTextField textField2 = new JTextField();
        textField2.setBounds(165, 190, 180, 40);
        container.add(textField2);

        JLabel label4 = new JLabel();
        label4.setText("BMI");
        label4.setFont(font2);
        label4.setBounds(50, 250, 150, 150);
        container.add(label4);

        JButton button = new JButton();
        button.setBounds(120, 305, 120, 40);
        button.setBackground(Color.CYAN);
        container.add(button);

        Font font3 = new Font("Bahnschrift Light", Font.BOLD, 25);
        JLabel label5 = new JLabel();
        label5.setFont(font3);
        label5.setBounds(320, 250, 300, 150);
        container.add(label5);

        Font font4 = new Font("Bahnschrift Light", Font.BOLD, 20);

        JButton button2 = new JButton();
        button2.setBounds(100, 370, 130, 40);
        button2.setFont(font4);
        button2.setText("Submit");
        button2.setBackground(Color.MAGENTA);
        container.add(button2);

        JButton button3 = new JButton();
        button3.setText("Clear");
        button3.setBounds(250, 370, 120, 40);
        button3.setFont(font4);
        button3.setBackground(Color.MAGENTA);
        container.add(button3);

        JButton button4 = new JButton();
        button4.setBounds(400, 370, 120, 40);
        button4.setText("Cancel");
        button4.setFont(font4);
        button4.setBackground(Color.MAGENTA);
        container.add(button4);

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(ABORT);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String str = textField1.getText().toString();
                String str1 = textField2.getText().toString();

                if (str.equals("") || str1.equals("")) {

                    JOptionPane.showMessageDialog(null, "Please Compleate Your Weight and Height",
                            null, JOptionPane.WARNING_MESSAGE);

                } else {
                    double number1 = Double.parseDouble(textField2.getText()) / 3.281;
                    double number2 = Double.parseDouble(textField1.getText());

                    double number = Math.round((number2 / (number1 * number1)) * 100) / 100.0;
                    button.setText(String.valueOf(number));

                    if (number < 18.5) {
                        label5.setText("Underweight");
                    } else if (number >= 18.5 && number <= 24.99) {
                        label5.setText("Normal weight");
                    } else if (number >= 25.0 && number <= 29.99) {
                        label5.setText("Overweight");
                    } else if (number >= 30.0 && number <= 34.99) {
                        label5.setText("Class 1 obesity");
                    } else if (number >= 35.0 && number <= 39.99) {
                        label5.setText("Class 2 obesity");
                    } else if (number > 39.99) {
                        label5.setText("Class 3 obesity");
                    } else {
                        label5.setText("sory");
                    }

                }
            }
        });

        JPanel panel3 = new JPanel();
        panel3.setBounds(0, 630, 600, 50);
        panel3.setBackground(Color.lightGray);

        JButton button5 = new JButton();
        button5.setBounds(5, 150, 130, 40);
        button5.setText("<18.5");
        button5.setBackground(Color.ORANGE);
        panel3.add(button5);

        JButton button6 = new JButton();
        button6.setBounds(5, 150, 130, 40);
        button6.setText("18.5-24.99");
        button6.setBackground(Color.ORANGE);
        panel3.add(button6);

        JButton button7 = new JButton();
        button7.setBounds(5, 150, 110, 40);
        button7.setText("25-29.99");
        button7.setBackground(Color.ORANGE);
        panel3.add(button7);

        JButton button8 = new JButton();
        button8.setBounds(5, 150, 110, 40);
        button8.setText("30-34.99");
        button8.setBackground(Color.ORANGE);
        panel3.add(button8);
        JButton button9 = new JButton();
        button9.setBounds(5, 150, 110, 40);
        button9.setText("35-39.99");
        button9.setBackground(Color.ORANGE);
        panel3.add(button9);

        JButton button10 = new JButton();
        button10.setBounds(5, 150, 130, 40);
        button10.setText("<40");
        button10.setBackground(Color.ORANGE);
        panel3.add(button10);
        container.add(panel3);

    }

    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.setVisible(true);
        bmi.setBounds(300, 50, 600, 700);

    }

}
