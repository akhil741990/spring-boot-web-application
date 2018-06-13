package com.soul.springboot.app.element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ElementService {

	private List<Element> elements =    new ArrayList<>(
			Arrays.asList(new Element("Earth",0,"Prithvi"),
			new Element("Water", 1, "Jal"),
			new Element("Air",2,"Vayu"),
			new Element("Fire", 3, "Agni"),
			new Element("Ether",4,"Aakash")));
	
	public List<Element> getElements(){
		return elements;
	}
	
	public Element getElement(Integer id) {
		try {
			return elements.stream().filter(e ->e.getId().equals(id)).findFirst().get();
		}catch (Exception e) {
			return new Element("NO SUCH ELEMENT");
		}
		
	}
	

	public void updateElememt(Element element, Integer id) {
		int i = 0;
		for(Element e : elements) {
			if(e.getId().equals(id)) {
				elements.set(i, element);
				break; // Assumption id is unique
			}
			i++;
		}
	}

	public void addElememt(Element element) {
		this.elements.add(element);
	}
}
