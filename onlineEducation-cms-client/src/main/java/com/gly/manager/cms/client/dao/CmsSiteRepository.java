/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CmsSiteRepository
 * Author:   Administrator
 * Date:     2019/9/1 14:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.gly.manager.cms.client.dao;

import com.gly.common.model.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/9/1
 * @since 1.0.0
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite, String> {

}