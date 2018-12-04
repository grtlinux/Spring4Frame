package org.tain.kang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tain.kang.dao.FixedDepositDao;
import org.tain.kang.domain.FixedDepositDetails;

@Service
public class FixedDepositServiceImpl implements FixedDepositService {

	@Autowired
	private FixedDepositDao fixedDepositDao;
	
	@Override
	public List<FixedDepositDetails> getFixedDeposits(String user) {
		return this.fixedDepositDao.getFixedDeposits(user);
	}

	@Override
	public List<FixedDepositDetails> getAllFixedDeposits() {
		return this.fixedDepositDao.getAllFixedDeposits();
	}

	@Override
	public void saveFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		this.fixedDepositDao.saveFixedDeposit(fixedDepositDetails);
	}

	@Override
	public void closeFixedDeposit(long fixedDepositId) {
		this.fixedDepositDao.closeFixedDeposit(fixedDepositId);
	}

	@Override
	public FixedDepositDetails getFixedDeposits(long fixedDepositId) {
		return this.fixedDepositDao.getFixedDeposit(fixedDepositId);
	}

	@Override
	public void editFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		this.fixedDepositDao.editFixedDeposit(fixedDepositDetails);
	}

}
