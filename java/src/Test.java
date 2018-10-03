import tools.GenClass;

public class Test {
	private GenClass obj;

	public Test(GenClass obj) {
		this.obj = obj;
	}

	public Test() {}

	public void test() {
		if(obj.getObj() instanceof Boolean) throw new IllegalArgumentException("Unexpected type");
		System.out.println("Test passed");
	}

	public void test(GenClass obj1, GenClass obj2) {
		if((obj1.getObj() instanceof Boolean) || (obj2.getObj() instanceof Boolean)) throw new IllegalArgumentException("Unexpected types!");
		System.out.println("Test passed: " + obj1.getObj().getClass().getSimpleName() + ", " + obj2.getObj().getClass().getSimpleName());
	}
}
