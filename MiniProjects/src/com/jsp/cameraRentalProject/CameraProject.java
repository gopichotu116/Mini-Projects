package com.jsp.cameraRentalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class CameraProject{

	static Scanner sc=new Scanner(System.in);
	static int cam_id;
	static double money=1000;
	static String user;
	
	public static void main(String[] args) {
		ArrayList<Camera> list=new ArrayList<>();
		list.add(new Camera(1,"Samsung","Ds123",500,"Available","u1"));
		cam_id++;
		list.add(new Camera(2,"Sony","HD214",700,"Available","u1"));
		cam_id++;
		list.add(new Camera(3,"Panasonic","XC",500,"Available","u2"));
		cam_id++;
		list.add(new Camera(4,"Canon","XLR",600,"Available","u1"));
		cam_id++;
		list.add(new Camera(5,"Fujitsu","J5",500,"Available","u2"));
		cam_id++;
		list.add(new Camera(6,"LG","L123",600,"Available","u2"));
		cam_id++;
		list.add(new Camera(7,"canon","XPL",500,"Available","u1"));
		cam_id++;
		list.add(new Camera(8,"Chroma","CT",500,"Available","u2"));
		cam_id++;
		list.add(new Camera(9,"Canon","Digital",500,"Available","u1"));
		cam_id++;
		list.add(new Camera(10,"Nikon","DLSR-D500",800,"Available","u2"));
		cam_id++;
	
		System.out.println("+**********+");
		System.out.println("| WELCOM TO CAMERA RENATAL APP |"); 
		System.out.println("+**********+");
		
		System.out.println("PLEASE LOGIN TO CONTINUE ");
		
		System.out.print("USERNAME - "); //cust1 (or) cust2
		String user=sc.next();			
		System.out.print("PASSWORD - ");//cust123 (or) cust456
		String pass=sc.next();
		
		Login l=new Login();
		RentalApp r=new RentalApp();
		
		if(l.login(user,pass)) {
			if(user.contains("cust1")) {CameraProject.user="u1";}
			if(user.contains("cust2")) {CameraProject.user="u2";}
			options(list,r);
		}
	}
	public static void options(ArrayList<Camera> list,Rental r) {
		System.out.println("1.MY CAMERA\n"
				+ "2.RENT A CAMERA\n"
				+ "3.VIEW ALL CAMERA\n"
				+ "4.MY WALLET\n"
				+ "5.EXIT");
		
		boolean cond=true;
		while(cond) {
			int opt=sc.nextInt();
	switch(opt) {
	
	case 1:
		mycamera(list,r);
	break;
	
	case 2:
		if(r.rent(list)) {
		options(list,r);	
		}
		System.out.println("Invalid Camera Id");
		options(list,r);
		break;
	
	
	case 3:
		r.displaycamera(list);
		options(list,r);
		break;
	
	case 4:
		r.wallet();
		options(list,r);
		break;
		
	case 5:
		System.out.println("Thank you.....pls visit again");
		break;
		
	default:
		System.out.println("invaild option \npls try again");
		options(list,r);
}
}
	}
	public static void mycamera(ArrayList<Camera> list,Rental r) {
		System.out.println("1.ADD\n"
				+ "2.REMOVE\n"
				+ "3.VIEW MY CAMERAS\n"
				+ "4.GO TO PREVIOUS MENU");

			int opt1=sc.nextInt();
		switch(opt1) {
		
		case 1:
			r.add(list, user, ++cam_id);
			mycamera(list,r);
			break;
			
		case 2:
			if(r.remove(list)) {
				mycamera(list,r);
			}
			System.out.println("INVALID CAMERA ID");
			mycamera(list,r);
			break;
			
		case 3:
			r.displaymycamera(list);
			mycamera(list,r);
			break;
	
		case 4:
			options(list,r);
			break;
			
		default: 
			System.out.println("invaild option\npls try again");
			mycamera(list,r);		
	}
}
}

class Login{
	public boolean login(String username,String password) {
		if(username.equals("cust1") && password.equals("cust123")||username.equals("cust2") && password.equals("cust456")){
			return true;
		}
		else {
			System.out.println("Invalid user");
			return false;
		}
	}
	}

class Camera{
	private int camera_id;
	private String brand;
	private String model;
	private double price;
	private String status;
	private String user;
	
	public Camera(int camera_id, String brand, String model, double price, String status,String user) {
		super();
		this.camera_id = camera_id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = status;
		this.user=user;
	}

