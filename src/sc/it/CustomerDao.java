package sc.it;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sc.it.DBUtil;
import sc.entity.Customer;

public class CustomerDao {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		CustomerDao cDao = new CustomerDao();
		
		customer.setName("xiaobai");
		
		cDao.insert(customer);
	}

	public ArrayList<Customer> queryAll() {
		
		ArrayList<Customer> customers = new ArrayList<>();
		Connection conn = DBUtil.getConnection();
		String sql = "select * from ruzhudengji";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int ID = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String sex = rs.getString(4);
				String IDCARD = rs.getString(5);
				String roomID = rs.getString(6);
				String bulidingID = rs.getString(7);
				String recordID = rs.getString(8);
				String elderType = rs.getString(9);
				String checkInDate = rs.getString(10);
				String expirationtionDate = rs.getString(11);
				String contactTel = rs.getString(12);
				String bedID = rs.getString(13);
				String psychosomaticstate = rs.getString(14);
				String attention = rs.getString(15);
				String birthday = rs.getString(16);
				String height = rs.getString(17);
				Customer customer = new Customer(ID, name, age, sex, IDCARD, roomID, bulidingID, recordID, elderType, checkInDate, expirationtionDate, contactTel, bedID, psychosomaticstate, attention, birthday, height);
				customers.add(customer);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(conn);
		}
		return customers;
	}
	
	/////
public ArrayList<Customer> queryName(String Name) {
		ArrayList<Customer> customers = new ArrayList<>();
		Connection conn = DBUtil.getConnection();
		String sql = "select * from ruzhudengji where CUSTOMERNAME = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int ID = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String sex = rs.getString(4);
				String IDCARD = rs.getString(5);
				String roomID = rs.getString(6);
				String bulidingID = rs.getString(7);
				String recordID = rs.getString(8);
				String elderType = rs.getString(9);
				String checkInDate = rs.getString(10);
				String expirationtionDate = rs.getString(11);
				String contactTel = rs.getString(12);
				String bedID = rs.getString(13);
				String psychosomaticstate = rs.getString(14);
				String attention = rs.getString(15);
				String birthday = rs.getString(16);
				String height = rs.getString(17);
				Customer customer = new Customer(ID, name, age, sex, IDCARD, roomID, bulidingID, recordID, elderType, checkInDate, expirationtionDate, contactTel, bedID, psychosomaticstate, attention, birthday, height);
				customers.add(customer);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(conn);
		}
		return customers;
	}
	
public ArrayList<Customer> queryByID(int ID) {
	ArrayList<Customer> customers = new ArrayList<>();
	Connection conn = DBUtil.getConnection();
	String sql = "select * from ruzhudengji where ID = ?";
	try {
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,ID);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			String name = rs.getString(2);
			int age = rs.getInt(3);
			String sex = rs.getString(4);
			String IDCARD = rs.getString(5);
			String roomID = rs.getString(6);
			String bulidingID = rs.getString(7);
			String recordID = rs.getString(8);
			String elderType = rs.getString(9);
			String checkInDate = rs.getString(10);
			String expirationtionDate = rs.getString(11);
			String contactTel = rs.getString(12);
			String bedID = rs.getString(13);
			String psychosomaticstate = rs.getString(14);
			String attention = rs.getString(15);
			String birthday = rs.getString(16);
			String height = rs.getString(17);
			Customer customer = new Customer(ID, name, age, sex, IDCARD, roomID, bulidingID, recordID, elderType, checkInDate, expirationtionDate, contactTel, bedID, psychosomaticstate, attention, birthday, height);
			customers.add(customer);
		}
		
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		DBUtil.close(conn);
	}
	return customers;
}
	
	/////
	public boolean insert(Customer customer ) {
		Connection connection = null;
		
		try{
			connection = DBUtil.getConnection();
			String sql = "insert into ruzhudengji(ID,CUSTOMERNAME,CUSTOMERAGE,CUSTOMERSEX,IDCARD,ROOMID,BUILDINGID,RECORDID,ELDERTYPE,CHECKINDATE,EXPIRATIONDATE,CONTACTTEL,BEDID,PSYCHOSOMATICSTATE,ATTENTION,BIRTHDAY,HEIGHT) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, customer.getID());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.setString(4, customer.getSex());
			ps.setString(5, customer.getIDCARD());
			ps.setString(6, customer.getRoomID());
			ps.setString(7, customer.getBulidingID());
			ps.setString(8, customer.getRecordID());
			ps.setString(9, customer.getElderType());
			ps.setString(10, customer.getCheckInDate());
			ps.setString(11, customer.getExpirationtionDate());
			ps.setString(12, customer.getContactTel());
			ps.setString(13, customer.getBedID());
			ps.setString(14, customer.getPsychosomaticstate());
			ps.setString(15, customer.getAttention());
			ps.setString(16, customer.getBirthday());
			ps.setString(17, customer.getHeight());	
			ps.executeUpdate();
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}finally {
			DBUtil.close(connection);
		}
		
	}
	////////
	public void delete(Customer customer) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			 String sql = "delete from ruzhudengji where ID = ?";
			 PreparedStatement ps = conn.prepareStatement(sql);
			 ps.setInt(1, customer.getID());
			 ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(conn);
		}	
	}
	
	public void update(Customer customer) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "update ruzhudengji set CUSTOMERNAME = ?,CUSTOMERAGE = ?,CUSTOMERSEX = ?,IDCARD=?,ROOMID=?,BUILDINGID=?,RECORDID=?,ELDERTYPE=?,CHECKINDATE=?,EXPIRATIONDATE=?,CONTACTTEL=?,BEDID=?,PSYCHOSOMATICSTATE=?,ATTENTION=?,BIRTHDAY=?,HEIGHT=? where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, customer.getName());
			ps.setInt(2, customer.getAge());
			ps.setString(3, customer.getSex());
			ps.setString(4, customer.getIDCARD());
			ps.setString(5, customer.getRoomID());
			ps.setString(6, customer.getBulidingID());
			ps.setString(7, customer.getRecordID());
			ps.setString(8, customer.getElderType());
			ps.setString(9, customer.getCheckInDate());
			ps.setString(10, customer.getExpirationtionDate());
			ps.setString(11, customer.getContactTel());
			ps.setString(12, customer.getBedID());
			ps.setString(13, customer.getPsychosomaticstate());
			ps.setString(14, customer.getAttention());
			ps.setString(15, customer.getBirthday());
			ps.setString(16, customer.getHeight());	
			ps.setInt(17, customer.getID());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

	
}
