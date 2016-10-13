package se.patrikbergman;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import se.patrikbergman.gradle.Band;

import static org.junit.Assert.assertEquals;

@Slf4j
public class BandTest {

    @Test
    public void testRockFactor() {
        Band band = Band.builder()
                .name("Iron Maiden")
                .rockFactor(10)
                .build();
        log.info("Created band {}.", band);
        assertEquals("Iron Maiden", band.getName());
    }

    @Test
    public void testBandPlay() {
        Band band = Band.builder()
                .name("Accept")
                .rockFactor(8)
                .build();
        log.info("Created band {}.", band);
        assertEquals(0, band.getNumberOfPlayedShows());
        band.play();
        assertEquals(1, band.getNumberOfPlayedShows());
        log.info("{} has played {} shows.", band.getName(), band.getNumberOfPlayedShows());
    }
}
