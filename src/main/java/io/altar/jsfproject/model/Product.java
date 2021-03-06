package io.altar.jsfproject.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	private String name;
	private ArrayList<Long> shelfId = new ArrayList<>();
	private long maiorShelfId = 0;
	private int discount;
	private double iva;
	private double pvp;
	
	//no arg constructor
	public Product(){}
	
	public ArrayList<Long> getShelfId() {
		return shelfId;
	}
	public long getMaiorShelfId() {
		return maiorShelfId;
	}

	public void addShelfId(long id){
		shelfId.add(id);
		maiorShelfId++;
	}
	public void removeShelfId(long id){
		shelfId.remove(id);
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
