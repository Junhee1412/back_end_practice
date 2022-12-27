package com.lec.basic.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
	Collection	XML
	------------------
	List		<list>
	Set			<set>
	Map			<map>
	Properties	<props>

*/

public class CollectionBean {

	private List<String> addressList;
	private Set<String> addressSet;
	private Map<String, String> addressMap;
	private Properties addressProps;
	
	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public Set<String> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getAddressProps() {
		return addressProps;
	}

	public void setAddressProps(Properties addressProps) {
		this.addressProps = addressProps;
	}
	
}
