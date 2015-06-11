package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.KpiResult;
import com.adms.kpireport.dao.KpiResultDao;

@Repository("kpiResultDao")
public class KpiResultDaoImpl extends GenericDaoHibernate<KpiResult, Long> implements KpiResultDao {

	public KpiResultDaoImpl() {
		super(KpiResult.class);
	}

}
