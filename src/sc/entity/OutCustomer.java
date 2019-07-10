package sc.entity;

public class OutCustomer {
	private int ID;
	private int customerID;
	private String outgoingReason;
	private String outgoingTime;
	private String expectedReturnTime;
	private String actualReturnTime;
	private String escorted;
	private String relation;
	private String escortedTel;
	
	public OutCustomer() {
		super();
	}
	public OutCustomer(int customerID, String outgoingReason, String outgoingTime, String expectedReturnTime,
			String actualReturnTime, String escorted, String relation, String escortedTel) {
		super();
		this.customerID = customerID;
		this.outgoingReason = outgoingReason;
		this.outgoingTime = outgoingTime;
		this.expectedReturnTime = expectedReturnTime;
		this.actualReturnTime = actualReturnTime;
		this.escorted = escorted;
		this.relation = relation;
		this.escortedTel = escortedTel;
	}
	public OutCustomer(int iD, int customerID, String outgoingReason, String outgoingTime, String expectedReturnTime,
			String actualReturnTime, String escorted, String relation, String escortedTel) {
		super();
		ID = iD;
		this.customerID = customerID;
		this.outgoingReason = outgoingReason;
		this.outgoingTime = outgoingTime;
		this.expectedReturnTime = expectedReturnTime;
		this.actualReturnTime = actualReturnTime;
		this.escorted = escorted;
		this.relation = relation;
		this.escortedTel = escortedTel;
	}
	@Override
	public String toString() {
		return "OutCustomer [ID=" + ID + ", customerID=" + customerID + ", outgoingReason=" + outgoingReason
				+ ", outgoingTime=" + outgoingTime + ", expectedReturnTime=" + expectedReturnTime
				+ ", actualReturnTime=" + actualReturnTime + ", escorted=" + escorted + ", relation=" + relation
				+ ", escortedTel=" + escortedTel + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getOutgoingReason() {
		return outgoingReason;
	}
	public void setOutgoingReason(String outgoingReason) {
		this.outgoingReason = outgoingReason;
	}
	public String getOutgoingTime() {
		return outgoingTime;
	}
	public void setOutgoingTime( String outgoingTime) {
		this.outgoingTime = outgoingTime;
	}
	public String getExpectedReturnTime() {
		return expectedReturnTime;
	}
	public void setExpectedReturnTime(String expectedReturnTime) {
		this.expectedReturnTime = expectedReturnTime;
	}
	public String getActualReturnTime() {
		return actualReturnTime;
	}
	public void setActualReturnTime(String actualReturnTime) {
		this.actualReturnTime = actualReturnTime;
	}
	public String getEscorted() {
		return escorted;
	}
	public void setEscorted(String escorted) {
		this.escorted = escorted;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getEscortedTel() {
		return escortedTel;
	}
	public void setEscortedTel(String escortedTel) {
		this.escortedTel = escortedTel;
	}

	
	
}
