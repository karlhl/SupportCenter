package sc.entity;

public class NursingRecord {
	private String ID;
	private String CUSTOMER_ID;//客户id
	private	String CONTENT_ID;//护理项目id
	private String NURSING_TIME;//护理时间
	private String NURSING_COUNT;//护理数量
	private String STAFFINFO_ID;//护理人员id
	private String NURSING_ID;//护理安排id
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public String getCONTENT_ID() {
		return CONTENT_ID;
	}
	public void setCONTENT_ID(String cONTENT_ID) {
		CONTENT_ID = cONTENT_ID;
	}
	public String getNURSING_TIME() {
		return NURSING_TIME;
	}
	public void setNURSING_TIME(String nURSING_TIME) {
		NURSING_TIME = nURSING_TIME;
	}
	public String getNURSING_COUNT() {
		return NURSING_COUNT;
	}
	public void setNURSING_COUNT(String nURSING_COUNT) {
		NURSING_COUNT = nURSING_COUNT;
	}
	public String getSTAFFINFO_ID() {
		return STAFFINFO_ID;
	}
	public void setSTAFFINFO_ID(String sTAFFINFO_ID) {
		STAFFINFO_ID = sTAFFINFO_ID;
	}
	public String getNURSING_ID() {
		return NURSING_ID;
	}
	public void setNURSING_ID(String nURSING_ID) {
		NURSING_ID = nURSING_ID;
	}
	@Override
	public String toString() {
		return "NursingRecord [ID=" + ID + ", CUSTOMER_ID=" + CUSTOMER_ID + ", CONTENT_ID=" + CONTENT_ID
				+ ", NURSING_TIME=" + NURSING_TIME + ", NURSING_COUNT=" + NURSING_COUNT + ", STAFFINFO_ID="
				+ STAFFINFO_ID + ", NURSING_ID=" + NURSING_ID + "]";
	}
	public NursingRecord(String iD, String cUSTOMER_ID, String cONTENT_ID, String nURSING_TIME, String nURSING_COUNT,
			String sTAFFINFO_ID, String nURSING_ID) {
		super();
		ID = iD;
		CUSTOMER_ID = cUSTOMER_ID;
		CONTENT_ID = cONTENT_ID;
		NURSING_TIME = nURSING_TIME;
		NURSING_COUNT = nURSING_COUNT;
		STAFFINFO_ID = sTAFFINFO_ID;
		NURSING_ID = nURSING_ID;
	}
	public NursingRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
