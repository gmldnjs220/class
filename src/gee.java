import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
    public MyFrame(){
        setTitle("ContentPane과 JFrame예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.ORANGE);
        getContentPane().setLayout(new FlowLayout());

        add(new JButton("OK"));
        add(new JButton("Cnacel"));
        add(new JButton("Ignore"));
        
        setTitle("300x300 스윙 프로그램 만들기");
        setSize(300, 300);
        setVisible(true);
        }
}
public class gee extends JFrame{
    
    public static void main(String[] args) {
        


        
        MyFrame frame = new MyFrame();
        
        


    }
}
