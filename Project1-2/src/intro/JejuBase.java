package intro;

import Basic.Macro;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JejuBase extends JFrame{
	
	private static JejuBase instance;
	
	public JejuBase(JPanel e) {
		
		
		setTitle("���� �?");
		setLayout(null);
		setBounds(Macro.g_X,
				  Macro.g_Y,
				  Macro.g_Width, Macro.g_Height);
		
		add(e);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // TODO â ũ�� ����
	}
	
	static public void getInstance(JPanel e) {
		instance = new JejuBase(e);
		
		instance.getContentPane().removeAll();
		instance.getContentPane().add(e);
		
		instance.revalidate();
		instance.repaint();
	}
	
	static public void disposeInstance(JPanel e)
	{
		instance.dispose();
	}
	
	
}
