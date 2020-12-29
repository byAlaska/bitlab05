package bitlab.askar.module2.lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JPanel {
    private MainFrame parent;

    private JLabel label;
    private JTextArea area;
    private JButton back;

    public FirstPage(MainFrame parent) {

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        area = new JTextArea();
        area.setLocation(50,100);
        area.setSize(450,300);
        add(area);


        back = new JButton("Back");
        back.setSize(300,30);
        back.setLocation(400,400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }

    public void updateArea(){
        area.setText("");
        for (Student s:Main.students){
            area.append(s.toString() + "\n");
        }
        add(area);
    }
}
