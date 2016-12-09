package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="cake")
public class Cake {
	@Id @GeneratedValue
	private Long id;
	private String description;
	private String flavor;
	
	
	
	public Cake(String description, String flavor) {
		super();
		this.description = description;
		this.flavor = flavor;
	}
	 
	public Cake() {
	this("" ,"");
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}
	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	

}
