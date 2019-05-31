package com.leyou.item.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnums {
    pirce_nume_Create(400,"不能为空"),
    CATEGOYR_NO_FOND(404,"商品分类没找到"),
    BRAND_NO_FIND(404,"商品分类没找到")
    ;
    private int code;
    private String msg;

}

