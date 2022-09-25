package Day3;

public class EmpWageCompUCM5 {
	private static final String FULL_TIME ="FULL_TIME";
	private static final String PART_TIME ="PART_TIME";
	private static final int monthDays =20;
	
	
	public static void main(String[] args) {
		EmpWageCompUCM5 nitin = new EmpWageCompUCM5();
		int hrs=nitin.noOfHrsInDay(FULL_TIME);
		System.out.println("working time: "+ hrs);
		
		double salary=nitin.oneDaySal();
		System.out.println("one day salary is " + salary);
		double fullMonthSal= salary*monthDays;
		System.out.println("so your one month full time sal is: "+ fullMonthSal);
		
		double partsal=nitin.oneDaysal(monthDays);
		System.out.println("Your one day part time sal is: "+ partsal);
		double partMonthSal= partsal*monthDays;
		System.out.println("so your one month full time sal is: "+ partMonthSal);
		
		
//		int FulltimeSalary= monthDays*(full.dailySal(20, 8));
//		System.out.println("Your full time monthly salary is "+FulltimeSalary);
//		salary=no of days* Daily salary
//		int PartTimeSal = monthDays * (full.dailySal(20, 4));
//		System.out.println("Your Monthly Part time salary is "+ PartTimeSal);
		
	}
	
	public  int noOfHrsInDay(String type) {
		switch (type) {
		case FULL_TIME:
			return 8;
		case PART_TIME :
			return 4;
		default:
			return 0;
		}
	}
	
	public  double oneDaySal() {
		return noOfHrsInDay(FULL_TIME)*20;
	}
	
	public double oneDaysal(int wrHr) {
		return noOfHrsInDay(PART_TIME)*wrHr;
	}
	
	
	
}
