package com.imooc.spring.ioc.context;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ClassPathXmlApplicationContext implements ApplicationContext{
    private Map iocContainer = new HashMap();
    public ClassPathXmlApplicationContext() {

        try{
            String filePath = this.getClass().getResource("/applicationContext.xml").getPath();
            filePath = new URLDecoder().decode(filePath, "UTF-8");
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File(filePath));

            List<Node> beans = document.getRootElement().selectNodes("bean");
            for(Node node:beans){
                Element ele = (Element) node;
                String id = ele.attributeValue("id");
                String classname = ele.attributeValue("class");

                Class c = Class.forName(classname);
                Object obj = c.getDeclaredConstructor().newInstance();
                List<Node> properties = ele.selectNodes("property");
                for(Node p : properties){
                    Element property =  (Element) p;
                    String propName = property.attributeValue("name");
                    String propValue = property.attributeValue("value");

                    String setMethodName = "set" + propName.substring(0,1).toUpperCase() + propName.substring(1);
                    System.out.println("ready to start:" + setMethodName);
                    Method setMethod = c.getMethod(setMethodName, String.class);
                    setMethod.invoke(obj, propValue);
                }

                iocContainer.put(id, obj);
            }
            System.out.println(iocContainer);
            System.out.println("IOC continer init complete");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public Object getBean(String beanId) {
        return iocContainer.get(beanId);
    }
}
