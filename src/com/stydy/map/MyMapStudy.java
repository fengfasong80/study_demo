package com.stydy.map;

import com.stydy.java8.Java8Study;
import com.stydy.java8.Student;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * map学习
 * @author fengfasong
 * @date 2020/8/21
 */
public class MyMapStudy {

    /**
     * map遍历
     */
    @Test
    public void test01(){
        Map<String,Student> map = getMap();
        for(Map.Entry<String,Student> entry : map.entrySet()) {
            //System.out.println(entry.getKey());
            //System.out.println(entry.getValue());
            //拿到李清照的key
            if (entry.getValue().getName() == "李清照") {
                System.out.println(entry.getKey());
            }
            //拿到key为A的学时
            if (entry.getKey() == "A") {
                System.out.println(entry.getValue());
            }
        }
            //判断是否存在key  M，存在咋打印该key的value，不存在则打印不存在该key
        //同样的使用方法，可以用containsValue方法判断是否存在某个value
        if(map.containsKey("M")){
            System.out.println(map.get("M"));
        }else {
            System.out.println("不存在该key！");
        }

    }

    @Test
    public void test02(){
        Map<String,Student> map = getMap();
        //map.put("A",null);
        System.out.println(map.size());
        Map<String,Student> testMap = new HashMap<>();
        testMap.put("A",null);
        System.out.println(testMap.isEmpty());
        Set<String> strings = map.keySet();
        System.out.println(strings);
        System.out.println(map.values());
        System.out.println(map.get("A"));

    }

    @Test
    public void test(){
        Map<String,String> map = new HashMap<>();
        map.put("map","2020");
        map.put("map","2021");
        System.out.println(map.get("map"));
        System.out.println(0%2);
    }

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
}
