package com.imooc.respository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
public class ProductCategoryRespositoryTest {
    @Autowired
    private ProductCategoryRespository respository;

//    @Transactional
    @Test
    public void findOneTest(){
        ProductCategory productCategory =respository.getOne(1);
        System.out.println(productCategory.toString());
    }
    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory =new ProductCategory("男生最爱",3);
        ProductCategory result =respository.save(productCategory);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByCategroyTypeInTest(){
        List<Integer> list = Arrays.asList(2,4);
        List<ProductCategory> result = respository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}