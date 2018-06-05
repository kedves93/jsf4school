package com.school.jsf.createSurvey;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import java.io.Serializable;

public class CreateSurveyFlow implements Serializable {

    private static final long serialVersionUID = 1L;

    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder builder) {
        builder.id("", "createSurvey");

        builder.viewNode("admin", "/createSurvey/create-survey.xhtml").markAsStartNode();
        
        builder.viewNode("review", "/createSurvey/review-created-survey.xhtml");
        
        builder.viewNode("edit", "/createSurvey/create-survey.xhtml");
        
        builder.returnNode("finished").fromOutcome("admin");

        return builder.getFlow();
    }
}
