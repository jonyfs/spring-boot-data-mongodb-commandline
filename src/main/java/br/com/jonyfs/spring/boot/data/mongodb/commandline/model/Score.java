package br.com.jonyfs.spring.boot.data.mongodb.commandline.model;

public class Score {
	Double score;
	ScoreType type;

	public Score(Double score, ScoreType type) {
		super();
		this.score = score;
		this.type = type;
	}

	public Double getScore() {
		return score;
	}

	public ScoreType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Score [score=" + score + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
