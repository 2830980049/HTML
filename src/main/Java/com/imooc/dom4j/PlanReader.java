package com.imooc.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class PlanReader {
    public static void main(String[] args) throws DocumentException {
        String file = "D:/IDEA File/HTML/src/main/resources/plan.xml";
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        Element root = document.getRootElement();
        List<Element> courses = root.elements("course");
        for(Element course : courses){
            System.out.println(course.elementText("course-name"));
            System.out.println(course.elementText("class-hour"));
            System.out.println(course.elementText("exam-form"));
            Attribute att = course.attribute("id");
            System.out.println(att.getText());
        }
    }
}
