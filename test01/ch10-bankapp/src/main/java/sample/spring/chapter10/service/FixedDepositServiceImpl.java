package sample.spring.chapter10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.spring.chapter10.dao.FixedDepositDao;
import sample.spring.chapter10.domain.FixedDepositDetails;

@Service
public class FixedDepositServiceImpl implements FixedDepositService {
	
	@Autowired
	private FixedDepositDao fixedDepositDao;

	public List<FixedDepositDetails> getFixedDeposits() {
		return fixedDepositDao.getFixedDeposits();
	}

	public void saveFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		fixedDepositDao.saveFixedDeposit(fixedDepositDetails);
	}

	public void closeFixedDeposit(int fixedDepositId) {
		fixedDepositDao.closeFixedDeposit(fixedDepositId);
	}

	public FixedDepositDetails getFixedDeposit(int fixedDepositId) {
		return fixedDepositDao.getFixedDeposit(fixedDepositId);
	}
	
	public void editFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		fixedDepositDao.editFixedDeposit(fixedDepositDetails);
	}
}
