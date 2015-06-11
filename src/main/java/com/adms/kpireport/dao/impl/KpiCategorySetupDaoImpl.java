package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.KpiCategorySetup;
import com.adms.kpireport.dao.KpiCategorySetupDao;

@Repository("kpiCategorySetupDao")
public class KpiCategorySetupDaoImpl extends GenericDaoHibernate<KpiCategorySetup, Long> implements KpiCategorySetupDao {

	public KpiCategorySetupDaoImpl() {
		super(KpiCategorySetup.class);
	}

}
