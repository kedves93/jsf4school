ALTER TABLE T_QUESTIONS DROP CONSTRAINT TQUESTIONSSURVEYID
ALTER TABLE T_ANSWERS DROP CONSTRAINT TANSWERSQUESTIONID
DROP TABLE T_USERS
DROP TABLE T_SURVEYS
DROP TABLE T_QUESTIONS
DROP TABLE T_ANSWERS
DELETE FROM SEQUENCE WHERE SEQ_NAME = 'SEQ_GEN'
