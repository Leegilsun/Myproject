package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


import model.Customer;

public class CustomerDao {
	private static CustomerDao instance;
	private Connection connection;
	private static String URL = "jdbc:mysql://127.0.0.1/customer_db";
	private static String USERNAME = "root";
	private static String PASSWORD = "mysql";
	
	public CustomerDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
	}
	
	public static CustomerDao getInstance() {
		if (instance == null) {
			instance = new CustomerDao();
		}
		return instance;
	}
	
	public boolean insertCustomer(Customer c) {
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO customer VALUES (0,?,?,?,?,?)";

		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, c.getId());
			pstmt.setString(2, c.getName());
			pstmt.setInt(3, c.getAge());
			pstmt.setString(4, c.getTel());
			pstmt.setString(5, c.getAddr());
			
			int result = pstmt.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public boolean deleteCustomer(String id) {
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM customer WHERE id = ?";
		
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, id);
			
			int result = pstmt.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public boolean updateCustomer(String id, String name, int age, String tel, String addr) {
		PreparedStatement pstmt = null;
		String sql = "UPDATE customer SET name = ?, age = ?, tel = ?, addr = ? WHERE id = ?";
		
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(3, tel);
			pstmt.setString(4, addr);
			pstmt.setString(5, id);
			pstmt.setInt(2, age);
			
			int result = pstmt.executeUpdate();
			if (result > 0) {
				return true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public Customer selectOneCustomer(String id) {
		PreparedStatement pstmt = null;
		String sql ="SELECT * FROM customer WHERE id = ?";
		ResultSet rs = null;
		Customer c = null;
		
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				c = new Customer();
				c.setId(id);
				c.setNo(rs.getInt("no"));
				c.setName(rs.getString("name"));
				c.setAddr(rs.getString("addr"));
				c.setAge(rs.getInt("age"));
				c.setTel(rs.getString("tel"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
				if (rs != null && !rs.isClosed())
					rs.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return c;
	}
	
	public List<Customer> selectAllCustomer() {
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM customer";
		ResultSet rs = null;
		Customer c = null;
		List<Customer> list = new ArrayList<Customer>();
		
		try {
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				c = new Customer();
				c.setNo(rs.getInt("no"));
				c.setId(rs.getString("id"));
				c.setName(rs.getString("name"));
				c.setAddr(rs.getString("addr"));
				c.setAge(rs.getInt("age"));
				c.setTel(rs.getString("tel"));
				
				list.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
			
	}

}
