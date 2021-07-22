/*
 * 	Author : manan.panchal@stltech.in
 *  Date of Creation : 14th July, 2021
 * 	Version : 1.0
 * 	Copyright : Sterlite Technologies Ltd.
 */

package com.phoenix.comparators;

import java.util.Comparator;

public class CompareNum implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1 < o2)
			return 1;
		else if(o1 > o2)
			return -1;
		else
			return 0;
	}

}
