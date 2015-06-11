package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.TsrHirarchy;
import com.adms.kpireport.dao.TsrHirarchyDao;

@Repository("tsrHirarchyDao")
public class TsrHirarchyDaoImpl extends GenericDaoHibernate<TsrHirarchy, Long> implements TsrHirarchyDao {

	public TsrHirarchyDaoImpl() {
		super(TsrHirarchy.class);
	}

}
