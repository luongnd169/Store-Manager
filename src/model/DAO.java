package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {

	Connection con;

	public DAO() {
		getConnect();
	}

	public Connection getConnect() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// String url = "jdbc:odbc:smbd";
		// String user = "";
		// String password = "";
		try {
			con = DriverManager.getConnection("jdbc:odbc:smdb");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public ArrayList<Item> getItems() {
		ArrayList<Item> list = new ArrayList<>();

		try {
			Statement st = con.createStatement();
			String query = "Select * from item";
			ResultSet rs = st.executeQuery(query);
			if (rs == null) {
				System.out.println("NULL");
			} else {
				while (rs.next()) {
					String serialNumber = rs.getString("sn");
					String name = rs.getString("name");
					String type = rs.getString("type");
					double purchasePrice = rs.getDouble("purchase");
					double sellPrice = rs.getDouble("sell");
					int quantity = rs.getInt("quantity");
					Customer provider = new Customer();
					Item i = new Item(serialNumber, name, type, purchasePrice, sellPrice, quantity, provider);
					list.add(i);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public ResultSet getItem(){
		Statement st;
		ResultSet rs;
		try {
			st = con.createStatement();
			String query = "Select * from item";
			rs = st.executeQuery(query);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		DAO dao = new DAO();
		ArrayList<Item> list = dao.getItems();
		for (Item i : list) {
			System.out.println(i.toString());
		}
	}
}
