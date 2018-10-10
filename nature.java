import java.util.Scanner;
class nature{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the the no.");
		int n=kb.nextInt();
		int a=1;
		while (n!=0){
	    a=a*n;
		n--;
		}
		{System.out.println(" factorial is "+a);}
	}
}
