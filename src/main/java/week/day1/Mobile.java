package week.day1;

public class Mobile {
public void print() {
	System.out.println("the statement is printed");
}
private void leaf()
{
	System.out.println("the leaf statement is printed");
}
	public static void main(String[] args) {
		
		int a=10;
		System.out.println(a);
		Mobile obj=new Mobile();
		obj.print();
		obj.leaf();
	}

}
