package cn.imufeng.blog.modular.param;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 博客分页查询参数
 *
 * @author MuFeng
 * @since 2023/6/9 17:14
 */
@Data
@EqualsAndHashCode
public class BlogPageParam {

    /**
     * 当前页
     */
    @Schema(description = "当前页码")
    private Integer current;

    /**
     * 每页条数
     */
    @Schema(description = "每页条数")
    private Integer size;

    /**
     * 排序字段
     */
    @Schema(description = "排序字段，字段驼峰名称，如：userName")
    private String sortField;

    /**
     * 排序方式
     */
    @Schema(description = "排序方式，升序：ASCEND；降序：DESCEND")
    private String sortOrder;

    /**
     * id
     */
    @Schema(description = "id")
    private String id;

    /**
     * 博客分类
     */
    @Schema(description = "博客分类ID")
    private String category;

    /**
     * 名称关键词
     */
    @Schema(description = "名称关键词")
    private String searchKey;

    @Schema(description = "标题")
    private String title;

    @Schema(description = "描述")
    private String description;

    @Schema(description = "内容")
    private String content;

    @Schema(description = "删除标志 NOT_DELETE：未删除 DELETED：已删除")
    private String deleteFlag;
}
