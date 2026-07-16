package Aran.Aran;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class control {
	ArrayList<Integer> a;
	@GetMapping("/hello")
	void show() {
		demo obj = new demo();
		obj.setName("ARAVINDH");
		obj.setAge(30);
		obj.setAddress("Edappadi");
		System.out.println(obj.getAddress()+obj.getAge()+obj.getName());
	}
	@GetMapping("/hi")
	String hello() {
		demo obj = new demo();
		obj.setName("ARAVINDH");
		obj.setAge(30);
		obj.setAddress("Edappadi");
		return obj.getAddress()+obj.getAge()+obj.getName();
	}
	control() {
		a = new ArrayList<Integer>();
		a.add(75);
		a.add(45);
		a.add(25);
		System.out.println(a);
		
	}
	@PutMapping("/change")
	void chg() {
		a.remove(2);
		a.add(2,85);
		System.out.println(a);
	}
	
}
