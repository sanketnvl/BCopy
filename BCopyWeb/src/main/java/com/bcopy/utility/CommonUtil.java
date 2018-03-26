package com.bcopy.utility;

import java.io.File;

public class CommonUtil {
	public File getFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file;
	}

}
