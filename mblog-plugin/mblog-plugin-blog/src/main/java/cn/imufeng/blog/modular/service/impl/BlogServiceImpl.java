package cn.imufeng.blog.modular.service.impl;

import cn.imufeng.blog.modular.entity.Blog;
import cn.imufeng.blog.modular.mapper.BlogMapper;
import cn.imufeng.blog.modular.param.BlogPageParam;
import cn.imufeng.blog.modular.service.IBlogService;
import cn.imufeng.common.page.CommonPageRequest;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * <p>
 * 博客 服务实现类
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

    @Override
    public Page<Blog> page(BlogPageParam blogPageParam) {
        LambdaQueryWrapper<Blog> wrapper = new LambdaQueryWrapper<>();
        wrapper.select(Blog::getId, Blog::getTitle, Blog::getDescription,
                Blog::getFigureUrl, Blog::getIsPublic, Blog::getIsReward,
                Blog::getUsReview, Blog::getViews, Blog::getApplaud,
                Blog::getCollect, Blog::getWords, Blog::getPassword,
                Blog::getCreateUser, Blog::getCreateTime);
        wrapper.eq(!ObjectUtils.isEmpty(blogPageParam.getId()), Blog::getId, blogPageParam.getId());
        wrapper.eq(!ObjectUtils.isEmpty(blogPageParam.getTitle()), Blog::getTitle, blogPageParam.getTitle());
        wrapper.eq(!ObjectUtils.isEmpty(blogPageParam.getDescription()), Blog::getDescription, blogPageParam.getDescription());
        wrapper.eq(!ObjectUtils.isEmpty(blogPageParam.getDeleteFlag()), Blog::getDeleteFlag, blogPageParam.getDeleteFlag());

        return this.page(CommonPageRequest.defaultPage(), wrapper);
    }
}
