package com.imooc.sell.dataobject;

import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@DynamicUpdate
public class OrderMaster {

    @Id
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    /**  订单状态，默认为0 新下单 .*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();;
    /**  支付状态，默认为0 未支付 .*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    private Date createTime;
    private Date updateTime;

   /* @Transient// 忽略报错
    private List<OrderDetail> orderDetailList;*/

}
