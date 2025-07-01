package LinkedList;

public class SupportTicket {

	private int id;
	private String customerName;
	private String issue;
	private int priority; //less number= high priority
	
	public SupportTicket(int id, String customerName, String issue, int priority) {
		this.id= id;
		this.customerName= customerName;
		this.issue= issue;
		this.priority= priority;
	}
	public int getPriority(){
		return priority;
	}
	@Override
	public String toString() {
		return "SupportTicket [id=" + id + ", customerName=" + customerName + ", issue=" + issue + ", priority="
				+ priority + "]";
	}
	
	
}
