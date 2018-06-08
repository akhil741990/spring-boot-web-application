package com.soul.springboot.app.element;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElementController {

	
	@Autowired
	private ElementService elementService;
	
	@RequestMapping("/elements-of-nature")
	public List<Element> getAllElements() {
		
		return elementService.getElements();
	}
	
	@RequestMapping("/element/{id}")
	public Element getElement(@PathVariable String id) {
		Integer identifier = Integer.parseInt(id);
		if(identifier > 5 || identifier < 0) {
			return new Element("ELEMENT NOT FOUND");
		}
		return elementService.getElements().get(Integer.parseInt(id));	
	}
	
	
	
}