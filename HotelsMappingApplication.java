package com.KNN.Main;

import java.util.ArrayList;
import java.lang.*;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.KNN.Instance.Hotel_Instances;
import com.KNN.Instance.Instance;
import com.KNN.Instance.Neighbor;

@SpringBootApplication
public class HotelsMappingApplication {
	public static final int NUM_ATTRS = 9;
	public static final int NUM_RUNS = 17067;
	public static final String PATH_TO_TRAINDATA_FILE = "Data/Train_Data.data";
	public static final String PATH_TO_TESTNDATA_FILE = "Data/CL_TestData.data";
	
	@SuppressWarnings("null")
	public static void main(String[] args)  {
		SpringApplication.run(HotelsMappingApplication.class, args);
	
		ArrayList<Instance> instances_Traindata = null;
		ArrayList<Instance> instances_Testdata = null;
		//ArrayList<Neighbor> distances = null;
		
		
		Hotel_Instances reader=new Hotel_Instances(PATH_TO_TRAINDATA_FILE);
		instances_Traindata = reader.buildInstances_For_Traindata();
		
		Hotel_Instances Testreader=new Hotel_Instances(PATH_TO_TESTNDATA_FILE);
		instances_Testdata = Testreader.buildInstances_For_Traindata();
				
		try {
		for (Instance Testdata : instances_Testdata) {
			ArrayList<Neighbor>  distances = new ArrayList<Neighbor>() ;
			Neighbor neighbor = new Neighbor();
			double distance = 0;
            for (Instance train : instances_Traindata) {
                if ( !Testdata.getOta().equalsIgnoreCase(train.getOta())) {
                	if(Testdata.getCluster().equalsIgnoreCase( train.getCluster())) {
                		if(Testdata.getChainName().equalsIgnoreCase(train.getChainName())) {
                		if( Testdata.getPostalcode().equalsIgnoreCase(train.getPostalcode())) {
                			if(Testdata.getCity().equalsIgnoreCase( train.getCity()))
                         {
                				
                				distance += Math.sqrt(Math.pow((Testdata.getLat()-train.getLat()), 2)+Math.pow((Testdata.getLog()-train.getLog()), 2));
                				System.out.println(distance+"    "+Testdata.getID()+"   "+train.getID());
                				/*neighbor.setInstance(train.getID());
                				neighbor.setDistance(distance);
                				distances.add(neighbor);*/
                				
                          }
             }
           }
        }
                }
                
     } 
            System.out.println("/n");
            /*System.out.println(Testdata.getID());
            for (int j = 0; j < distances.size(); j++) {
				System.out.println(distances.get(j).getInstance()+""+distances.get(j).getDistance());	
				} 
            System.out.println("/n");*/
            
	}
		}
		catch(Exception e) {
			
		}
		
	}
}
