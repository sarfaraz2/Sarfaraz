package icreon.engineering.records;

public class qaemployee {
 static String companyname="icreon";
 int empid;
 //this.epmid = empid;
 
 
void display(String empname, int empid, String Dep)
{
	System.out.println("Inserted Records:"+empname+" " +empid+" " +Dep+" " +"Companyname:"+qaemployee.companyname);
	}
void display(int n, int k, int j) {
	System.out.println("inserted records count:" +n +k +j +qaemployee.companyname);
}
void display(int n, int k){
	System.out.println("My value is:" +n+"  " +k+ " " +qaemployee.companyname);
	
	
}
}