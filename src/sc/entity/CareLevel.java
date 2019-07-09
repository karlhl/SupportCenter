package sc.entity;

public class CareLevel {
	private String ID;
	private String LEVEL_NAME ;
	private int LEVEL_STATUS;
	public CareLevel(String iD, String lEVEL_NAME, int lEVEL_STATUS) {
		super();
		ID = iD;
		LEVEL_NAME = lEVEL_NAME;
		LEVEL_STATUS = lEVEL_STATUS;
	}
	public CareLevel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getLEVEL_NAME() {
		return LEVEL_NAME;
	}
	public void setLEVEL_NAME(String lEVEL_NAME) {
		LEVEL_NAME = lEVEL_NAME;
	}
	public int getLEVEL_STATUS() {
		return LEVEL_STATUS;
	}
	public void setLEVEL_STATUS(int lEVEL_STATUS) {
		LEVEL_STATUS = lEVEL_STATUS;
	}
	@Override
	public String toString() {
		return "CareLevel [ID=" + ID + ", LEVEL_NAME=" + LEVEL_NAME + ", LEVEL_STATUS=" + LEVEL_STATUS + "]";
	}
	
	
	
}
