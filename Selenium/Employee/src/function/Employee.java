package function;

public class Employee
{
   int show(int i)
   {
	   i++;
	  return i; 
   }
   
   int add(int i,int j)
   {
	   int k=i+j;
	   return k; 	   
   }
   
   String add(String st)
   {
	// System.out.println(st); 
	   return st;
	  	   
   }
   
   int add1(int i,int j,int k)
   {
	   int m=i+j+k;
	   return m; 	   
   }   
   int add()
   {
	   int k=1;
	   return k; 	   
   }
}