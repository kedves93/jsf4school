package com.school.jsf;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "T_ANSWERS", schema = "APP")
public final class Answer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private int id;
    
    @ManyToOne
    private Question question;
    
    private String text;
    
    private boolean valid;

    public Answer() {}
    
    public Answer(int id, Question question, String text, boolean valid) {
        this.id = id;
        this.question = question;
        this.text = text;
        this.valid = valid;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public Question getQuestion() {
		return question;
	}
	
    public void setQuestion(Question question) {
		this.question = question;
	}

    public String getText() {
        return text;
    }
    
    public void setText(String text) {
    	this.text = text;
    }
    
    public boolean getValid() {
        return valid;
    }
    
    public void setValid(boolean valid) {
    	this.valid = valid;
    }
}
