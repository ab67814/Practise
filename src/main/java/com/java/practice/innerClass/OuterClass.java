/**
 * 
 */
package com.ritesh.practice.innerClass;

/**
 * @author ritesht
 * @param <Foo>
 *
 */
public class OuterClass {

	public class NormalInnerClass {
		String foo = "1";
	}

	public static class StaticInnerClass {
		String foo = "1";

		static void print() {
			main(null);
			OuterClass.NormalInnerClass name = new OuterClass().new NormalInnerClass();
			System.out.println(name.foo);
		}

		void nonStaticPrint() {

		}

	}

	private String outerClassVariable;

	static {
		class Test {
			void test() {
				System.out.println("inside test metod of foo class");
			}
		}
		new Test().test();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.NormalInnerClass normalInnerClass = outerClass.new NormalInnerClass();
		OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();// This will work
		System.out.println(staticInnerClass.foo);
		// OuterClass.StaticInnerClass staticInnerClass =
		// OuterClass.StaticInnerClass();//This will give error as we can't call on "()
		// afer new constructor"
		OuterClass.StaticInnerClass.print();
		// OuterClass.StaticInnerClass.nonStaticPrint(); //This will throw error as
		// nonstaticPrint is not static
		System.out.println(normalInnerClass.foo);

		// InnerClass.StaticInnerClass staticInnerClass = InnerClass.StaticInnerClass
	}

	// Class inside method without any condition
	public void print() {
		String outerClassMethodVariable;
		outerClassMethodVariable = "1";
		outerClassVariable = outerClassMethodVariable;

		class LocalInnerClass {
			String localInnerClassVariable;

			public void examine() {
				String localInnerClassMethodVariable = localInnerClassVariable;
				localInnerClassMethodVariable = outerClassVariable;
				localInnerClassMethodVariable = outerClassMethodVariable;
				System.out.println(localInnerClassMethodVariable);
				// outerClassMethodVariable= localInnerClassMethodVariable; // This throw error
				// as "outerClassMethodVariable" is effectively have final modifier
			}
		}
		LocalInnerClass name = new LocalInnerClass();
		name.examine();

	}

	// Class inside method without any condition or in block example
	public void printWithConditionOrInABlock(boolean isTrue) {
		String outerClassMethodVariable;
		outerClassMethodVariable = "1";
		outerClassVariable = outerClassMethodVariable;

		if (isTrue) {
			class LocalInnerClass {
				String localInnerClassVariable;

				public void examine() {
					String localInnerClassMethodVariable = localInnerClassVariable;
					localInnerClassMethodVariable = outerClassVariable;
					localInnerClassMethodVariable = outerClassMethodVariable;
					System.out.println(localInnerClassMethodVariable);
					// outerClassMethodVariable= localInnerClassMethodVariable; // This throw error
					// as "outerClassMethodVariable" is effectively have final modifier
				}
			}
			LocalInnerClass name = new LocalInnerClass();
			name.examine();

		}

	}
}