	public int getCamera_id() {
		return camera_id;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUser() {
		return user;
	}

}

interface Rental{
	public void displaycamera(ArrayList<Camera> list);
	public boolean rent(ArrayList<Camera> list);
	public int add(ArrayList<Camera> list,String user,int cam_id);
	public boolean remove(ArrayList<Camera> list);
	public void wallet();
	public void displaymycamera(ArrayList<Camera> list);
	
}

class RentalApp implements Rental{
	static Scanner sc=new Scanner(System.in);
	@Override
	public void displaycamera(ArrayList<Camera> list) {
		System.out.printf("%-12s%-15s%-10s%-10s%5s\n","CAMERA ID","BRAND","MODEL","PRICE","STATUS");
		for(int i=0;i<list.size();i++) {
			Camera c=list.get(i);
			System.out.printf("%-12d%-15s%-10s%-10s%5s\n",c.getCamera_id(),c.getBrand(),c.getModel(),c.getPrice(),
					c.getStatus());
		}
		System.out.println();
	}
		

	@Override
	public boolean rent(ArrayList<Camera> list) {
		System.out.println("FOLLOWING IS THE AVAILABLE LIST OF CAMERA(S) - ");
		System.out.printf("%-12s%-15s%-10s%-10s%5s\n","CAMERA ID","BRAND","MODEL","PRICE","STATUS");
		for(int i=0;i<list.size();i++) {
			Camera c=list.get(i);
			if(c.getStatus().contains("Available")) {
				System.out.printf("%-12d%-15s%-10s%-10s%5s\n",c.getCamera_id(),c.getBrand(),c.getModel(),c.getPrice(),
						c.getStatus());
						}
		}
		
		System.out.print("ENTER THE CAMERA ID YOU WANT TO RENT - ");
		int id=sc.nextInt();
		for(int i=0;i<list.size();i++) {
			Camera c=list.get(i);
			if(c.getCamera_id()==id) {
			if(c.getStatus().contains("Available")) {
			if(CameraProject.money>=(c.getPrice())) {
				CameraProject.money=CameraProject.money-(c.getPrice());
				System.out.println("YOUR TRANSACTION FOR CAMERA - "+c.getBrand()+" with rent INR."+c.getPrice()+" HAS SUCESSFULLY COMPETED\n");
				c.setStatus("RENTED");
				return true;
			}
			else {
				System.out.println("TRANCTION FAILED DUE TO INSUFFICIENT WALLET BALANCE.PLEASE DEPOSIT THE AMOUNT TO YOUR WALLET\n");
				return true;
			}
		}
		else {
			System.out.println("CURRENTAL "+c.getBrand()+" "+c.getModel()+" CAMERA IN NOT AVAILABLE\n");
			return true;
		}
		}	
		}
		return false;
	}

	@Override
	public int add(ArrayList<Camera> list,String user,int cam_id) {
		//System.out.println("ENTER THE CAMERA ID - ");
		//int camera_id=sc.nextInt();
		System.out.print("ENTER THE CAMERA BRAND - ");
		String brand=sc.next();
		System.out.print("ENTER THE MODEL - ");
		String model=sc.next();
		System.out.print("ENTER THE PER DAY PRICE (INR)- ");
		double price=sc.nextInt();
		String status="Available";
		list.add(new Camera(cam_id,brand,model,price,status,CameraProject.user));

		System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST\n");
		return 0;
	}

	@Override
	public boolean remove(ArrayList<Camera> list) {
		displaymycamera(list);
		System.out.print("ENTER THE CAMERA ID TO REMOVE - ");
		int id=sc.nextInt();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getCamera_id()==id) {
				if(list.get(i).getUser().contains(CameraProject.user)) {
				list.remove(i);
				System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST\n");
				return true;
			}
		}
	}
		return false;
	}

	@Override
	public void wallet() {
		System.out.println("YOUR CURRENT WALLET BALANCE IS - INR."+CameraProject.money);
		System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET?(1.YES 2.NO)");
		int dep=sc.nextInt();
		if(dep==1) {
			System.out.print("Enter THE AMOUNT (INR) - ");
			double addmoney=sc.nextDouble();
			CameraProject.money=CameraProject.money+addmoney;
			System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY.CURRENT WALLET BALANCE - INR.\n"+(CameraProject.money));
			
		}
		
	}

	public void displaymycamera(ArrayList<Camera> list) {
		System.out.printf("%-12s%-15s%-10s%-10s%5s\n","CAMERA ID","BRAND","MODEL","PRICE","STATUS");
		for(int i=0;i<list.size();i++) {
			Camera c=list.get(i);
			if(c.getUser().contains(CameraProject.user)) {
			System.out.printf("%-12d%-15s%-10s%-10s%5s\n",c.getCamera_id(),c.getBrand(),c.getModel(),c.getPrice(),
					c.getStatus());
		}
	}
}

}
