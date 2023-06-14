package cn.imufeng.blog.modular.mapper;

import cn.imufeng.blog.modular.entity.BlogTag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 博客与标签关联表 Mapper 接口
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Mapper
public interface BlogTagMapper extends BaseMapper<BlogTag> {

}
