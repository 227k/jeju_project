package reservation;

import java.awt.Menu;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Bedbaguni {

	private static Bedbaguni instance;

	// ��ٱ��Ͽ����� ���� �迭��.
	public static ArrayList<BedMenu> buylist = new ArrayList<BedMenu>();

	// �� �޴��� ������ ���� �� �ִ� ����������, 1~9���� ���۰���
	public static int person = 1;
	public static int count1 = 1;
	public static int count2 = 1;
	public static int count3 = 1;
	public static int count4 = 1;

	// �ش� Ŭ������ ��ü�� �����ϴ�
	public static Bedbaguni getMyMenu() {
		if (instance == null) {
			instance = new Bedbaguni();
		}
		return instance;
	}

	// ��ٱ��Ͽ� ������ ��� �޼���
	public static void add(BedMenu m) {
		buylist.add(m);
		JOptionPane.showMessageDialog(null, m.getName() + "�� ��ٱ��Ͽ� ��ҽ��ϴ�.");
	}

	// ��ٱ��ϸ� ���� �޼���
	public static void clear() {
		buylist.clear();
		JOptionPane.showMessageDialog(null, "��ٱ��ϸ� ������ϴ�.");
	}

	public static void countmenu1(int c) {
		count1 = c;
	}

	public static void countmenu2(int c) {
		count2 = c;
	}


	public static void countmenu3(int c) {
		count3 = c;
	}

	public static void countmenu4(int c) {
		count4 = c;
	}

	public static void person(int c) {
		person = c;
	}

	// ��� count �ʱ�ȭ
	public static void resetcount() {
		Bedbaguni.count1 = 1;
		Bedbaguni.count2 = 1;
		Bedbaguni.count3 = 1;
		Bedbaguni.count4 = 1;
        Bedbaguni.person = 1;
	}

}
