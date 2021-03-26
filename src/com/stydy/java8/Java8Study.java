package com.stydy.java8;

import com.stydy.java8.entity.Apple;
import com.stydy.java8.service.impl.AppleColorFilter;
import com.stydy.java8.service.impl.AppleWeightFilter;
import com.stydy.java8.util.UtilTest;
import org.junit.Test;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * java8常用方法学习，前面提到的LocalDateTime也属于java8新出API
 * @author fengfasong
 * @date 2020/8/15
 */
public class Java8Study {

    /**
     * List使用foreach
     * java8之foreach
     */
    @Test
    public void test01(){
        /**
         * 普通foreach
         */
        List<Student> list = getStudentList();
        list.forEach(System.out::println);
        /**
         * 自定义消费行为
         */
        Consumer<Student> outName = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.getName());
            }
        };
        list.forEach(outName);
    }

    /**
     *map使用foreach
     */
    @Test
    public void test02(){
        /**
         * 普通foreach
         */
        Map<String,Student> map = getMap();
        map.forEach((k,v)->
                System.out.println("k="+k+",v="+v));

        /**
         * 自定义消费行为
         */
        BiConsumer<String,Student> outSchool = (k,v)->{
            System.out.println("k="+k);
            System.out.println("school="+v.getSchoolName());
        };
        map.forEach(outSchool);
    }

    /**
     * java8之filter
     * 过滤，即筛选
     */
    @Test
    public void test03(){
        Consumer<Student> outName = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.getName());
            }
        };
        /**
         * 筛选性别为女的学生
         */
        String gender = "女";
        List<Student> list = getStudentList();
        list.stream().filter(s->gender.equals(s.getGender())).forEach(outName);
    }


    /**
     * java8之stream
     * 流
     */
    @Test
    public void test04(){
        Consumer<Student> outName = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.getName());
            }
        };
        /**
         * 流的创建
         */
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        stream.forEach(s-> System.out.println(s));
        /**
         * 创建集合流
         */
        Stream<Student> studentStream = getStudentList().stream();
        studentStream.forEach(outName);

    }
    @Test
    public void test05(){
        List<Apple> result = UtilTest.filterApple(getApples(),new AppleColorFilter());
        List<Apple> result02 = UtilTest.filterApple(getApples(),new AppleWeightFilter());
        result.stream().forEach(p -> System.out.println(p.getColor()+" "+p.getWeight()));
    }


    /**
     * 获取苹果集合
     * @return
     */
    private List<Apple> getApples(){
        List<Apple> apples = new ArrayList<>();
        Apple apple01 = new Apple("green",10.00);
        Apple apple02 = new Apple("yellow",14.00);
        Apple apple03 = new Apple("orangle",13.00);
        Apple apple04 = new Apple("black",20.00);
        Apple apple05 = new Apple("red",21.00);
        Apple apple06 = new Apple("red",24.00);
        apples.add(apple01);
        apples.add(apple02);
        apples.add(apple03);
        apples.add(apple04);
        apples.add(apple05);
        apples.add(apple06);
        return apples;
    }

    /**
     * 获取学生集合
     * @return
     */
    private List<Student> getStudentList(){
        List<Student> list = new ArrayList<>();
        Student wanganshi = new Student("王安石","男",18,"一中");
        Student liqingzhao = new Student("李清照","女",19,"二中");
        Student libai = new Student("李白","男",22,"清华附中");
        Student dufu = new Student("杜甫","男",25,"北大附中");
        Student baijuyi = new Student("白居易","男",15,"浙大附中");
        list.add(wanganshi);
        list.add(liqingzhao);
        list.add(libai);
        list.add(dufu);
        list.add(baijuyi);
        return list;
    }

    /**
     * 获取Map
     * @return
     */
    private Map<String,Student> getMap(){
        Student wanganshi = new Student("王安石","男",18,"一中");
        Student liqingzhao = new Student("李清照","女",19,"二中");
        Student libai = new Student("李白","男",22,"清华附中");
        Student dufu = new Student("杜甫","男",25,"北大附中");
        Student baijuyi = new Student("白居易","男",15,"浙大附中");
        Map<String,Student> map = new HashMap<>();
        map.put("A",wanganshi);
        map.put("B",liqingzhao);
        map.put("C",libai);
        map.put("D",dufu);
        map.put("E",baijuyi);
        return map;
    }

    @Test
    public void test11(){
        System.out.println(5 % 5);
    }

}
