package com.imooc.respository;

import com.imooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRespositoryTest {
    @Autowired
    private OrderDetailRespository respository;
    @Test
    public void saveTest(){
        OrderDetail orderDetail =new OrderDetail();
        orderDetail.setDetailId("12345678910");
        orderDetail.setOrderId("111111");
        orderDetail.setProductIcon("http://xxxxxx.jpg");
        orderDetail.setProductId("11122222");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(3);
        OrderDetail result =respository.save(orderDetail);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList= respository.findByOrderId("111111");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}