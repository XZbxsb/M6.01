package com.njzh.java1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection01 {
    public static void main(String[] args) {
        Collection coll=new ArrayList();//多态 引用Collection 调用ArrayList的实例
        coll.add(123);//.add(Object e) 向集合中添加元素
        coll.add("456");
        coll.add(true);
        coll.add(new Student("张三",22));
        System.out.println(coll.size());//.size() 等同于length  查看数据的长度（个数）

        Collection c1=new ArrayList();
        c1.add(123);

        System.out.println(coll.equals(c1));//.equals 比较两个集合是否相等

        System.out.println(coll.contains(123));//.contains(Object o) 判断集合是否包含某个元素

        coll.remove(123);//从集合中移除某个元素

        System.out.println(coll.contains(123));

        coll.addAll(c1);//.addAll(Collection c) 将集合c添加到集合中
        System.out.println(coll.size());

        System.out.println(c1.isEmpty());//.isEmpty 判断集合是否为空

        c1.clear();//.clear()  清空集合
        System.out.println(c1.isEmpty());

        Iterator it=coll.iterator();//.iterator()返回此集合的列表迭代器
        for (int i = 0; i < coll.size(); i++) {//遍历集合
            System.out.println(it.next());
        }
//
//         jdk1.5 之后新增了foreach遍历  [增强for循环]
//         for(遍历的集合的数据类型  变量名：需要遍历的集合){
//             使用
//         }
        for (Object o:coll){
            System.out.println(o);
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}