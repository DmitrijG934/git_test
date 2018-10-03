import tools.GenClass;

public class Test {
	private GenClass obj;

	public Test(GenClass obj) {
		this.obj = obj;
	}

	public void test() {
		if(obj.getObj() instanceof Boolean) throw new IllegalArgumentException("Unexpected type");
		System.out.println("Test passed");
	}
}
