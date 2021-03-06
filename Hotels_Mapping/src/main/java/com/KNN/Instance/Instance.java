package com.KNN.Instance;

public class Instance {

	private String ID=null;
	private String Ota=null;
	private double Lat=0;
	private double Log=0;
	//private String City=null;
	//private String ChainName=null;
	private String Cluster=null;
	private String Postalcode=null;
    private String Name=null;


	public void setID(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID ;
	}


	public void setOta(String Ota) {
		this.Ota = Ota;
	}

	public String getOta() {
		return Ota ;
	}

	public void setLat(double Lat) {
		this.Lat = Lat;
	}

	public double getLat() {
		return Lat ;
	}

	public void setLog(double Log) {
		this.Log = Log;
	}

	public double getLog() {
		return Log;
	}

	/*public void setCity(String City) {
		this.City = City;
	}

	public String getCity() {
		return City ;
	}

	public void setChainName(String ChainName) {
		this.ChainName = ChainName;
	}


	public String getChainName() {
		return ChainName;
	}*/

	public void setCluster(String Cluster) {
		this.Cluster = Cluster;
	}

	public String getCluster() {
		return Cluster;
	}

	public void setPostalcode(String Postalcode) {
		this.Postalcode= Postalcode;
	}

	public String getPostalcode() {
		return Postalcode ;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}


	public String getName() {
		return Name;
	}

	@Override
	public String toString() {
		return this.getID()+this.getOta()+this.getLat()+this.getLog()+this.getPostalcode()+this.getCluster();

	}






}
