package com.imooc.respository;

import com.imooc.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Administrator
 * @date: 2018/5/4/004
 * @description:
 */
public interface SellerInfoRespository extends JpaRepository<SellerInfo,String> {
    SellerInfo findByOpenid(String openid);
}
