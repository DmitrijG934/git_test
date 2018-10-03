
import tools.GenClass;

public class Main {
	public static void main(String[] args) {

	GenClass<Integer> gen_int = new GenClass<>(10);
	GenClass<Double> gen_double = new GenClass<>(43.2);

	int x = gen_int.getObj();
	double y = gen_double.getObj();

	System.out.println("Result: " + (x + y));
        
	System.out.println("testing...");

	Test test = new Test();

	test.test(gen_int, gen_double);
	

	}
}
