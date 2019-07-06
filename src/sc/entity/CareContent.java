package sc.entity;

public class CareContent {
	private String id;//主键
	private String serialNumber;//编号
	private String nursingName;//名称
	private String servicePrice;//价格
	private String describe;//描述
	private int incrementFlag;//是否增值，1 是 2否
	private int status;//״̬状态1启用，2停用
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getNursingName() {
		return nursingName;
	}
	public void setNursingName(String nursingName) {
		this.nursingName = nursingName;
	}
	public String getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getIncrementFlag() {
		return incrementFlag;
	}
	public void setIncrementFlag(int incrementFlag) {
		this.incrementFlag = incrementFlag;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public CareContent(String id, String serialNumber, String nursingName, String servicePrice, String describe,
			int incrementFlag, int status) {
		super();
		this.id = id;
		this.serialNumber = serialNumber;
		this.nursingName = nursingName;
		this.servicePrice = servicePrice;
		this.describe = describe;
		this.incrementFlag = incrementFlag;
		this.status = status;
	}
	public CareContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CareContent [id=" + id + ", serialNumber=" + serialNumber + ", nursingName=" + nursingName
				+ ", servicePrice=" + servicePrice + ", describe=" + describe + ", incrementFlag=" + incrementFlag
				+ ", status=" + status + "]";
	}
	
	
}
