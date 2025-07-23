package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Online;
import com.practice.Utility.HibernateUtility;

public class UserFunctioality {

	SessionFactory factory = HibernateUtility.getSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();

	Scanner sc = new Scanner(System.in);

	public void getRegisterForCourse() {

		Online o = new Online();
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter Student Name");
		String name = sc.next();
		System.out.println("Enter course Name");
		String cName = sc.next();
		System.out.println("Enter paid fees");
		double fees = sc.nextDouble();
		System.out.println("Enter Registration Date");
		String dateString = sc.next();

		o.setId(id);
		o.setStudentName(name);
		o.setCourseName(cName);
		o.setFeesPaid(fees);
		o.setRegistrationDate(dateString);

		session.persist(o);
		transaction.commit();

	}

	public void getViewAllRegistration() {
		List<Online> list = session.createQuery("Select o from Online o", Online.class).getResultList();
		list.stream().forEach(x -> System.out.println(x));
		int s = sc.nextInt();
		Online on = session.find(Online.class, s);
		System.out.println(on.toString());
		transaction.commit();
		session.close();
	}

	public void getUpdateFeesPaid() {

		System.out.println("Enter id");
		int a = sc.nextInt();
		Online on1 = session.find(Online.class, a);
		System.out.println("Enter Fees");
		double b = sc.nextDouble();
		// Online on2 = session.find(Online.class, b);
		on1.setFeesPaid(b);
		transaction.commit();
		session.close();

	}

	public void getDeleteRegistration() {
		System.out.println("Enter id");
		int a = sc.nextInt();
		Online o1 = session.find(Online.class, a);

		Transaction transaction = session.beginTransaction();
		session.remove(o1);
		transaction.commit();
		System.out.println("Record deleted successfully.");

		session.close();

	}

}
