package h.l.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: ���ģʽDemo
 */
public abstract class Composite {
	protected String nodeName;

	public Composite(String nodeName) {
		this.nodeName = nodeName;
	}

	public abstract void addComposite(Composite composite);

	public abstract void removeComposite(Composite composite);

	public abstract void display(int depth);
}

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: Ҷ�ӽڵ�
 */
class Leaf extends Composite {

	public Leaf(String nodeName) {
		super(nodeName);
	}

	@Override
	public void addComposite(Composite composite) {
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void removeComposite(Composite composite) {
		System.out.println("Cannot remove from a leaf");
	}

	@Override
	public void display(int depth) {
		System.out.println(depth + "-" + super.nodeName);
	}
}
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020��3��1��
 * @Description: ��֧�ڵ�
 */
class Branch extends Composite {

	private List<Composite> branch = new ArrayList<>();

	public Branch(String nodeName) {
		super(nodeName);
	}

	@Override
	public void addComposite(Composite composite) {
		branch.add(composite);
	}

	@Override
	public void removeComposite(Composite composite) {
		branch.remove(composite);
	}

	@Override
	public void display(int depth) {
		System.out.println(depth + "-" + super.nodeName);
		for (Composite composite : branch) {
			composite.display(depth + 2);
		}
	}

}