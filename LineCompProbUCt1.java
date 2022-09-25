package day3p2;

import java.util.Scanner;

public class LineCompProbUCt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 =1;
		int y1 =4;
		int x2 =5;
		int y2 =1;
		
		double lengthOfLine=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of the line with co-ordinates (x1,y1),("+x1+","+y1+")"+ " and (x2,y2), ("+x2+","+y2+") is " + lengthOfLine);
		sc.close();
	}
}
