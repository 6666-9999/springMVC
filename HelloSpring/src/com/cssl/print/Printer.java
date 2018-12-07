package com.cssl.print;

public class Printer {

	private Ink ink=null;
	
	private Paper paper=null;

	public void setInk(Ink ink) {
		this.ink = ink;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print(String str) {
		//输出颜色标记
		System.out.println("使用"+ink.getColor(255, 200, 0)+"颜色打印:\n");
		//逐字符输出到纸张
		for (int i = 0; i < str.length(); i++) {
			paper.putInChar(str.charAt(i));
		}
		//将纸张的内容输出
		System.out.println(paper.getContent());
	}
}
