package excercise3;

import java.util.Scanner;

public class Authenticate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter Username: ");
		String username=s.next();
		System.out.println("Please Enter Password: ");
		String password=s.next();
		getAuthenticate ga=(String user,String pass)->{
			if(user.equals("Akshat") && pass.equals("Hello")) {
				System.out.println("Authenticated!");
			}
			else {
				System.out.println("Not Authenticated");
			}
		};
		ga.authenticate(username, password);

	}

}
