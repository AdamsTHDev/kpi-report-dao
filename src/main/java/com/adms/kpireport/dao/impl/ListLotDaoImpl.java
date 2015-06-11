package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.ListLot;
import com.adms.kpireport.dao.ListLotDao;

@Repository("listLotDao")
public class ListLotDaoImpl extends GenericDaoHibernate<ListLot, Long> implements ListLotDao {

	public ListLotDaoImpl() {
		super(ListLot.class);
	}

}
