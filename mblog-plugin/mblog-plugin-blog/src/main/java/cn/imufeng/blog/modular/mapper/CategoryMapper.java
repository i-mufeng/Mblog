package cn.imufeng.blog.modular.mapper;


import cn.imufeng.blog.modular.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 博客分类 Mapper 接口
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
