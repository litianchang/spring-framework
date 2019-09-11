package org.springframework.core.io;

import org.junit.Test;

import java.io.File;

/**
 * @program spring-framework
 * @description:
 * @author: litianchang
 * @create: 2019/09/11 15:40
 */

public class DefaultResourceLoaderTests {
	@Test
	public void getResource() throws Exception {
		DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
		Resource resource = defaultResourceLoader.getResource("/");
		File file = resource.getFile();
		System.out.println(file.getAbsolutePath());
	}
}
