package com.school.jsf;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class SurveyServiceImpl implements SurveyService {

    private List<Survey> surveys;

    public SurveyServiceImpl() {
    	ArrayList<Answer> answers = new ArrayList<Answer>();
    }

    @Override
    public List<Survey> getTopSurveys() {
        return surveys;
    }

    @Override
    public Survey getSurvey(int id) {
        return surveys.get(id);
    }
}
