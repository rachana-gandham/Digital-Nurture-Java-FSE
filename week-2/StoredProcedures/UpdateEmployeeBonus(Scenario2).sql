--Table Employees
CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DepartmentID NUMBER,
    Salary NUMBER(10,2)
);

--Sample data
INSERT INTO Employees VALUES(1,'Aditya',101,5000);
INSERT INTO Employees VALUES(2,'Krishna',101,5200);
INSERT INTO Employees VALUES(3,'Candy',102,4800);
INSERT INTO Employees VALUES(4,'Deena',103,5500);

COMMIT;

--Create procedure
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_DepartmentID IN NUMBER,
    p_BonusPercent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent / 100)
    WHERE DepartmentID = p_DepartmentID;

    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        RAISE_APPLICATION_ERROR(-20002, 'Error updating employee bonuses: ' || SQLERRM);
END;
/

--Call the procedure
BEGIN
    UpdateEmployeeBonus(101,10);
END;
/

--Print the updated data
SELECT * FROM Employees;