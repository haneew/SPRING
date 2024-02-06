package com.itbank.component;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileComponent {

	private String saveDirectory = "C:\\upload";
	
	public FileComponent() {
		File f = new File(saveDirectory);
		if(f.exists() == false) {
			f.mkdirs();
		}
	}
	
	public String upload(MultipartFile f) {
		File dest = new File(saveDirectory);
		try {
			f.transferTo(dest);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		return saveDirectory;
				
	}
	
	
	
	
}
