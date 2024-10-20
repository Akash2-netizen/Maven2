package week.day4;

public class Apple extends AndroidTv implements Android{
	public void samsung(){
		System.out.println("samsung");
	}
	public void oneplus(){
		System.out.println("oneplus");
	} 
	public void playVideo() {
	 System.out.println("video played");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Apple obj=new Apple();
obj.openApp();
obj.oneplus();
obj.samsung();
obj.playVideo();
	}




}
