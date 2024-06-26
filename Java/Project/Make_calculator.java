import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Make_calculator extends JFrame implements ActionListener {
  private ImageIcon icon, icon1;
  private Container c;
  private JPanel jp, jp1;
  private GridLayout gl;
  private JTextField text;
  private JLabel label;
  private Font f, f1;
  double number1 = 0, number2 = 0, result = 0;
  char operator;
  Date m;
  LocalTime tm;
  JButton[] nemberofbutton = new JButton[10];
  JButton[] fucntionofbutton = new JButton[11];
  JButton[] radiousbutton = new JButton[6];
  JButton[] logbutton = new JButton[10];
  JButton add, sub, div, diviton, deci, clr, equl, multi, DC, date, time;
  JButton sin, cos, tan, sqrt;
  JButton log, ln, pow, sq, inv, BIN, OCT, HEX;

  Make_calculator() {
    setResizable(true);

    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    icon = new ImageIcon(getClass().getResource("icon.png"));
    this.setIconImage(icon.getImage());

    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.black);
    button();
  }

  public void button() {

    f = new Font("Bahnschrift Light", Font.BOLD, 40);

    text = new JTextField();
    text.setBounds(40, 10, 400, 80);
    text.setFont(f);
    text.setBackground(Color.black);
    text.setForeground(Color.white);
    text.setEditable(true);
    c.add(text);

    f1 = new Font("Bahnschrift SemiLight", Font.BOLD, 20);
    add = new JButton("+");
    add.setBackground(Color.magenta);
    add.setForeground(Color.white);
    add.setFont(f1);
    sub = new JButton("-");
    sub.setForeground(Color.white);
    sub.setBackground(Color.magenta);
    sub.setFont(f1);
    multi = new JButton("x");
    multi.setBackground(Color.magenta);
    multi.setFont(f1);
    multi.setForeground(Color.white);
    diviton = new JButton("/");
    diviton.setBackground(Color.magenta);
    diviton.setFont(f1);
    diviton.setForeground(Color.white);
    deci = new JButton(".");
    deci.setFont(f1);

    clr = new JButton("AC");
    clr.setFont(f1);
    clr.setBackground(Color.magenta);
    clr.setForeground(Color.white);

    DC = new JButton("DC");
    DC.setBackground(Color.magenta);
    DC.setForeground(Color.white);
    DC.setFont(f1);
    equl = new JButton("=");
    equl.setFont(f1);
    date = new JButton("Date");
    date.setFont(f1);
    date.setForeground(Color.white);
    date.setBackground(Color.magenta);

    time = new JButton("Time");
    time.setFont(f1);
    time.setForeground(Color.white);
    time.setBackground(Color.magenta);
    sin = new JButton("sin");
    sin.setFont(f1);
    sin.setForeground(Color.black);

    cos = new JButton("cos");
    cos.setFont(f1);
    cos.setForeground(Color.black);
    // cos.setBackground(Color.white);

    tan = new JButton("tan");
    tan.setFont(f1);
    tan.setForeground(Color.black);
    // tan.setBackground(Color.white);

    sqrt = new JButton("sqrt");
    sqrt.setFont(f1);
    sqrt.setForeground(Color.white);
    sqrt.setBackground(Color.magenta);

    log = new JButton("log");
    log.setFont(f1);
    log.setForeground(Color.white);
    log.setBackground(Color.magenta);

    ln = new JButton("ln");
    ln.setFont(f1);
    ln.setForeground(Color.white);
    ln.setBackground(Color.magenta);

    pow = new JButton("pow");
    pow.setFont(f1);
    pow.setForeground(Color.white);
    pow.setBackground(Color.magenta);

    sq = new JButton("sq");
    sq.setFont(f1);
    sq.setForeground(Color.white);
    sq.setBackground(Color.magenta);

    inv = new JButton("inv");
    inv.setFont(f1);
    inv.setForeground(Color.white);
    inv.setBackground(Color.magenta);

    BIN = new JButton("bin");
    BIN.setFont(f1);
    BIN.setForeground(Color.black);
    // BIN.setBackground(Color.white);

    OCT = new JButton("oct");
    OCT.setFont(f1);
    OCT.setForeground(Color.black);
    // OCT.setBackground(Color.white);

    HEX = new JButton("hex");
    HEX.setFont(f1);
    HEX.setForeground(Color.black);

    fucntionofbutton[0] = add;
    fucntionofbutton[1] = sub;
    fucntionofbutton[2] = multi;
    fucntionofbutton[3] = diviton;
    fucntionofbutton[4] = deci;
    fucntionofbutton[5] = DC;
    fucntionofbutton[6] = clr;
    fucntionofbutton[7] = equl;
    fucntionofbutton[8] = date;
    fucntionofbutton[9] = time;

    radiousbutton[0] = sin;
    radiousbutton[1] = cos;
    radiousbutton[2] = tan;
    radiousbutton[3] = sqrt;

    logbutton[0] = log;
    logbutton[1] = ln;
    logbutton[2] = pow;
    logbutton[3] = sq;
    logbutton[4] = inv;
    logbutton[5] = BIN;
    logbutton[6] = OCT;
    logbutton[7] = HEX;
    for (int i = 0; i < 8; i++) {

      logbutton[i].addActionListener(this);
      logbutton[i].setFocusable(false);
    }

    // second;
    for (int i = 0; i < 4; i++) {

      radiousbutton[i].addActionListener(this);
      radiousbutton[i].setFocusable(false);
    }

    // frist;
    for (int i = 0; i < 10; i++) {
      fucntionofbutton[i].addActionListener(this);
      fucntionofbutton[i].setFocusable(false);

    }
    for (int i = 0; i < 10; i++) {

      nemberofbutton[i] = new JButton(String.valueOf(i));

      nemberofbutton[i].addActionListener(this);
      ;
      nemberofbutton[i].setFont(f1);
      nemberofbutton[i].setFocusable(false);

    }
    gl = new GridLayout(8, 4, 2, 1);

    jp = new JPanel(gl);
    jp.setBackground(Color.black);
    jp.setBounds(40, 100, 400, 380);
    c.add(jp);

    jp.add(fucntionofbutton[8]);
    jp.add(fucntionofbutton[9]);
    jp.add(logbutton[0]);
    jp.add(logbutton[1]);

    jp.add(logbutton[2]);
    jp.add(logbutton[3]);
    jp.add(logbutton[4]);
    jp.add(radiousbutton[3]);

    jp.add(logbutton[5]);
    jp.add(logbutton[6]);
    jp.add(logbutton[7]);
    jp.add(add);

    jp.add(radiousbutton[0]);
    jp.add(radiousbutton[1]);
    jp.add(radiousbutton[2]);
    jp.add(sub);

    jp.add(nemberofbutton[1]);
    jp.add(nemberofbutton[2]);
    jp.add(nemberofbutton[3]);
    jp.add(multi);

    jp.add(nemberofbutton[4]);
    jp.add(nemberofbutton[5]);
    jp.add(nemberofbutton[6]);
    jp.add(diviton);

    jp.add(nemberofbutton[7]);
    jp.add(nemberofbutton[8]);
    jp.add(nemberofbutton[9]);
    jp.add(fucntionofbutton[5]);

    jp.add(nemberofbutton[0]);
    jp.add(deci);
    jp.add(equl);
    jp.add(fucntionofbutton[6]);

    c.add(jp);

  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == date) {
      m = new Date();
      DateFormat datefomate = new SimpleDateFormat("dd/MM/YYYY");
      String name = datefomate.format(m);
      text.setText(name);
    } else if (e.getSource() == time) {

      tm = LocalTime.now();

      DateTimeFormatter time1 = DateTimeFormatter.ofPattern("hh:mm:ss");

      String name1 = tm.format(time1);
      text.setText(name1);

    } else if (e.getSource() == logbutton[0]) {
      number1 = Double.parseDouble(text.getText());
      result = Math.log10(number1);
      text.setText(String.valueOf(result));
    } else if (e.getSource() == logbutton[1]) {
      number1 = Double.parseDouble(text.getText());
      result = Math.log(number1);
      text.setText(String.valueOf(result));

    } else if (e.getSource() == radiousbutton[3]) {

      number1 = Double.parseDouble(text.getText());
      result = Math.sqrt(number1);
      text.setText(String.valueOf(result));
    } else if (e.getSource() == logbutton[4]) {
      number1 = Double.parseDouble(text.getText());
      result = 1 / (number1);
      text.setText(String.valueOf(result));
    } else if (e.getSource() == logbutton[3]) {

      number1 = Double.parseDouble(text.getText());
      result = number1 * number1;
      text.setText(String.valueOf(result));
    } else if (e.getSource() == logbutton[5]) {
      int nazmul = Integer.parseInt(text.getText());
      String name = Integer.toBinaryString(nazmul);
      text.setText(String.valueOf(name));
    } else if (e.getSource() == logbutton[6]) {
      int nazmul = Integer.parseInt(text.getText());
      String name = Integer.toOctalString(nazmul);
      text.setText(String.valueOf(name));
    }

    else if (e.getSource() == logbutton[7]) {
      int nazmul = Integer.parseInt(text.getText());
      String name = Integer.toHexString(nazmul);
      String name1 = name.toUpperCase();
      text.setText(String.valueOf(name1));
    }

    else if (e.getSource() == radiousbutton[0]) {
      number1 = Double.parseDouble(text.getText());
      if (number1 == 180 || number1 == 360) {
        text.setText("0");
      } else {
        result = Math.sin(Math.toRadians(number1));
        text.setText(String.valueOf(result));
      }
    } else if (e.getSource() == radiousbutton[1]) {
      number1 = Double.parseDouble(text.getText());
      result = Math.cos(Math.toRadians(number1));
      text.setText(String.valueOf(result));
    } else if (e.getSource() == radiousbutton[2]) {
      number1 = Double.parseDouble(text.getText());
      if (number1 == 90 || number1 == 270) {
        text.setText("Math Error");
      } else {
        result = Math.tan(Math.toRadians(number1));
        text.setText(String.valueOf(result));
      }
    } else if (e.getSource() == radiousbutton[3]) {
      number1 = Double.parseDouble(text.getText());
      result = (Math.sqrt(number1));
      text.setText(String.valueOf(result));
    }

    else {

      for (int i = 0; i < 10; i++) {

        if (e.getSource() == nemberofbutton[i]) {

          text.setText(text.getText().concat(String.valueOf(i)));
        }
      }
      if (e.getSource() == deci) {
        text.setText(text.getText().concat("."));
      }
      if (e.getSource() == logbutton[2]) {
        number1 = Double.parseDouble(text.getText());
        operator = 'p';
        text.setText("");

      }
      if (e.getSource() == add) {
        number1 = Double.parseDouble(text.getText());
        operator = '+';
        text.setText("");

      }
      if (e.getSource() == sub) {
        number1 = Double.parseDouble(text.getText());
        operator = '-';
        text.setText("");

      }
      if (e.getSource() == multi) {
        number1 = Double.parseDouble(text.getText());
        operator = 'x';
        text.setText("");

      }
      if (e.getSource() == DC) {
        text.setText("");
      }
      if (e.getSource() == diviton) {
        number1 = Double.parseDouble(text.getText());
        operator = '/';
        text.setText("");

      }
      if (e.getSource() == equl) {
        number2 = Double.parseDouble(text.getText());
        if (operator == '+')
          result = number1 + number2;

        else if (operator == '-')
          result = number1 - number2;

        else if (operator == 'x')
          result = number1 * number2;
        else if (operator == '/')
          result = number1 / number2;

        else if (operator == 'p')
          result = Math.pow(number1, number2);
        text.setText(String.valueOf(result));
      }
    }

  }

  public static void main(String[] args) {

    Make_calculator sc = new Make_calculator();
    sc.setVisible(true);
    sc.setBounds(120, 30, 540, 600);
    sc.setTitle("CALCULATOR");

  }
}
