package h.l.demo.builder;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月25日
 * @Description: 具体建造者类1
 */
public class ConcreteBuilder1 extends Builder {

	private Product product = new Product();

	@Override
	public void builderPartA() {
		product.add("部件X");
	}

	@Override
	public void builderPartB() {
		product.add("部件Y");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
