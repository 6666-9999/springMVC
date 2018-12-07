package com.cssl.lisnener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ApplicationAttrListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("添加Application-key:"+arg0.getName());
		System.out.println("添加Application-value:"+arg0.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("移除Application-key:"+arg0.getName());
		System.out.println("移除Application-value:"+arg0.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("替换Application-key:"+arg0.getName());
		System.out.println("替换Application-value:"+arg0.getValue());
	}

}
