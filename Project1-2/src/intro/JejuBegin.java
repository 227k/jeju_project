package intro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Basic.Macro;
import character.JejuTypeSelection;


public class JejuBegin extends JPanel{
	
	public JejuBegin() {
		setLayout(null);
		setSize(Macro.g_Width, Macro.g_Height);

		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(440, 180, 50, 20);
		lblID.setFont(new Font("����", Font.BOLD, 12));
		
		JTextField tfID = new JTextField(null, 10);
		tfID.setBounds(440, 200, 120, 20);

		JLabel lblPass = new JLabel("PassWord");
		lblPass.setBounds(440, 220, 70, 20);
		lblPass.setFont(new Font("����", Font.BOLD, 12));
		
		JPasswordField tfPass = new JPasswordField(null, 10);
		tfPass.setBounds(440, 240, 120, 20);
		
		JButton logBtn = new JButton("Log In");
		logBtn.setBounds(490, 270, 70, 20);
		logBtn.setFont(new Font("����", Font.ITALIC , 10));
		
		JButton joinBtn = new JButton("Sign Up!");
		joinBtn.setBackground(new Color(255, 140, 0)); // RGB����
		joinBtn.setBounds(440, 320, 120, 40);
		joinBtn.setFont(new Font("����", Font.CENTER_BASELINE, 13));
		
//		JButton closeBtn = new JButton("�����ϱ�");
//		closeBtn.setBackground(new Color(255, 140, 0)); // RGB����
//		closeBtn.setSize(150, 70);
//		closeBtn.setLocation((int)joinBtn.getLocation().getX()+250, 
//				(int)joinBtn.getLocation().getY());
//		closeBtn.setFont(new Font("����", Font.BOLD, 20));

		
		add(lblID);
		add(tfID);
		add(lblPass);
		add(tfPass);
		add(logBtn);
		add(joinBtn);
//		add(closeBtn);
		
		ImageIcon hjeju = new ImageIcon("./src/Hello_jeju.jpg"); // �׸� �ҷ�����
		JLabel lblHJeju = new JLabel(hjeju); // �׸� ���̱�
		lblHJeju.setSize(Macro.g_Width, Macro.g_Height);
		lblHJeju.setLocation(-15, 0);
		add(lblHJeju);
		
		logBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String id = "";
				String pass = "";

				if (id.equals(tfID.getText()) && pass.equals(tfPass.getText())) {

					JOptionPane.showMessageDialog(null, "ȥ���ɼ���~!");
					JejuBase.disposeInstance(new JejuBegin());
					JejuBase.getInstance(new JejuTypeSelection());
				} else {

					JOptionPane.showMessageDialog(null, "�ٽ� �� ���ݽ�~!");

				}

			}

		});
		
		joinBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.disposeInstance(new JejuBegin());
				JejuBase.getInstance(new JejuJoinUs());
			}
		});
	}

}
