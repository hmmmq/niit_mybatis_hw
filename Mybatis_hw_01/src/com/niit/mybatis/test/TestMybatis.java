package com.niit.mybatis.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.niit.mybatis.beans.book;


class TestMybatis {

	@Test
	void testsqlSessionFactory() throws Exception {

	       String resource = "mybatis-config.xml";
	       InputStream inputStream = Resources.getResourceAsStream(resource);
	       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println(sqlSessionFactory);
            SqlSession session = sqlSessionFactory.openSession();
         System.out.println(session);
         try {
        	 //sql语句的唯一标识
        	 //执行sql需要用到的参数
             book a = session.selectOne("abc.selectbook", 02);
             System.out.println(a);
           } finally {
             session.close();
           }
	   

	}

}
