package ${package.Controller};

import ${package.Entity}.${entity};
import ${package.Service}.${table.serviceName};
import cn.imufeng.transaction.core.controller.AjaxResult;
import cn.imufeng.transaction.core.controller.TableDataInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import javax.annotation.Resource;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

<#if restControllerStyle>
import org.springframework.web.bind.annotation.RestController;
<#else>
import org.springframework.stereotype.Controller;
</#if>
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>

/**
* <p>
* ${table.comment!} 前端控制器
* </p>
*
* @author ${author}
* @since ${date}
*/
<#if restControllerStyle>
@RestController
<#else>
@Controller
</#if>
@Tag(name = "${table.comment}控制层")
@RequestMapping("<#if package.ModuleName?? && package.ModuleName != "">/${package.ModuleName}</#if>/<#if controllerMappingHyphenStyle>${controllerMappingHyphen}<#else>${table.entityPath}</#if>")
<#if kotlin>
class ${table.controllerName}<#if superControllerClass??> : ${superControllerClass}()</#if>
<#else>
<#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
<#else>
public class ${table.controllerName} {
</#if>

    @Resource
    private ${table.serviceName} ${table.serviceName?uncap_first};

    @GetMapping
    @Operation(summary = "根据条件分页查询${table.comment!}")
    public TableDataInfo<${entity}> list() {
        Page<${entity}> page = ${table.serviceName?uncap_first}.page(createPage());
        return getDataTable(page);
    }

    @Operation(summary = "通过id查询${table.comment}")
    @GetMapping("{id}")
    public AjaxResult<${entity}> selectById(@PathVariable Long id) {
        return AjaxResult.success(${table.serviceName?uncap_first}.getById(id));
    }

    @Operation(summary = "新增${table.comment}")
    @PostMapping
    public AjaxResult<String> add(@Valid @RequestBody ${entity} ${entity?uncap_first}) {
        return toAjax(${table.serviceName?uncap_first}.save(${entity?uncap_first}));
    }

    @Operation(summary = "通过ID修改${table.comment}")
    @PutMapping
    public AjaxResult<String> edit(@Valid @RequestBody ${entity} ${entity?uncap_first}) {
        return toAjax(${table.serviceName?uncap_first}.updateById(${entity?uncap_first}));
    }

    @Operation(summary = "删除${table.comment}")
    @DeleteMapping("{id}")
    public AjaxResult<String> removes(@PathVariable Long id) {
        return toAjax(${table.serviceName?uncap_first}.removeById(id));
    }
}
</#if>
