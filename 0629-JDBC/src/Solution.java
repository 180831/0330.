import www.bitech.jdbc.MemoGroup;
import www.bitech.jdbc.Memoinfo;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-06-29
 * Time:10:08
 */
public abstract class Solution {
    /**
     * 创建MemoGroup
     * @param memoGroup
     * @return
     */
    public abstract Boolean createMemoGrup(MemoGroup memoGroup);

    //通过ID查询MemoGroup;
    public abstract MemoGroup queryMemGroupByld(Integer id);

    //更新MemoGroup(name)
    public abstract Boolean updateMemoGroup(MemoGroup memoGroup);

    //根据名称模糊匹配删除MomoGroup(后模糊)
    public abstract Integer deleteMemoGroupByName(String name);

    //创建MemoInfo
    public abstract Boolean createMemoinfo(MemoGroup memoGroup,
                                           Memoinfo memoinfo );
}
