package br.com.jonyfs.spring.boot.data.mongodb.commandline.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

	@Id
	Integer id;
	String name;
	List<Score> scores;

	public Student(Integer id, String name, List<Score> scores) {
		super();
		this.id = id;
		this.name = name;
		this.scores = scores;
	}


	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public List<Score> getScores() {
		return scores;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", scores=" + scores + "]";
	}

}
