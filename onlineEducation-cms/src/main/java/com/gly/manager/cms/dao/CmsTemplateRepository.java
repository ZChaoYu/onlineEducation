package com.gly.manager.cms.dao;

import com.gly.common.model.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CmsTemplateRepository extends MongoRepository<CmsTemplate, String> {

}