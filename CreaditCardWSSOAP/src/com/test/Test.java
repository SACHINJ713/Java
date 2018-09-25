package com.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sachin.dto.AccStatementDTO;
import com.sachin.dto.CustomerDTO;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		CustomerDTO c = new CustomerDTO();
		c.setCard_num("4321123487655679");
		c.setCust_name("SWAPNIL R DERLE");
		c.setCvv(345);
		c.setExp_date("2/2055");
		c.setStatement_tbl("4321123487655679");

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webservice", "root", "root");
		// String sql = "insert into 4321123487655679_statement(date,ref_number,transaction_details,reward_points,currency,international_amount,amount) values(?,?,?,?,?,?,?)";
		// String sql = "insert into customer_cardinfo values(?,?,?,?,?)";
		String sql = "select * from customer_cardinfo where card_number=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, c.getCard_num());

		// ps.setString(1, c.getCard_num());
		// ps.setString(2, c.getCust_name());
		// ps.setInt(3, c.getCvv());
		// ps.setString(4, c.getExp_date());
		// ps.setString(5, c.getStatement_tbl());

		/* ps.setDate(1, new Date(0));
		 ps.setString(2, "1234567892323");
		 ps.setString(3, "Durga hotel IN");
		 ps.setInt(4, 1);
		 ps.setString(5, "RS");
		 ps.setDouble(6, 87872);
		 ps.setDouble(7, 650.50);

		 int i = ps.executeUpdate();
System.out.println(i);
ps.close();
		 con.close();*/
		CustomerDTO cs = new CustomerDTO();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			if (rs.getString("card_number").equals(c.getCard_num()) && rs.getString("cust_name").equals(c.getCust_name())
					&& rs.getInt("cvv") == c.getCvv() && rs.getString("exp_date").equals(c.getExp_date())) {
				cs.setCard_num(rs.getString("card_number"));
				cs.setCust_name(rs.getString("cust_name"));
				cs.setCvv(rs.getInt("cvv"));
				cs.setExp_date(rs.getString("exp_date"));
				cs.setStatement_tbl(rs.getString("statement_table"));

			}

		}
		System.out.println(cs);
		ps.close();
		
		System.out.println(cs.getStatement_tbl());
		
		List<AccStatementDTO> list = new ArrayList<>();
		String sql1 = "select * from "+cs.getStatement_tbl();
		PreparedStatement ps1 = con.prepareStatement(sql1);
		ResultSet rs1 = ps1.executeQuery();
		while(rs1.next())
		{
			AccStatementDTO t = new AccStatementDTO();
			t.setDate(rs1.getDate("date"));
			t.setRef_number(rs1.getString("ref_number"));
			t.setTransaction_details(rs1.getString("transaction_details"));
			t.setReward_point(rs1.getInt("reward_points"));
			t.setCurrency(rs1.getString("currency"));
			t.setInternational_amount(rs1.getDouble("international_amount"));
			t.setAmount(rs1.getDouble("amount"));
			list.add(t);
		}
		
		ps1.close();
		con.close();
		for(AccStatementDTO a : list)
		{
			System.out.println(a);
		}
	}

}
