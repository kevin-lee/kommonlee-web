/**
 * 
 */
package org.elixirian.kommonlee.web;

import org.elixirian.kommonlee.util.CommonConstants;

/**
 * <pre>
 *     ___  _____                                              _____
 *    /   \/    / ______ __________________  ______ __ ______ /    /   ______  ______  
 *   /        / _/ __  // /  /   / /  /   /_/ __  // //     //    /   /  ___ \/  ___ \ 
 *  /        \ /  /_/ _/  _  _  /  _  _  //  /_/ _/   __   //    /___/  _____/  _____/
 * /____/\____\/_____//__//_//_/__//_//_/ /_____//___/ /__//________/\_____/ \_____/
 * </pre>
 * 
 * <pre>
 *     ___  _____                                _____
 *    /   \/    /_________  ___ ____ __ ______  /    /   ______  ______
 *   /        / /  ___ \  \/  //___// //     / /    /   /  ___ \/  ___ \
 *  /        \ /  _____/\    //   //   __   / /    /___/  _____/  _____/
 * /____/\____\\_____/   \__//___//___/ /__/ /________/\_____/ \_____/
 * </pre>
 * 
 * @author Lee, SeongHyun (Kevin)
 * @version 0.0.1 (2010-07-30)
 */
public final class CommonWebConstants
{
	/**
	 * "javax.servlet.forward.request_uri"
	 */
	public static final String JAVAX_SERVLET_FORWARD_REQUEST_URI = "javax.servlet.forward.request_uri";

	/**
	 * "javax.servlet.error.exception"
	 */
	public static final String JAVAX_SERVLET_ERROR_EXCEPTION = "javax.servlet.error.exception";

	/**
	 * "Referer"
	 */
	public static final String HEADER_REFERRER_NAME = "Referer";

	/**
	 * "user-agent"
	 */
	public static final String HEADER_USER_AGENT_NAME = "user-agent";

	/**
	 * "X-Requested-With"
	 */
	public static final String HEADER_FOR_XML_HTTP_REQUEST_NAME = "X-Requested-With";

	/**
	 * "XMLHttpRequest"
	 */
	public static final String HEADER_XML_HTTP_REQUEST_VALUE = "XMLHttpRequest";

	public static final String HEADER_CONTENT_TYPE_TEXT = "text";
	public static final String HEADER_CONTENT_TYPE_TEXT_HTML = "text/html";
	public static final String HEADER_CONTENT_TYPE_APPLICATION_JSON = "application/json";

	public static final int ONE_DAY_IN_SECONDS = 60 * 60 * 24;
	public static final int THIRTY_DAYS_IN_SECONDS = ONE_DAY_IN_SECONDS * 30;
	public static final int ONE_YEAR_IN_SECONDS = ONE_DAY_IN_SECONDS * 365;

	public static final String CACHE_CONTROL = "Cache-Control";
	public static final String CACHE_CONTROL_NO_CACHE_VALUE = "no-cache";
	public static final String CACHE_CONTROL_AGGRESSIVE_CACHE_VALUE = "max-age=" + ONE_YEAR_IN_SECONDS + ", public";
	public static final String CACHE_CONTROL_AGGRESSIVE_CACHE_VALUE_BUT_MUST_REVALIDATE =
		CACHE_CONTROL_AGGRESSIVE_CACHE_VALUE + ", must-revalidate";

	private CommonWebConstants() throws IllegalAccessException
	{
		throw new IllegalAccessException(getClass().getName() + CommonConstants.CANNOT_BE_INSTANTIATED);
	}
}