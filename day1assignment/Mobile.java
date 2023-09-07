package week1.day1assignment;

public class Mobile {
	public void makeCall() {
		String mobileModel="Vivo";
		float mobileWeight=102.5f;
		System.out.println("Mobile model is:"+mobileModel+"\n"+"Mobile weight is:"+mobileWeight);
	}
public void sendMsg() {
	boolean isFullyCharged=true;
	int mobileCost=22000;
	System.out.println("Is Fully charged:"+isFullyCharged+"\n"+"Mobile cost is:"+mobileCost);
}
public static void main(String[] args) {
	Mobile m=new Mobile();
	System.out.println("This is my mobile");
	m.makeCall();
	m.sendMsg();
	
	}
}
