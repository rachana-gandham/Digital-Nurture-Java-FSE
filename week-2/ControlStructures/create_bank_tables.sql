--Table Customers
CREATE TABLE Customers(
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Age NUMBER,
    Balance NUMBER(10,2),
    IsVIP VARCHAR(5) DEFAULT 'FALSE'
);

--Table Loans
CREATE TABLE Loans(
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER REFERENCES Customers(CustomerID),
    InterestRate NUMBER(5, 2),
    DueDate DATE
);

--Sample Customers data
INSERT INTO Customers VALUES(1,'Sri',65,12000,'FALSE');
INSERT INTO Customers VALUES(2,'Rama',45,8000,'FALSE');
INSERT INTO Customers VALUES(3,'Vikram',70,15000,'FALSE');
INSERT INTO Customers VALUES(4,'Vincy',30,5000,'FALSE');

SELECT * FROM Customers;

--Sample Loans data
INSERT INTO Loans VALUES(101,1,6.5,SYSDATE+10);   
INSERT INTO Loans VALUES(102,2,7.0,SYSDATE+45);   
INSERT INTO Loans VALUES(103,3,5.5,SYSDATE+5);    
INSERT INTO Loans VALUES(104,4,6.0,SYSDATE+20); 

SELECT * FROM Loans;

COMMIT;
