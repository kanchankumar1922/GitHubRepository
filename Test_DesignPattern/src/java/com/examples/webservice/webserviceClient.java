/**
 * 
 */
package com.examples.webservice;

import com.examples.webservice.net.webservicex.GeoIP;
import com.examples.webservice.net.webservicex.GeoIPService;
import com.examples.webservice.net.webservicex.GeoIPServiceSoap;

/**
 * @author kumark
 *
 */
public class webserviceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(args);
		if(null != args) System.out.println("---");
		
		String [] agrsManual = {};
		System.out.println("agrsManual :: " + agrsManual);
		for(String str  :  agrsManual){
			System.out.println( " :_ " + str);
		}
		String ipAddress = (args == null) ? "192.168.0.11" : "nothing" ;
		System.out.println(ipAddress);
		GeoIPService geoIPService = new GeoIPService();
		System.out.println("geoIPService :: " +geoIPService );
		GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
		System.out.println( " geoIPServiceSoap :: " +geoIPServiceSoap);
		GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
		System.out.println("GEOIP ::: " + geoIP);
		System.out.println( "IP address " +ipAddress + " corresponds to country "  + geoIP.getCountryName() );

	}

}
