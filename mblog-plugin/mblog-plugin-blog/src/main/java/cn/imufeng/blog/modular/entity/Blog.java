package cn.imufeng.blog.modular.entity;

import cn.imufeng.common.pojo.CommonEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * <p>
 * 博客
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("mb_blog")
@Schema(name = "Blog", description = "$!{table.comment}")
public class Blog extends CommonEntity {


    private static final long serialVersionUID = 1L;

    @Schema(description = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "标题")
    private String title;

    @Schema(description = "描述")
    private String description;

    @Schema(description = "内容")
    private String content;

    @Schema(description = "图片地址")
    private String figureUrl;

    @Schema(description = "是否公开")
    private Integer isPublic;

    @Schema(description = "打赏开关")
    private Integer isReward;

    @Schema(description = "评论开关")
    private Integer usReview;

    @Schema(description = "浏览次数")
    private Integer views;

    @Schema(description = "点赞数")
    private Integer applaud;

    @Schema(description = "收藏数")
    private Integer collect;

    @Schema(description = "字数")
    private Integer words;

    @Schema(description = "密码")
    private String password;

}
