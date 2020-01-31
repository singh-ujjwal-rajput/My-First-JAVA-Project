package com.oops.concept;
class Encapsulate{
	private String name;
	private long mobile_no;
	private String city_name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long l) {
		this.mobile_no = l;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
}
public class EncapsulationEx {

	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		obj.setName("Ujjwal Kumar Singh");
		obj.setMobile_no(7488885738L);
		obj.setCity_name("Patna");
		
		
		System.out.println("Name:"+obj.getName());
		System.out.println("Mobile_no:"+obj.getMobile_no());
		System.out.println("City_name:"+obj.getCity_name());		
	}

}
