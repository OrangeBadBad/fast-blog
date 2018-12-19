package entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author pengzc123
 * @since 2018-12-16
 */
public class BlogArticleTagRelation extends Model<BlogArticleTagRelation> {

    private static final long serialVersionUID = 1L;

    private Integer articleId;
    private Integer tagId;


    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Override
    protected Serializable pkVal() {
        return this.articleId;
    }

    @Override
    public String toString() {
        return "BlogArticleTagRelation{" +
        ", articleId=" + articleId +
        ", tagId=" + tagId +
        "}";
    }
}
