package Interface;

public interface ElectronicGadgets {
	String name="Computer";
}

abstract class E_Gadgets implements ElectronicGadgets{
	abstract void switchOn() ;
	abstract void switchOff();
}
class A extends E_Gadgets{

	@Override
	void switchOn() {
		// TODO Auto-generated method stub
		System.out.println(name+" is ON");
	}

	@Override
	void switchOff() {
		// TODO Auto-generated method stub
		System.out.println(name+" is OFF");
	}
	



public static void main(String[] args) {
	A a = new A();
	a.switchOn();
	a.switchOff();
}}