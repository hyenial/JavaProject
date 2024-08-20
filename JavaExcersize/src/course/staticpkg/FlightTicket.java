package course.staticpkg;

public class FlightTicket {
	public int flightNumber;
	public int seatNumber;
	public String ticketCategory;
	public int ticketId;
	
	
	
	public static int availableSeats = 50;
	
	
	public FlightTicket(int flightNumber, int seatNumber, String ticketCategory, int ticketId) {
		super();
		this.flightNumber = flightNumber;
		this.seatNumber = seatNumber;
		this.ticketCategory = ticketCategory;
		this.ticketId = ticketId;
	}
	
	
	
	public static void main(String[] args) {
		if (availableSeats >0) {
			FlightTicket ticket1 = new FlightTicket(1122, 1, "Economy", 12345);
			availableSeats--; // ticket1.availableSeats--;
		}
		
		
		//System.out.println("Available Seats :: " +availableSeats);
		
		FlightTicket ticket2 = new FlightTicket(1122, 2, "Bussiness", 12346);
		availableSeats--;
		
		System.out.println("Available Seats :: " +availableSeats);
		
		FlightTicket ticket3 = new FlightTicket(1122, 3, "Bussiness", 12347);
		availableSeats--;
		
		System.out.println("Available Seats :: " +availableSeats);
		
		
		
	}

}
