package org.springframework.core.io;

import org.junit.Test;

import java.io.File;

/**
 * @program spring-framework
 * @description:
 * @author: litianchang
 * @create: 2019/09/11 15:28
 */

public class FileSystemResourceLoaderTests {

	@Test
	public void getResource() throws Exception {
		FileSystemResourceLoader fileSystemResourceLoader = new FileSystemResourceLoader();
		Resource resource = fileSystemResourceLoader.getResource("/");
		File file = resource.getFile();
		System.out.println(file.getAbsolutePath());

		Resource out = resource.createRelative("out");
		System.out.println(out.exists());
		System.out.println(out.contentLength());
	}
}
