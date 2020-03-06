package com.hilo.entities;

import java.io.Serializable;
import java.util.Date;

public class Reviews implements Serializable {
	protected int reviewNo;
	protected String reviewName;
	protected String category;
	protected String productName;
	protected Date reviewDate;

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	@Override
	public String toString() {
		return "Reviews [reviewNo=" + reviewNo + ", reviewName=" + reviewName + ", category=" + category
				+ ", productName=" + productName + ", reviewDate=" + reviewDate + "]";
	}

}
