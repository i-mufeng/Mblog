package cn.imufeng.blog.modular.service.impl;

import cn.imufeng.blog.modular.entity.Tag;
import cn.imufeng.blog.modular.mapper.TagMapper;
import cn.imufeng.blog.modular.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
