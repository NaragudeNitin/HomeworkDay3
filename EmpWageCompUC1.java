package Day3;
import java.util.Random;

public class EmpWageCompUC1 {
	public static void main(String[] args) {
		Random random = new Random();
		int rand =random.nextInt(2);
		System.out.println("Your Random num is "+ rand );
		
		if(rand==0) {
			System.out.println("Employee is Absent");
		}
		else {
			System.out.println("Employee is present");
		}
	
	}
}
