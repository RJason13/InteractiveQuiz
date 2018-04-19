package application.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Question implements Serializable {

	private String title;
	private String text;
	private String picture;
	private ArrayList<String> topics = new ArrayList<String>();
	private ArrayList<String> answers = new ArrayList<String>();
	private int correctAnswerIndex;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String questionText) {
		this.text = questionText;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public ArrayList<String> getTopics() {
		return topics;
	}
	
	public void addTopic(String topic) {
		topics.add(topic);
	}

	public ArrayList<String> getAnswers() {
		return answers;
	}
	
	public void addAnswer(String answer) {
		answers.add(answer);
	}
	
	public String getAnswer(int index) {
		return answers.get(index);
	}

	public int getCorrectAnswerIndex() {
		return correctAnswerIndex;
	}

	public void setCorrectAnswerIndex(int correctAnswerIndex) {
		this.correctAnswerIndex = correctAnswerIndex;
	}
}
