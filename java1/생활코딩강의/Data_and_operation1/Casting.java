
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; //=
		double b2 = (double) 1;
		
		System.out.println(b);

		int c = (int) 1.1;
		
		System.out.println(c);

		// 1 to String
		String d = Integer.toString(1);
		System.out.println(d.getClass());

	}

}
