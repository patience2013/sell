package com.imooc.respository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: Administrator
 * @date: 2018/4/25/025
 * @description:
 */
public interface ProductCategoryRespository extends JpaRepository<ProductCategory,Integer>{
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categroyTypeList);
}
