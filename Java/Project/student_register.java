import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;

public class student_register extends JFrame implements ActionListener {
  private JTextField t1, t2, t3, t4, t5, t6;
  private Container c;
  private JButton b1, b2, b3, b4;
  private JLabel j, j1, j2, j3, j4, j5;
  private JTable tb;
  private JScrollPane jp;
  private DefaultTableModel model;
  private String col[] = { "Frist name", "Last name", "Department", "CGPA" };
  private String row[] = new String[4];

  // private Font f;
  student_register() {
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    table();
  }

  public void table() {
    c = this.getContentPane();
    this.setLayout(null);
    c.setBackground(Color.pink);

    j = new JLabel();
    j.setText("DATA FORME");
    j.setBounds(230, 40, 300, 20);
    c.add(j);

    j1 = new JLabel();
    j1.setBounds(72, 90, 250, 30);
    j1.setText("First name");
    c.add(j1);

    t1 = new JTextField();
    t1.setBounds(150, 90, 250, 30);
    t1.setBackground(Color.white);
    c.add(t1);

    j2 = new JLabel();
    j2.setBounds(72, 140, 250, 30);
    j2.setText("Last name");
    c.add(j2);

    t2 = new JTextField();
    t2.setBounds(150, 140, 250, 30);
    t2.setBackground(Color.white);
    c.add(t2);

    j3 = new JLabel();
    j3.setBounds(72, 190, 250, 30);
    j3.setText("Department");
    c.add(j3);

    t3 = new JTextField();
    t3.setBounds(150, 190, 250, 30);
    t3.setBackground(Color.white);
    c.add(t3);

    j4 = new JLabel();
    j4.setBounds(72, 240, 250, 30);
    j4.setText("CGPA");
    c.add(j4);

    t4 = new JTextField();
    t4.setBounds(150, 240, 250, 30);
    t4.setBackground(Color.white);
    c.add(t4);

    b1 = new JButton("Submit");
    b1.setBounds(80, 350, 80, 30);
    c.add(b1);

    b2 = new JButton("cancel");
    b2.setBounds(200, 350, 80, 30);
    c.add(b2);

    b3 = new JButton("Update");
    b3.setBounds(500, 130, 80, 30);
    c.add(b3);

    b4 = new JButton("Delate");
    b4.setBounds(500, 180, 80, 30);
    c.add(b4);

    tb = new JTable(20, 6);

    model = new DefaultTableModel();
    model.setColumnIdentifiers(col);
    tb.setModel(model);
    tb.setRowHeight(30);

    jp = new JScrollPane(tb);
    jp.setBounds(10, 400, 650, 300);
    c.add(jp);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    tb.addMouseListener(new MouseAdapter() {

      public void mouseClicked(MouseEvent e) {
        int a = tb.getSelectedRow();

        String n1 = model.getValueAt(a, 0).toString();
        String n2 = model.getValueAt(a, 1).toString();
        String n3 = model.getValueAt(a, 2).toString();
        String n4 = model.getValueAt(a, 3).toString();

        t1.setText(n1);
        t2.setText(n2);
        t3.setText(n3);
        t4.setText(n4);

      }

    });

  }

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == b1) {
      row[0] = t1.getText();
      row[1] = t2.getText();
      row[2] = t3.getText();
      row[3] = t4.getText();

      model.addRow(row);

    } else if (e.getSource() == b2) {
      t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
    } else if (e.getSource() == b3) {
      int p = tb.getSelectedRow();

      String n = t1.getText();
      String m = t2.getText();
      String o = t3.getText();
      String s = t4.getText();
      model.setValueAt(n, p, 0);
      model.setValueAt(m, p, 1);
      model.setValueAt(o, p, 2);
      model.setValueAt(s, p, 3);

    }

  }

  public static void main(String[] args) {

    student_register sc = new student_register();
    sc.setVisible(true);
    sc.setBounds(150, 30, 700, 750);
    sc.setTitle("DATAFROME");

  }

}
