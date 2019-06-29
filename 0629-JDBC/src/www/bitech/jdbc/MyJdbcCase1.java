package www.bitech.jdbc;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.ws.api.model.MEP;

import java.sql.*;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-06-29
 * Time:15:07
 */
public class MyJdbcCase1 implements JdbcDemo {

    @Override
    public Boolean createMemoGrup(MemoGroup memoGroup) {
        Connection connection = null;
        //预编译命令
        PreparedStatement statement = null;

        ResultSet resultSet = null;

        Integer number;
        try {
            //1.加载数据库的驱动JDBC驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建连接
            String url = "jdbc:mysql://127.0.0.1:3306/memo?user=root&password=981203";
            connection = DriverManager.getConnection(url);

            //执行命令
            //准备sql语句

            String str1 = memoGroup.getName();
            LocalDateTime str2 = memoGroup.getCreatetime();

            String sql = "insert into memo_group(name,created_time) values(?,?);";

            //预编译命令的赋值
            statement = connection.prepareStatement(sql);

            //传入预编译命令的参数1
            statement.setString(1,str1);

            //将javazhong 中的timestamp转为localstamp;
            statement.setTimestamp(2,Timestamp.valueOf(str2));
            //执行sql语句
            number = statement.executeUpdate();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public MemoGroup queryMemGroupByld(Integer id) {
        //连接
        Connection connection = null;
        //命令
        PreparedStatement preparedStatement = null;
        //结果
        ResultSet resultSet = null;
        //对象
        MemoGroup memoGroup = new MemoGroup();

        try {
            //1.加载数据库的驱动JDBC驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建连接
            String url = "jdbc:mysql://127.0.0.1:3306/memo?user=root&password=981203";
            connection = DriverManager.getConnection(url);

            //执行命令
            //准备sql语句
            String sql = "select * from memo_group where id = id;";

            //执行sql语句
            preparedStatement = connection.prepareStatement(sql);

            //保存结果
            resultSet = preparedStatement.executeQuery();

            //给所创建的对象赋值
            if (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                memoGroup.setName(resultSet.getString("name"));
                Timestamp createTime = resultSet.getTimestamp("created_time");
                memoGroup.setCreatetime(createTime.toLocalDateTime());
                Timestamp modifyTime = resultSet.getTimestamp("modify_time");
                memoGroup.setModifytime(modifyTime);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return memoGroup;
    }

    @Override
    public Boolean updateMemoGroup(MemoGroup memoGroup) {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        Integer pop = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://127.0.0.1:3306/memo?user=root&password=981203";
            connection = DriverManager.getConnection(url);
            Integer newid = memoGroup.getId();
            String newname = memoGroup.getName();
            String sql = "update memo_group set name = ? where id = ?;";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,newname);
            preparedStatement.setInt(2,newid);
            pop = preparedStatement.executeUpdate();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void main(String[] args) {
        MyJdbcCase1 myJdbcCase1 = new MyJdbcCase1();

        MemoGroup memoGroup = new MemoGroup();
        memoGroup.setCreatetime(LocalDateTime.now());
        memoGroup.setName("read1");
        memoGroup.setId(669);

        MemoGroup memoGroup2 = new MemoGroup();
        memoGroup2.setId(670);
        memoGroup2.setName("stduy");
        Boolean pop = myJdbcCase1.createMemoGrup(memoGroup);
        System.out.println(pop);
        String str1 = myJdbcCase1.queryMemGroupByld(1).toString();
        System.out.println(str1);
        myJdbcCase1.updateMemoGroup(memoGroup);
    }
}
