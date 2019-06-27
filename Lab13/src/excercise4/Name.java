package excercise4;
interface Interface1 {
	void show(String a,String b);
}
class Class2{
	public void getDetails(String firstname,String lastname) {
		System.out.println("Your First Name is: "+firstname);
		System.out.println("Your Last Name is: "+lastname);
	}
}
public class Name {
	public static void main(String[] args) {
		Class2 c=new Class2();
		Interface1 i=c::getDetails;
		i.show("Akshat","Aman");

	}

}
