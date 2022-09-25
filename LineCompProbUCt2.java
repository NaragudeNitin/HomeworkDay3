package day3p2;

import java.util.Scanner;

public class LineCompProbUCt2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-ordinate points of line1");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		double lengthOfLine=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of the line with co-ordinates (x1,y1),("+x1+","+y1+")"+ " and (x2,y2), ("+x2+","+y2+") is " + lengthOfLine);
		sc.close();
	}
}
