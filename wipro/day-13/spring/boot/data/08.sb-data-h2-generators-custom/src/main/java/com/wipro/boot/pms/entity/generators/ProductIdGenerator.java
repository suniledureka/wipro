package com.wipro.boot.pms.entity.generators;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ProductIdGenerator implements IdentifierGenerator{
	private static final long serialVersionUID = 1L;
	
	private static Integer pid = 101;
	
	@Override
	public String generate(SharedSessionContractImplementor session, Object object) {
		return "RIL_"+(pid++);
	}

}
