package miniProject;
import java.util.*;
abstract class VS{
	static String cn;
	static String vnum;
	static String stype;
	VS(String cn,String vnum,String stype){
		this.cn=cn;
		this.vnum=vnum;
		this.stype=stype;
	}
static void displayserDet() {
	System.out.println("Customer Name : "+cn);
	System.out.println("Vechile Num : "+vnum);
	System.out.println("Service Type : "+stype);
  }
abstract double calsercha();
}
 class CarSer extends VS{
	double sparepartscost;
	String vc;
	 double cost;
	 double tsc;
	CarSer(String cn,String vnum,String stype,double sparepartcost) {
		super(cn, vnum, stype);
		this.sparepartscost=sparepartcost;
	}
	@Override
	double calsercha() {
		double serchar = 2000 + sparepartscost;
		return serchar;
	}
	void displaycar() {
		System.out.println(".................................");
		System.out.println("Vechile cat : Car");
		System.out.println("Spare Parts Cost : "+sparepartscost);
		System.out.println("Total Service Charge : "+calsercha());
		System.out.println(".................................");
	}
}
 class BikeSer extends VS{
	 double sparepartscost;
	 BikeSer(String cn,String vnum,String stype,double sparepartcost) {
		super(cn, vnum, stype);
		this.sparepartscost=sparepartcost;
	}
	@Override
	double calsercha() {
		double serchar = 800 + sparepartscost;
		return serchar;
	}
	void displaybike() {
		System.out.println(".................................");
		System.out.println("Vechile cat : Bike ");
		System.out.println("Spare Parts Cost : "+sparepartscost);
		System.out.println("Total Service Charge : "+calsercha());
		System.out.println(".................................");
	}
	 
 }
public class Servicesystem {

	public static void main(String[] args) {
		VS service;
		service = new CarSer("Pravin", "TN34AJ5620", "General Service",7300);
		service.displayserDet();
		((CarSer) service).displaycar();
		service = new BikeSer("Kaviya","TN39F3620","oil service",3500.0);
		service.displayserDet();
		((BikeSer) service).displaybike();
	}

}
