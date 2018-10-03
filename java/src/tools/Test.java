package tools;

public class Test {
	private GenClass obj;

	public Test(GenClass obj) {
	   this.obj = obj;
	   try {
	   	checkType();
	   } catch(Exception ex) {
		   System.out.println("Exception catched: " + ex.getMessage());
	   }	
	}

	private void checkType() {
		if(obj.getObj() instanceof Boolean) throw new IllegalArgumentExeption("Unexpected type!");
		System.out.println("Type: " + obj.getObj().getClass().getSimpleName());
	}
}
