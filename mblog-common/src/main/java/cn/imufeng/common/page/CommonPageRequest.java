package cn.imufeng.common.page;

import cn.imufeng.common.util.CommonServletUtil;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * 通用分页请求
 *
 * @author MuFeng
 * @since 2023/6/9 17:32
 */
@Slf4j
public class CommonPageRequest {

    private static final String PAGE_SIZE_PARAM_NAME = "size";

    private static final String PAGE_PARAM_NAME = "current";

    private static final Integer PAGE_SIZE_MAX_VALUE = 100;

    public static <T> Page<T> defaultPage() {
        return defaultPage(null);
    }

    public static <T> Page<T> defaultPage(List<OrderItem> orderItemList) {

        int size = 20;

        int page = 1;

        //每页条数
        String pageSizeString = CommonServletUtil.getParamFromRequest(PAGE_SIZE_PARAM_NAME);
        if (!ObjectUtils.isEmpty(pageSizeString)) {
            try {
                size = Integer.parseInt(pageSizeString);
                if (size > PAGE_SIZE_MAX_VALUE) {
                    size = PAGE_SIZE_MAX_VALUE;
                }
            } catch (Exception e) {
                log.error(">>> 分页条数转换异常：", e);
                size = 20;
            }
        }

        //第几页
        String pageString = CommonServletUtil.getParamFromRequest(PAGE_PARAM_NAME);
        if (!ObjectUtils.isEmpty(pageString)) {
            try {
                page = Integer.parseInt(pageString);
            } catch (Exception e) {
                log.error(">>> 分页页数转换异常：", e);
                page = 1;
            }
        }
        Page<T> objectPage = new Page<>(page, size);
        if (!ObjectUtils.isEmpty(orderItemList)) {
            objectPage.setOrders(orderItemList);
        }
        return objectPage;
    }
}
