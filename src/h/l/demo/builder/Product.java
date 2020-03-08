package h.l.demo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月25日
 * @Description: 产品类
 */
public class Product {
	List<String> parts = new ArrayList<>();

	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		System.out.println("产品创建 ----");
		for (String part : parts) {
			System.out.println(part + " ");
		}
	}
}
