package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@SpringBootTest
class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    void findOneTest() {
        Optional<ProductCategory> op = repository.findById(1);
        op.ifPresent(productCategory -> System.out.println(productCategory.toString()));
    }

    @Test
    @Transactional
    void saveTest() {
        ProductCategory productCategory = new ProductCategory("特色", 7);
        ProductCategory result = repository.save(productCategory);
        Assertions.assertNotNull(result);
    }

    @Test
    @Transactional
    public void updateTest() {
        ProductCategory productCategory = null;
        Optional<ProductCategory> op = repository.findById(2);
        if (op.isPresent()) {
            productCategory = op.get();
            productCategory.setCategoryType(4);
        }
        repository.save(productCategory);
    }

    @Test
    void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(4, 6, 10);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        System.out.println(result.toString());
        Assertions.assertNotEquals(0, result.size());
    }

}