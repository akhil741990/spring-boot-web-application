package com.soul.springboot.app.element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementService {

	@Autowired
	private ElementRepository elementRepo;
	
	public List<Element> getElements(){
		List<Element> elements = new ArrayList<>();
		elementRepo.findAll().forEach(elements::add);
		return elements;
	}
	
	public Element getElement(Integer id) {
		try {
			return elementRepo.findOne(id);
		}catch (Exception e) {
			return new Element("NO SUCH ELEMENT");
		}
		
	}
	

	public void addElememt(Element element) {
		elementRepo.save(element);
	}
	
	public void updateElememt(Element element, Integer id) {
		elementRepo.save(element);
	}

	public void deleteElement(Integer id) {
		elementRepo.delete(id);
	}
	
	
}
