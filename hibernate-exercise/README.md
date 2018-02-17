# Hibernate Exercise

To run tests against local MySQL database

    mvn install -P mysql
    
# SQL

Report on people skills with **inner join** so that only people with skills are listed

    SELECT P.ID, P.NAME, S.NAME
    FROM PERSON P 
    INNER JOIN PERSON_SKILL
    ON P.ID = PERSON_ID
    INNER JOIN SKILL S
    ON SKILL_ID = S.ID;

With **outer join** which includes people with no skill

    SELECT P.ID, P.NAME, S.NAME
    FROM PERSON P 
    LEFT JOIN PERSON_SKILL
    ON P.ID = PERSON_ID
    LEFT JOIN SKILL S
    ON SKILL_ID = S.ID;
