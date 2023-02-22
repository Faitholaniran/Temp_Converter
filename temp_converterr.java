import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class temp_converterr extends JFrame{
    private JTextField celsius;
    private JPanel panel1;
    private JButton convertButton;
    private JLabel lblfahrenheit;
    private JLabel lblcelsius;

    public temp_converterr(String title) {
        title = "ssssimiit";
        setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double cel = Double.parseDouble(celsius.getText());
                double fah = (cel * 1.8) + 32;
                lblcelsius.setText(fah + "");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new temp_converterr("temperature converter");
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}