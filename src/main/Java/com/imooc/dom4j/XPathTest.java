package com.imooc.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XPathTest {
    public void xpath(String xpathExp) throws DocumentException {
        String file = "D:/IDEA File/HTML/src/main/resources/hr.xml";
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        //用来执行XPath表达式,返回selectNodesXPath查询节点
        List<Node> nodes = document.selectNodes(xpathExp);
        for(Node node : nodes){
            Element emp = (Element) node;
            System.out.println(emp.attributeValue("no"));
            System.out.println(emp.elementText("name"));
            System.out.println(emp.elementText("age"));
            System.out.println(emp.elementText("salary"));
            System.out.println("=============================");
        }
    }

    public  static void main(String[] args) throws DocumentException {
        XPathTest xPathTest = new XPathTest();
        //从根节点获取所有employee节点
        xPathTest.xpath("/hr/employee");
        //当前XML文档中不管employee在哪，只要为employee一律统计
        xPathTest.xpath("//employee");
        //统计所有工资小于4000的employee
        xPathTest.xpath("//employee[salary<4000]");
        //查询所有employee为苏苏
        xPathTest.xpath("//employee[name='苏苏']");
        //获取所有属性为305
        xPathTest.xpath("//employee[@no=305]");
        //获取employee编号最1个
        xPathTest.xpath("//employee[1]");
        //获取employee最后一个
        xPathTest.xpath("//employee[last()]");
        //获取一个范围的employee
        xPathTest.xpath("//employee[position()<2]");
        //获取employee的第一个的第三个
        xPathTest.xpath("//employee[1] | //employee[3]");
    }

}
