package org.wecancodeit.ecom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringsConfig {

	@Bean
	public String myOneAndOnlyString() {
		return "shazam";
	}

	@Bean
	public String anotherString() {
		return "another string";
	}

	@Bean
	public String beetlebrox() {
		return "this IS the string you're looking for";
	}
}
