package com.yimeicloud.study.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting/{count}")
    public List<Greeting> greeting(@PathVariable(value="count") int count) {
    	
    	List<Greeting> result = new ArrayList<Greeting>();;
    	Greeting greeting = null;
    	for(int i = 0; i < count; i++) {
    		greeting = new Greeting(i, "Name" + i);
    		result.add(greeting);
    	}
        return result;
    }
}