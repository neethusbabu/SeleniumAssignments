package week1.day1;

/**
 * @author ajith
 *
 */
public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum=0;
		int secondNum=1;
		int sum=0;
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		for(int i=0;i<=11;i++) {
			
			
		   sum=firstNum+secondNum;
		   firstNum=secondNum;
		   secondNum=sum;
		   System.out.println(sum);
					
			
		}

	}

}
