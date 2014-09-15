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
public class Dep extends GenericCMSEntity {


	public Dep() {
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

	public String getLabel(){
		return (String)getFieldValue("label");
	}

	public void setLabel(String attrVal_label){
		setFieldValue("label", attrVal_label);
	}
		
	public List<Team> getTeam(){
		return (List<Team>) getFieldValue("team");
	}

	public void setTeam(List<Team> attrVals_team){
		setFieldValue("team", attrVals_team);
	}
	
	public void addTeam(Team attrVal_team){
		addFieldValue("team", attrVal_team);
	}

	public String getCalName(){
		return (String)getFieldValue("CalName");
	}

	public void setCalName(String attrVal_CalName){
		setFieldValue("CalName", attrVal_CalName);
	}

	@JsonIgnore
	public String get_metaclass(){
		return "Dep";
	}
	
}