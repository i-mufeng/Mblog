package cn.imufeng.blog.modular.service;

import cn.imufeng.blog.modular.entity.Blog;
import cn.imufeng.blog.modular.param.BlogPageParam;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 博客 服务类
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
public interface IBlogService extends IService<Blog> {

    Page<Blog> page(BlogPageParam blogPageParam);

}
