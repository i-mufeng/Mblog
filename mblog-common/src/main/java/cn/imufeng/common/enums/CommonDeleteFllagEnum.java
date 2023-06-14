package cn.imufeng.common.enums;

import lombok.Getter;

/**
 * 通用删除标志枚举
 *
 * @author MuFeng
 * @since 2023/6/13 10:51
 */
@Getter
public enum CommonDeleteFllagEnum {
    /**
     * 未删除
     */
    NOT_DELETE,

    /**
     * 已删除
     */
    DELETED
}
