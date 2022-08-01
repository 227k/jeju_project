package reservation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bedbase extends JPanel {

	public Bedbase() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		setSize(600, 800);
		setLocation(0, 0);
		setVisible(true);
		BPMB();// 플러스마이너스 버튼구현
		infobtn();// 정보
		BedSingle();
		BedTwo();
		BedQueen();
		BedKing();

	}

	private void infobtn() { // 인원수 침대 누르는 상단바 /미구현
		JLabel btnperson = new JLabel("인원수 선택");
		JLabel btnbed = new JLabel("침대 선택");
		// 인원버튼 설정
		btnperson.setBounds(80, 20, 100, 30);
		btnperson.setFont(new Font("굴림", Font.BOLD, 15));
		btnperson.setBackground(new Color(255, 255, 255));
		// 침대
		btnbed.setBounds(500, 20, 100, 20);
		btnbed.setFont(new Font("굴림", Font.BOLD, 15));
		btnbed.setBackground(new Color(255, 255, 255));
		add(btnperson);
		add(btnbed);
	}

	// 인원 선택
	private void BPMB() {
		BedPlusMinusBtn BPMB = new BedPlusMinusBtn(); // 버튼
		Font f = new Font("monospaced", Font.BOLD, 20);
		TextArea j1 = BPMB.getCountArea();
		j1.setSize(20, 30);
		j1.setLocation(40, 20);// 511
		j1.setFont(f);
		j1.setFocusable(false);

		JButton plusCount = BPMB.ppbtn(1, j1);
		plusCount.setSize(20, 20);
		plusCount.setLocation(60, 15);// 530

		JButton minusCount = BPMB.mpbtn(1, j1);
		minusCount.setSize(20, 20);
		minusCount.setLocation(60, 35);// 490
		add(minusCount);
		add(plusCount);
		add(j1);

	}

	// 침대 이미지 불러오기
	private void BedSingle() {
		// 메뉴
		ImageIcon menu1 = new ImageIcon("single.jpg");
		JLabel lblmenu1 = new JLabel(menu1);
		lblmenu1.setSize(120, 120);// 이미지 사이즈
		lblmenu1.setLocation(40, 75);// 이미지 위치
		add(lblmenu1);
		JLabel single = new JLabel("Single Size");
		single.setBounds(40, 50, 100, 30);
		single.setFont(new Font("굴림", Font.BOLD, 15));
		single.setBackground(new Color(255, 255, 255));
		add(single);

		// 메뉴 관련 텍스트
		TextArea story1 = new TextArea("" + BedCollect.single(), 4, TextArea.SCROLLBARS_BOTH);
		story1.setEditable(false);
		story1.setSize(330, 120);
		story1.setLocation((int) lblmenu1.getLocation().getX() + 120, (int) lblmenu1.getLocation().getY());
		story1.setBackground(new Color(255, 255, 255));
		story1.setFont(new Font("monospaced", Font.BOLD, 16));
		story1.setFocusable(false);
		add(story1);
		
		//몇개를 담을것인지
		BedPlusMinusBtn BPMB = new BedPlusMinusBtn();
		Font f = new Font("monospaced", Font.BOLD, 20);
		TextArea j = BPMB.getCountArea();
		j.setSize(20, 30);
		j.setLocation(530, 111);

		JButton plusCount = BPMB.plusbtn(1, j);
		plusCount.setSize(20, 20);
		plusCount.setLocation(511, 90);

		JButton minusCount = BPMB.minusbutton(1, j);
		minusCount.setSize(20, 20);
		minusCount.setLocation(511, 130);

		add(plusCount);
		add(minusCount);
		add(j);
	}
//	public void setSingle(boolean check)
//	{
//		if(story1 != null)
//		{
//			story1.setvisible(check);
//		}
//	}

	private void BedTwo() {
		// 메뉴
		ImageIcon menu1 = new ImageIcon("two.jpg");
		JLabel lblmenu1 = new JLabel(menu1);
		lblmenu1.setSize(120, 120);// 이미지 사이즈
		lblmenu1.setLocation(40, 225);// 이미지 위치
		add(lblmenu1);

		// 라벨추가
		JLabel single = new JLabel("Two Size");
		single.setBounds(40, 200, 100, 30);
		single.setFont(new Font("굴림", Font.BOLD, 15));
		single.setBackground(new Color(255, 255, 255));
		add(single);

		// 메뉴 관련 텍스트
		TextArea story1 = new TextArea(BedCollect.two() + "", 4, TextArea.SCROLLBARS_BOTH);
		story1.setEditable(false);
		story1.setSize(330, 120);
		story1.setLocation((int) lblmenu1.getLocation().getX() + 120, (int) lblmenu1.getLocation().getY());
		story1.setBackground(new Color(255, 255, 255));
		story1.setFont(new Font("monospaced", Font.BOLD, 16));
		story1.setFocusable(false);
		add(story1);

	}

	private void BedQueen() {
		// 메뉴
		ImageIcon menu1 = new ImageIcon("queen.jpg");
		JLabel lblmenu1 = new JLabel(menu1);
		lblmenu1.setSize(120, 120);// 이미지 사이즈
		lblmenu1.setLocation(40, 375);// 이미지 위치
		add(lblmenu1);

		// 라벨추가
		JLabel single = new JLabel("Queen Size");
		single.setBounds(40, 355, 100, 30);
		single.setFont(new Font("굴림", Font.BOLD, 15));
		single.setBackground(new Color(255, 255, 255));
		add(single);
		// 메뉴 관련 텍스트
		TextArea story1 = new TextArea(BedCollect.Queen() + "", 4, TextArea.SCROLLBARS_BOTH);
		story1.setEditable(false);
		story1.setSize(330, 120);
		story1.setLocation((int) lblmenu1.getLocation().getX() + 120, (int) lblmenu1.getLocation().getY());
		story1.setBackground(new Color(255, 255, 255));
		story1.setFont(new Font("monospaced", Font.BOLD, 16));
		story1.setFocusable(false);
		add(story1);
	}

	private void BedKing() {
		// 메뉴
		ImageIcon menu1 = new ImageIcon("king.jpg");
		JLabel lblmenu1 = new JLabel(menu1);
		lblmenu1.setSize(120, 120);// 이미지 사이즈
		lblmenu1.setLocation(40, 525);// 이미지 위치
		add(lblmenu1);
		// 라벨추가
		JLabel single = new JLabel("King Size");
		single.setBounds(40, 505, 100, 30);
		single.setFont(new Font("굴림", Font.BOLD, 15));
		single.setBackground(new Color(255, 255, 255));
		add(single);

		// 메뉴 관련 텍스트
		TextArea story1 = new TextArea(BedCollect.king() + "", 4, TextArea.SCROLLBARS_BOTH);
		story1.setEditable(false);
		story1.setSize(330, 120);
		story1.setLocation((int) lblmenu1.getLocation().getX() + 120, (int) lblmenu1.getLocation().getY());
		story1.setBackground(new Color(255, 255, 255));
		story1.setFont(new Font("monospaced", Font.BOLD, 16));
		story1.setFocusable(false);
		add(story1);
	}

}
