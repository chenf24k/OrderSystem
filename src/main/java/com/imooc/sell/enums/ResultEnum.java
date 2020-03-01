package com.imooc.sell.enums;


import lombok.Getter;

@Getter
public enum ResultEnum {

    PRODUCT_NOE_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(10, "库存不正确"),
    ;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;
}
