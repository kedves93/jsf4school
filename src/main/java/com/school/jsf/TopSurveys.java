package com.school.jsf;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class TopSurveys {

    @Inject
    private SurveyService service;

    private List<Survey> surveys;

    @PostConstruct
    public void initialize() {
    	surveys = service.getTopSurveys();
    }

    public List<Survey> getSurveys() {
        return surveys;
    }
}
