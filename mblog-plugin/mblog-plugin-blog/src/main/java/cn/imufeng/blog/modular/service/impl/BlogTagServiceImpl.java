package cn.imufeng.blog.modular.service.impl;

import cn.imufeng.blog.modular.entity.BlogTag;
import cn.imufeng.blog.modular.mapper.BlogTagMapper;
import cn.imufeng.blog.modular.service.IBlogTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客与标签关联表 服务实现类
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Service
public class BlogTagServiceImpl extends ServiceImpl<BlogTagMapper, BlogTag> implements IBlogTagService {

}
