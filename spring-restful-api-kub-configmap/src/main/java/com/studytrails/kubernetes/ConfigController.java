package com.studytrails.kubernetes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${spring.datasource.url}")
	public String springDataSourceUrl;

	@Value("${spring.datasource.username}")
	public String springDataSourceUsername;

	@Value("${spring.datasource.password}")
	public String springDataSourcePassword;

	@RequestMapping("/datasource")
	public String getDataSourceDetails() {
		String s = "";
		s = "URL : " + springDataSourceUrl + "<br>";
		s += "Username : " + springDataSourceUsername + "<br>";
		s += "Password : " + springDataSourcePassword;
		return s;
	}
}
