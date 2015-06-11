package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.TsrTracking;
import com.adms.kpireport.dao.TsrTrackingDao;

@Repository("tsrTrackingDao")
public class TsrTrackingDaoImpl extends GenericDaoHibernate<TsrTracking, Long> implements TsrTrackingDao {

	public TsrTrackingDaoImpl() {
		super(TsrTracking.class);
	}

}
