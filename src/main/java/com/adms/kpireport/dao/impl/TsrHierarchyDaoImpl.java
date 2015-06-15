package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.TsrHierarchy;
import com.adms.kpireport.dao.TsrHierarchyDao;

@Repository("tsrHierarchyDao")
public class TsrHierarchyDaoImpl extends GenericDaoHibernate<TsrHierarchy, Long> implements TsrHierarchyDao {

	public TsrHierarchyDaoImpl() {
		super(TsrHierarchy.class);
	}

}
