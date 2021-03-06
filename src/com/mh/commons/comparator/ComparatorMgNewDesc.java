package com.mh.commons.comparator;

import java.util.Comparator;

import com.mh.entity.WebMgElectronic;

public class ComparatorMgNewDesc implements Comparator {

	public int compare(Object o1, Object o2) {
		WebMgElectronic u1 = (WebMgElectronic) o1;
		WebMgElectronic u2 = (WebMgElectronic) o2;
		if (u1.getEleIsNew() < u2.getEleIsNew()) {
			return 1;
		} else {
			return 0;
		}
	}
}
