package Model;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel jp=new JPanel();                                     //创建面板
//		frame.setSize(700, 700);                                    //创建Frame窗口
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Magic Tower");                              //主题可recreate
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
        
        JLabel label1=new JLabel("test1");    //创建标签
        
        JLabel label2=new JLabel();
        label2.setText("test2 setText()");
        
        ImageIcon img=new ImageIcon("Resource/image/1_1.jpg");      //创建一个图标
        JLabel label3=new JLabel("test3",img,JLabel.CENTER);        //创建既含有文本又含有图标的JLabel对象
        
        jp.add(label1);                                             //添加标签到面板
        jp.add(label2);
        jp.add(label3);
        frame.add(jp);
        frame.setBounds(700,700,700,700);
      
	}

}
