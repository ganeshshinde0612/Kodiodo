import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int fact = 1;
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
			fact = i*fact;
			
		}
		if(count ==2)
		{
			System.out.println(fact);
		}
		System.out.println(fact);
	}
}
