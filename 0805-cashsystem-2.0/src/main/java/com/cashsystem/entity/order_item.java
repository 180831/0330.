package com.cashsystem.entity;

import lombok.Data;
/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:10:41
 */
@Data
public class order_item {

    private Integer id;
    private Integer goods_id;
    private String order_id;
    private String goods_name;
    private String goods_introduce;
    private Integer goods_num;
    private String goods_unit;
    private Integer goods_price;
    private Integer goods_doscount;
}
