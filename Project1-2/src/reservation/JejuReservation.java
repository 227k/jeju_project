package reservation;


import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


import Basic.Macro;
import character.JejuPlace;
import intro.JejuBase;


public class JejuReservation extends JPanel{
	
	public JejuReservation() {
		
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
		
		reserveBtn = new JButton("Payment");
		reserveBtn.setBounds(minicoordX + miniDistanceX, minicoordY, miniSizeX, miniSizeY);
		add(backBtn);
		add(reserveBtn);
		
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JejuBase.disposeInstance(new JejuReservation());
				JejuBase.getInstance(new JejuPlace());
			}
		});
				
		hotelName();
		date();
		Bed();
	}
	
	private void hotelName()
	{
		JLabel hotelLabel = new JLabel("HILTEN HOTEL");
		hotelLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		hotelLabel.setBounds(hotelCoordX, hotelCoordY, hotelWidth, hotelHeight);
		add(hotelLabel);
	}
	
	
	private void date()
	{
		JButton dateButton = new JButton("Date");
		dateButton.setBounds(middleCoordX, middleCoordY, middleWidth, middleHeight);
		add(dateButton);
		
		dateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	                new JejuDateFrame(new GetSet_CheckDate());
				
			}
		});
		
	}
	
	private void Bed()
	{
		JButton Bedbtn = new JButton("Bed");
		Bedbtn.setBounds(middleCoordX + 90, middleCoordY, middleWidth, middleHeight);
		Bedbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.getInstance(new Bedbase());
				
			}
		});
		add(Bedbtn);
	}
	
	
	
	
	//=========BASIC VARIABLE========= 추후 매크로로 옮길예정
	private JButton backBtn = null;
	private JButton reserveBtn = null;
	private int miniSizeX = 150;
	private int miniSizeY = 70;
	private int minicoordY = 650;
	private int minicoordX = 30;
	private int miniDistanceX = 370;
	
	// hottel label variable
	private int hotelCoordX = 50;
	private int hotelCoordY = 30;
	private int hotelWidth = 300;
	private int hotelHeight = 90;
	
	// date and num variable
	private int middleCoordX = 50;
	private int middleCoordY = 130;
	private int middleWidth = 90;
	private int middleHeight = 40;
	private int middleDistX = 130;
	
	// control person's num variable
	
	
	// ===================== Calendar Part =====================
	
	
	
	// Calendar variable
	
	
}
