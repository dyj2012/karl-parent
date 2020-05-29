package com.karl.core.user.controller;

import com.karl.base.controller.BaseRestExcelController;
import com.karl.core.user.api.UserService;
import com.karl.core.user.api.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Think
 */
@RestController
@RequestMapping("/users")
public class UserRestController extends BaseRestExcelController<UserEntity, UserService> {


}