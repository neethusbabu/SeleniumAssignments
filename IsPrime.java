package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 4;
		boolean f=false;
				
		for (int i=2;i<=n/2;i++) {
			
						
			if(n%i==0) {
				f=true;
						
				break;
			}
		}
		if(f==false)
		{
				
			System.out.println("The number is prime");
			}
			else {
				System.out.println("The number is not prime");
			}
			
		}

	

}
