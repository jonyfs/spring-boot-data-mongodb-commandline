package br.com.jonyfs.spring.boot.data.mongodb.commandline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import br.com.jonyfs.spring.boot.data.mongodb.commandline.builder.StudentBuilder;
import br.com.jonyfs.spring.boot.data.mongodb.commandline.model.Student;
import br.com.jonyfs.spring.boot.data.mongodb.commandline.repository.StudentRepository;

@ComponentScan
@EnableMongoRepositories
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = new ArrayList<Student>();
		StudentBuilder studentBuilder = new StudentBuilder();
		Student student; 
		for (int i = 0; i < 100; i++) {
			student =  studentBuilder
			.withAutomaticId()
			.withAutomaticName()
			.withAutomaticScores()
			.build();
			students.add(student);
		}
		repository.save(students);
	}

}