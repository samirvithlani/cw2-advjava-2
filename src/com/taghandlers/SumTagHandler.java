package com.taghandlers;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SumTagHandler extends SimpleTagSupport {

	int no1;
	int no2;

	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	@Override
	public void doTag() throws JspException, IOException {

		JspWriter out = getJspContext().getOut();
		int ans = no1 + no2;

		out.print(ans);
	}
}
