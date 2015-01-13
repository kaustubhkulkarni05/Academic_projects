import javax.jws.WebService;

@WebService
public class Calculator {

	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public int div(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}

	public String checkInput(String num1, String num2 , String operation) {
		// boolean isValidString = false;
		
		if(operation.equals("DIVIDE")){
			
			if (num2.equals("0")){
				
				return "Can not Divide by zero!!";
			}
			
		}
		
		
		try {
			Integer.parseInt(num1);
			Integer.parseInt(num2);
		} catch (Exception e) {
			return "invalid input";
		}

		return "valid input";
	}

}
