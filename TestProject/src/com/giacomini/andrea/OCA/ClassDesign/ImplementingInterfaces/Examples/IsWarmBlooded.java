package com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples;

public interface IsWarmBlooded {

	boolean hasScales();
	public default double getTemperature(){
		return 10.0;
	}
}