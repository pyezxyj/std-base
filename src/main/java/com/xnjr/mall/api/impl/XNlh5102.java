package com.xnjr.mall.api.impl;

import com.xnjr.mall.api.AProcessor;
import com.xnjr.mall.common.JsonUtil;
import com.xnjr.mall.dto.req.XN602222Req;
import com.xnjr.mall.exception.BizException;
import com.xnjr.mall.exception.ParaException;

/**
 * 修改分销引导记录
 * @author: xieyj 
 * @since: 2016年7月29日 下午1:22:07 
 * @history:
 */
public class XN602222 extends AProcessor {

    private XN602222Req req = null;

    @Override
    public Object doBusiness() throws BizException {
        return null;
    }

    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN602222Req.class);
    }
}