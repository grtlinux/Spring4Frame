package sample.spring.chapter06.bankapp.dao;

import javax.inject.Named;

import org.apache.log4j.Logger;

import sample.spring.chapter06.bankapp.domain.CustomerRequestDetails;

@Named(value = "customerRequestDao")
public class CustomerRequestDaoImpl implements CustomerRequestDao {
	private static Logger logger = Logger
			.getLogger(CustomerRequestDaoImpl.class);

	public CustomerRequestDaoImpl() {
		logger.info("Created CustomerRequestDaoImpl instance");
	}

	@Override
	public void submitRequest(CustomerRequestDetails userRequestDetails) {
		// --save UserRequestDetails
	}
}
