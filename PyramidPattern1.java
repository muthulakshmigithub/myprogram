import java.util.Scanner;
public class PyramidPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n ;
		System.out.println("Enter the Number");
		Scanner a = new Scanner(System.in);
		int n= a.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i +" ");
				
			}
			System.out.println("");
			
		}
	}

}
