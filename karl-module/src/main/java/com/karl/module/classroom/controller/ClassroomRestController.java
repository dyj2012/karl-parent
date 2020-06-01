package com.karl.module.classroom.controller;

import com.karl.base.controller.BaseRestController;
import com.karl.module.classroom.api.ClassroomService;
import com.karl.module.entity.ClassroomEntity;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo控制器
 *
 * @author 杜永军
 * @date 2020/5/25
 */
@RestController
@RequestMapping("/classrooms")
@Api(tags = "教室接口")
public class ClassroomRestController extends BaseRestController<ClassroomEntity, ClassroomService> {


}
