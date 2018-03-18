package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soundSystem.CDPlayer;
import soundSystem.CompactDisk;
import soundSystem.MediaPlayer;
import soundSystem.SgtPeppers;

@Configuration
public class Config {

    @Bean
    public MediaPlayer cDPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CompactDisk sgtPeppers(){
        return new SgtPeppers();
    }
}
