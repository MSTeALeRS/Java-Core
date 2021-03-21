package logos;



public class app {

	public static void main(String[] args) {

		int a = 3;
		byte b = 4;
		short c = 5;
		long d = 6;
		float i1 = 6.5F;
		double e = 3.4;
		boolean f = true;
		boolean g = false;
		

		System.out.println("MAX INT = " + Integer.MAX_VALUE);
		System.out.println("MIN INT = " + Integer.MIN_VALUE);
		System.out.println("MAX Byte = " + Byte.MAX_VALUE);
		System.out.println("MIN Byte = " + Byte.MIN_VALUE);
		System.out.println("MAX Short = " + Short.MAX_VALUE);
		System.out.println("MIN Short = " + Short.MIN_VALUE);
		System.out.println("MAX Long = " + Long.MAX_VALUE);
		System.out.println("MIN Long = " + Long.MIN_VALUE);
		System.out.println("MAX Float = " + Float.MAX_VALUE);
		System.out.println("MIN Float = " + Float.MIN_VALUE);
		System.out.println("MAX Double = " + Double.MAX_VALUE);
		System.out.println("MIN Double = " + Double.MIN_VALUE);

		int[] new_mas = new int[10];

		int max = new_mas.length - 1;
		int min = new_mas[0];
		for (int i = 0; i < 10; i++)
			System.out.println("Mas = " + i);

		System.out.println("Найбільше значення = " + max);
		System.out.println("Найменше значення = " + min);

	}

}
