package member;

public class Employee  {
	
	String department;

	 Employee(){
			
		    department="Electrical Engineer";
			
		}
		 

		 Employee(String derpartment){
		 
			this.department=department;
		
			
		}
		 
			public void printsalary()
			{
				
				System.out.println("Person Department is = "+department);
				
				System.out.println();
				 
			}


}
