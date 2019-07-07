package sc.entity;

public class Customer {
	private int ID;
	private String name;
	private int age;
	private String sex;
	private String IDCARD;
	private String roomID;
	private String bulidingID;
	private String recordID;
	private String elderType;
	private String checkInDate;
	private String ExpirationtionDate;
	private String contactTel;
	private String bedID;
	private String Psychosomaticstate;
	private String attention;
	private String birthday;
	private String height;
	
	
	
	
	
	public Customer(String name, int age, String sex, String iDCARD,String recordID, String elderType,String checkInDate, String expirationtionDate, String contactTel, String birthday, String height) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.IDCARD = iDCARD;
		this.recordID = recordID;
		this.elderType = elderType;
		this.checkInDate = checkInDate;
		this.ExpirationtionDate = expirationtionDate;
		this.contactTel = contactTel;
		this.birthday = birthday;
		this.height = height;
	}


	public Customer(int ID, String name, int age, String sex, String IDCARD, String roomID, String bulidingID,
			String recordID, String elderType, String checkInDate, String expirationtionDate, String contactTel,
			String bedID, String psychosomaticstate, String attention, String birthday, String height) {
		super();
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.IDCARD = IDCARD;
		this.roomID = roomID;
		this.bulidingID = bulidingID;
		this.recordID = recordID;
		this.elderType = elderType;
		this.checkInDate = checkInDate;
		this.ExpirationtionDate = expirationtionDate;
		this.contactTel = contactTel;
		this.bedID = bedID;
		this.Psychosomaticstate = psychosomaticstate;
		this.attention = attention;
		this.birthday = birthday;
		this.height = height;
	}
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + ", age=" + age + ", sex=" + sex + ", IDCARD=" + IDCARD
				+ ", roomID=" + roomID + ", bulidingID=" + bulidingID + ", recordID=" + recordID + ", elderType="
				+ elderType + ", checkInDate=" + checkInDate + ", ExpirationtionDate=" + ExpirationtionDate
				+ ", contactTel=" + contactTel + ", bedID=" + bedID + ", Psychosomaticstate=" + Psychosomaticstate
				+ ", attention=" + attention + ", birthday=" + birthday + ", height=" + height + "]";
	}


	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		this.ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIDCARD() {
		return IDCARD;
	}
	public void setIDCARD(String iDCARD) {
		this.IDCARD = iDCARD;
	}
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	public String getBulidingID() {
		return bulidingID;
	}
	public void setBulidingID(String bulidingID) {
		this.bulidingID = bulidingID;
	}
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}
	public String getElderType() {
		return elderType;
	}
	public void setElderType(String elderType) {
		this.elderType = elderType;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getExpirationtionDate() {
		return ExpirationtionDate;
	}
	public void setExpirationtionDate(String expirationtionDate) {
		this.ExpirationtionDate = expirationtionDate;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getBedID() {
		return bedID;
	}
	public void setBedID(String bedID) {
		this.bedID = bedID;
	}
	public String getPsychosomaticstate() {
		return Psychosomaticstate;
	}
	public void setPsychosomaticstate(String psychosomaticstate) {
		this.Psychosomaticstate = psychosomaticstate;
	}
	public String getAttention() {
		return attention;
	}
	public void setAttention(String attention) {
		this.attention = attention;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

}
