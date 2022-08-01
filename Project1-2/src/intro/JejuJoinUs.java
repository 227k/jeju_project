package intro;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Basic.Macro;

public class JejuJoinUs extends JPanel{
	
	public JejuJoinUs() {
		setSize(Macro.g_Width, Macro.g_Height);
		setLayout(null);
		setBackground(new Color(255, 140, 0));
		
		JLabel lblJoinus = new JLabel("Join Us!");
		lblJoinus.setBounds(165, 50, 300, 100);
		lblJoinus.setFont(new Font("����", Font.ITALIC, 60));
		
		JLabel lblag = new JLabel("��� ����");
		lblag.setBounds(70, 175, 100, 60);
		lblag.setFont(new Font("����", Font.BOLD, 15));
		
		JPanel terms = new JPanel();
		terms.setLayout(null);
		terms.setBackground(new Color(255, 180, 0));
		terms.setBounds(50, 180, 500, 395);
		
		TextArea ta = new TextArea("��������ó����ħ\r\n"
				+ "\r\n"
				+ "[����]\r\n"
				+ "1. ��Ģ\r\n"
				+ "2. �������� ������ ���� ����\r\n"
				+ "3. ���������� ���� �� �̿����\r\n"
				+ "4. �����ϴ� �������� �׸�\r\n"
				+ "5. �������� �ڵ����� ��ġ�� ��ġ, � �� �� �źο� ���� ����\r\n"
				+ "6. ���� �� ��� �� ��3�ڿ� ���� ����\r\n"
				+ "7. ���������� ���� �� ����\r\n"
				+ "8. �������� ����, �̿�, ������ ���� ����öȸ\r\n"
				+ "9. ���������� ���� �� �̿�Ⱓ\r\n"
				+ "10. ���������� �ı����� �� ���\r\n"
				+ "11. �Ƶ��� �������� ��ȣ\r\n"
				+ "12. �������� ��ȣ�� ���� ����� ��å\r\n"
				+ "13. ���������� ��Źó��\r\n"
				+ "14. �ǰ���� �� �Ҹ�ó��\r\n"
				+ "15. �� Ģ(������) \r\n"
				, 1000, 20);
		ta.setBounds(50, 225, 500, 350);
		ta.setBackground(new Color(255, 180, 0));
		
		JButton joinBtn = new JButton("JOIN");
		joinBtn.setBackground(new Color(255, 180, 0)); 
		joinBtn.setBounds(365, 650, 170, 50);
		joinBtn.setFont(new Font("����", Font.CENTER_BASELINE, 20));
		
		JButton cancelBtn = new JButton("CANCEL");
		cancelBtn.setBackground(new Color(255, 180, 0)); 
		cancelBtn.setBounds(65, 650, 170, 50);
		cancelBtn.setFont(new Font("����", Font.CENTER_BASELINE, 20));
		
		add(lblJoinus);
		add(ta);
		add(lblag);
		add(joinBtn);
		add(cancelBtn);
		add(terms);
		
		
		joinBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.disposeInstance(new JejuJoinUs());
				JejuBase.getInstance(new JejuBegin());
			}
		});
		
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.disposeInstance(new JejuJoinUs());
				JejuBase.getInstance(new JejuBegin());
			}
		});
		
	}

}
