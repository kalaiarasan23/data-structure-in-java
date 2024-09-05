package dimond;

public class Dimond1 {

	public static void main(String[] args) {
		int n=4;
		
		for(int i=0;i<n*2;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=i;j>=0 ;j--)
			{
				System.out.print((n*j+k)+" ");
				k++;
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<n;j++)
			{
				
			}
		}
		
	}

}
