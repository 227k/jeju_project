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
		
		// 추후 이미지 추가?
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
				+ "◎ 오설록 ◎<br/><br/>"
				+ "[리뷰점수] 3.9 ★★★☆☆<br/>"
				+ "[영업시간] 매일 09:00 ~ 18:00<br/>"
				+ "[전화번호] 064-794-5312<br/>"
				+ "[해시태그]<br/>"
				+ "#달콤한 #녹차밭 #아모레퍼시픽 #티스톤 #카페 #녹차라떼<br/> "
				+ "#자연경관 #걷기좋은 #단풍명소 #흐림<br/>"
				+ "</html>";
		
		String btn2Img = "./src/character/common_banner/hueilot.jpg";
		String label2 =  
				  "<html>"
				+ "◎ 휴일로 ◎<br/><br/>"
				+ "[리뷰점수] 4.1 ★★★★☆<br/>"
				+ "[영업시간] 매일 09:00 ~ 20:30(last order 20:00)<br/>"
				+ "[전화번호] 010-6835-4965<br/>"
				+ "[해시태그]<br/>"
				+ "#무료주차 #한라산 #말차무스 #핫플 #분위기 #서귀포<br/> "
				+ "#카페투어 #cafe interior #한라산<br/>"
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
				+ "◎ 비자림 ◎<br/><br/>"
				+ "[리뷰점수] 5.0 ★★★★★<br/>"
				+ "[영업시간] 매일 09:00 ~ 18:00<br/>"
				+ "[전화번호] 064-710-7912<br/>"
				+ "[해시태그]<br/>"
				+ "#걷기 #등산 #아이 #여름 #힐링 #수국<br/> "
				+ "#자연경관 #걷기좋은 #단풍명소 #흐림<br/>"
				+ "</html>";
		String btn2Img = "./src/character/common_banner/norimae.jpg";
		String label2 = 
				  "<html>"
				+ "◎ 노리매 ◎<br/><br/>"
				+ "[리뷰점수] 4.0 ★★★★☆<br/>"
				+ "[영업시간] 매일 09:00 ~ 18:00<br/>"
				+ "[전화번호] 064-792-8211<br/>"
				+ "[해시태그]<br/>"
				+ "#걷기좋은 #나들이 #핑크뮬리명소 #자연경관<br/> "
				+ "#커플 #봄 #포토스팟 #매화 #테마공원<br/>"
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
