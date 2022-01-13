
public class compute {
	
	//method for computing two numbers
	void calcCompute(double num1, double num2, char op) {
		double ans;
		switch(op) {
        case '+': ans = num1 + num2;
           break;
        case '-': ans = num1 - num2;
           break;
        case '*': ans = num1 * num2;
           break;
        case '/': ans = num1 / num2;
           break;
     default: System.out.printf("Error! Enter correct operator");
        return;
     }
     System.out.print("Results: ");
     System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	}
}