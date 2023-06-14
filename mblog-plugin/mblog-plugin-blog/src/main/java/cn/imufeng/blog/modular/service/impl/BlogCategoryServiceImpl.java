package cn.imufeng.blog.modular.service.impl;

import cn.imufeng.blog.modular.entity.BlogCategory;
import cn.imufeng.blog.modular.mapper.BlogCategoryMapper;
import cn.imufeng.blog.modular.service.IBlogCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客与分类关联 服务实现类
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Service
public class BlogCategoryServiceImpl extends ServiceImpl<BlogCategoryMapper, BlogCategory> implements IBlogCategoryService {

}
