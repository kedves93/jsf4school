package com.school.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "T_SURVEYS", schema = "APP")
public final class Survey implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private int id;
    
    private String name;
    
    private String description;
    
    @OneToMany(targetEntity=com.school.jsf.Question.class, mappedBy="survey", cascade=CascadeType.ALL)
    private List<Question> questions;
    
    private boolean isCompleted;

    public Survey() {}
    
    public Survey(int id, String name, String description, ArrayList<Question> questions, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.questions = questions;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    }
    
    public List<Question> getQuestions() {
        return questions;
    }
    
    public void setQuestions(ArrayList<Question> questions) {
    	this.questions = questions;
    }
    
    public boolean getIsCompleted() {
        return isCompleted;
    }
    
    public void setIsCompleted(boolean isCompleted) {
    	this.isCompleted = isCompleted;
    }
}
