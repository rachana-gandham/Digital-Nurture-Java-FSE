--Table SavingsAccounts
CREATE TABLE SavingsAccounts(  
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    Balance NUMBER(10,2)
);

--Sample data
INSERT INTO SavingsAccounts VALUES(1,101,1000);
INSERT INTO SavingsAccounts VALUES(2,102,2000);
INSERT INTO SavingsAccounts VALUES(3,103,500);
COMMIT;

--Procedure Creation
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE SavingsAccounts
    SET Balance =Balance+(Balance*0.01);
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
END;
/

--Call the procedure
BEGIN
    ProcessMonthlyInterest;
END;
/

--Print the updated data
SELECT * FROM SavingsAccounts;
