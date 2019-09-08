package cn.itcast.travel.dao;

import cn.itcast.travel.domain.RouteImg;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-09-08
 * Time:14:12
 */
public interface RouteImgDao {

    //根据线路route的id 查询图片
    public List<RouteImg> findByRid(int rid);
}
