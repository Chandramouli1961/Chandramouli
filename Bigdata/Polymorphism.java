class A{
 void display(){
  System.out.println("Inside class A");
 }
}

class B extends A{
 @Override //annotation
 void display(){
  System.out.println("Inside class B");
 }
}

class Polymorphism {
	public static void main(String[] args) {
		//A obj = new A();
		//B obj = new B();
		A obj = new B();
		obj.display();
	}
}
