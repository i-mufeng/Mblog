package cn.imufeng.blog.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


/**
 * <p>
 * 博客与标签关联表
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Data
@EqualsAndHashCode
@TableName("mb_blog_tag")
@Schema(name = "BlogTag", description = "$!{table.comment}")
public class BlogTag implements Serializable {


    private static final long serialVersionUID = 1L;

    @Schema(description = "用户ID")
    private Long blogId;

    @Schema(description = "角色ID")
    private Long tagId;
}
