package sc.it;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import sc.entity.Customer;
import sc.entity.RetreatCustomer;

public class RetreatCustomerDao {
	
	
	public static void main(String[] args) {
		RetreatCustomerDao retreatCustomerDao = new RetreatCustomerDao();
		ArrayList<Customer> customers = retreatCustomerDao.queryCustomerNoRetreat("ÉòÑÇ¶«");
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	
	public ArrayList<RetreatCustomer> queryRetreatByID(int ID) {
		ArrayList<RetreatCustomer> retreatCustomers = new ArrayList<>();
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from tuizhudengji where ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, ID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int customerID = rs.getInt(2);
				String retreatTime = rs.getString(3);
				String retreatReason = rs.getString(4);
				String describe = rs.getString(5);
				String askTime = rs.getString(6);
				RetreatCustomer retreatCustomer =  new RetreatCustomer(ID, customerID, retreatTime, retreatReason, describe, askTime);
				retreatCustomers.add(retreatCustomer);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(connection);
		}
		
		return retreatCustomers;
	}
		
	public boolean insert(RetreatCustomer retreatCustomer) {
		
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "insert into tuizhudengji(ID,CUSTOMERID,RETREATTIME,RETREATREASON,DESCRIBE2,ASKTIME) values(?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, retreatCustomer.getID());
			ps.setInt(2, retreatCustomer.getCustomerID());
			ps.setString(3, retreatCustomer.getRetreatTime());
			ps.setString(4, retreatCustomer.getRetreatReason());
			ps.setString(5, retreatCustomer.getDescribe2());
			ps.setString(6, retreatCustomer.getAskTime());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally {
			DBUtil.close(connection);
		}	
	}
	
	public void delete(RetreatCustomer retreatCustomer) {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "delete from tuizhudengji where ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, retreatCustomer.getID());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			DBUtil.close(connection);
		}
		
	}
	public void update(RetreatCustomer retreatCustomer) {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "update tuizhudengji set CUSTOMERID = ?,RETREATTIME = ?,RETREATREASON = ?,DESCRIBE2=?,ASKTIME=? where ID=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, retreatCustomer.getCustomerID());
			ps.setString(2, retreatCustomer.getRetreatTime());
			ps.setString(3, retreatCustomer.getRetreatReason());
			ps.setString(4, retreatCustomer.getDescribe2());
			ps.setString(5, retreatCustomer.getAskTime());
			ps.setInt(6, retreatCustomer.getID());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(connection);
		}	
	}
	public ArrayList<Integer> qureyCustomerID (String name) {
		ArrayList<Integer>  ids = new ArrayList<>();
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from ruzhudengji where CUSTOMERNAME = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				ids.add(id);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(connection);
		}
		return ids;
	}	
	public ArrayList<RetreatCustomer> queryRetreatCustomersByName(String name) {
		ArrayList<RetreatCustomer> retreatCustomers = new ArrayList<>();
		ArrayList<Integer> ids = qureyCustomerID(name);
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "select * from tuizhudengji where CUSTOMERID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			for (Integer id : ids) {
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int ID = rs.getInt(1);
					int customerID = rs.getInt(2);
					String retreatTime = rs.getString(3);
					String retreatReason = rs.getString(4);
					String describe = rs.getString(5);
					String askTime = rs.getString(6);
					RetreatCustomer retreatCustomer =  new RetreatCustomer(ID, customerID, retreatTime, retreatReason, describe, askTime);
					retreatCustomers.add(retreatCustomer);
				}
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(connection);
		}
			return retreatCustomers;
	}
	
	
	public ArrayList<Customer> queryCustomerNoRetreat(String name){
		
		CustomerDao customerDao = new CustomerDao();
		RetreatCustomerDao retreatCustomerDao = new RetreatCustomerDao();
		ArrayList<Customer> customers = customerDao.queryName(name);
		ArrayList<RetreatCustomer> retreatCustomers = retreatCustomerDao.queryRetreatCustomersByName(name);
		Iterator<Customer> iterator = customers.iterator();
		while(iterator.hasNext()){
			Customer customer = iterator.next();
		//	System.out.println(customer);
			for (RetreatCustomer retreatCustomer : retreatCustomers) {
				//System.out.println(retreatCustomer);
				if(customer.getID() == retreatCustomer.getCustomerID()){
					iterator.remove();
				}
			}
		}
		return customers;
	}

}
