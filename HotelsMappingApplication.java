package com.KNN.Main;

import java.util.ArrayList;
import java.lang.*;
import java.io.FileWriter;
import java.io.IOException;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.KNN.Instance.Hotel_Instances;
import com.KNN.Instance.Instance;
import com.KNN.Instance.Neighbor;

@SpringBootApplication
public class HotelsMappingApplication {
	public static final int NUM_ATTRS = 9;
	
	public static final String PATH_TO_TRAINDATA_FILE = "Data/Train_Data.data";
	public static final String PATH_TO_TESTNDATA_FILE = "Data/CL_TestData.data";
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws IOException {
		SpringApplication.run(HotelsMappingApplication.class, args);

		ArrayList<Instance> instances_Traindata = null;
		ArrayList<Instance> instances_Testdata = null;
		ArrayList<Neighbor>  distances = new ArrayList<Neighbor>() ;
		

        
		//ArrayList<Neighbor> distances = null;


		Hotel_Instances reader=new Hotel_Instances(PATH_TO_TRAINDATA_FILE);
		instances_Traindata = reader.buildInstances_For_Traindata();

		Hotel_Instances Testreader=new Hotel_Instances(PATH_TO_TESTNDATA_FILE);
		instances_Testdata = Testreader.buildInstances_For_Traindata();

		try {
			Neighbor neighbor=null;
			
			for (Instance Testdata : instances_Testdata) {
				
				neighbor = new Neighbor();
				neighbor.setTest(Testdata.getID()+"0");
				distances.add(neighbor);
				
				double distance = 0;
				//System.out.println(Testdata.getID());
				for (Instance train : instances_Traindata) {
					if ( !Testdata.getOta().equalsIgnoreCase(train.getOta())) {
						if(Testdata.getCluster().equalsIgnoreCase(train.getCluster())) {
							if(Testdata.getChainName().equalsIgnoreCase(train.getChainName())) {
								if( Testdata.getPostalcode().equalsIgnoreCase(train.getPostalcode())) {
									if(Testdata.getCity().equalsIgnoreCase( train.getCity()))
									{

										distance += Math.sqrt(Math.pow((Testdata.getLat()-train.getLat()), 2)+Math.pow((Testdata.getLog()-train.getLog()), 2));
										//System.out.println(distance+"   "+train.getID());
										
										neighbor = new Neighbor();
										
										neighbor.setDistance(distance);
										//neighbor.setTest(Testdata.getID());
										neighbor.setInstance(train.getID());
										
										distances.add(neighbor);

									}             			
								}
							}
						}
					}
				}
				FileWriter file=new FileWriter("output.csv",true);
				
				for (Neighbor d : distances) {
					 //FileOutputStream fileOutputStream=new FileOutputStream(file);
					//System.out.println(d.getInstance()+"  "+d.getTest());
					//file.write(d.getTest()+d.getInstance());
					file.write(d.getTest()+"");
					file.write(",");//+"\t"+d.getInstance());
					file.write(d.getInstance()+"");
					file.write("\n");
					
					
				}
				file.write("\n");
				
				file.close();
				 //System.out.println();
				
				distances.removeAll(distances);
				
			}
			

		}
		catch(Exception e) {
			System.out.println(e);

		}





	}

	
}
