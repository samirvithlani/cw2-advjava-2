package com.taghandlers;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class UpperCaseHandler extends BodyTagSupport {

	
	@Override
	public int doStartTag() throws JspException {
		
		return EVAL_BODY_BUFFERED;
	}
	
	@Override
	public int doEndTag() throws JspException {
	
		String body = bodyContent.getString();
		String result = body.toUpperCase();
		
		try {
			pageContext.getOut().print(result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	
}
