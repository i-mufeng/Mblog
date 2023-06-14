package cn.imufeng.blog.modular.mapper;

import cn.imufeng.blog.modular.entity.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 标签表 Mapper 接口
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

}
