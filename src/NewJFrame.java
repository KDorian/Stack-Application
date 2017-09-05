import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NewJFrame  extends JFrame{

    private JPanel panel;
    private JButton insertButton;
    private JButton deleteButton;
    private JTextArea textArea1;

    Stack obj = new Stack(10);

    public NewJFrame(){

        setContentPane(panel);


        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                int n = rand.nextInt(50) + 1;

                if(obj.push(n)){
                    textArea1.setText("Array: \n" + obj.toString() + "\nThe number of elements is: " + obj.itemCount);
                } else {
                    textArea1.setText("Array: \n" + obj.toString() + "\nThe number of elements is: " + obj.itemCount + "\nCould not insert data, stack is full.");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(obj.pop()){
                    textArea1.setText("Array: \n" + obj.toString() + "\nThe number of elements is: " + obj.itemCount);
                } else {
                    textArea1.setText("Array: \n" + obj.toString() + "\nThe number of elements is: " + obj.itemCount + "\nCould not retrieve data, stack is empty.");
                }
            }
        });
    }
}
