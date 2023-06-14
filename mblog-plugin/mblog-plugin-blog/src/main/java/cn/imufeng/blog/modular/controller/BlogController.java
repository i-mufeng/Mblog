package cn.imufeng.blog.modular.controller;

import cn.imufeng.blog.modular.entity.Blog;
import cn.imufeng.blog.modular.param.BlogPageParam;
import cn.imufeng.blog.modular.service.IBlogService;
import cn.imufeng.common.pojo.CommonResult;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 博客接口层
 *
 * @author MuFeng
 * @since 2023/6/9 17:11
 */
@Tag(name = "博客控制器")
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Resource
    private IBlogService blogService;

    @GetMapping
    @Operation(summary = "获取博客分页")
    public CommonResult<Page<Blog>> page(BlogPageParam blogPageParam) {
        return CommonResult.data(blogService.page(blogPageParam));
    }

    @PostMapping
    @Operation(summary = "新增博客")
    public CommonResult<String> insert() {
        return CommonResult.ok("发布博客成功");
    }
}
