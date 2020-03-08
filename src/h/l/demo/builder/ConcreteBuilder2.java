package h.l.demo.builder;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020年2月25日
 * @Description: 具体建造者类2
 */
public class ConcreteBuilder2 extends Builder {

	private Product product = new Product();

	@Override
	public void builderPartA() {
		product.add("部件XX");
	}

	@Override
	public void builderPartB() {
		product.add("部件YY");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
