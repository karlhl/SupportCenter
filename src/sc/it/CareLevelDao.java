package sc.it;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sc.entity.CareContent;
import sc.entity.CareLevel;
	
public class CareLevelDao {
	public static void main(String[] args) {
		CareLevelDao cd = new CareLevelDao();
		//CareLevel c = new CareLevel("4","非常低",2);
		
		cd.delect("4");
	}
	
	public boolean insert(CareLevel c) {
		// mysql
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			// 
			String sql = "insert into care_level values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			//
			ps.setString(1, c.getID());
			ps.setString(2, c.getLEVEL_NAME());
			ps.setInt(3, c.getLEVEL_STATUS());

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
			String sql = "delete from care_level where ID = ?";
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
	
	public void update(CareLevel c) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			System.out.println(conn);
			// 3.sql语句
			String sql = "UPDATE care_level set LEVEL_NAME=?,LEVEL_STATUS=? where ID=?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			// 4.指定sql语句中的占位符
			ps.setString(3,c.getID());
			ps.setString(1,c.getLEVEL_NAME());
			ps.setInt(2,c.getLEVEL_STATUS());

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
	
	public CareLevel queryByID(String cid) {
		CareLevel s = null;
		Connection conn =  DBUtil.getConnection();
		String sql = "select * from care_level where ID = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cid);
			
			//对select这一类sql需要用到结果集
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				String ID = rs.getString(1);
				String LEVEL_NAME = rs.getString(2);
				String LEVEL_STATUS = rs.getString(3);

				
				s=new CareLevel(ID,LEVEL_NAME,Integer.parseInt(LEVEL_STATUS));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn);
		}
		return s;
	}
	
	public ArrayList<CareLevel> queryAll(){
		ArrayList<CareLevel> CareLevels = new ArrayList<>();
		Connection conn =  DBUtil.getConnection();
		String sql = "select * from care_level";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			//对select这一类sql需要用到结果集
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				String ID = rs.getString(1);
				String LEVEL_NAME = rs.getString(2);
				String LEVEL_STATUS = rs.getString(3);

				
				CareLevel s=new CareLevel(ID,LEVEL_NAME,Integer.parseInt(LEVEL_STATUS));
				CareLevels.add(s);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn);
		}
		return CareLevels;
	}
}
