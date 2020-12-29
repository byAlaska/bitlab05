package bitlab.askar.module2.lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JPanel {

    private MainFrame parent;


    public SecondPage(MainFrame parent) {

        String[] strings = {"Tech","Argo","Multi"};

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setLocation(100,50);
        nameLabel.setSize(100,30);
        add(nameLabel);

        JLabel surnameLabel = new JLabel("Surname:");
        surnameLabel.setLocation(100,100);
        surnameLabel.setSize(100,30);
        add(surnameLabel);

        JLabel facultyLabel = new JLabel("Faculty:");
        facultyLabel.setLocation(100,150);
        facultyLabel.setSize(100,30);
        add(facultyLabel);

        JLabel groupLabel = new JLabel("Group:");
        groupLabel.setLocation(100,200);
        groupLabel.setSize(100,30);
        add(groupLabel);

        JTextField nameField = new JTextField();
        nameField.setSize(200,30);
        nameField.setLocation(250,50);
        add(nameField);

        JTextField surnameField = new JTextField();
        surnameField.setLocation(250,100);
        surnameField.setSize(200,30);
        add(surnameField);

        JComboBox facultyBox = new JComboBox(strings);
        facultyBox.setLocation(250,150);
        facultyBox.setSize(200,30);
        add(facultyBox);

        JTextField groupField = new JTextField();
        groupField.setSize(200,30);
        groupField.setLocation(250,200);
        add(groupField);

        JButton addButton = new JButton("ADD");
        addButton.setLocation(100,350);
        addButton.setSize(200,30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String surname = surnameField.getText();
                String faculty = (String)facultyBox.getSelectedItem();
                String group = groupField.getText();

                Student student = new Student(name,surname,faculty,group);
                Main.students.add(student);

                nameField.setText("");
                surnameField.setText("");
                groupField.setText("");
            }
        });

        add(addButton);

        JButton back = new JButton("Back");
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
}
