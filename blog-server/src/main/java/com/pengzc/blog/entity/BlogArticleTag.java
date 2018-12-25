package com.pengzc.blog.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author pengzc
 * @since 2018-12-25
 */
public class BlogArticleTag extends Model<BlogArticleTag> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "tag_id", type = IdType.AUTO)
    private Integer tagId;
    /**
     * 标签名字
     */
    private String tagName;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 高亮
     */
    private Integer highlight;


    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getHighlight() {
        return highlight;
    }

    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }

    @Override
    protected Serializable pkVal() {
        return this.tagId;
    }

    @Override
    public String toString() {
        return "BlogArticleTag{" +
        "tagId=" + tagId +
        ", tagName=" + tagName +
        ", status=" + status +
        ", highlight=" + highlight +
        "}";
    }
}
