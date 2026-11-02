package com.zhang.self2;

/*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性:学号，姓名，年龄。
要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
要求2:添加完毕之后，遍历所有学生信息。
要求3:通过id删除学生信息。如果存在，则删除，如果不存在，则提示删除失败。
要求4:删除完毕之后，遍历所有学生信息。
要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/

public class StudentUpTest {
    public static void main(String[] args) {
        StudentUp[] arr = new StudentUp[3];
        StudentUp stu1 = new StudentUp(1, "zhangsan", 23);
        StudentUp stu2 = new StudentUp(2, "lisi", 24);
        StudentUp stu3 = new StudentUp(3, "wangwu", 25);  //随即去掉一个就会用原数组添加新元素
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;  //~
        StudentUp stu4 = new StudentUp(4, "zhaoliu", 26);
        //引用方法判断id
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("该id与历史id重复！"); //如果id相同
        } else {   //如果不同则加入新数组（存没存满，存满了就拷贝到新数组中再添加）
            int count = full(arr);
            if (count == arr.length) {  //存满了 =>就创建新数组（需要拷贝）
                StudentUp[] newarr = newArr(arr);
                newarr[count] = stu4;
                copy(newarr);
                arr = newarr;
            } else {
                arr[count] = stu4;
                copy(arr);
            }
        }
        System.out.println("以下是进行删除操作的结果");
        //删除操作
        int index = delete(arr,1);
        if(index >= 0){
            arr[index] = null;
            copy(arr);
        }else{
            System.out.println("数据不存在，删除失败");
        }
        //查询
        System.out.println("以下为修改后的数组结果");
        int index_find = delete(arr,2);
        if(index_find >= 0) {
                StudentUp a =arr[index_find];
                int change = a.getAge() + 1;
                a.setAge(change);
                copy(arr);
            }else{
            System.out.println("没有这个选项！");

        }
    }

    //定义方法进行id唯一性判断
    public static boolean contains(StudentUp[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            StudentUp stu = arr[i];
            if(arr[i] != null){
                if (id == stu.getId()) {   //如果数据是null就会报错
                    return true;
                }
            }
        }
        return false;
    }

    //定义方法计算数组里存了几个元素，回去判断原数组还有没有剩余
    public static int full(StudentUp[] arr) {    //这里用int是因为我需要返回的变量是int型
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //定义方法创建一个新数组，比原数组长度加一，并把数据拷贝过来
    public static StudentUp[] newArr(StudentUp[] arr) {
        StudentUp[] newarr = new StudentUp[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }

    //定义方法遍历数组（新+旧）所以写方法
    public static void copy(StudentUp[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StudentUp a = arr[i];   //传的是地址
            if(a != null){
                System.out.println(a.getId()+","+a.getName()+","+a.getAge());
            }
        }
    }
    //定义方法寻找要删除元素的索引
    public static int delete(StudentUp[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if(id == arr[i].getId()){
                    return i;
                }
            }
        }
        return -1;
    }
}