package www.bitech.jdbc;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-06-29
 * Time:15:11
 */
public interface JdbcDemo {
    //创建MemoGroup
    public abstract Boolean createMemoGrup(MemoGroup memoGroup);

    //通过ID查询MemoGroup;
    public abstract MemoGroup queryMemGroupByld(Integer id);

    //更新MemoGroup(name)
    public abstract Boolean updateMemoGroup(MemoGroup memoGroup);

}

