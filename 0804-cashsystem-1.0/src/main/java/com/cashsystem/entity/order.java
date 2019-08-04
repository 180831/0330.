package com.cashsystem.entity;

import java.time.LocalDateTime;
import lombok.Data;
/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-08-04
 * Time:10:37
 */
@Data
public class order {

    private String id;
    private Integer account_id;
    private String account_name;
    private LocalDateTime create_time;
    private LocalDateTime finish_time;
    private Integer actual_amount;
    private Integer total_money;
    private Integer order_status;

}
