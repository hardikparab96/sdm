import java.util.Scanner;

public class Primenum {
// some thing updated
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int i,sum=0;
		for(i=1;i<=num;i++)
		{
			if((num%i)==0)
			{
				sum=sum+1;
			}
		}
			if(sum==2) 
			    {
				System.out.println("givennumber is a prime no");
		        }
			else
			    {
				System.out.println("givennumber is not a prime no");
			    }
		
		
	}

}
