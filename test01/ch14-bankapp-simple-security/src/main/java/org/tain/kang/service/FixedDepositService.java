package org.tain.kang.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.tain.kang.domain.FixedDepositDetails;

public interface FixedDepositService {

	@Secured("ROLE_CUSTOMER")
	public List<FixedDepositDetails> getFixedDeposits(String user);
	
	@Secured("ROLE_ADMIN")
	public List<FixedDepositDetails> getAllFixedDeposits();
	
	@Secured("ROLE_CUSTOMER")
	public void saveFixedDeposit(FixedDepositDetails fixedDepositDetails);
	
	@Secured("ROLE_ADMIN")
	public void closeFixedDeposit(long fixedDepoitId);
	
	@Secured("ROLE_CUSTOMER")
	public FixedDepositDetails getFixedDeposits(long fixedDepositId);
	
	@Secured("ROLE_CUSTOMER")
	public void editFixedDeposit(FixedDepositDetails fixedDepositDetails);
}
