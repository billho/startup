package ext.billopen.start.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ext.billopen.start.db.entity.StartUpDemo;
import ext.billopen.start.db.persistent.StartUpDemoPersistent;

/**
* @author  Bill_Ho@foxmail.com
* @version 2015年12月5日 下午2:46:20
* 
*/
@Controller
public class HelloWordController {
	@Autowired
	private StartUpDemoPersistent persistent;
	
	@RequestMapping("/sayhi")
	public Object sayHi(){
		StartUpDemo startUpDemo = new StartUpDemo();
		startUpDemo.setContent("Hello world");
		persistent.save(startUpDemo);
		
		ModelAndView modelAndView = new ModelAndView("showMessage");
		modelAndView.addObject("message","Hi,World.");
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("/sayhijson")
	public Object sayHijosn(){
		StartUpDemo startUpDemo = new StartUpDemo();
		startUpDemo.setContent("hello!");
		return startUpDemo;
	}
}
