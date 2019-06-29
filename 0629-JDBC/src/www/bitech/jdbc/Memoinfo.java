package www.bitech.jdbc;

import java.sql.Timestamp;
import java.time.DateTimeException;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:Light_Long
 * Date:2019-06-29
 * Time:15:03
 */
public class Memoinfo {
    private Integer id;
    private Integer group_id;
    private String title;
    private String content;
    private String is_protected;
    private clolr background;
    private String is_remind;
    private LocalDateTime remind_time;
    private LocalDateTime created_time;
    private Timestamp modfiy_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIs_protected() {
        return is_protected;
    }

    public void setIs_protected(String is_protected) {
        this.is_protected = is_protected;
    }

    public clolr getBackground() {
        return background;
    }

    public void setBackground(clolr background) {
        this.background = background;
    }

    public String getIs_remind() {
        return is_remind;
    }

    public void setIs_remind(String is_remind) {
        this.is_remind = is_remind;
    }

    public LocalDateTime getRemind_time() {
        return remind_time;
    }

    public void setRemind_time(LocalDateTime remind_time) {
        this.remind_time = remind_time;
    }

    public LocalDateTime getCreated_time() {
        return created_time;
    }

    public void setCreated_time(LocalDateTime created_time) {
        this.created_time = created_time;
    }

    public Timestamp getModfiy_time() {
        return modfiy_time;
    }

    public void setModfiy_time(Timestamp modfiy_time) {
        this.modfiy_time = modfiy_time;
    }

    @Override
    public String toString() {
        return "Memoinfo{" +
                "id=" + id +
                ", group_id=" + group_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", is_protected='" + is_protected + '\'' +
                ", background=" + background +
                ", is_remind='" + is_remind + '\'' +
                ", remind_time=" + remind_time +
                ", created_time=" + created_time +
                ", modfiy_time=" + modfiy_time +
                '}';
    }

    enum clolr{
        white,red,blue,green;
    }
}
