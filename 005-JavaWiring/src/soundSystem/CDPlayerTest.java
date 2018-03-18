package soundSystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import resources.Config;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    private MediaPlayer player;

    private CompactDisk cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    /*@Test
    public void play(){
        player.play();
        assertEquals(
                "Playing Sgt. Peppers's Lonely Hearts Club Band by The Beatles",
                log.getLog()
        );
    }*/
}
