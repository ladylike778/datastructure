
import sun.swing.UIAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Main {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        LinkedList ll=new LinkedList();
        LinkedList ll2=new LinkedList();
        JButton buy=new JButton("new deal");
        JButton show=new JButton("show");
        JButton show1=new JButton("show result");
        JButton clear=new JButton("clear");
        JLabel lb1=new JLabel("KEY:");
        JLabel lb2=new JLabel();
        JFrame mf=new JFrame();
        mf.setVisible(true);
        mf.setBounds(100,100,800,500);
        mf.setLayout(null);
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        buy.setBounds(50,100,100,50);
        show.setBounds(50,200,120,50);
        show1.setBounds(50,300,120,50);
        clear.setBounds(200,200,120,50);
        mf.add(buy);
        mf.add(show);
        mf.add(show1);
        mf.add(clear);
        lb1.setBounds(160,100,50,50);
        mf.add(lb1);
        lb2.setBounds(230,100,100,50);
        mf.add(lb2);
        String[] RegSNContent = {
                "0","1","2","3","4","5","6","7","8","9",
                "A","B","C","D","E","F","G","H","I","J",
                "K","L","M","N","O","P","Q","R","S","T",
                "U","V","W","X","Y","Z","a","b","c","d",
                "e","f","g","h","i","j","k","l","m","n","o",
                "p","q","r","s","t","u","v","w","x","y","z"};
        buy.addActionListener(e -> {
            String src="";
            for(int i=0;i<9;i++) {
                src += RegSNContent[(int) (Math.random() * RegSNContent.length)];
            }lb2.setText(src);
            ll.add(src);
            String input=JOptionPane.showInputDialog("解密結果");
            JOptionPane.showMessageDialog(null,input);
            ll2.add(input);
        });
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,ll);
            }
        });show1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,ll2);
            }
        });clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    ll.clear();

            }
        });


    }

}









