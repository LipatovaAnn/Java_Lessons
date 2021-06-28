package ru.geekbrains.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork7 {

public static class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("My app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600,300,400,400);
        JButton button1=new JButton("Start");
        JButton button2=new JButton("Finish");
        JTextArea area = new JTextArea();
        Timer timer=new Timer(5000,new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent ev) {
                area.append("\r\nПрошло 5 секунд");

        }});
        area.setEditable(false);
        add(area, BorderLayout.CENTER);
        add(button1, BorderLayout.NORTH);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
                area.append("\r\nТаймер запущен");
            }
        });
        add(button2, BorderLayout.SOUTH);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.append("\r\nТаймер остановлен");
                timer.stop();
            }
        });
        setVisible(true);
    }
}
public static void main(String[] args) {
    new MyWindow();
}
}
