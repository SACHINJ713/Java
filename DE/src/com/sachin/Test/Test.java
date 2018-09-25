package com.sachin.Test;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.sachin.ws.AccStatementDTO;
import com.sachin.ws.CreaditService;
import com.sachin.ws.CreaditServiceImplServiceLocator;
import com.sachin.ws.CustomerDTO;

public class Test {

	public static void main(String[] args) throws ServiceException, RemoteException {
		

		CustomerDTO c = new CustomerDTO();
		c.setCard_num("4321123487655679");
		c.setCust_name("SWAPNIL R DERLE");
		c.setCvv(345);
		c.setExp_date("2/2055");
		c.setStatement_tbl("4321123487655679");
		
		CreaditServiceImplServiceLocator cl = new CreaditServiceImplServiceLocator();
		CreaditService creaditService = cl.getCreaditServiceImplPort();
		AccStatementDTO[] list = creaditService.getStatement(c);

		for(AccStatementDTO a : list)
		{
			
			System.out.println(a.getRef_number());
			System.out.println(a.getAmount());
			System.out.println(a.getCurrency());
			System.out.println(a.getTransaction_details());
		}
	}

}
