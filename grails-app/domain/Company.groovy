package test1.domain

import org.joda.time.DateTime

class Company {

	String name;
	
	String description;

	static transients = []
	
	static mapping = {
		projects sort:'name'
		sort name : 'asc'
	}
	
    static constraints = {
		name(nullable:false,blank:false)
		description(nullable:false,blank:true)
    }

	public Company(){
		DateTime dt = DateTime.now();
	}
	
}
