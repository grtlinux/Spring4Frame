package org.tain.kang.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.tain.kang.domain.FixedDepositDetails;

@Repository
public class FixedDepositDaoImpl implements FixedDepositDao {

	private int counter = 0;
	private List<FixedDepositDetails> listFd;
	
	public FixedDepositDaoImpl() {
		listFd = new ArrayList<FixedDepositDetails>();
		listFd.add(new FixedDepositDetails(++counter, "cust1", "10000", "24", "cust1@email.com"));
		listFd.add(new FixedDepositDetails(++counter, "cust2", "20000", "25", "cust2@email.com"));
		listFd.add(new FixedDepositDetails(++counter, "cust3", "30000", "26", "cust3@email.com"));
		listFd.add(new FixedDepositDetails(++counter, "cust4", "40000", "27", "cust4@email.com"));
	}
	
	@Override
	public List<FixedDepositDetails> getFixedDeposits(String user) {
		List<FixedDepositDetails> list = new ArrayList<FixedDepositDetails>();

		for (FixedDepositDetails details : this.listFd) {
			if (details.getCustomerId().equalsIgnoreCase(user))
				list.add(details);
		}
		
		return list;
	}

	@Override
	public List<FixedDepositDetails> getAllFixedDeposits() {
		List<FixedDepositDetails> list = new ArrayList<FixedDepositDetails>();

		for (FixedDepositDetails details : this.listFd) {
			list.add(details);
		}
		
		return list;
	}

	@Override
	public void saveFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		fixedDepositDetails.setId(++counter);
		this.listFd.add(fixedDepositDetails);
	}

	@Override
	public void closeFixedDeposit(long fixedDepositId) {
		for (FixedDepositDetails details : this.listFd) {
			if (details.getId() == fixedDepositId) {
				this.listFd.remove(details);
				break;
			}
		}
	}

	@Override
	public FixedDepositDetails getFixedDeposit(long fixedDepositId) {
		FixedDepositDetails retDetail = null;
		for (FixedDepositDetails details : this.listFd) {
			if (details.getId() == fixedDepositId) {
				retDetail = details;
				break;
			}
		}
		return retDetail;
	}

	@Override
	public void editFixedDeposit(FixedDepositDetails fixedDepositDetails) {
		for (FixedDepositDetails details : this.listFd) {
			if (details.getId() == fixedDepositDetails.getId()) {
				this.listFd.remove(details);
				break;
			}
		}
		this.listFd.add(fixedDepositDetails);
	}
}
