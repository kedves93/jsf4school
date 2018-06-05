DROP SCHEMA MYSCHEMA;
ALTER TABLE MYSCHEMA.T_QUESTIONS DROP CONSTRAINT TQUESTIONSSURVEYID;
ALTER TABLE MYSCHEMA.T_ANSWERS DROP CONSTRAINT TANSWERSQUESTIONID;
DROP TABLE MYSCHEMA.T_USERS;
DROP TABLE MYSCHEMA.T_SURVEYS;
DROP TABLE MYSCHEMA.T_QUESTIONS;
DROP TABLE MYSCHEMA.T_ANSWERS;
DELETE FROM MYSCHEMA.SEQUENCE WHERE SEQ_NAME = 'SEQ_GEN';