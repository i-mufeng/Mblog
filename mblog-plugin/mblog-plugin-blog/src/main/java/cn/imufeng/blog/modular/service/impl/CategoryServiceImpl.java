package cn.imufeng.blog.modular.service.impl;

import cn.imufeng.blog.modular.entity.Category;
import cn.imufeng.blog.modular.mapper.CategoryMapper;
import cn.imufeng.blog.modular.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客分类 服务实现类
 * </p>
 *
 * @author MuFeng
 * @since 2023-06-09 15:11:07
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
