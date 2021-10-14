package com.ziddioglu.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="questions")
public class Question implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6931293088245057736L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	String question;
	
	@Column(nullable=false)
	String answer1;
	
	@Column(nullable=false)
	String answer2;
	
	@Column(nullable=false)
	String answer3;
	
	@Column(nullable=false)
	String answer4;
	
	@Column(nullable=false)
	String answer5;
	
	
	@Column(nullable=false)
	String correctAnswer;


	


	public Question() {
		super();
	}


	public Question(String question, String answer1, String answer2, String answer3, String answer4, String answer5,
			String correctAnswer) {
		super();
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.correctAnswer = correctAnswer;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getAnswer1() {
		return answer1;
	}


	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}


	public String getAnswer2() {
		return answer2;
	}


	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}


	public String getAnswer3() {
		return answer3;
	}


	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}


	public String getAnswer4() {
		return answer4;
	}


	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}


	public String getAnswer5() {
		return answer5;
	}


	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}


	public String getCorrectAnswer() {
		return correctAnswer;
	}


	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	
}
