/*
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package co.aurasphere.botmill.fb.demo.userprofile;

import static co.aurasphere.botmill.fb.demo.FbBotMillDemoData.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.aurasphere.botmill.fb.FbBotMillContext;
import co.aurasphere.botmill.fb.model.userprofile.FacebookUserProfile;
import co.aurasphere.botmill.fb.userprofile.FbBotMillUserProfileRetriever;

/**
 * The Class UserProfileRetrieverDemo.
 */
public class UserProfileRetrieverDemo {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(UserProfileRetrieverDemo.class);

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		FbBotMillContext.getInstance().setup(getFbPageToken(), getFbValidationToken());
		FacebookUserProfile user = FbBotMillUserProfileRetriever.getUser(getFacebookMockId());
		logger.info("----------- Retrieved user -----------");
		logger.info("Name: " + user.getFirstName());
		logger.info("Surname: " + user.getLastName());
		logger.info("Locale: " + user.getLocale());
		logger.info("Profile pic: " + user.getProfilePic());
		logger.info("Timezone: " + user.getTimezone());
		logger.info("Gender: " + user.getGender());
	}

}
