package com.demo.webserviceclient;

import com.demo.my.MyServiceImplService;
import com.demo.my.Request;
import com.demo.my.Response;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import mypackage.DemoServiceImplService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebserviceclientApplicationTests {
    @Autowired
    private DemoServiceImplService webService;
    @Autowired
    private MyServiceImplService myWebService;
    @Test
    public void contextLoads() {
        String result = webService.getDemoServiceImplPort().sayHello("张三");
        System.out.println("===========================================");
        System.out.println(result);
        System.out.println("===========================================");
    }
    @Test
    public void test() {
        Request request=new Request();
        request.setDateValue("2018-01-01");
        request.setStringValue("String");
        Response result = myWebService.getMyServiceImplPort().query(request);
        System.out.println("===========================================");
        System.out.println(result.getDateValue());
        System.out.println(result.getStringValue());
        System.out.println("===========================================");
    }

}
