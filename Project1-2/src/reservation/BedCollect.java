package reservation;


import java.util.ArrayList;

public class BedCollect {
	
	public static String Bedinformation;
	
	private static ArrayList<BedMenu> single = new ArrayList<BedMenu>();
	private static ArrayList<BedMenu> two = new ArrayList<BedMenu>();
	private static ArrayList<BedMenu> Queen = new ArrayList<BedMenu>();
	private static ArrayList<BedMenu> king = new ArrayList<BedMenu>();
	
	public static ArrayList<BedMenu> single(){
		Bedinformation="�̱ۺ���! \r\n"
	            +"ȥ���ڱ� �ʹ����� ������\r\n"
				+"���ݹٷ� �����ϼ���!\r\n";
		
		BedMenu m1 = new BedMenu("�̱ۺ���" ,60000,"\nȥ�ڿɼ���? �̰����̼�!");
		single.add(m1);
		return single;
	}
	public static ArrayList<BedMenu> two(){
		Bedinformation="������\r\n"+"����� �µ����ڴ� ���� ������!\r\n";
		BedMenu m1 = new BedMenu("������",120000,"\n������ ���Ⱑ ���Ͻο�!");
		two.add(m1);
		return two;
		
	}
	public static ArrayList<BedMenu> Queen(){
		Bedinformation="�� ������ ħ��!\r\n"+"���̶� ŷ�̶� �򰥸��� ��ûū ������!\r\n"+"���̸� ������ �ΰ��� ��������.?\r\n";
		BedMenu m1 = new BedMenu("��������",200000,"\nŷ���� ��������! \n������ ŷ�� �ƴ϶���~");
		Queen.add(m1);
		return Queen;
	}
	public static ArrayList<BedMenu> king(){
		Bedinformation="ħ���� �� ŷ ������!\r\n"+"�̸��״�� ����� ŷ ��¯!\r\n";
		BedMenu m1 = new BedMenu("ŷ������",250000,"\n �ɸ� ��ε� ��¥ ŷ�̿�����~");
		king.add(m1);
		return king;
	}

}
