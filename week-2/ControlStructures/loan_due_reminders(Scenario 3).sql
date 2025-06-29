SET SERVEROUTPUT ON;

DECLARE
    c_name Customers.Name%TYPE;
    c_due_date Loans.DueDate%TYPE;
BEGIN
    FOR l IN (
        SELECT LoanID, CustomerID, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        SELECT Name INTO c_name FROM Customers WHERE CustomerID = l.CustomerID;
        c_due_date := l.DueDate;

        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || c_name ||
                             ', your loan (ID: ' || l.LoanID ||
                             ') is due on ' || TO_CHAR(c_due_date, 'DD-Mon-YYYY') || '.');
    END LOOP;
END;
/

