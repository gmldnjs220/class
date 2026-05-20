import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class zoo extends JFrame{
    
    public zoo(){//판떼기
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); //리스너 이벤트 등록
        c.add(btn);
        setSize(250, 120);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new zoo();
    }
}

class MyActionListener implements ActionListener { //액션 이벤트 리스너 구현
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Action"))
            b.setText("액션");
        else 
            b.setText("Action");
    }
}
