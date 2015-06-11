package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.bean.KpiBean;
import com.adms.kpireport.dao.KpiBeanDao;

@Repository("kpiBeanDao")
public class KpiBeanDaoImpl extends GenericDaoHibernate<KpiBean, Long> implements KpiBeanDao {

	public KpiBeanDaoImpl() {
		super(KpiBean.class);
	}

}
