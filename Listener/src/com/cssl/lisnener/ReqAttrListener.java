package com.cssl.lisnener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ReqAttrListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("添加Request-key:"+arg0.getName());
		System.out.println("添加Request-value:"+arg0.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("移除Request-key:"+arg0.getName());
		System.out.println("移除Request-value:"+arg0.getValue());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("替换Request-key:"+arg0.getName());
		System.out.println("替换Request-value:"+arg0.getValue());
	}

}
