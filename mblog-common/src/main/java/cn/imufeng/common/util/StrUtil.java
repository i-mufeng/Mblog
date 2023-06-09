package cn.imufeng.common.util;

import cn.dev33.satoken.util.StrFormatter;
import org.springframework.util.ObjectUtils;

/**
 * 字符串工具类
 *
 * @author MuFeng
 * @since 2023/6/9 21:10
 */
public class StrUtil {

    /**
     * 格式化文本, {} 表示占位符<br>
     * 此方法只是简单将占位符 {} 按照顺序替换为参数<br>
     * 如果想输出 {} 使用 \\转义 { 即可，如果想输出 {} 之前的 \ 使用双转义符 \\\\ 即可<br>
     * 例：<br>
     * 通常使用：format("this is {} for {}", "a", "b") =》 this is a for b<br>
     * 转义{}： format("this is \\{} for {}", "a", "b") =》 this is {} for a<br>
     * 转义\： format("this is \\\\{} for {}", "a", "b") =》 this is \a for b<br>
     *
     * @param template 文本模板，被替换的部分用 {} 表示，如果模板为null，返回"null"
     * @param params   参数值
     * @return 格式化后的文本，如果模板为null，返回"null"
     */
    public static String format(CharSequence template, Object... params) {
        if (null == template) {
            return null;
        }
        if (ObjectUtils.isEmpty(params) || ObjectUtils.isEmpty(template)) {
            return template.toString();
        }
        return StrFormatter.format(template.toString(), params);
    }
}
