package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "110110";

    @Test
    void findByBuyerOpenid() {
        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID, PageRequest.of(0, 3));
        Assertions.assertNotEquals(0, result.getTotalElements());
    }

    @Test
    @Transactional
    void save() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("师兄2");
        orderMaster.setBuyerPhone("13100000918");
        orderMaster.setBuyerAddress("慕课网");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(2.5));

        OrderMaster result = repository.save(orderMaster);
        Assertions.assertNotNull(result);
    }
}