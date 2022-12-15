package member;

public class Manager{
	
	String specialization;

	 Manager(){
			
		     specialization = "Java Basics";
			
		}
		 

		 Manager(String specialization){
		 
			this.specialization=specialization;
		
			
		}
		 
			public void printsalary()
			{
				
				System.out.println("Person Department is = "+specialization);
				
				System.out.println();
				 
			}


}
