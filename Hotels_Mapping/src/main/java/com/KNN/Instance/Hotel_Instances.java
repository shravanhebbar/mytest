package com.KNN.Instance;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.KNN.Main.HotelsMappingApplication;

public class Hotel_Instances {
	private String TraindataFilePath;

	public Hotel_Instances(String TraindataFilePath){
		this.TraindataFilePath=TraindataFilePath;	
	}

	@SuppressWarnings("resource")
	public ArrayList<Instance> buildInstances_For_Traindata() {
		BufferedReader reader = null;
		DataInputStream dis = null;
		ArrayList<Instance> TrainData = new ArrayList<Instance>();

		try{
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(TraindataFilePath))));

			String line;
			int Line_num=1;
			Instance instance = null;

			while ((line = reader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");
				instance = new Instance();

				Line_num++;
				if((HotelsMappingApplication.NUM_ATTRS - 1) != st.countTokens()) {
					System.out.println("LINE: " + --Line_num);
					throw new Exception("Unknown number of attributes!");
				}
				
				
				String ID = st.nextToken();  
				String Ota = st.nextToken(); 
				double Lat =Double.parseDouble(st.nextToken());
				double Log =Double.parseDouble( st.nextToken());
				//String City = st.nextToken();
				String Postalcode = st.nextToken();
				//String ChainName=st.nextToken();
				String Cluster=st.nextToken();
				String Name=st.nextToken();

				instance.setID(ID);
				instance.setOta(Ota);
				instance.setLat(Lat);
				instance.setLog(Log);
				//instance.setCity(City);
				instance.setPostalcode(Postalcode);
				//instance.setChainName(ChainName);
				instance.setCluster(Cluster);
				instance.setName(Name);


				TrainData.add(instance);
			}

		}
		catch(Exception e) {
			System.out.println("Uh oh, got an IOException error: " + e.getMessage()); 

		}

		finally { 
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException ioe) {
					System.out.println("IOException error trying to close the file: " + ioe.getMessage()); 
				}
			}
		}

		return TrainData;
	}


}

