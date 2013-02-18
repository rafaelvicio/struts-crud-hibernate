package com.ashok.exception;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomExceptionHandler extends ExceptionHandler {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(CustomExceptionHandler.class);

	@Override
	public ActionForward execute(Exception exception, ExceptionConfig config,
			ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws ServletException {
		
		LOGGER.error(exception.getMessage());
		
		return super.execute(exception, config, mapping, form, request, response);
	}
}
