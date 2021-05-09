package ua.lviv.lgs;

public class Methods {

	int a;
	int b;

	int result;

	public void Plus(int a, int b) {
		if (a < 0 && b < 0) {

			String descript = "IllegalArgumentException - a<0 and b<0";
			throw new IllegalArgumentException(descript);

		} else {
			result = a + b;
			System.out.println(result);
		}

	}

	public void Minus(int a, int b) {

		if (a == 0 && !(b == 0) || !(a == 0) && b == 0) {

			String descript = "ArithmeticException (a=0 and b!=0) or (a!=0 and b=0)";
			throw new ArithmeticException(descript);

		} else {
			result = a - b;
			System.out.println(result);
		}

	}

	public void Devine(int a, int b) throws Exception  {
		if (a == 0 && b == 0) {

			String descript = "IllegalAccessException a=0 and b=o";
			throw new IllegalAccessException(descript);

		} else {
			result = a / b;
			System.out.println(result);
		}

	}

	public void Multiply(int a, int b) throws MyException {
		if (a > 0 && b > 0) {

			String descript = "MyException - a>0 and b>0";
			throw new MyException(descript);

		} else {
			result = a * b;
			System.out.println(result);
		}

	}

	@Override
	public String toString() {
		return "Methods [plus=" + result + "]";
	}

}
