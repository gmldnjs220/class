import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
    public MyFrame(){
        setTitle("ContentPane과 JFrame예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.ORANGE); //JFrame 배경색 설정 (실제로는 contentpan 에 적용됌)
        getContentPane().setLayout(new FlowLayout()); //

        add(new JButton("OK"));
        add(new JButton("Cnacel"));
        add(new JButton("Ignore"));
        
        // setTitle("300x300 스윙 프로그램 만들기");
        setSize(300, 300);
        setVisible(true);
        }
}


class MyFrame2 extends JFrame{
    public MyFrame2(){
        setTitle("ContentPane과 JFrame예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
    
        getContentPane().setBackground(Color.ORANGE); //JFrame 배경색 설정 (실제로는 contentpan 에 적용됌)
        getContentPane().setLayout(new FlowLayout()); //

        add(new JButton("OK"));
        add(new JButton("Cnacel"));
        add(new JButton("Ignore"));
        
        // setTitle("300x300 스윙 프로그램 만들기");
        setSize(300, 300);
        setVisible(true);
        }
}

class MyFrame3 extends JFrame{
    public MyFrame3(){
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(2, 5));

        for (int i = 0; i < 10 ; i++) {
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            add(button);

        }
        setSize(500, 200);
        setVisible(true);
        }
}

public class gee extends JFrame{
    public static void main(String[] args) {
          
        MyFrame3 frame = new MyFrame3();
        
    }
}
