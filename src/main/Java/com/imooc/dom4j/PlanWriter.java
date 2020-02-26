package com.imooc.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;

public class PlanWriter {
    public static void main(String[] args) throws DocumentException, IOException {
        String file = "D:/IDEA File/HTML/src/main/resources/plan.xml";
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        Element root = document.getRootElement();
        Element course = root.addElement("course");
        course.addAttribute("id","4");
        Element cname = course.addElement("course-name");
        cname.setText("C++");
        course.addElement("class-hour").setText("100");
        course.addElement("exam-form").setText("上机");
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        document.write(writer);
        writer.close();
    }
}
