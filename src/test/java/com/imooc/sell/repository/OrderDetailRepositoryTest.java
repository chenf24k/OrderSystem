package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("123456");
        Assertions.assertNotNull(orderDetailList);

    }

    @Test
    @Transactional
    void save() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456789");
        orderDetail.setOrderId("123456");
        orderDetail.setProductIcon("http://xxxxx.jpg");
        orderDetail.setProductId("111115");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(1.2));
        orderDetail.setProductQuantity(2);
        OrderDetail result = repository.save(orderDetail);
        Assertions.assertNotNull(result);

    }
}