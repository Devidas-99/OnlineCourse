package com.practice;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App {
  public static void main( String[] args ){
    	while(true) {
    	UserFunctioality user = new UserFunctioality();
    	SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Enter your choice");
        System.out.println(" 1. Do Registration for Course");
        System.out.println(" 2. View All Registration");
        System.out.println(" 3. Update Fees");
        System.out.println(" 4. Delete Registratio");
    	Scanner sc = new Scanner(System.in);
    	
    	int choice = sc.nextInt();
    	
    	switch(choice){
    	case 1:
    		user.getRegisterForCourse();
    		break;
        
    	case 2:
    		user.getViewAllRegistration();
    		break;
        
    	case 3:
    		user.getUpdateFeesPaid();
    		break;
     
        case 4:
            user.getDeleteRegistration();
            break;
            
        default :
        	System.out.println("Wrong Input");
        
        
    	}
        transaction.commit();
        session.close();
        
        
        
    	} 
        
        
    }

	
		
	}

