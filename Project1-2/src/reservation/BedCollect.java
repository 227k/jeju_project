package reservation;


import java.util.ArrayList;

public class BedCollect {
	
	public static String Bedinformation;
	
	private static ArrayList<BedMenu> single = new ArrayList<BedMenu>();
	private static ArrayList<BedMenu> two = new ArrayList<BedMenu>();
	private static ArrayList<BedMenu> Queen = new ArrayList<BedMenu>();
	private static ArrayList<BedMenu> king = new ArrayList<BedMenu>();
	
	public static ArrayList<BedMenu> single(){
		Bedinformation="싱글베드! \r\n"
	            +"혼자자기 너무좋은 사이즈\r\n"
				+"지금바로 예약하세요!\r\n";
		
		BedMenu m1 = new BedMenu("싱글베드" ,60000,"\n혼자옵서예? 이거하이소!");
		single.add(m1);
		return single;
	}
	public static ArrayList<BedMenu> two(){
		Bedinformation="투베드\r\n"+"사이즈가 셋도들어가겠다 싶은 사이즈!\r\n";
		BedMenu m1 = new BedMenu("투베드",120000,"\n투베드 여기가 제일싸요!");
		two.add(m1);
		return two;
		
	}
	public static ArrayList<BedMenu> Queen(){
		Bedinformation="퀸 사이즈 침대!\r\n"+"퀸이랑 킹이랑 헷갈린듯 엄청큰 사이즈!\r\n"+"셋이면 투베드 두개가 나을지도.?\r\n";
		BedMenu m1 = new BedMenu("퀸사이즈",200000,"\n킹같은 퀸사이즈! \n하지만 킹은 아니란거~");
		Queen.add(m1);
		return Queen;
	}
	public static ArrayList<BedMenu> king(){
		Bedinformation="침대의 왕 킹 사이즈!\r\n"+"이름그대로 사이즈도 킹 왕짱!\r\n";
		BedMenu m1 = new BedMenu("킹사이즈",250000,"\n 쪼매 비싸도 진짜 킹이에요잉~");
		king.add(m1);
		return king;
	}

}
