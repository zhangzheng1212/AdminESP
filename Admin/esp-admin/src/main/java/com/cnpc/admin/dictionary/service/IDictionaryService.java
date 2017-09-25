package com.cnpc.admin.dictionary.service;

import com.cnpc.admin.basic.service.IBaseService;
import com.cnpc.admin.entity.PageData;

import java.util.List;

public interface IDictionaryService extends IBaseService {
    /**
     * 唯一编码校验
     * @param pd
     * @return
     */
    List<PageData> findOnlyCode(PageData pd) throws Exception;
}
