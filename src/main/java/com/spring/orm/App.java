package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started....." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/hibernateorm.xml");
        StudentDao dao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student(103, "Komal", "Noida");
        dao.insert(student);
    }
}
