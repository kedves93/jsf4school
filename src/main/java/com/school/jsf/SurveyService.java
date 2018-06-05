package com.school.jsf;

import java.util.List;

public interface SurveyService {

    List<Survey> getTopSurveys();

    Survey getSurvey(int id);
}