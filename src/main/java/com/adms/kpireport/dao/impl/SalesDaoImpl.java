package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.Sales;
import com.adms.kpireport.dao.SalesDao;

@Repository("salesDao")
public class SalesDaoImpl extends GenericDaoHibernate<Sales, Long> implements SalesDao {

	public SalesDaoImpl() {
		super(Sales.class);
	}

}
