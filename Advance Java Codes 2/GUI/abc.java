package GUI;

import java.awt.*;
import java.awt.event.*;

public class abc implements ActionListener
{  
    static TextField tf = new TextField();
    public static  void main(String[] args)
     {  
        Frame f=new Frame("anynonymous");  
       
        tf.setBounds(50,50, 150,20);  
        Button b=new Button("Click Here");  
        b.setBounds(50,100,60,30);  
        //2nd step  
      
        f.add(b);
        f.add(tf);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
        
    b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
                tf.setText("Welcome to Javatpoint.");  
        }  
        });
    }
    //public void actionPerformed(ActionEvent e){  
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
       // tf.setText("Welcome");  
}


