/**
 * 
 */
package com.simple.whs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.simple.johnson.WorkingObject;

/**
 * @author Administrator
 *
 */
public class Supplier implements WorkingObject {
	
	private Map master;
	private Map data;
	private String vendorCode;
	private String id;
	
	public Supplier(){
		master=new HashMap();
		data=new HashMap();
	}

	/* (non-Javadoc)
	 * @see com.simple.johnson.WorkingObject#getData()
	 */
	public Map getData() {
		// TODO Auto-generated method stub
		return this.data;
	}

	/* (non-Javadoc)
	 * @see com.simple.johnson.WorkingObject#setData(java.util.Map)
	 */
	public void setData(Map data) {
		this.data=data;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map getMaster() {
		return master;
	}

	public void setMaster(Map master) {
		this.master = master;
	}

}
