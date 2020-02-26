package com.imooc.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class HrReaders {
    public void readXml() {
        String file = "D:/IDEA File/HTML/src/main/resources/hr.xml";
        //SAXReader 读取XML文件的核心类，用于将XML解析后以“树”的形式保存在内存中
        SAXReader reader = new SAXReader();
        try{
            //读取文件
            Document document = reader.read(new File(file));
            //获取XML文档的根节点,即hr标签
            Element root = document.getRootElement();
            //elements方法用于获取指定标签集合
            List<Element> employees = root.elements("employee");
            for(Element employee : employees){
                //element方法用于获取唯一的子节点对象
                Element name = employee.element("name");
                //getText()用于获取标签文本
                String empName =  name.getText();
                System.out.println(empName);
                //elementText == 前面2个
                System.out.println(employee.elementText("age"));
                System.out.println(employee.elementText("salary"));
                Element department = employee.element("deparment");
                System.out.println(department.elementText("dname"));
                System.out.println(department.elementText("address"));
                //attribute获取属性
                Attribute att = employee.attribute("no");
                System.out.println(att.getText());

            }
        }
        catch (DocumentException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws DocumentException {
        HrReaders reader = new HrReaders();
        reader.readXml();
    }

}
