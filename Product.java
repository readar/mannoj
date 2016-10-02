package com.base.model;




import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;



@Entity
@Table
@Component


public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int ptid;
	private String ptname;
	private String ptdescription;
	private String ptauthor;
	@Min(1)
	private int ptprice;
	@Min(1)
	private int ptquantity;
	
	
	public int getPtid() {
		return ptid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	@Transient
	private MultipartFile img;
	
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	public String getPtname() {
		return ptname;
	}
	public void setPtname(String ptname) {
		this.ptname = ptname;
	}
	public String getPtdescription() {
		return ptdescription;
	}
	public void setPtdescription(String ptdescription) {
		this.ptdescription = ptdescription;
	}
	public int getPtprice() {
		return ptprice;
	}
	public void setPtprice(int ptprice) {
		this.ptprice = ptprice;
	}
	public int getPtquantity() {
		return ptquantity;
	}
	public void setPtquantity(int ptquantity) {
		this.ptquantity = ptquantity;
	}
	public String getPtauthor() {
		return ptauthor;
	}
	public void setPtauthor(String ptauthor) {
		this.ptauthor = ptauthor;
	}
	
	
	
	@ManyToOne(cascade=CascadeType.ALL)

	@JoinColumn(name="sup_spid",insertable=false,updatable=false)
	private Supplier supplier;


	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	private int sup_spid;


	public int getSup_spid() {
		return sup_spid;
	}
	public void setSup_spid(int sup_spid) {
		this.sup_spid = sup_spid;
	}




	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="catg_tgid",nullable=false,insertable=false,updatable=false)
	private Category category;


	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	private int catg_tgid;


	public int getCatg_tgid() {
		return catg_tgid;
	}
	public void setCatg_tgid(int catg_tgid) {
		this.catg_tgid = catg_tgid;
	}
	
		
	
}
