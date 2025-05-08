package inherit.inherit02;

import inherit.inherit01.Parent;

public class HideChild  extends Parent {
	
	public HideChild() {
		super(0);
	}
	
	public void printInfo() {
		System.out.println(money);
	}

}
