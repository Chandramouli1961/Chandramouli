class A{
 int a=10,b=20;
 void display(){
  System.out.println("Inside class A");
 }
}

class B extends A{
 int a=11,b=22;
 @Override //annotation
 void display(){
  System.out.println("Inside class B");
  System.out.println(this.a+" | "+b+" | "+super.a+" | "+ super.b);
  super.display();
 }
}

class OverridingMembers
{
	public static void main(String[] args) 
	{
		B obj = new B();
		System.out.println(obj.a+" | "+obj.b);
		obj.display();
	}
}
