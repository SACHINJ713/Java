package com.sachin.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sachin.dto.AccStatementDTO;
import com.sachin.dto.CustomerDTO;

@WebService(serviceName="sachin")
public interface CreaditService {

	@WebMethod(operationName = "getStatement")
	public List<AccStatementDTO> getStatement(CustomerDTO customerDTO);
}
