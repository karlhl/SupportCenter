package sc.it;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import sc.it.DBUtil;

import sc.it.*;

import sc.entity.CareContent;


public class ContentDao {
	public static void main(String[] args) {
		ContentDao cd = new ContentDao();
		//CareContent c = new CareContent("3","003","遛弯洗漱","30","无",1,1);
		//增
		//cd.insert(c);
		
		//删除
		//cd.delect("6");
		
		//改
		//cd.update(c);
		
		//查
		
//		CareContent cc = cd.quaryByID("1");
//		System.out.println(cc);
		
//		System.out.println(cd.queryAll());
		
	}
	public boolean insert(CareContent c) {
		// mysql
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			// 
			String sql = "insert into care_content values (?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			//
			ps.setString(1, c.getId());
			ps.setString(2, c.getSerialNumber());
			ps.setString(3, c.getNursingName());
			ps.setString(4,c.getServicePrice() );
			ps.setString(5,c.getDescribe() );
			ps.setInt(6, c.getIncrementFlag());
			ps.setInt(7,c.getStatus() );
			//
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			// 关闭
			DBUtil.close(conn);
		}
	}
	
	public void delect(String sid) {
		// mysql连接
		Connection conn = null;
		try {
			// 1、加载驱动
			// 2.建立连接
			conn = DBUtil.getConnection();
			System.out.println(conn);
			// 3.sql语句
			String sql = "delete from care_content where ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			// 4.指定sql语句中的占位符
			ps.setString(1, sid);
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
	
	public void update(CareContent c) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			System.out.println(conn);
			// 3.sql语句
			String sql = "UPDATE care_content set SERIAL_NUMBER=?,NURSING_NAME=?,SERVICE_PRICE=?,DESCRIBE2=?,INCREMENT_FLAG=?,STATUS2=? where ID=?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			// 4.指定sql语句中的占位符
			ps.setString(1,c.getSerialNumber());
			ps.setString(2,c.getNursingName());
			ps.setString(3,c.getServicePrice());
			ps.setString(4,c.getDescribe());
			ps.setInt(5,c.getIncrementFlag());
			ps.setInt(6,c.getStatus());
			ps.setString(7, c.getId());
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
	
	public CareContent quaryByID(String cid) {
		CareContent s = null;
		Connection conn =  DBUtil.getConnection();
		String sql = "select * from care_content where ID = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cid);
			
			//对select这一类sql需要用到结果集
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String serialNumber = rs.getString(2);
				String nursingName = rs.getString(3);
				String servicePrice  = rs.getString(4);
				String describe = rs.getString(5);
				int incrementFlag = rs.getInt(6);
				int status = rs.getInt(7);
				
				s=new CareContent(id,serialNumber,nursingName,servicePrice,describe,incrementFlag,status);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn);
		}
		return s;
	}
	
	public ArrayList<CareContent> queryAll(){
		ArrayList<CareContent> CareContents = new ArrayList<>();
		Connection conn =  DBUtil.getConnection();
		String sql = "select * from care_content";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			//对select这一类sql需要用到结果集
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String serialNumber = rs.getString(2);
				String nursingName = rs.getString(3);
				String servicePrice  = rs.getString(4);
				String describe = rs.getString(5);
				int incrementFlag = rs.getInt(6);
				int status = rs.getInt(7);
				
				CareContent c=new CareContent(id,serialNumber,nursingName,servicePrice,describe,incrementFlag,status);
				CareContents.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn);
		}
		return CareContents;
	}


}
