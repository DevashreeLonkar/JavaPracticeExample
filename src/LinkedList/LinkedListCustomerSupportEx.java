package LinkedList;

public class LinkedListCustomerSupportEx {

	public static void main(String[] args) {
		TicketingSystem ticketingSystem= new TicketingSystem();
		
		 // Adding sample tickets
		ticketingSystem.addTicket(new SupportTicket(101, "Alice", "Cannot log in", 2));
		ticketingSystem.addTicket(new SupportTicket(102, "Bob", "Payment issue", 1));
	    ticketingSystem.addTicket(new SupportTicket(103, "Charlie", "App crash on startup", 3));
	    
	 // Viewing all tickets
	    ticketingSystem.pendingTickets();
	    
	 // Sorting tickets by priority
	    ticketingSystem.sortByPriority();
	    
	 // Checking next ticket without removing
	    ticketingSystem.peekNextTicket();
	    
	 // Processing a ticket
	    ticketingSystem.processNextTiket();
	    ticketingSystem.pendingTickets();
	}
}
