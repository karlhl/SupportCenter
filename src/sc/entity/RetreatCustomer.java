package sc.entity;

public class RetreatCustomer {
	private int ID;
	private int customerID;
	private String retreatTime;
	private String retreatReason;
	private String describe2;
	private String askTime;
	
	
	public RetreatCustomer(int customerID, String retreatTime, String retreatReason, String describe2, String askTime) {
		super();
		this.customerID = customerID;
		this.retreatTime = retreatTime;
		this.retreatReason = retreatReason;
		this.describe2 = describe2;
		this.askTime = askTime;
	}
	public RetreatCustomer(int iD, int customerID, String retreatTime, String retreatReason, String describe2,
			String askTime) {
		super();
		ID = iD;
		this.customerID = customerID;
		this.retreatTime = retreatTime;
		this.retreatReason = retreatReason;
		this.describe2 = describe2;
		this.askTime = askTime;
	}
	public RetreatCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RetreatCustomer [ID=" + ID + ", customerID=" + customerID + ", retreatTime=" + retreatTime
				+ ", retreatReason=" + retreatReason + ", describe2=" + describe2 + ", askTime=" + askTime + "]";
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
	public String getRetreatTime() {
		return retreatTime;
	}
	public void setRetreatTime(String retreatTime) {
		this.retreatTime = retreatTime;
	}
	public String getRetreatReason() {
		return retreatReason;
	}
	public void setRetreatReason(String retreatReason) {
		this.retreatReason = retreatReason;
	}
	public String getDescribe2() {
		return describe2;
	}
	public void setDescribe2(String describe2) {
		this.describe2 = describe2;
	}
	public String getAskTime() {
		return askTime;
	}
	public void setAskTime(String askTime) {
		this.askTime = askTime;
	}
	
	
}
