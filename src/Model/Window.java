package Model;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel jp=new JPanel();                                     //�������
//		frame.setSize(700, 700);                                    //����Frame����
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Magic Tower");                              //�����recreate
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
        
        JLabel label1=new JLabel("test1");    //������ǩ
        
        JLabel label2=new JLabel();
        label2.setText("test2 setText()");
        
        ImageIcon img=new ImageIcon("Resource/image/1_1.jpg");      //����һ��ͼ��
        JLabel label3=new JLabel("test3",img,JLabel.CENTER);        //�����Ⱥ����ı��ֺ���ͼ���JLabel����
        
        jp.add(label1);                                             //��ӱ�ǩ�����
        jp.add(label2);
        jp.add(label3);
        frame.add(jp);
        frame.setBounds(700,700,700,700);
      
	}

}
