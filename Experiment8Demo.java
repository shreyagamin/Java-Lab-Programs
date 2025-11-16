import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Experiment8Frame extends JFrame implements ActionListener {

    JButton add, avg, max;
    JTextField tbox1, tbox2, tbox3;
    JLabel lab1, lab2, lab3;

    public Experiment8Frame() {
        makeGUI();
    }

    private void makeGUI() {
        setLayout(new FlowLayout());

        lab1 = new JLabel("First Number: ");
        lab2 = new JLabel("Second Number: ");
        lab3 = new JLabel("Third Number: ");

        tbox1 = new JTextField(10);
        tbox2 = new JTextField(10);
        tbox3 = new JTextField(10);

        add = new JButton("ADD");
        avg = new JButton("AVG");
        max = new JButton("MAX");

        add.addActionListener(this);
        avg.addActionListener(this);
        max.addActionListener(this);

        add(lab1); add(tbox1);
        add(lab2); add(tbox2);
        add(lab3); add(tbox3);

        add(add);
        add(avg);
        add(max);
    }

    public void actionPerformed(ActionEvent ae) {
        float n1, n2, n3;

        try {
            n1 = Float.parseFloat(tbox1.getText());
            n2 = Float.parseFloat(tbox2.getText());
            n3 = Float.parseFloat(tbox3.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numeric values!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        float result = 0;

        if (ae.getActionCommand().equals("ADD")) {
            result = n1 + n2 + n3;
        }
        else if (ae.getActionCommand().equals("AVG")) {
            result = (n1 + n2 + n3) / 3;
        }
        else if (ae.getActionCommand().equals("MAX")) {
            result = Math.max(n1, Math.max(n2, n3));
        }

        JOptionPane.showMessageDialog(this,
                "Result: " + result,
                "Output",
                JOptionPane.INFORMATION_MESSAGE);
    }
}


public class Experiment8Demo {
    public static void main(String[] args) {
        Experiment8Frame win = new Experiment8Frame();
        win.setTitle("5th D Section");
        win.setSize(500, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.getContentPane().setBackground(Color.PINK);
        win.setVisible(true);
    }
}

