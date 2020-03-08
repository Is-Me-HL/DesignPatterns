package h.l.demo.builder;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��2��25��
 * @Description: ���彨������1
 */
public class ConcreteBuilder1 extends Builder {

	private Product product = new Product();

	@Override
	public void builderPartA() {
		product.add("����X");
	}

	@Override
	public void builderPartB() {
		product.add("����Y");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
