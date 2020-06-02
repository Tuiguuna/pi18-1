import java.awt.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

class Window extends Frame implements ActionListener{
    Label label;
    TextField textField;
    TextField textField2;
    TextField textField3;

    public Window(){
        setTitle("AWT Event Example");
        setLayout(null);

        Label al = new Label("a");
        textField = new TextField();
        al.setSize(40, 30 );
        al.setLocation(100, 100);
        textField.setSize(100,30);
        textField.setLocation(140,100);
        add(al);
        add(textField);
        textField.setVisible(true);

        Label bl = new Label("b");
        textField2 = new TextField();
        bl.setSize(40, 30 );
        bl.setLocation(100, 140);
        textField2.setSize(100,30);
        textField2.setLocation(140,140);
        add(bl);
        add(textField2);
        textField2.setVisible(true);

        Label suml = new Label("sum");
        textField3 = new TextField();
        suml.setSize(40, 30 );
        suml.setLocation(100, 180);
        textField3.setSize(100,30);
        textField3.setLocation(140,180);
        add(suml);
        add(textField3);
        textField3.setVisible(true);

        TextField at = new TextField();


        Button firstButton = new Button("Calculate");
        firstButton.setSize(120,30);
        firstButton.setLocation(100,300);
        firstButton.addActionListener(this);
        add(firstButton);

        Button secondButton = new Button("clear");
        secondButton.setSize(120,30);
        secondButton.setLocation(100,350);
        secondButton.addActionListener(this);
        add(secondButton);


        setSize(325, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Calculate")) {
            double a = Double.parseDouble(textField.getText());
            double b = Double.parseDouble(textField2.getText());
            double sum = a + b;
            textField3.setText(Double.toString(sum));
        } else {
            textField.setText("");
            textField2.setText("");
            textField3.setText("");
        }

    }


    public static void main(String[] args) {
        new Window();
    }
}
