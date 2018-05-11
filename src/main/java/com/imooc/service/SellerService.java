package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

public interface SellerService {
    /**
     * 通过openid查询卖家端
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
