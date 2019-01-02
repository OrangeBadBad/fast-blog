package com.pengzc.blog.modules.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;

/**
 * <p>
 *
 * </p>
 *
 * @author pengzc123
 * @since 2018-12-19
 */
public class BlogArticleImg extends Model<BlogArticleImg> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "img_id", type = IdType.AUTO)
    private Integer imgId;
    private String imgName;
    private String imgUrl;
    private Integer articleId;


    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.imgId;
    }

    @Override
    public String toString() {
        return "BlogArticleImg{" +
                "imgId=" + imgId +
                ", imgName=" + imgName +
                ", imgUrl=" + imgUrl +
                ", articleId=" + articleId +
                "}";
    }
}
