package com.xxxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.server.mapper.EmployeeMapper;
import com.xxxx.server.mapper.MailLogMapper;
import com.xxxx.server.pojo.Employee;
import com.xxxx.server.service.IEmployeeService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhoubin
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private RabbitTemplate rabbitTemplate;
	@Autowired
	private MailLogMapper mailLogMapper;

}
