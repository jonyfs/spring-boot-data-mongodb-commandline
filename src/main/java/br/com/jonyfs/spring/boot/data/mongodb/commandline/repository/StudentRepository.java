package br.com.jonyfs.spring.boot.data.mongodb.commandline.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.jonyfs.spring.boot.data.mongodb.commandline.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
