package br.com.jonyfs.spring.boot.data.mongodb.commandline.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.jonyfs.spring.boot.data.mongodb.commandline.model.Score;
import br.com.jonyfs.spring.boot.data.mongodb.commandline.model.ScoreType;
import br.com.jonyfs.spring.boot.data.mongodb.commandline.model.Student;

public class StudentBuilder {

	private Integer id;
	private String name;
	private List<Score> scores;

	String[] firstNames = { "John", "Mary", "Joseph", "Paul", "Hugo", "Carl", "Melissa", "Nicole", "James", "Lucie", "Charlie", "Nathan", "Henry", "Anne", "Julie", "Isal", "Alex", "Carol",
			"Christine",
			"Erick", "Josie", "Raphael", "Adam", "Adele", "Barbie", "Ken", "Steve", "Roger", "Betty", "Billy", "Calvin", "Carly", "Johnson", "Cassie", "Debbie", "Deborah", "Eugene", "Everard",
			"Isabelle", "Jane", "Jason", "Fredie", "Jennifer" };

	String[] lastNames = { "Silva", "Mendez", "Gates", "Maddison", "Sullivan", "Carey", "Wonder", "Gomez" };

	public Student build() {
		return new Student(id, name, scores);
	}

	public StudentBuilder withAutomaticId() {
		long range = 1000L;
		Random random = new Random();
		this.id = (int) (random.nextDouble() * range);
		return this;
	}

	public StudentBuilder withAutomaticName() {
		Random random = new Random();

		String firstName = firstNames[random.nextInt(firstNames.length)];
		String lastName = lastNames[random.nextInt(lastNames.length)];

		this.name = firstName + " " + lastName;

		return this;
	}
	
	public StudentBuilder withAutomaticScores() {
		Random random = new Random();
		long maxScore = 100L;
		
		String firstName = firstNames[random.nextInt(firstNames.length)];
		String lastName = lastNames[random.nextInt(lastNames.length)];

		this.name = firstName + " " + lastName;
		
		
		this.scores = new ArrayList<Score>();
		this.scores.add(new Score(random.nextDouble() * maxScore, ScoreType.HOMEWORK));
		this.scores.add(new Score(random.nextDouble() * maxScore, ScoreType.TEST));
		this.scores.add(new Score(random.nextDouble() * maxScore, ScoreType.FINAL_EXAM));
		
		return this;
	}

}
