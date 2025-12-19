package operators;

public class typeCasting {

//	TypeCasting 
//	2 type of TypeCasting  ( Implicity and Explicity )
	
	public static void main(String[] args) {
		
		int num = 10;
		
		// Implicit typeCasting  -> Smallest Data type to larger Data type
		long longNum = num;
		
		
		double numDouble = 10.5;
		 
		// Explicity typeCasting  -> larger Data type to smaller Data type
		
		int intNum = (int) numDouble;

		System.out.println("num = " + num);
		System.out.println("numDouble = " + numDouble);
		System.out.println(num + " " + numDouble);
		System.out.println(num + numDouble);
	}

}
