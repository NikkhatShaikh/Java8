package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow {
    public static void main(String[] args) {

        //window : object Frame 
        JFrame jFrame = new JFrame("My Window");
        jFrame.setSize(400, 400);
        jFrame.setLayout(new FlowLayout());


        //create Button and add jFrame


        JButton jButton = new JButton("click Me !!!");
        jFrame.add(jButton);

        // using anonymous  class
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("button clicked !");
//                JOptionPane.showMessageDialog(null, "Hey Button Clicked !!! ");
//            }
//        });

        //using lambda function

//        jButton.addActionListener((ActionEvent e) -> {
//            System.out.println("button clicked !");
//            JOptionPane.showMessageDialog(null, "Hey Button Clicked !!! ");
//
//        });


        // no need to pass return type - if having single line code inside lambda no need to {} too.
        jButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Hey Its working !!!"));

        // Anonymous class can override all methods from interface -
        // but lambda function can work with only @Functional Interface - which having single Abstract Method
        jButton.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
