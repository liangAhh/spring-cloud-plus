package org.gourd.hu.base.common.enums;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Getter;
import lombok.Setter;

/**
 * 逻辑状态枚举工具类
 *
 * @author gourd
 * @create 2018-07-04 15:41
 **/
@JSONType(serializeEnumAsJavaBean = true)
public enum SortEnum {
    ASC("ASC","升序"),
    DESC("DESC","降序");

    @Getter
    @Setter
    private String value;

    @Getter
    @Setter
    private String label;

    SortEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }
}
