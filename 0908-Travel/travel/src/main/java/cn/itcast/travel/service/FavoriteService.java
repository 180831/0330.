package cn.itcast.travel.service;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-09-08
 * Time:16:15
 */
public interface FavoriteService {

    public boolean isFavorite(String rid,int uid);

    void add(String rid, int uid);
}
