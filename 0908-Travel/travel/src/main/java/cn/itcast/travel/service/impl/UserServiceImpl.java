package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean regist(User user) {
        //1.根据用户名查询用户对象
        User u = userDao.findByUsername(user.getUsername());
        //判断u是否为null
        if (u != null) {
            //用户名存在，注册失败
            return false;
        }
        //设置激活码
        //设置状态UuidUtil生成唯一字符串
        user.setCode(UuidUtil.getUuid());
        user.setStatus("N");
        userDao.save(user);

        String content="<a href='http://localhost:8080/travel111/active?code="+user.getCode()+"'>点击激活【大千世界任我游】</a>";

        MailUtils.sendMail(user.getEmail(),content,"激活邮件");

        return true;
    }


    //激活用户
    @Override
    public boolean active(String code) {
        //根据激活码查对象
        User user = userDao.findByCode(code);
        if(user != null) {
            userDao.updateStatus(user);
            return true;
        }else{
            return false;
        }

        //调用dao的修改激活状态的方法
    }


    /*@Override
    public User login(User user) {
        return userDao.findByUsernameAndPassword(user.getUsername(),user.getPassword());
    }*/

    @Override
    public User login(User user) {

        return userDao.findByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

}
