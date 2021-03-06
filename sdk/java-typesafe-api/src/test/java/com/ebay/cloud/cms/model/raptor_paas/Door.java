package com.ebay.cloud.cms.model.raptor_paas;

import java.util.List;
import java.util.ArrayList;


import com.ebay.cloud.cms.typsafe.entity.GenericCMSEntity;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CMS generated entity.
 * This class is generated by CMS type-safe api model exporter, DON'T modify this class.
 * 
 */
public class Door extends GenericCMSEntity {


	public Door() {
		set_type(get_metaclass());
//		set_repo("raptor-paas");
	}

	// the getter/setter method
	

	public String getName(){
		return (String)getFieldValue("name");
	}

	public void setName(String attrVal_name){
		setFieldValue("name", attrVal_name);
	}
		
	public List<Lock> getLock(){
		return (List<Lock>) getFieldValue("lock");
	}

	public void setLock(List<Lock> attrVals_lock){
		setFieldValue("lock", attrVals_lock);
	}
	
	public void addLock(Lock attrVal_lock){
		addFieldValue("lock", attrVal_lock);
	}
		
	public Lock getRearlock(){
		return (Lock)getFieldValue("rearlock");
	}

	public void setRearlock(Lock attrVal_rearlock){
		setFieldValue("rearlock", attrVal_rearlock);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "Door";
	}
	
}