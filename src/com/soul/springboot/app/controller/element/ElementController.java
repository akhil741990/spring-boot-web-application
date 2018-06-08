package com.soul.springboot.app.controller.element;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElementController {

	static List<Element> elements;
	static {
		elements = Arrays.asList(new Element("Earth",0,"Prithvi"),
				new Element("Water", 1, "Jal"),
				new Element("Air",2,"Vayu"),
				new Element("Fire", 3, "Agni"),
				new Element("Ether",4,"Aakash"));
	}
	
	
	
	@RequestMapping("/elements-of-nature")
	public List<Element> getAllElements() {
		
		return elements;
	}
	
	@RequestMapping("/element/{id}")
	public Element getElement(@PathVariable String id) {
		Integer identifier = Integer.parseInt(id);
		if(identifier > 5 || identifier < 0) {
			return new Element("ELEMENT NOT FOUND", -1, "NO SUCH ELEMENT");
		}
		return elements.get(Integer.parseInt(id));	
	}
	
}
