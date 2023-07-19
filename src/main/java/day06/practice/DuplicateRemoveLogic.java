package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemoveLogic {

	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		List<String> uniqueCityList = new ArrayList<String>();

		for (String city : cityList) {
			if (uniqueCityList.contains(city)) {
				continue;
			}else {
				uniqueCityList.add(city);
				
			}
		}

		System.out.println("Original city list: " + cityList);
		System.out.println("Unique city list: " + uniqueCityList);

	}

}


