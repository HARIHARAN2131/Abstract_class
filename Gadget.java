package Interface;

abstract class Gadget{
	public String name ;
	public long price;
	public String vendor;
    abstract void calculatediscount();	
}

class Computer extends Gadget {
	
	@Override
	void calculatediscount() {
		// TODO Auto-generated method stub
		name = "HP";
		price = 69000;
		vendor="Hari";
		float discount = (float) (0.30*price);
		System.out.println("Name : "+ name);
		System.out.println("Net Price : "+ price);
		System.out.println("vendor : "+ vendor);
		System.out.println("Discount : 30% ");
		System.out.println("Discount price : "+ discount);
		System.out.println("price : "+(price-discount));
	}
	
}

class Tv extends Gadget{

	@Override
	void calculatediscount() {
		// TODO Auto-generated method stub
		name = "MI";
		price = 45000;
		vendor="Hari";
		float discount = (float) (0.20*price);
		System.out.println("Name : "+ name);
		System.out.println("Net Price : "+ price);
		System.out.println("vendor : "+ vendor);
		System.out.println("Discount : 20% ");
		System.out.println("Discount price : "+ discount);
		System.out.println("price : "+(price-discount));
	}
	
}

class Fan extends Gadget{

	@Override
	void calculatediscount() {
		// TODO Auto-generated method stub
		name = "Panasonic";
		price = 10000;
		vendor="Hari";
		float discount = (float) (0.50*price);
		System.out.println("Name : "+ name);
		System.out.println("Net Price : "+ price);
		System.out.println("vendor : "+ vendor);
		System.out.println("Discount : 50% ");
		System.out.println("Discount price : "+ discount);
		System.out.println("price : "+(price-discount));
	}
	

	
	public static void main(String[] args) {
		Fan fan= new Fan();
		fan.calculatediscount();
		Tv tv =new Tv();
		tv.calculatediscount();
		Computer computer = new Computer();
		computer.calculatediscount();
	}
	
	}
