package com.taghandlers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateConvert extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		String strDate = sdf.format(date);
		out.print(strDate);
	}
}
