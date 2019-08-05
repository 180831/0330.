package com.cashsystem.entity;
import lombok.Data;
/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:10:35
 */
@Data
public class goods {

    private Integer id;
    private String name;
    private String introduce;
    private Integer stock;
    private String  unit;
    private Integer price;
    private Integer discount;

}
