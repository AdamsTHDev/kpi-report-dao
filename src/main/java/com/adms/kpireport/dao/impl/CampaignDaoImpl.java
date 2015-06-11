package com.adms.kpireport.dao.impl;

import org.springframework.stereotype.Repository;

import com.adms.common.dao.generic.impl.GenericDaoHibernate;
import com.adms.entity.Campaign;
import com.adms.kpireport.dao.CampaignDao;

@Repository("campaignDao")
public class CampaignDaoImpl extends GenericDaoHibernate<Campaign, Long> implements CampaignDao {

	public CampaignDaoImpl() {
		super(Campaign.class);
	}

}
