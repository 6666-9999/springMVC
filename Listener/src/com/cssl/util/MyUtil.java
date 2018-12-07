package com.cssl.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyUtil {

	private static SqlSessionFactory factory=null;
	
    private static ThreadLocal<SqlSession> threadLocal=new ThreadLocal<SqlSession>();
	
	static {
		try {
			String resource="mybatis-config.xml";
			InputStream is=Resources.getResourceAsStream(resource);
			factory=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession() {
		SqlSession session=threadLocal.get();
		if(session==null) {
			session=factory.openSession();
			threadLocal.set(session);
		}
		return session;
	}
	
	public static void closeSession() {
		SqlSession session=threadLocal.get();
		if(session!=null) {
			session.close();
			threadLocal.set(null);
		}
	}
}
