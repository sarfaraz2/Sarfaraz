package addfunction;

public class MySecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icreon S1= new Icreon();
		int Z= S1.add(1, 4, 3);
		System.out.println("Sum of Two number:" +Z);

		 Z = S1.sub(5,3);
		System.out.println("Substraction:" +Z);
		
		Z= S1.divide(4, 2);
		System.out.println("Divison:" +Z);
		
	String St= S1.name("Sarfaarz");
	System.out.println("My name is:" +St);
	
	Icreon S2= new Icreon();
	S2.Noida("Sarfarz", 3, 5);
	
	Icreon S3= new Icreon();
	S3.Noida("SADAF", "NYLON", "CYCLE"  );
	
		
		
	
	}	
}
