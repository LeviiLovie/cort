import java.awt.*;  
import javax.swing.JFrame;  
  
// class Screen extends Canvas {  
//     public void paint(Graphics g) {  
//         g.drawString("Hello",40,40);  
//         setBackground(Color.WHITE);  
//         g.fillRect(130, 30,100, 80);  
//         g.drawOval(30,130,50, 60);  
//         setForeground(Color.RED);  
//         g.fillOval(130,130,50, 60);  
//         g.drawArc(30, 200, 40,50,90,60);  
//         g.fillArc(30, 130, 40,50,180,40);  
//     }
//     public void () {  
//         Screen m=new Screen();  
//         JFrame f=new JFrame();  
//         f.add(m);  
//         f.setSize(400,400);  
//         //f.setLayout(null);  
//         f.setVisible(true);  
//     }  
// } 

public class Main {
    public void paint(Graphics g) {  
        g.drawString("Hello",40,40);  
        setBackground(Color.WHITE); 
        g.fillRect(130, 30,100, 80);  
        g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
    }

    public void s() {  
        Screen m = new Screen();  
        JFrame f = new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  

    public static void main(String[] args) {
        System.out.println("Hello, wrold!");
        Screen screen = new Screen();
        screen.
    }
}