package h.l.demo.flyweight;
/**
 * 
 * @author: Is-Me-Hl
 * @date: 2020ƒÍ1‘¬31»’
 * @Description: ≤‚ ‘
 */
public class TestMainEnter {

	public static void main(String[] args) {
		int extrinsicState = 1503;
		
		FlyWeightFactory f =new FlyWeightFactory();
		
		FlyWeight fx = f.getFlyWeight("X");
		fx.operation(--extrinsicState);
		
		FlyWeight fy = f.getFlyWeight("Y");
		fx.operation(--extrinsicState);
		
		FlyWeight fz = f.getFlyWeight("Z");
		fx.operation(--extrinsicState);
		
		FlyWeight uf = new UnSharedConcreteFlyWeight();
		uf.operation(--extrinsicState);
	}

}
