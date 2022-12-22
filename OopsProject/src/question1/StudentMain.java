package question1;

public class StudentMain {

	public static void main(String[] args) {
        //Declaring and initializing the array....
		String[] subjects= {"Java","C/C++","OOPS"};
		
        //Instantiation of students
		Student s1=new Student("Aastha ", 22 ,"7667098886","01",subjects);
		Student s2=new Student("Satish",22,"8724569890","21",subjects);

//Printing the students details
		System.out.println(s1);
		System.out.println(s2);
		

	
	}

}
