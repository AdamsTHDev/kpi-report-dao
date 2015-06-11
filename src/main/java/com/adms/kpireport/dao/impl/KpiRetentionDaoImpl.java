package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.bean.KpiRetention;
import com.adms.kpireport.dao.KpiRetentionDao;

@Repository("kpiRetentionDao")
public class KpiRetentionDaoImpl extends GenericDaoHibernate<KpiRetention, Long> implements KpiRetentionDao {

	public KpiRetentionDaoImpl() {
		super(KpiRetention.class);
	}

}
