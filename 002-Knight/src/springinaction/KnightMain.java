package springinaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resources.Config;

public class KnightMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();

    }
}
