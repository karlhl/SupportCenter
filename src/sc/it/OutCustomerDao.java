package sc.it;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sc.entity.OutCustomer;

public class OutCustomerDao {
	
	public boolean insert(OutCustomer outCustomer) {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql ="insert into waichudengji(ID,CUSTOMERID,OUTGOINGREASON,OUTGOINGTIME,EXPECTEDRETURNTIME,ACTUALRETURNTIME,ESCORTED,RELATION,ESCORTEDTEL) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, outCustomer.getID());
			ps.setInt(2, outCustomer.getCustomerID());
			ps.setString(3, outCustomer.getOutgoingReason());
			ps.setString(4, outCustomer.getOutgoingTime());
			ps.setString(5, outCustomer.getExpectedReturnTime());
			ps.setString(6, outCustomer.getActualReturnTime());
			ps.setString(7, outCustomer.getEscorted());
			ps.setString(8, outCustomer.getRelation());
			ps.setString(9, outCustomer.getEscortedTel());
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
	
	public void delete(OutCustomer outCustomer) {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "delete from waichudengji where ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, outCustomer.getID());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			DBUtil.close(connection);
		}
		
	}
	
	public ArrayList<OutCustomer> queryByID(int ID) {

		ArrayList<OutCustomer> outCustomers = new ArrayList<>();
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "SELECT * FROM waichudengji WHERE ID = ? ";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, ID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int customerID = rs.getInt(2);
				String outgoingReason = rs.getString(3);
				String outgoingTime = rs.getString(4);
				String expectedReturnTime = rs.getString(5);
				String actualReturnTime = rs.getString(6);
				String escorted = rs.getString(7);
				String relation = rs.getString(8);
				String escortedTel = rs.getString(9);
				OutCustomer outCustomer = null;
			    outCustomer = new OutCustomer(ID, customerID, outgoingReason, outgoingTime, expectedReturnTime, actualReturnTime, escorted, relation, escortedTel);
				outCustomers.add(outCustomer);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(connection);
		}
		
		return outCustomers;
	}
	
	
	public ArrayList<OutCustomer> queryByName(String name) {
		ArrayList<OutCustomer> outCustomers = new ArrayList<>();
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "SELECT *FROM waichudengji t, ruzhudengji r WHERE t.CUSTOMERID = r.ID && r.CUSTOMERNAME = ? ";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int ID = rs.getInt(1);
				int customerID = rs.getInt(2);
				String outgoingReason = rs.getString(3);
				String outgoingTime = rs.getString(4);
				String expectedReturnTime = rs.getString(5);
				String actualReturnTime = rs.getString(6);
				String escorted = rs.getString(7);
				String relation = rs.getString(8);
				String escortedTel = rs.getString(9);			
				OutCustomer outCustomer = new OutCustomer(ID, customerID, outgoingReason, outgoingTime, expectedReturnTime, actualReturnTime, escorted, relation, escortedTel);
				outCustomers.add(outCustomer);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(connection);
		}
		return outCustomers;
	}
	
	public void update(OutCustomer outCustomer) {
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			String sql = "update waichudengji set CUSTOMERID = ?,OUTGOINGREASON = ?,OUTGOINGTIME = ?,EXPECTEDRETURNTIME=?,ACTUALRETURNTIME=?,ESCORTED=?,RELATION=?,ESCORTEDTEL=? where ID=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, outCustomer.getCustomerID());
			ps.setString(2, outCustomer.getOutgoingReason());
			ps.setString(3, outCustomer.getOutgoingTime());
			ps.setString(4, outCustomer.getExpectedReturnTime());
			ps.setString(5, outCustomer.getActualReturnTime());
			ps.setString(6, outCustomer.getEscorted());
			ps.setString(7, outCustomer.getRelation());
			ps.setString(8, outCustomer.getEscortedTel());
			ps.setInt(9, outCustomer.getID());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtil.close(connection);
		}	
	}

}
