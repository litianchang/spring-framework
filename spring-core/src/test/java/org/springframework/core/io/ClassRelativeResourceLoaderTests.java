package org.springframework.core.io;

import org.junit.Test;
import org.springframework.util.PathMatcher;

import java.io.File;

/**
 * @program spring-framework
 * @description:
 * @author: litianchang
 * @create: 2019/09/11 16:05
 */

public class ClassRelativeResourceLoaderTests {
	@Test
	public void getResource() throws Exception {
		ClassRelativeResourceLoader classRelativeResourceLoader = new ClassRelativeResourceLoader(PathMatcher.class);
		Resource resource = classRelativeResourceLoader.getResource("..");
		File file = resource.getFile();
		System.out.println(file.getAbsolutePath());
	}

}
