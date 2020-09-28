package com.meng;

import com.meng.dao.CustomerBo;
import com.meng.dao.StudentDAO;
import com.meng.dao.impl.StudentJDBCTemplate;
import com.meng.entity.Student;
import com.meng.entity.StudentMarks;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HelloApp {
//    @Autowired
//    private static Customer customer;

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
 //       CustomerDao customerDao = (CustomerDao)context.getBean("customerDao");
//        Customer customer = new Customer(5, "haohao",29);
//        //customerDao.insert(customer);
//        Customer byCustomerId = customerDao.findByCustomerId(1);
//        DepartmentDAO deparmentDao = (DepartmentDAO) context.getBean("deparmentDao2");
//        System.out.println(deparmentDao.queryDepartment().size());
//        context = new AnnotationConfigApplicationContext(AppConfig.class);
//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//        helloWorld.sayHello();

//        ConfigurableApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Customer4 customer4 = (Customer4) context2.getBean("customer4");
//        System.out.println(customer4);
//
//        context2.close();

//        Customer6 customer6 = (Customer6) context.getBean("customerServiceProxy");
//
//        System.out.println("*************************");
//        customer6.printName();
//        System.out.println("*************************");
//        customer6.printURL();
//        System.out.println("*************************");
//        try {
//            customer6.printThrowException();
//        } catch (Exception e) {
//
//        }
//        CustomerBo customer = (CustomerBo) context.getBean("customerBo");
//        customer.addCustomerAround("yiibai");

        StudentDAO studentJDBCTemplate =
                (StudentDAO)context.getBean("studentJDBCTemplate");
        System.out.println("------Records creation--------" );
        studentJDBCTemplate.create("Zara", 11, 99, 2010);
        studentJDBCTemplate.create("Nuha", 20, 97, 2010);
        studentJDBCTemplate.create("Ayan", 25, 100, 2011);
        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }



}
