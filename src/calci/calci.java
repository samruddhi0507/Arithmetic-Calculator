package calci;

import java.util.Scanner;

public class calci {
	public static void main(String[] args) 
	{
		System.out.println(" Enter 1 for Addition");
		System.out.println(" Enter 2 for Subtraction");
        System.out.println(" Enter 3 for Multiplcaition");
        System.out.println(" Enter 4 for Division");
		System.out.println(" Enter Your Choice!!");
		int choice = new Scanner(System.in).nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println(" Enter 1st Number");
			int num1 =new Scanner(System.in).nextInt();
            System.out.println(" Enter 2nd Number");
			int num2 =new Scanner(System.in).nextInt();
            System.out.println(num1+" + "+ num2 +"="+ calculator.add(num1,num2));
            System.out.println(" ===========THANK YOU ============");
			break;

		}
		case 2:
		{
			System.out.println(" Enter 1st Number");
			int num1 =new Scanner(System.in).nextInt();
            System.out.println(" Enter 2nd Number");
			int num2 =new Scanner(System.in).nextInt();
            System.out.println(num1+"-"+ num2 +"="+ calculator.sub(num1,num2));
            System.out.println(" ===========THANK YOU ============");
			break;

		}
		case 3:
		{
			System.out.println(" Enter 1st Number");
			int num1 =new Scanner(System.in).nextInt();
            System.out.println(" Enter 2nd Number");
			int num2 =new Scanner(System.in).nextInt();
            System.out.println(num1+"* "+ num2 +"="+ calculator.prod(num1,num2));
            System.out.println(" ===========THANK YOU ============");
			break;

		}
		case 4:
		{
			System.out.println(" Enter 1st Number");
			int num1 =new Scanner(System.in).nextInt();
            System.out.println(" Enter 2nd Number");
			int num2 =new Scanner(System.in).nextInt();
            System.out.println(num1+"/ "+ num2 +"="+ calculator.div(num1,num2));
            System.out.println(" ===========THANK YOU ============");
			break;

		}
		default:
		{
		System.out.println("Wrong Choice!!");
		System.out.println("=========== THANK YOU ==========");
		break;


		}

		}

	}
}
