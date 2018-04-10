package com.KNN.Main;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.lang.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.KNN.Instance.Hotel_Instances;
import com.KNN.Instance.Instance;
import com.KNN.Instance.Neighbor;

@SpringBootApplication
public class HotelsMappingApplication {
	public static final int NUM_ATTRS = 8;

	public static final String PATH_TO_TRAINDATA_FILE = "Data/data.data";
	public static final String PATH_TO_TESTDATA_FILE = "Data/Gmdata.data";



	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws IOException {
		SpringApplication.run(HotelsMappingApplication.class, args);

		ArrayList<Instance> instances_Traindata = null;
		ArrayList<Instance> instances_Testdata = null;
		ArrayList<Neighbor>  distances = new ArrayList<Neighbor>() ;
		//ArrayList<Neighbor>  below97 = new ArrayList<Neighbor>() ;


		Hotel_Instances reader=new Hotel_Instances(PATH_TO_TRAINDATA_FILE);
		instances_Traindata = reader.buildInstances_For_Traindata();

		Hotel_Instances Testreader=new Hotel_Instances(PATH_TO_TESTDATA_FILE);
		instances_Testdata = Testreader.buildInstances_For_Traindata();

		try {
			int truePositive=0;
			int falsNegative=0;

			Neighbor neighbor=null;
			FileWriter file=new FileWriter("hotelMap.txt",true);

			for (Instance Testdata : instances_Testdata) {


				int distance = 0;
				for (Instance train : instances_Traindata) {
					if ( !Testdata.getOta().equalsIgnoreCase(train.getOta())) {
						//  if(Testdata.getCluster().equalsIgnoreCase(train.getCluster())) {
							//if(Testdata.getChainName().equalsIgnoreCase(train.getChainName())){
							if( Testdata.getPostalcode().equalsIgnoreCase(train.getPostalcode())) {
								//if(Testdata.getCity().equalsIgnoreCase(train.getCity()))
								//{
								try {

									distance  =FuzzySearch.ratio(Testdata.getName(),train.getName());
									if(distance>=70){
										neighbor = new Neighbor();
										neighbor.setLat2Distance(train.getLat());
										neighbor.setLog2Distance(train.getLog() );
										neighbor.setLat1Distance(Testdata.getLat());
										neighbor.setLog1Distance(Testdata.getLog() );
										neighbor.setDistance(distance);
										neighbor.setOta(train.getOta());

										neighbor.setInstance(train.getID());

										neighbor.setNametrain(train.getName());
										distances.add(neighbor);

									}
								}
								catch(Exception e) {
									System.out.println(e);											
								}
								//}             			
							//}
							//}
						}
					}
				}
				Collections.sort(distances,Comparator.comparingInt(Neighbor::getDistance).reversed());

				int K=distances.size();
				Random rand = new Random(); 
				file.write("ID="+rand.nextLong()+"\n");
				file.write(Testdata.getID()+"===="+Testdata.getName());//+"===="+Testdata.getCity());
				file.write("\n------------------------------------------------------------------------------------------------------------------\n");


				if(distances.isEmpty())
				{
					file.write("0");
					falsNegative=falsNegative+1;

				}else

				{
					/*truePositive=truePositive+1;
						for(Neighbor s:distances) {
							file.write(s.getInstance()+"===="+s.getNametrain());//+"===="+s.getCity());
							file.write("\n");
						}*/
					if(K>=2) {
						for(int i=0;i<=1;i++) {
							
							
								if(distances.get(i).getDistance()>=96) {
									truePositive=truePositive+1;



									file.write(distances.get(i).getInstance()+"===="+distances.get(i).getNametrain());//+"===="+distances.get(K).getCity());
									file.write("\n");
								}else
								{ 
									//int i=0;	
									double Km= distance(distances.get(i).getLat1Distance(),distances.get(i).getLog1Distance(),distances.get(i).getLat2Distance(),distances.get(i).getLog2Distance());


									if(Km<0.1) {
										truePositive=truePositive+1;
										file.write(distances.get(i).getInstance()+"===="+distances.get(i).getNametrain());
										
										file.write("\n");
									}else {
										file.write("0");
										file.write("\n");
										falsNegative=falsNegative+1;

									}

								}
							}
						
					}else
					{
						int i=0;

						if(distances.get(i).getDistance()>=93) {
							truePositive=truePositive+1;


							file.write(distances.get(i).getInstance()+"===="+distances.get(i).getNametrain());//+"===="+distances.get(K).getCity());

						}else
						{ 

							double Km= distance(distances.get(i).getLat1Distance(),distances.get(i).getLog1Distance(),distances.get(i).getLat2Distance(),distances.get(i).getLog2Distance());


							if(Km<0.3) {
								truePositive=truePositive+1;
								file.write(distances.get(i).getInstance()+"===="+distances.get(i).getNametrain());//+"===="+distances.get(K).getCity());
								file.write("\n");
							}else {
								file.write("0");
								file.write("\n");
								falsNegative=falsNegative+1;

							}

						}


					}
				}


				file.write("\n-------------------------------------------------------------------------------------------------------------------\n");
				file.write("\n\n");

				distances.removeAll(distances);


			}


			//double total=(truePositive);
			//double total1=(total/14244)*100;
			file.write("flasNegative = "+(falsNegative)+"\n"+"truePositive = "+(truePositive)+"\n");//+"%= "+total1);
			file.close();



		}
		catch(Exception e) {
			System.out.println(e);

		}


	}


	private static double distance(double lat1, double lon1, double lat2, double lon2) {

		double theta = lon1 - lon2;

		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));

		dist = Math.acos(dist);

		dist = rad2deg(dist);

		dist = dist * 60 * 1.1515;


		dist = dist * 1.609344;



		return (dist);

	}



	private static double deg2rad(double deg) {

		return (deg * Math.PI / 180.0);

	}
	private static double rad2deg(double rad) {

		return (rad * 180.0 / Math.PI);

	}


}
