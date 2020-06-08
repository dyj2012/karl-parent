package com.karl.module.wristband.controller;

import com.karl.base.controller.BaseEntityController;
import com.karl.module.entity.WristbandEntity;
import com.karl.module.wristband.mapper.WristbandMapper;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 手环 控制器
 *
 * @author 杜永军
 * @date 2020/5/25
 */
@RestController
@RequestMapping("/wristbands")
@Api(tags = "手环接口")
public class WristbandController extends BaseEntityController<WristbandMapper, WristbandEntity> {


}
