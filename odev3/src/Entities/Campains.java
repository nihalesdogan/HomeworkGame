package Entities;

public class Campains {
	int id;
	String name;
	int cutprice;
	int price;
	
	public Campains() {
		super();
	}
	public Campains(int id, int cutprice,String name,int price) {
		super();
		this.id = id;
		this.cutprice = cutprice;
		this.name=name;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCutprice() {
		return price-cutprice;
	}
	public void setCutprice(int cutprice) {
		this.cutprice = cutprice;
	}

}
