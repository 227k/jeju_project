package reservation;

//�޴��� �����ϱ����� �޴� Ŭ�����Դϴ�!
public class BedMenu {
	
	int price;
	String name;
	int count;
	String BedInfo;
	String Bedinformation;
	


	public BedMenu(String name, int price, String BedInfo) {
		this.price=price;
		this.name=name;
		this.BedInfo=BedInfo;
	}
	
	public String BedInfo() {
		return BedInfo;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name+":"+price+"��" +BedInfo+"";
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count += count;
	}
	public void minusCount(int count) {
		this.count -= count;
	}
	

}