package binfoo.shiro;


import java.util.logging.Logger;

/**
 * Created by QueenLi on 2018/4/7.
 */
public class Tutorial {

    //java语言的关键字，变量修饰符，如果用transient声明一个实例变量，当对象存储时，它的值不需要维持。
    // 换句话来说就是，用transient关键字标记的成员变量不参与序列化过程

    private static final transient Logger log = Logger.getLogger(Tutorial.class.getName());

    public static void main(String[] args) {
        log.info("My first Apache Shiro Application");
        System.exit(0);
    }


}
