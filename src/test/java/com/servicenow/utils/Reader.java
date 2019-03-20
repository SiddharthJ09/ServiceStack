package com.servicenow.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Reader {

	
//	@DataProvider (name = "data-provider")
	public static Map<String,String> getData() throws FilloException {
	
		Recordset rs;
		String query;
		
		Fillo  fi = new Fillo();
		Connection cn = fi.getConnection("C:\\Users\\hp-pc\\Desktop\\ServiceStack\\ServiceNow\\TestData\\TestData.xls");
		
		query = "Select * from Sheet1";
		rs= cn.executeQuery(query);
		Map<String, String> formdata = null; 
		while(rs.next()) {
			
			
			formdata = new HashMap<String, String>();
			ArrayList <String> key = rs.getFieldNames(); //new ArrayList<>();
			
			key = rs.getFieldNames();
			
			for(int i=0;i<key.size();i++) {
				System.out.println(key.get(i));  // gives column names
				formdata.put(key.get(i), rs.getField(key.get(i)));
			}	
		}
		
		
		rs.close();
		cn.close();
		
		return formdata;
		
	}
	
	
//	@Test (dataProvider = "data-provider")
//	public void getData(Map<String,String> formdata)
//	{
//		System.out.println(formdata.get("Caller"));
//	}
	
	
	
	
}


	
//	public static void main(String[] args) throws FilloException {
//		
//		Recordset rs;
//		String query;
//		Fillo  fi = new Fillo();
//		Connection cn = fi.getConnection("C:\\Users\\Siddharth.jadhav\\Documents\\TestData.xls");
//		
//		query = "Select * from Sheet1";
//		rs= cn.executeQuery(query);
//		while(rs.next()) {
//			
//		Map <String,String> formdata = new HashMap<String, String>();
//		ArrayList <String> key = rs.getFieldNames(); //new ArrayList<>();
//		
//		key =	rs.getFieldNames();
//		
//		for(int i=0;i<key.size();i++) {
//			System.out.println(key.get(i));  // gives column names
//			formdata.put(key.get(i), rs.getField(key.get(i)));
//		}
//				
//			
//		}
//		rs.close();
//		cn.close();
//		
//	}
	

