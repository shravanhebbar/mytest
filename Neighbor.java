package com.KNN.Instance;

public class Neighbor {

	
	private double distance=0;
	private String ID=null;
	public Neighbor() {
		setInstance(null);
		setDistance(0);
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getDistance() {
		return distance;
	}

	public void setInstance(String ID) {
		this.ID= ID;
	}

	public String getInstance() {
		return ID;
	}
	
	@Override
	public String toString() {
		return this.getDistance()+this.getInstance();
		
	}
}
