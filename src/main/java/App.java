import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanC1 =
                (Cat) applicationContext.getBean("cat");
        Cat beanC2 =
                (Cat) applicationContext.getBean("cat");
        boolean beanHW = beanHW1 == beanHW2;
        boolean beanC = beanC1 == beanC2;
        System.out.println(beanHW);
        System.out.println(beanC);
    }
}