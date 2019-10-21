
public class Myfirst {

	public static void main(String[] args) { 
			 
			 Employee obj1=new Employee();
			 obj1.EmpId=1183;
			 obj1.Empname="Sarfaraz";
			 obj1.EmpSalary=1185667;
			 //Employee.Companyname="Icreon";
			 
			 System.out.println(obj1.EmpId+" "+obj1.Empname );
			 System.out.println("Emp Salary:" +obj1.EmpSalary);
			 System.out.println(Employee.Companyname);
			 System.out.println(obj1);
			 }

	@Override
	public String toString() {
		return "Myfirst [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
