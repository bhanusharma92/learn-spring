package soundSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resources.Config;

public class CDMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MediaPlayer player = context.getBean(MediaPlayer.class);

        player.play();
        context.close();
    }

}
