package annotation;

//目标：认识元注解
//@MyTest     //只能注解方法和成员变量
public class AnnotationDemo2 {
    @MyTest
    private String name;

    @MyTest
    public void run() {
    }

}
