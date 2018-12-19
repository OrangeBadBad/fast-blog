package entity;

import java.io.Serializable;

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
 * @author pengzc123
 * @since 2018-12-19
 */
public class BlogVisitor extends Model<BlogVisitor> {

    private static final long serialVersionUID = 1L;

    /**
     * 访客记录ID
     */
    @TableId(value = "v_id", type = IdType.AUTO)
    private Integer vId;
    /**
     * 访客ID
     */
    private Integer visitorId;
    /**
     * 来访时间
     */
    private Integer visitorTime;
    /**
     * 被访用户ID
     */
    private Integer userId;
    /**
     * 访客IP地址
     */
    private String visitorIp;
    /**
     * 访问板块ID
     */
    private Integer typeId;
    /**
     * 查看某板块的某个子项目，如查看相册板块的第3个相册，ID对应该相册的ID号
     */
    private Integer whereId;


    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public Integer getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Integer visitorId) {
        this.visitorId = visitorId;
    }

    public Integer getVisitorTime() {
        return visitorTime;
    }

    public void setVisitorTime(Integer visitorTime) {
        this.visitorTime = visitorTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getVisitorIp() {
        return visitorIp;
    }

    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getWhereId() {
        return whereId;
    }

    public void setWhereId(Integer whereId) {
        this.whereId = whereId;
    }

    @Override
    protected Serializable pkVal() {
        return this.vId;
    }

    @Override
    public String toString() {
        return "BlogVisitor{" +
        "vId=" + vId +
        ", visitorId=" + visitorId +
        ", visitorTime=" + visitorTime +
        ", userId=" + userId +
        ", visitorIp=" + visitorIp +
        ", typeId=" + typeId +
        ", whereId=" + whereId +
        "}";
    }
}
