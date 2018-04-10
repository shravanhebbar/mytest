package com.KNN.Instance;

public class Neighbor {


	private int distance=0;
	private String ID=null;
	private String ota=null;
	private String test=null;
	private String name_test=null;
	private String name_train=null;
	private double Log2_distance=0; 
	private double Log1_distance=0;
	private double Lat1_distance=0; 
	private double Lat2_distance=0; 
	private double km=0.0;
	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}

	public void setInstance(String ID) {
		this.ID= ID;
	}

	public String getInstance() {
		return ID;
	}

	public void setTest(String test) {
		this.test= test;
	}

	public String getTest() {
		return test;
	}


	public void setNametrain(String nametrain) {
		this.name_train= nametrain;
	}

	public String getNametrain() {
		return name_train;
	}

	public void setLog1Distance(double Log1_distance) {
		this.Log1_distance = Log1_distance;
	}

	public double getLog1Distance() {
		return Log1_distance;
	}
	
	public void setLog2Distance(double Log2_distance) {
		this.Log2_distance = Log2_distance;
	}

	public double getLog2Distance() {
		return Log2_distance;
	}
	
	public void setLat1Distance(double Lat1_distance) {
		this.Lat1_distance = Lat1_distance;
	}

	public double getLat1Distance() {
		return Lat1_distance;
	}
	
	public void setLat2Distance(double Lat2_distance) {
		this.Lat2_distance = Lat2_distance;
	}

	public double getLat2Distance() {
		return Lat2_distance;
	}

	public void setOta(String ota) {
		this.ota= ota;
	}

	public String getOta() {
		return ota;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getKm() {
		return km;
	}

	@Override
	public String toString() {
		return this.getDistance()+this.getInstance();

	}
}
