package com.cssl.lisnener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttListener implements HttpSessionAttributeListener {

	/**
	 * 属性的添加 监听
	 */
	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("添加Session-key:"+arg0.getName());
		System.out.println("添加Session-value:"+arg0.getValue());
	}

	/**
	 * 属性的移除 监听
	 */
	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("移除Session-key:"+arg0.getName());
		System.out.println("移除Session-value:"+arg0.getValue());

	}

	/**
	 * 属性的替换 监听
	 */
	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("替换Session-key:"+arg0.getName());
		System.out.println("替换Session-value:"+arg0.getValue());

	}

}
