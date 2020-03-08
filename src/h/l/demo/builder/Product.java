package h.l.demo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��25��
 * @Description: ��Ʒ��
 */
public class Product {
	List<String> parts = new ArrayList<>();

	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		System.out.println("��Ʒ���� ----");
		for (String part : parts) {
			System.out.println(part + " ");
		}
	}
}
