--Table Accounts
CREATE TABLE Accounts(
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    Balance NUMBER(10,2)
);
--Sample data
INSERT INTO Accounts VALUES(1,101,5000);
INSERT INTO Accounts VALUES(2,101,2000);
INSERT INTO Accounts VALUES(3,102,1000);

COMMIT;

--Create procedure
CREATE OR REPLACE PROCEDURE TransferFunds (
    FromAccountID IN NUMBER,
    ToAccountID IN NUMBER,
    Amount IN NUMBER
) AS
    v_FromBalance NUMBER;
BEGIN
    SELECT Balance INTO v_FromBalance FROM Accounts WHERE AccountID = FromAccountID;

    IF v_FromBalance < Amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
    END IF;

    UPDATE Accounts
    SET Balance =Balance - Amount
    WHERE AccountID =FromAccountID;

    UPDATE Accounts
    SET Balance =Balance+ Amount
    WHERE AccountID =ToAccountID;

    COMMIT;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Account not found.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('An unexpected error occurred: ' || SQLERRM);
END;
/

--Call the procedure
BEGIN
    TransferFunds(1, 2, 1000);
END;
/

--Print the updated data
SELECT * FROM Accounts;