package cn.imufeng.blog.modular.mapper;

import cn.imufeng.blog.modular.entity.BlogCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 博客与分类关联 Mapper 接口
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Mapper
public interface BlogCategoryMapper extends BaseMapper<BlogCategory> {

}
