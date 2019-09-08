package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-09-08
 * Time:16:16
 */
public interface FavoriteDao {

    //根据rid 和 uid 查询对象
    public Favorite findByRidAndUid(int rid, int uid);

    //根据线路Id 查询
    int findCountByRid(int rid);

    void add(int i, int uid);
}
