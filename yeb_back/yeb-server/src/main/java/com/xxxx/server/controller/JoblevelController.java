package com.xxxx.server.controller;


import com.xxxx.server.service.IJoblevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhoubin
 */
@RestController
@RequestMapping("/system/basic/joblevel")
public class JoblevelController {

	@Autowired
	private IJoblevelService joblevelService;

}
