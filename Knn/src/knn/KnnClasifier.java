package knn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;



public class KnnClasifier {
	static double[][] instances = {
			{0.35,0.91,0.86,0.42,0.71},
			{0.21,0.12,0.76,0.22,0.92},
			{0.41,0.58,0.73,0.21,0.09},
			{0.71,0.34,0.55,0.19,0.80},
			{0.79,0.45,0.79,0.21,0.44},
			{0.61,0.37,0.34,0.81,0.42},
			{0.78,0.12,0.31,0.83,0.87},
			{0.52,0.23,0.73,0.45,0.78},
			{0.53,0.17,0.63,0.29,0.72},
		};


		
		private static String findMajorityClass(String[] array)
		{
			
			Set<String> h = new HashSet<String>(Arrays.asList(array));
			
			String[] uniqueValues = h.toArray(new String[0]);
			
			int[] counts = new int[uniqueValues.length];
			
			for (int i = 0; i < uniqueValues.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if(array[j].equals(uniqueValues[i])){
						counts[i]++;
					}
				}        
			}

			for (int i = 0; i < uniqueValues.length; i++)
				System.out.println(uniqueValues[i]);
			for (int i = 0; i < counts.length; i++)
				System.out.println(counts[i]);


			int max = counts[0];
			for (int counter = 1; counter < counts.length; counter++) {
				if (counts[counter] > max) {
					max = counts[counter];
				}
			}
			System.out.println("max # of occurences: "+max);

			
			int freq = 0;
			for (int counter = 0; counter < counts.length; counter++) {
				if (counts[counter] == max) {
					freq++;
				}
			}

			
			int index = -1;
			if(freq==1){
				for (int counter = 0; counter < counts.length; counter++) {
					if (counts[counter] == max) {
						index = counter;
						break;
					}
				}
				System.out.println("one majority class, index is: "+index);
				return uniqueValues[index];
			} else{//we have multiple modes
				int[] ix = new int[freq];//array of indices of modes
				System.out.println("multiple majority classes: "+freq+" classes");
				int ixi = 0;
				for (int counter = 0; counter < counts.length; counter++) {
					if (counts[counter] == max) {
						ix[ixi] = counter;//save index of each max count value
						ixi++; // increase index of ix array
					}
				}

				for (int counter = 0; counter < ix.length; counter++)         
					System.out.println("class index: "+ix[counter]);       

				
				Random generator = new Random();        
				
				int rIndex = generator.nextInt(ix.length);
				System.out.println("random index: "+rIndex);
				int nIndex = ix[rIndex];
			
				return uniqueValues[nIndex];
			}

		}


		
		private static double meanOfArray(double[] m) {
			double sum = 0.0;
			for (int j = 0; j < m.length; j++){
				sum += m[j];
			}
			return sum/m.length;
		}



		public static void main(String args[]){ 

			int k = 6;// # of neighbours  
			//list to save city data
			List<City> cityList = new ArrayList<City>();
			//list to save distance result
			List<Result> resultList = new ArrayList<Result>();
			// add city data to cityList       
			cityList.add(new City(instances[0],"London"));
			cityList.add(new City(instances[1],"Leeds"));
			cityList.add(new City(instances[2],"Liverpool"));
			cityList.add(new City(instances[3],"London"));
			cityList.add(new City(instances[4],"Liverpool"));
			cityList.add(new City(instances[5],"Leeds"));
			cityList.add(new City(instances[6],"London"));
			cityList.add(new City(instances[7],"Liverpool"));
			cityList.add(new City(instances[8],"Leeds"));
			
			double[] query = {0.65,0.78,0.21,0.29,0.50};
			//find disnaces
			for(City city : cityList){
				double dist = 0.0;  
				for(int j = 0; j < city.cityAttributes.length; j++){    	     
					dist += Math.pow(city.cityAttributes[j] - query[j], 2) ;
					System.out.print(city.cityAttributes[j]+" ");    	     
				}
				double distance = Math.sqrt( dist );
				resultList.add(new Result(distance,city.cityName));
				System.out.println(distance);
			} 

			System.out.println(resultList);
			Collections.sort(resultList, new DistanceComparator());
			String[] ss = new String[k];
			for(int x = 0; x < k; x++){
				System.out.println(resultList.get(x).cityName+ " .... " + resultList.get(x).distance);
				//get classes of k nearest instances (city names) from the list into an array
				ss[x] = resultList.get(x).cityName;
			}
			String majClass = findMajorityClass(ss);
			System.out.println("Class of new instance is: "+majClass);                
		}//end main  

		
		static class City {	
			double[] cityAttributes;
			String cityName;
			public City(double[] cityAttributes, String cityName){
				this.cityName = cityName;
				this.cityAttributes = cityAttributes;	    	    
			}
		}
		
		static class Result {	
			double distance;
			String cityName;
			public Result(double distance, String cityName){
				this.cityName = cityName;
				this.distance = distance;	    	    
			}
		}
		
		static class DistanceComparator implements Comparator<Result> {
			@Override
			public int compare(Result a, Result b) {
				return a.distance < b.distance ? -1 : a.distance == b.distance ? 0 : 1;
			}
		}
}
