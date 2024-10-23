/*
Java Singleton Design Pattern

- Singleton design pattern can be defined as at any point of time we can create a single object, if we try to create an object again and again it will return the same object.

Can you explain the one of the way to create singleton design pattern ?
>> There are many approach to create singleton design pattern :
- However one of the widely used approaches includes :-

Step 1 : By creating a private constructor to restrict instance creation of the class from another class.

Step 2 : By using private static reference variable at the same class which is the only instance of the class by implementing public static method that returns the instance of the class which will act as the global access point for other classes to interact with the singleton class.

*/
class PVRMovies{
	
	//private static reference variable
	private static PVRMovies mTicket;
	private static boolean bookingStatus = false;
	
	//creating a private constructor
	private PVRMovies(){
		System.out.println("Welcome to PVRMovies.");
	}
	
	//public static method that returns the instance
	public static PVRMovies bookTicket(){
		System.out.println("Ticket booking is in progress......");
		if(bookingStatus == false){
			mTicket = new PVRMovies();
			bookingStatus = true;
		}
		return mTicket;
	}
}
class BookMyShow{
	public static void main(String args[]){
		System.out.println("Start @Cyber Success");
		
		PVRMovies mTicket1 = PVRMovies.bookTicket();
		System.out.println(mTicket1);
		mTicket1 = PVRMovies.bookTicket();
		System.out.println(mTicket1);
		
		System.out.println(" -------------------------------------------- ");
		
		PVRMovies mTicket2 = PVRMovies.bookTicket();
		System.out.println(mTicket2);
		
		System.out.println("Stop @Cyber Success");
	}
}