package h.l.demo.builder;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��25��
 * @Description: ���彨������2
 */
public class ConcreteBuilder2 extends Builder {

	private Product product = new Product();

	@Override
	public void builderPartA() {
		product.add("����XX");
	}

	@Override
	public void builderPartB() {
		product.add("����YY");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
