package com.stydy.list;

import com.stydy.java8.Student;
import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import javax.swing.tree.TreeNode;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * List测试类
 * @author fengfasong
 * @date 2020/8/27
 */
public class ListStydy {
    /**
     * 自定义分页工具测试
     */
    @Test
    public void test01(){
        List<Student> list = getStudentList();
        PageUtil pageUtil = new PageUtil(list,2,2);
        System.out.println(pageUtil.pageData());
    }

    @Test
    public void test02(){
        Student student = new Student("王安石","男",18,"一中");
        Student student1 = student;
        student1.setName("阿莫西林");
        System.out.println(student.toString());
        System.out.println(student1.toString());
    }

    /**
     * 两个list判断进行过滤
     */
    @Test
    public void test03(){
        List<Student> list = getStudentList();
        List<String> stringList = new ArrayList<>();
        list = list.stream().filter(p->{
            return stringList.contains(p.getName());
        }).collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void test04(){
        Deque<Student> deque = new LinkedList<>();
        deque.addAll(getStudentList());
        System.out.println(deque.peek());
        deque.pop();
        System.out.println(deque.peek());
        int [][] rows = new int[9][9 + 1];
        Arrays.stream(rows).forEach(p-> Arrays.stream(p).forEach(s-> System.out.println(s)));
    }

    @Test
    public void test05(){
        System.out.println(2/3);
        int [][] rows = new int[3][3 + 1];
        Arrays.stream(rows).forEach(p->{
            Arrays.stream(p).forEach(s-> System.out.print(s));
            System.out.println();
        });
        rows[2][2]--;
        Arrays.stream(rows).forEach(p->{
            Arrays.stream(p).forEach(s-> System.out.print(s));
            System.out.println();
        });
    }

    @Test
    public void test06(){
        char a =  1+'0';
        System.out.println(a);
    }

    @Test
    public void test07(){
        for (int i = 0; i < 4; ++i) {
            System.out.print("===");
            System.out.print(i);
            System.out.println();
        }
        for (int j = 0; j < 4; j++) {
            System.out.print("===");
            System.out.print(j);
            System.out.println();
        }
    }

    @Test
    public void test08(){
        Comparable max = Collections.max((Collection) getStudentList());
        System.out.println(max);
    }

    @Test
    public void test09(){
        Collections.sort(getStudentList(), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        getStudentList().sort(Comparator.comparing(Student::getAge));
    }

    @Test
    public void test10(){
        List<Student> studentList = getStudentList();
        List<Integer> ageS = new ArrayList<>(Arrays.asList(25,22));
        List<Student> collect = studentList.stream().filter(p -> !ageS.contains(p.getAge())).collect(Collectors.toList());
        System.out.println(collect.toString());
    }

    @Test
    public void test11(){
        List<Student> students = getStudentList();
        students.addAll(getStudentList());
        System.out.println(students);
    }

    @Test
    public void test12(){
        final int a = 0;
        List<Student> studentList = getStudentList();
        AtomicInteger i = new AtomicInteger();
        studentList.stream().forEach(p->{
            p.setAge(i.getAndIncrement());
        });
    }

    @Test
    public void test13(){
        List<Student> list = new ArrayList<>();
        System.out.println(list.size());
        List<Student> list1 = new ArrayList<>();
        List<Student> studentList = getStudentList();
        list.addAll(studentList);
        System.out.println(list.size());
        list.addAll(list1);
        System.out.println(list.size());
    }

    public <T extends PageUtil> T testh(T t){

        return null;
    }

    @Test
    public void test14(){
        BigDecimal bigDecimal = new BigDecimal("0001");
        System.out.println(bigDecimal);
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
}
