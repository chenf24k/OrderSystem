package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductStatusEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assertions.assertEquals("123456", productInfo.getProductId());
    }

    @Test
    void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assertions.assertNotEquals(0, productInfoList.size());
    }

    @Test
    void findAll() {
        Page<ProductInfo> productInfoPage = productService.findAll(PageRequest.of(0, 2));
        Assertions.assertNotEquals(0, productInfoPage.getTotalElements());
    }

    @Test
    @Transactional
    void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的虾");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);
        ProductInfo result = productService.save(productInfo);
        Assertions.assertNotEquals(null, result);
    }
}