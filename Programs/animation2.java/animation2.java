import javax.swing.*;
import java.awt.*;

public class animation2{
    int y = 300;
    int x = 300;
    int xchange = 2;
    int ychange = 3;
    int counter = 0;
    public static void main(String[]args){
        animation2 ball = new animation2();
        ball.start();
    }
    
    public void start(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawPanel drawpanel = new DrawPanel();
        
        frame.getContentPane().add(drawpanel);
        frame.setSize(630,630);
        frame.setVisible(true);
        JTextField text = new JTextField(counter);
        text.setBounds(1,1,30,30);
        frame.add(text, BorderLayout.SOUTH);
        text.setEditable(false);
        text.setVisible(true);
        
        for(int l = 1; l > 0; l++){
            for(int j = 1; j <= 200; j++){
                    y += ychange;
                    drawpanel.repaint();
                    
                    x += xchange;
                    drawpanel.repaint();
                    try{
                        Thread.sleep(10);
                    }catch(Exception ex){
                    }
                    
                    if(y <= 0 || y >= 600){
                        ychange *= -1;
                        counter++;
                        text.setText("Number of Bounces: " + Double.toString(counter));
                    }
                                        
                    if(x <= 0 || x >= 600){
                        xchange *= -1;
                        counter++;
                        text.setText("Number of Bounces: " + Double.toString(counter));
                    }
            }
        }
    }
    
    class DrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.orange);
            g.fillOval(x,y,20,20);
        }
    }
}
