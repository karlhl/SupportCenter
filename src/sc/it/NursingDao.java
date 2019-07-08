package sc.it;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import sc.entity.NursingRecord;
import sc.it.DBUtil;

public class NursingDao {
	public static void main(String[] args) {
		NursingDao nd = new NursingDao();
		NursingRecord n = new NursingRecord("4","4","3","2019-07-08","1","1","1");
		
		System.out.println(nd.quaryByID("1"));
	}
	
	
	
	
	public boolean insert(NursingRecord n) {
		// mysql连接
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			// 3.sql语句
			String sql = "INSERT INTO nursing_record VALUES(?,?,?,str_to_date(?,'%Y-%m-%d'),?,?,?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			// 4.指定sql语句中的占位符
			ps.setString(1,n.getID());
			ps.setString(2,n.getCUSTOMER_ID());
			ps.setString(3,n.getCONTENT_ID() );
			ps.setString(4,n.getNURSING_TIME());
			ps.setString(5,n.getNURSING_COUNT());
			ps.setString(6,n.getSTAFFINFO_ID());
			ps.setString(7,n.getNURSING_ID());
			// 执行
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			// 断开连接
			DBUtil.close(conn);
		}
	}
	
	public void delect(String id) {
		// mysql连接
		Connection conn = null;
		try {
			// 1、加载驱动
			// 2.建立连接
			conn = DBUtil.getConnection();
			System.out.println(conn);
			// 3.sql语句
			String sql = "delete from nursing_record where ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			// 4.指定sql语句中的占位符
			ps.setString(1, id);
			// 执行
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 断开连接
			DBUtil.close(conn);
		}
	}
	
	public void update(NursingRecord n) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			System.out.println(conn);
			// 3.sql语句
			String sql = "UPDATE nursing_record SET CUSTOMER_ID=?,CONTENT_ID=?,NURSING_TIME=?,NURSING_COUNT=?,STAFFINFO_ID=?,NURSING_ID=? where ID=?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			// 4.指定sql语句中的占位符
			ps.setString(7,n.getID());
			ps.setString(1,n.getCUSTOMER_ID());
			ps.setString(2,n.getCONTENT_ID() );
			ps.setString(3,n.getNURSING_TIME());
			ps.setString(4,n.getNURSING_COUNT());
			ps.setString(5,n.getSTAFFINFO_ID());
			ps.setString(6,n.getNURSING_ID());
			
			// 执行
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 断开连接
			DBUtil.close(conn);
		}
	}

	public ArrayList<NursingRecord> quaryByID(String id) {
		ArrayList<NursingRecord> NursingRecords = new ArrayList<>();
		Connection conn =  DBUtil.getConnection();
		String sql = "select * from nursing_record where CUSTOMER_ID = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			//对select这一类sql需要用到结果集
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				String ID = rs.getString(1);
				String CUSTOMER_ID = rs.getString(2);
				String CONTENT_ID = rs.getString(3);
				String NURSING_TIME  = rs.getString(4);
				String NURSING_COUNT  = rs.getString(5);
				String STAFFINFO_ID  = rs.getString(6);
				String NURSING_ID  = rs.getString(7);
				
				NursingRecord n=new NursingRecord(ID,CUSTOMER_ID,CONTENT_ID,NURSING_TIME,NURSING_COUNT,STAFFINFO_ID,NURSING_ID);
				NursingRecords.add(n);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn);
		}
		return NursingRecords;
	}
	
	public ArrayList<NursingRecord> queryAll(){
		ArrayList<NursingRecord> NursingRecords = new ArrayList<>();
		Connection conn =  DBUtil.getConnection();
		String sql = "select * from nursing_record";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			//对select这一类sql需要用到结果集
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				String ID = rs.getString(1);
				String CUSTOMER_ID = rs.getString(2);
				String CONTENT_ID = rs.getString(3);
				String NURSING_TIME  = rs.getString(4);
				String NURSING_COUNT  = rs.getString(5);
				String STAFFINFO_ID  = rs.getString(6);
				String NURSING_ID  = rs.getString(7);
				
				NursingRecord n=new NursingRecord(ID,CUSTOMER_ID,CONTENT_ID,NURSING_TIME,NURSING_COUNT,STAFFINFO_ID,NURSING_ID);
				NursingRecords.add(n);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn);
		}
		return NursingRecords;
	}












}
