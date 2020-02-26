package com.imooc.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;

public class HrWriter {
    public void writeXml() throws DocumentException, IOException {
        String file = "D:/IDEA File/HTML/src/main/resources/hr.xml";
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        Element root = document.getRootElement();
        //写XML的核心方法，创建属于该对象子节点
        Element employee = root.addElement("employee");
        employee.addAttribute("no","305");
        Element name = employee.addElement("name");
        //添加文本内容
        name.setText("苏苏");
        employee.addElement("age").setText("20");
        employee.addElement("salary").setText("4500");
        Element department =  employee.addElement("deparment");
        department.addElement("dname").setText("人事部");
        department.addElement("address").setText("大厦-B105");
        //把文件输入流转换为write对象
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        //将内存中的DOM模型重新写入对应文件
        document.write(writer);
        writer.close();
    }

    public static void main(String[] args) throws IOException, DocumentException {
        HrWriter hrWriter = new HrWriter();
        hrWriter.writeXml();
    }
}
