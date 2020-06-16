import javax.swing.*;
import java.util.Random;

public class JProgressBarExample {
    public static void main(String[]args) {
        JFrame frame = new JFrame("Progress Bar");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JProgressBar pg = new JProgressBar(0,2000);
        panel.add(pg);
        frame.add(panel);
        frame.setVisible(true);
        int sum = 200;
        while(pg.getValue() < pg.getMaximum()){
            pg.setValue(pg.getValue() + sum);
            if(pg.getValue() >= 1800){
                sum = 200;
            }
            sum += new Random().nextInt(200-1)+1;
            try{
                Thread.sleep(800);
            }catch(Exception ignored){

            }
        }
        pg.setVisible(false);
    }
}
