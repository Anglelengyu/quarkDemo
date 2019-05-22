package com.rest.service.impl;

import com.quark.common.base.BaseServiceImpl;
import com.quark.common.dao.LabelDao;
import com.quark.common.entity.Label;
import com.rest.service.RestLabelService;
import org.springframework.stereotype.Service;

/**
 * @Author LHR
 * Create By 2017/8/27
 */
@Service
public class RestLabelServiceImpl extends BaseServiceImpl<LabelDao,Label> implements RestLabelService {
}
