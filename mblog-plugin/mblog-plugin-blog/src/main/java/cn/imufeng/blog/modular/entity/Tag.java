package cn.imufeng.blog.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * <p>
 * 标签表
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Data
@EqualsAndHashCode
@TableName("mb_tag")
@Schema(name = "Tag", description = "$!{table.comment}")
public class Tag implements Serializable {


    private static final long serialVersionUID = 1L;

    @Schema(description = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "标签名")
    private String tagName;

    @Schema(description = "显示颜色")
    private String color;

    @Schema(description = "创建人")
    private Long createBy;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新者")
    private Long updateBy;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}
