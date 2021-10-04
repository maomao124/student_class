/**
 * Project name(项目名称)：学生类 student_class
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/4
 * Time(创建时间)： 12:14
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Student s = new Student();
        s.name = "张滑稽";
        s.age = 18;
        s.setSex(true);
        String sex;
        if (s.isSex())
        {
            sex = "男";
        }
        else
        {
            sex = "女";
        }
        System.out.print("\033[1;92m");
        System.out.println("姓名：" + s.name + "\t性别：" + sex + "\t年龄：" + s.age);
        System.out.print("\033[0;0m");
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        //------------------------------------------------------

    }
}
