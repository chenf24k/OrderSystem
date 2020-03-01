package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        Assertions.assertEquals(1, productCategory.getCategoryId());
    }

    @Test
    void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assertions.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(4, 6, 10));
        Assertions.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    @Transactional
    void save() {
        ProductCategory productCategory = new ProductCategory("男生专属", 3);
        ProductCategory result = categoryService.save(productCategory);
        Assertions.assertNotEquals(null, result);
    }
}