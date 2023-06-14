package cn.imufeng.blog.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


/**
 * <p>
 * 博客与分类关联
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Data
@EqualsAndHashCode
@TableName("mb_blog_category")
@Schema(name = "BlogCategory", description = "$!{table.comment}")
public class BlogCategory implements Serializable {


    private static final long serialVersionUID = 1L;

    @Schema(description = "博客ID")
    private Long blogId;

    @Schema(description = "分类ID")
    private Long categoryId;
}
