package com.KNN.Main;

import java.util.ArrayList;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.KNN.Instance.Hotel_Instances;
import com.KNN.Instance.Instance;

@SpringBootApplication
public class HotelsMappingApplication {
	public static final int NUM_ATTRS = 9;
	public static final String PATH_TO_TRAINDATA_FILE = "Data/Train_Data.data";
	public static final String PATH_TO_TESTNDATA_FILE = "Data/CL_TestData.data";
	
	public static void main(String[] args) {
		SpringApplication.run(HotelsMappingApplication.class, args);
	
		ArrayList<Instance> instances_Traindata = null;
		ArrayList<Instance> instances_Testdata = null;
		
		Hotel_Instances reader=new Hotel_Instances(PATH_TO_TRAINDATA_FILE);
		instances_Traindata = reader.buildInstances_For_Traindata();
		
		Hotel_Instances Testreader=new Hotel_Instances(PATH_TO_TESTNDATA_FILE);
		instances_Testdata = Testreader.buildInstances_For_Traindata();
		
		
		for (Instance Testdata : instances_Testdata) {
            for (Instance train : instances_Traindata) {
                if ( !Testdata.getOta().equalsIgnoreCase(train.getOta()) ) {
                	if(Testdata.getCluster().equalsIgnoreCase( train.getCluster())) {
                	if( Testdata.getPostalcode().equalsIgnoreCase(train.getPostalcode())&& Testdata.getCity().equalsIgnoreCase( train.getCity()))
                         {
                   System.out.println("yes");

                }
                }
                }
                else
                {
                	System.out.println("no");
                }
            }
		}
		
	}
}
