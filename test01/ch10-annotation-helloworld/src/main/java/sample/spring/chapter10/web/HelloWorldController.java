package sample.spring.chapter10.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("sayHelloController")
@RequestMapping("/saySomething")
public class HelloWorldController {

	/*
	 * URL: http://localhost:8080/ch10-annotation-helloworld/helloworld/saySomething/sayhello
	 */
	@RequestMapping("/sayhello")
	public ModelAndView sayHello() {
		Map<String, String> modelData = new HashMap<String, String>();
		modelData.put("msg", "Hello World !!");
		//modelData.put("name", "강석");      // TODO-KANG-20181030: to think of UTF-8
		modelData.put("name", "Kiea Seok Kang");      // TODO-KANG-20181030: to think of UTF-8
		return new ModelAndView("helloworld", modelData);
	}

}
