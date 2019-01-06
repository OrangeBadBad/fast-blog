package com.pengzc.blog.modules.entity;



import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author pengzc
 * @since 2018-12-25
 */
public class BlogAboutMe extends Model<BlogAboutMe> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private String name;
    private String introduction;
    private Integer qqNumber;
    private String email;
    private Integer webchatNumber;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(Integer qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getWebchatNumber() {
        return webchatNumber;
    }

    public void setWebchatNumber(Integer webchatNumber) {
        this.webchatNumber = webchatNumber;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BlogAboutMe{" +
                "id=" + id +
                ", name=" + name +
                ", introduction=" + introduction +
                ", qqNumber=" + qqNumber +
                ", email=" + email +
                ", webchatNumber=" + webchatNumber +
                "}";
    }
}
