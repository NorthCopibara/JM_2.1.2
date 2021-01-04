import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanWorld_1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanWorld_2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat_1 =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat_2 =
                (Cat) applicationContext.getBean("cat");

        System.out.println("HelloWorld beans is " + (beanWorld_1 == beanWorld_2));
        System.out.println("Cat beans is " + (beanCat_1 == beanCat_2));
    }
}