import java.lang.Math;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;

public class mathProblems extends JPanel{
    static boolean tf = false;
    static int xpos = 10;
    static int tempans = 0;
    static int ypos = 20;  
    static int xanspos = 120;
    static int yanspos = 20;
    static int[] arrayx = new int[19];
    static int[] arrayy = new int[19];
    static int[] arrayans = new int[19];
    static String[] arrayop = new String[19];
    public static void main(String[]args){
        mathProblems mp = new mathProblems();
        mp.go();
    }
    public void go(){
        JButton ansbutton = new JButton("Answer");
        ansbutton.setBounds(140,5,60,50);
        
        JFrame frame = new JFrame("Math Test");
        frame.add(ansbutton);
        DrawPanel drawpanel = new DrawPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(drawpanel);
        frame.setSize(200,500);
        frame.setLocation(0,0);
        frame.setResizable(false);
        frame.setVisible(true);
        int x = 0;
        int y = 0;
        String z = "";
        int zrand = 0;
        String[] arrayz = new String[19];
        for(int count = 0; count <= 18; count++){
            x = (int)(Math.random() * 200) + 1;
            y = (int)(Math.random() * 200) + 1;
            zrand = (int)(Math.random() * 4) + 1;
            if(zrand == 1){
                arrayop[count] = "+";
            }else if(zrand == 2){
                arrayop[count] = "-";
            }else if(zrand == 3){
                arrayop[count] = "*";
            }else{
                arrayop[count] = "%";
            }
            if(x > y){
                arrayx[count] = x;
                arrayy[count] = y;
            }else if(y > x || x == y){
                arrayx[count] = y;
                arrayy[count] = x;
            }
        }

        for(int cc = 0; cc <= 18; cc++){
            if(arrayop[cc].equals("+")){
                tempans = arrayx[cc] + arrayy[cc];
            }else if(arrayop[cc].equals("-")){
                tempans = arrayx[cc] - arrayy[cc];
            }else if(arrayop[cc].equals("*")){
                tempans = arrayx[cc] * arrayy[cc];
            }else{
                tempans = arrayx[cc] % arrayy[cc];
            }
            arrayans[cc] = tempans;
        }
            ansbutton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    for(int countt = 0; countt <= 18; countt++){
                        String xx = Integer.toString(arrayans[countt]);
                        //g.drawString(xx,xanspos,yanspos);
                        System.out.println(xx);
                        yanspos += 25;
                    }
                }
            });
        
    }

    class DrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            for(int counter = 0; counter <= 18; counter++){
                String xx = arrayx[counter] + arrayop[counter] + arrayy[counter] + " =";
                g.drawString(xx,xpos,ypos);
                ypos += 25;
            }
        }
    }
}
