package com.karl.core.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import com.karl.base.model.BaseEntity;
import lombok.Data;

/**
 * 菜单例表
 *
 * @author karl
 * @date 2020/5/25
 */
@Data
@TableName("T_TEST_JSON")
@Table(name = "T_TEST_JSON")
public class TestJsonEntity extends BaseEntity {

    @TableField("JSON")
    @Column(name = "JSON", type = MySqlTypeConstant.LONGTEXT)
    private String json;


}
