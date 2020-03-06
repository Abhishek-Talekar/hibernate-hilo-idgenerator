package com.hilo.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hilo.entities.ReviewDao;
import com.hilo.entities.Reviews;

public class HiloBatchTest {
	public static void main(String[] args) {
		ReviewDao dao = new ReviewDao();
		List<Reviews> reviewsList = new ArrayList<Reviews>();

		for (int i = 1; i < 100; i++) {
			Reviews reviews = new Reviews();
			reviews.setCategory("CAT-"+i);
			reviews.setProductName("Washing Machine");
			reviews.setReviewDate(new Date());
			reviews.setReviewName("Best");
			reviewsList.add(reviews);
		}
		ReviewDao.save(reviewsList);
	}
}
