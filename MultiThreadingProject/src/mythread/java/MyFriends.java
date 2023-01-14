package mythread.java;

//creating MyFriends class as a thread by using extending Thread class
public class MyFriends extends Thread{

	@Override
	  public void run() {
		// creating an string array with initialization of ten friends
		String[] friendsName = {"Avantika","Bhargwi","Khusum","Megha","Tanvi","Pooja","Rashmi","Riya","Tishu","Anu"};
		
		//printing all names stored in the array
		for (String string : friendsName) {
			// Thread.currentThread().getName() used to print the thread name
			System.out.println(Thread.currentThread().getName()+" : "+string);
		}
		
	}

}