package com.school.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "T_QUESTIONS", schema = "APP")
public final class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private int id;
    
    @ManyToOne
    private Survey survey;
    
    private String text;
    
    @OneToMany(targetEntity=com.school.jsf.Answer.class, mappedBy="question", cascade=CascadeType.ALL)
    private List<Answer> answers;

    public Question() {}
    
    public Question(int id, Survey survey, String text, ArrayList<Answer> answers) {
        this.id = id;
        this.survey = survey;
        this.text = text;
        this.answers = answers;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public Survey getSurvey() {
		return survey;
	}

    public void setSurvey(Survey survey) {
		this.survey = survey;
	}

    public String getText() {
        return text;
    }
    
    public void setText(String text) {
    	this.text = text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
    
    public void setAnswers(ArrayList<Answer> answers) {
    	this.answers = answers;
    }
}
