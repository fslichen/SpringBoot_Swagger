package evolution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import evolution.pojo.RequestPojo;
import evolution.pojo.ResponsePojo;

@RestController
public class AnyController {
	@GetMapping("/get")
	public ResponsePojo get(@RequestParam("name") String name) {
		return null;
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public ResponsePojo post(@RequestBody RequestPojo request) {
		return null;
	}
}
