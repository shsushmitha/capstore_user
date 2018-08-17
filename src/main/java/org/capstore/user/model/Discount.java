package org.capstore.user.model;

import java.util.Date;


public class Discount {
	private int discountId;
	private Inventory inventory;
	private Category category;
	private double promoAmount;
	private int discountPercent;
	private Date issueDate;
	private Date expiryDate;
	private String promoName;
	public int getDiscountId() {
		return discountId;
	}
	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public double getPromoAmount() {
		return promoAmount;
	}
	public void setPromoAmount(double promoAmount) {
		this.promoAmount = promoAmount;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String getPromoName() {
		return promoName;
	}
	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}
	
	public Discount(int discountId, Inventory inventory, Category category, double promoAmount, int discountPercent,
			Date issueDate, Date expiryDate, String promoName) {
		super();
		this.discountId = discountId;
		this.inventory = inventory;
		this.category = category;
		this.promoAmount = promoAmount;
		this.discountPercent = discountPercent;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.promoName = promoName;
	}
	public Discount() {
		
	}
	
}
