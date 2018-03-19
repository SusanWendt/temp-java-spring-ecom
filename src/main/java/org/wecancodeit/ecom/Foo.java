package org.wecancodeit.ecom;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Foo {
	
	@Resource 
	private String bettlebrox;

	@Override
	public String toString() {
		return "Foo [bettlebrox=" + bettlebrox + "]";
	} 

	
}
