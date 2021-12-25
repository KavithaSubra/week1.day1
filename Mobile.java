package week1.day1;

public class Mobile {
public void makeCall()
{
	System.out.println("Make a call");
}
public void sendMsg()
{
	System.out.println("Send a Message");
}
int mobileWeight = 50;
String mobileModel = "Xiaomi";
boolean isFullCharge = false;
double mobileCost = 50000;
public static void main(String[] args) {
	Mobile newMob = new Mobile();
	newMob.makeCall();
	newMob.sendMsg();
	System.out.println(newMob.mobileModel);
	System.out.println(newMob.mobileWeight);
	System.out.println(newMob.isFullCharge);
	System.out.println(newMob.mobileCost);
}
}
