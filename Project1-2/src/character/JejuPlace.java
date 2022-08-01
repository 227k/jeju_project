package character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Basic.Macro;
import intro.JejuBase;
import reservation.JejuReservation;

public class JejuPlace extends JPanel{
	
	public JejuPlace()
	{
		Setting();
	}
	
	private void Setting()
	{
		setLayout(null);
		setSize(Macro.g_Width, Macro.g_Height);
		setVisible(true);
		
		// ���� �̹��� �߰�?
		backBtn = new JButton("Back");
		backBtn.setBounds(minicoordX, minicoordY, miniSizeX, miniSizeY);
		
		reserveBtn = new JButton("Book a Hotel");
		reserveBtn.setBounds(minicoordX + miniDistanceX, minicoordY, miniSizeX, miniSizeY);
		add(backBtn);
		add(reserveBtn);
		
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JejuBase.disposeInstance(new JejuPlace());
				
				JejuBase.getInstance(new JejuTypeSelection());
			}
		});
		
		
		
		
		
	}
	
	private void gridFrame(String button1, String label1, String button2, String label2)
	{
		ImageIcon Img = new ImageIcon(button1);
		Macro.customization(Img, BigSizeX, BigSizeY);
		
		ImageIcon Img2 = new ImageIcon(button2);
		Macro.customization(Img2, BigSizeX, BigSizeY);
		
		// first Button
		firstBtn = new JButton(Img);
		firstBtn.setBounds(BigcoordX, BigcoordY, BigSizeX, BigSizeY);
		
		// first Label
		firstLabel = new JLabel(label1);
		firstLabel.setBounds(BigcoordX + BigDistanceX, BigcoordY, BigSizeX, BigSizeY);
		
		// second Button
		secondBtn = new JButton(Img2);
		secondBtn.setBounds(BigcoordX, BigcoordY + BigDistanceY, BigSizeX, BigSizeY);
		
		// second Label
		secondLabel = new JLabel(label2);
		secondLabel.setBounds(BigcoordX + BigDistanceX, BigcoordY + BigDistanceY, BigSizeX, BigSizeY);
		
		add(firstBtn);
		add(firstLabel);
		add(secondBtn);
		add(secondLabel);
	}
	
	public void CafeTour()
	{
		String btn1Img = "./src/character/common_banner/osulloc.jpg";
		String label1 =  
				  "<html>"
				+ "�� ������ ��<br/><br/>"
				+ "[��������] 3.9 �ڡڡڡ١�<br/>"
				+ "[�����ð�] ���� 09:00 ~ 18:00<br/>"
				+ "[��ȭ��ȣ] 064-794-5312<br/>"
				+ "[�ؽ��±�]<br/>"
				+ "#������ #������ #�Ƹ��۽��� #Ƽ���� #ī�� #������<br/> "
				+ "#�ڿ���� #�ȱ����� #��ǳ��� #�帲<br/>"
				+ "</html>";
		
		String btn2Img = "./src/character/common_banner/hueilot.jpg";
		String label2 =  
				  "<html>"
				+ "�� ���Ϸ� ��<br/><br/>"
				+ "[��������] 4.1 �ڡڡڡڡ�<br/>"
				+ "[�����ð�] ���� 09:00 ~ 20:30(last order 20:00)<br/>"
				+ "[��ȭ��ȣ] 010-6835-4965<br/>"
				+ "[�ؽ��±�]<br/>"
				+ "#�������� #�Ѷ�� #�������� #���� #������ #������<br/> "
				+ "#ī������ #cafe interior #�Ѷ��<br/>"
				+ "</html>";

		gridFrame(btn1Img, label1, btn2Img, label2);
		
		
		firstBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				otherImages = new OtherImages2();
				otherImages.Details(osulloc);
				
			}
		});
		
		secondBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				OtherImages2 otherImages = new OtherImages2();
				otherImages.Details(hueilot);
				
			}
		});
	}
	
	public void Activity()
	{
		
	}
	
	public void HealingTour()
	{
		String btn1Img = "./src/character/common_banner/bijarim.jpg";
		String label1 =  
				  "<html>"
				+ "�� ���ڸ� ��<br/><br/>"
				+ "[��������] 5.0 �ڡڡڡڡ�<br/>"
				+ "[�����ð�] ���� 09:00 ~ 18:00<br/>"
				+ "[��ȭ��ȣ] 064-710-7912<br/>"
				+ "[�ؽ��±�]<br/>"
				+ "#�ȱ� #��� #���� #���� #���� #����<br/> "
				+ "#�ڿ���� #�ȱ����� #��ǳ��� #�帲<br/>"
				+ "</html>";
		String btn2Img = "./src/character/common_banner/norimae.jpg";
		String label2 = 
				  "<html>"
				+ "�� �븮�� ��<br/><br/>"
				+ "[��������] 4.0 �ڡڡڡڡ�<br/>"
				+ "[�����ð�] ���� 09:00 ~ 18:00<br/>"
				+ "[��ȭ��ȣ] 064-792-8211<br/>"
				+ "[�ؽ��±�]<br/>"
				+ "#�ȱ����� #������ #��ũ�ĸ���� #�ڿ����<br/> "
				+ "#Ŀ�� #�� #���佺�� #��ȭ #�׸�����<br/>"
				+ "</html>";

		gridFrame(btn1Img, label1, btn2Img, label2);
		
		firstBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				OtherImages2 otherImages = new OtherImages2();
				otherImages.Details(bijarim);
			}
		});
		
		secondBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				OtherImages2 otherImages = new OtherImages2();
				otherImages.Details(norimae);
			}
		});
	}//HealingTour
	
	public void imgInit()
	{
		otherImages = null;
	}
	
	// ==========================================
	private JButton firstBtn = null;
	private JButton secondBtn = null;
	private JButton backBtn = null;
	private JButton reserveBtn = null;
	private JLabel firstLabel = null;
	private JLabel secondLabel = null;

	// backBtn, reserveBtn size and coord
	private int miniSizeX = 150;
	private int miniSizeY = 70;
	private int minicoordY = 650;
	private int minicoordX = 30;
	private int miniDistanceX = 370;
	
	// firstBtn, secondBtn, Labels size and coord
	private int BigSizeX = 250;
	private int BigSizeY = 180;
	private int BigcoordX = 30;
	private int BigcoordY = 150;
	private int BigDistanceX = 270;
	private int BigDistanceY = 200;
	
	private OtherImages2 otherImages = null;
	
	// Activity variable
		
	// Healing variable
	private String norimae = "./src/character/resource_healing/norimae";
	private String bijarim = "./src/character/resource_healing/bijarim";
	// Desert variable
	private String osulloc = "./src/character/resource_desert/osulloc";
	private String hueilot = "./src/character/resource_desert/hueilot";
}
