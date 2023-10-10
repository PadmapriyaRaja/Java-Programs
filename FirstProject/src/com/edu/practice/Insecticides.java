package com.edu.practice;

import java.util.ArrayList;
import java.util.List;

public class Insecticides {

	List<String> mapInsectsName(List<Insect> list) {

		List<String> insectname = new ArrayList<String>();

		for (Insect in : list) {
			
			insectname.add(in.getInsectName());
		}

		return insectname;

	}

	List<Insect> getWeight(List<Insect> list) {

		List<Insect> weight = new ArrayList<Insect>();

		for (Insect in : list) {

			if (in.getInsectWeight() > 40 && in.getInsectWeight() <= 100) {
				weight.add(in);
			}
		}

		return weight;
	}
}
