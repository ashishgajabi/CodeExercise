package org.ashish.exercise1.controller;

import javax.servlet.http.HttpServletRequest;

import org.ashish.exercise1.logger.StringLogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubscriptionController {

	@Autowired
	private StringLogger logger;

	@RequestMapping(value = "/subscribe", method = RequestMethod.GET)
	public String subscribe(HttpServletRequest request) {

		// String orderDetails = getOrderDetails(request);
		String orderDetails = "123456789012345678901234567890";

		String truncatedOrderDetails = logger.truncate(orderDetails, 25);

		// log(truncatedOrderDetails);
		return "success";

	}

}