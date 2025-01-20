package config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import videosystem.DVDPlayer;
import videosystem.DigitalVideoDisc;

/**
 * JavaConfig3 <--- JavaConfig2, JavaConfig1
 */
@Configuration
@Import({ DVDConfig.class, DVDPlayerConfig.class })
public class VideoSystemConfig {
	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengers") DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
}
