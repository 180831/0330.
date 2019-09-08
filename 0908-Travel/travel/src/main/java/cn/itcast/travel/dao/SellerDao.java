package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Seller;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-09-08
 * Time:14:21
 */
public interface SellerDao {

    public Seller findById(int id);
}
