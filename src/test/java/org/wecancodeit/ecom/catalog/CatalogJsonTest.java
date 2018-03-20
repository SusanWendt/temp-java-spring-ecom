package org.wecancodeit.ecom.catalog;

import java.io.IOException;


import javax.annotation.Resource;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@JsonTest
public class CatalogJsonTest {

	@Resource
	private JacksonTester<Product> productJson;

	@Test
	public void souldSerialize() throws IOException {
		Product product = new Product("product name");
		productJson.write(product);
		JsonContent<Product> content = productJson.write(product);	
		Assertions.assertThat(content).extractingJsonPathValue("@.name").isEqualTo("product name"); 
	}
	
	@Test
	public void shouldDeserialize() throws IOException {
		String jsonContent = "{\"name\": \"product name\" }";
		Product parsed = productJson.parseObject(jsonContent); 
		Assertions.assertThat(parsed.getName()).isEqualTo("product name");
	}
}
