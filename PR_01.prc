CREATE OR REPLACE PROCEDURE PR_01(P_MSG IN VARCHAR2) IS
BEGIN
DBMS_OUTPUT.PUT_LINE(P_MSG);
DBMS_OUTPUT.PUT_LINE('pr_01 Fired');
END;
