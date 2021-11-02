package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class UserForm {
	
	@NotBlank(message="名前を入力してください")
	private String name;
	@NotNull(message="年齢を入力してください")
	@Range(min=0, max=200, message="０歳から２００歳で入力してください")
	private String age;
	@Size(min=1,max=2000, message="１文字以上２０００文字以内で入力してください")
	private String comment;
	
	public int getIntAge() {
		return Integer.parseInt(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}
	
	
}
