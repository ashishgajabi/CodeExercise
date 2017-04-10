package org.ashish.exercise1.logger.impl;

import org.ashish.exercise1.logger.StringLogger;
import org.ashish.exercise1.util.Constant;
import org.springframework.stereotype.Component;

/**
 * @author Ashish Gajabi
 * 
 *         This class is to modify String which needs to be logged to log file if
 *         string is very large
 *
 */
@Component
public class StringLoggerImpl implements StringLogger {

	/**
	 * This method truncate large String to given length.
	 * 
	 * @param orgString
	 *            String which needs to be modified
	 * @param numberOfChars
	 *            Length of output Sting
	 * @Return truncatedString Output modified String to be logged
	 * 
	 */
	@Override
	public String truncate(String orgString, int numberOfChars) {
		String truncatedString = "";

		if (orgString == null) {
			return orgString;
		}

		int orgLength = orgString.length();

		if (numberOfChars > Constant.TRUNCATESTRING.length() && (numberOfChars < orgLength)) 
		{
			int remaningLength = numberOfChars - (Constant.TRUNCATESTRING.length());
			int quotient = remaningLength / 2;
			int remeainder = remaningLength - quotient;

			StringBuilder formattedString = new StringBuilder(orgString.substring(0, quotient));
			formattedString = formattedString.append(Constant.TRUNCATESTRING)
					.append(orgString.substring((orgLength - remeainder), orgLength));
			truncatedString = formattedString.toString();
		}
		else
		{
			truncatedString = orgString;
		}

		return truncatedString;
	}

}
