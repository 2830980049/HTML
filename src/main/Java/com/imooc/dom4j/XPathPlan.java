package com.imooc.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XPathPlan {
    public void XPaths(String s) throws DocumentException {
        String file = "E:/IDEA File/src/main/resources/plan.xml";
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        List<Node> nodes = document.selectNodes(s);
        for(Node node : nodes){
            Element emp = (Element) node;
            System.out.println(emp.attributeValue("id"));
            System.out.println(emp.elementText("course-name"));
            System.out.println(emp.elementText("class-hour"));
            System.out.println(emp.elementText("exam-form"));
            System.out.println("==============================");
        }
    }

    public static void main(String[] args) throws DocumentException {
        XPathPlan xPathPlan = new XPathPlan();
        //xPathPlan.XPaths("/teaching-plan/course");
        //xPathPlan.XPaths("//course[class-hour < 50]");
        //xPathPlan.XPaths("//course[course-name = '高等数学']");
        //xPathPlan.XPaths("//course[@id=3]");
        //xPathPlan.XPaths("//course[position() <= 2]");
        xPathPlan.XPaths("//course[position() >= 2 and position() <= 3]");
    }
}
