package org.tain.kang.dao;

import java.util.List;

import org.tain.kang.domain.FixedDepositDetails;

public interface FixedDepositDao {

	public List<FixedDepositDetails> getFixedDeposits(String user);
	public List<FixedDepositDetails> getAllFixedDeposits();
	public void saveFixedDeposit(FixedDepositDetails fixedDepositDetails);
	public void closeFixedDeposit(long fixedDepositId);
	public FixedDepositDetails getFixedDeposit(long fixedDepositId);
	public void editFixedDeposit(FixedDepositDetails fixedDepositDetails);
}
