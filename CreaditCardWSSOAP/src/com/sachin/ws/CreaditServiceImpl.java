package com.sachin.ws;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.sachin.dto.AccStatementDTO;
import com.sachin.dto.CustomerDTO;

@WebService(endpointInterface = "com.sachin.ws.CreaditService")
public class CreaditServiceImpl {

	public List<AccStatementDTO> getStatement(CustomerDTO customerDTO) throws SQLException, IOException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webservice", "root", "root");
		String sql = "select * from customer_cardinfo where card_number=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, customerDTO.getCard_num());
		CustomerDTO cs = new CustomerDTO();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			if (rs.getString("card_number").equals(customerDTO.getCard_num()) && rs.getString("cust_name").equals(customerDTO.getCust_name())
					&& rs.getInt("cvv") == customerDTO.getCvv() && rs.getString("exp_date").equals(customerDTO.getExp_date())) {
				cs.setCard_num(rs.getString("card_number"));
				cs.setCust_name(rs.getString("cust_name"));
				cs.setCvv(rs.getInt("cvv"));
				cs.setExp_date(rs.getString("exp_date"));
				cs.setStatement_tbl(rs.getString("statement_table"));

			}

		}
		
		
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
		
		return list;
	}
	
}
