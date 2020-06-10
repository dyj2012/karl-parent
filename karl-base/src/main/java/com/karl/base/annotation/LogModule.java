/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.karl.base.annotation;

import java.lang.annotation.*;

/**
 * 日志模块
 *
 * @author Think
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogModule {

    /**
     * 日志模块
     *
     * @return
     */
    String value();
}
