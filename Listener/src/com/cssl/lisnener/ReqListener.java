package com.cssl.lisnener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ReqListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("ReqListener销毁成功。。。。");

	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("ReqListener初始化成功。。。。");

	}

}
