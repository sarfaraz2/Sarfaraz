package function;

public class Myclass {

	public static void main(String[] args)
	{
		Employee emp=new Employee();
		int j=emp.show(10);
		System.out.println(j);
		
		j=emp.add(2, 5);
		System.out.println(j);
		
		String st=emp.add("Sachin Tendulkar");
		System.out.println();
		j=emp.add1(2, 5,6);
		System.out.println(j);
		
		j=emp.add();
		System.out.println(j);
		
	
	
	}

}
