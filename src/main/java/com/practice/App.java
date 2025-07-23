package com.practice;

import org.hibernate.SessionFactory;

import com.practice.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        
        SessionFactory factory = HibernateUtility.getSessionFactory();
    }
}
