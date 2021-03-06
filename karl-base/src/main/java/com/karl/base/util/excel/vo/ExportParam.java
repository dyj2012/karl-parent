package com.karl.base.util.excel.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * 生成excel参数
 *
 * @author karl
 * @date 2018/12/25
 */
@Data
@ToString
public class ExportParam {
    /**
     * 声明,填写须知
     */
    private String statement;

    /**
     * 导出,导入参数
     */
    private Map<String, String> paramMap;

}
