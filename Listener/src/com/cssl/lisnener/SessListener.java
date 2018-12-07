package com.cssl.lisnener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessListener implements HttpSessionListener  {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("SessListener 悄悄地我来了。。。。。");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("SessListener 正如我悄悄地走了。。。。。");
	}

}
