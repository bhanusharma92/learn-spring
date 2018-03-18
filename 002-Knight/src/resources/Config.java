package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springinaction.BraveKnight;
import springinaction.Knight;
import springinaction.Quest;
import springinaction.SlayDragonQuest;

@Configuration
public class Config {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
