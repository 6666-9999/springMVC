package com.cssl.pojo;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {

	private String name;
	private String password;
	private Integer id;
	private Set<String> set;
}
