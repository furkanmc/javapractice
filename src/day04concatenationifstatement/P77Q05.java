package day04concatenationifstatement;

import java.util.Scanner;

public class P77Q05 {
/*
 Ask user to enter annual salary, if the salary is more than or equal
to $80.000 output will be “I accept the offer”, if the salary is between
$60.000 and $80.000 out put will be “I negotiate to increase”,
otherwise output will be “I do not accept the offer.”
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter annual salary...");
		int salary = scan.nextInt();
		if(salary >= 80000) {
			System.out.println("i accept the offer"); }
			else if (salary >= 60000 && salary<80000) {
			System.out.println("I negotiate the increase");				
			}else {
			System.out.println("I do not accept the offer");
			}
		scan.close();	
		}
	

}
