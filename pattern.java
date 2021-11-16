package testJavaProject;

public class pattern {
	public static void main(String [] args) {
		int i=0;
		for(i=0 ; i<10; i++) {
			for(int j=i; j>=0; j--) {

				System.out.print("*");
			}
			System.out.println(+(i+1)+"\n");
		}
		System.out.println("This is pattern from ssk232017/slave1_github");
	}

}
