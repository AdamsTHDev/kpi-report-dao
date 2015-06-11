package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.Tsr;
import com.adms.kpireport.dao.TsrDao;

@Repository("tsrDao")
public class TsrDaoImpl extends GenericDaoHibernate<Tsr, Long> implements TsrDao {

	public TsrDaoImpl() {
		super(Tsr.class);
	}

}
