package LinkedList;

import java.time.chrono.IsoChronology;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {

	private LinkedList<SupportTicket> ticketQueue;
	
	public TicketingSystem() {
		this.ticketQueue= new LinkedList<>();
	}
	
	//Add new support ticket
	public void addTicket(SupportTicket ticket) {
		ticketQueue.add(ticket);
		System.out.println("Added new ticket: " +ticket);
	}
	
	 // Peek at the next ticket to be processed
	public void peekNextTicket() {
		if(!ticketQueue.isEmpty()) {
			System.out.println("Next ticket: " +ticketQueue.peek());
		}
		else {
			System.out.println("Queue is empty");
		}
	}
	
	//Process (remove) the highest-priority ticket
	public void processNextTiket() {
		if(!ticketQueue.isEmpty()) {
			SupportTicket processedTicket= ticketQueue.poll();
			System.out.println("Proccessed ticket: " +processedTicket);
		}
	}
	
	// View all pending tickets
	public void pendingTickets() {
		if(ticketQueue.isEmpty()) {
			System.out.println("No pending tickets");
		}
		else {
			System.out.println("Pending tickets: ");
			for(SupportTicket ticket: ticketQueue) {
				System.out.println(ticket);
			}
		}
	}
	
	// Sort tickets by priority (lower number = higher priority)
	public void sortByPriority() {
		ticketQueue.sort(Comparator.comparing(SupportTicket::getPriority));
		System.out.println("Tickets sorted by Priority");
		System.out.println(ticketQueue);
	}
	
	
	
}
