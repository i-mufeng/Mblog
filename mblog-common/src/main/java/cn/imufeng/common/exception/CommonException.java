package cn.imufeng.common.exception;

import cn.imufeng.common.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 通用异常
 *
 * @author MuFeng
 * @since 2023/6/9 17:35
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CommonException extends RuntimeException {


    private static final long serialVersionUID = 8671641557909234820L;

    private Integer code;

    private String msg;

    public CommonException() {
        super("服务器异常");
        this.code = 500;
        this.msg = "服务器异常";
    }

    public CommonException(String msg, Object... arguments) {
        super(StrUtil.format(msg, arguments));
        this.code = 500;
        this.msg = StrUtil.format(msg, arguments);
    }

    public CommonException(Integer code, String msg, Object... arguments) {
        super(StrUtil.format(msg, arguments));
        this.code = code;
        this.msg = StrUtil.format(msg, arguments);
    }
}
