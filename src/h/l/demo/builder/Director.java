package h.l.demo.builder;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月25日
 * @Description: 指挥者类
 */
public class Director {
	public void Construct(Builder builder) {
		builder.builderPartA();
		builder.builderPartB();
	}
}
