package h.l.demo.composite;

import java.util.UUID;

/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020ƒÍ2‘¬14»’
 * @Description: ≤‚ ‘
 */
public class TestMainEnter {

	public static void main(String[] args) {
		Composite root = new Branch("root");
		root.addComposite(new Leaf("leafA"));
		root.addComposite(new Leaf("leafB"));
		
		Composite branch1 = new Branch("branch1");
		branch1.addComposite(new Leaf("branch1-leafA"));
		branch1.addComposite(new Leaf("branch1-leafB"));
		root.addComposite(branch1);
		root.display(1);
	}

}
