package com.imooc.service.impl;

import com.imooc.dataobject.SellerInfo;
import com.imooc.respository.SellerInfoRespository;
import com.imooc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Administrator
 * @date: 2018/5/4/004
 * @description:
 */
@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerInfoRespository respository;
    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return respository.findByOpenid(openid);
    }
}
