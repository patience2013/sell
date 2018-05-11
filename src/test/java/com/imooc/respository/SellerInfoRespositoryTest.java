package com.imooc.respository;

import com.imooc.dataobject.SellerInfo;
import com.imooc.util.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRespositoryTest {
    @Autowired
    private SellerInfoRespository respository;

    @Test
    public void save(){
        SellerInfo sellerInfo =new SellerInfo();
        sellerInfo.setSellerId(KeyUtil.genUniqueKey());
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("abc");
        SellerInfo result =respository.save(sellerInfo);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByOpenid() {
        SellerInfo sellerInfo =respository.findByOpenid("abc");
        Assert.assertNotNull(sellerInfo);

    }
}