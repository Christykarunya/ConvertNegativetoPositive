package week1.day1;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// To convert a negative no. to positive no. input=-40 output=40
		/*int i = -1; 
		while (i < 0) {
				int j = -(i);
				
			}System.out.println("The number " + i + " is converted to " + j + " number");
			}
			}
			*/
		int num = -40;
		if(num<0)
		{
		 int i = -(num);
		 System.out.println("The number " + num + " is converted to " + i +"");
		}
	}
}

