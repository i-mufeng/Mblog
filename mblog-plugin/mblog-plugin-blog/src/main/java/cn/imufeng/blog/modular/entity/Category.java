package cn.imufeng.blog.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


/**
 * <p>
 * 博客分类
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Data
@EqualsAndHashCode
@TableName("mb_category")
@Schema(name = "Category", description = "$!{table.comment}")
public class Category implements Serializable {


    private static final long serialVersionUID = 1L;

    @Schema(description = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "分类名称")
    private String name;
}
