package cn.kaka.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gonglu
 * 2022/1/11
 */
@RestController
public class DemoController {

	@RequestMapping(value = "/hello/test", method = RequestMethod.GET)
	public String testHello() {
		return "the first build for spring boot!";
	}
}
