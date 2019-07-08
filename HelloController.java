package io.jb.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
public class HelloController {
	
	@RequestMapping(value ="/hello" ,method = RequestMethod.GET)
	public String sayHi()
	{
		System.out.println("hello api in");
		return "Hi";
		
	}
	
	
}
