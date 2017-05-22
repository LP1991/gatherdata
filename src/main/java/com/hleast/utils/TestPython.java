/********************** 版权声明 *************************
 * 文件名: TestPython.java
 * 包名: main.java.com.hleast.utils
 * 版权:	杭州华量软件  gatherdata
 * 职责: 
 ********************************************************
 *
 * 创建者：Primo  创建时间：2017/5/18
 * 文件版本：V1.0
 *
 *******************************************************/
package main.java.com.hleast.utils;

import org.python.core.PyFunction;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import java.util.Properties;

public class TestPython {
    public static void main(String[] args) {

//        PythonInterpreter interpreter = new PythonInterpreter();
//        interpreter.exec("days=('mod','Tue','Wed','Thu','Fri','Sat','Sun'); ");
//        interpreter.exec("print days[1];");


        Properties props = new Properties();
        Properties preprops = System.getProperties();
        props.put("python.home", "C:\\Users\\00074\\AppData\\Local\\Programs\\Python\\Python36");
        props.put("python.console.encoding", "UTF-8");
//        props.put("python.security.respectJavaAccessibility", "false");
        props.put("python.import.site", "false");
        props.put("python.import.random", "false");
        PythonInterpreter.initialize(preprops, props, new String[0]);

        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("D:\\workplacecopy\\pythonWeb\\learn-python3\\samples\\test\\test.py");
        PyFunction func = (PyFunction)interpreter.get("getRandomName",PyFunction.class);

        PyObject pyobj = func.__call__();
        System.out.println("anwser = " + pyobj.toString());
    }
}
