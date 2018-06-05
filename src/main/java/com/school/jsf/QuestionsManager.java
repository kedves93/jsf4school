package com.school.jsf;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class QuestionsManager implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean questionAdded;
    
    public boolean getQuestionAdded() {
    	return questionAdded;
    }
    
    public void addQuestion() {
    	questionAdded = true;
    }
}
