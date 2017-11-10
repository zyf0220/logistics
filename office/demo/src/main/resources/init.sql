USE yibantest_integrate;
SELECT *
FROM zyf_feedback;

INSERT INTO zyf_feedback (question,code)
VALUES (#{},#{});


SELECT *
FROM zyf_feedback;
TRUNCATE TABLE zyf_feedback;