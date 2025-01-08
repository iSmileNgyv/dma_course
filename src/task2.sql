CREATE TABLE Products (
    ProductID SERIAL PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Price DECIMAL(10, 2) NOT NULL,
    Quantity INT NOT NULL,
    Description TEXT,
    CategoryID INT REFERENCES Categories(CategoryID) ON DELETE SET NULL
);

CREATE TABLE Categories (
    CategoryID SERIAL PRIMARY KEY,
    Name VARCHAR(255) NOT NULL
);

CREATE TABLE Customers (
   CustomerID SERIAL PRIMARY KEY,
   FirstName VARCHAR(255) NOT NULL,
   LastName VARCHAR(255) NOT NULL,
   Address TEXT,
   Email VARCHAR(255),
   PhoneNumber VARCHAR(15)
);

CREATE TABLE Orders (
    OrderID SERIAL PRIMARY KEY,
    CustomerID INT REFERENCES Customers(CustomerID) ON DELETE CASCADE,
    OrderDate DATE NOT NULL DEFAULT CURRENT_DATE
);

CREATE TABLE OrderDetails (
      OrderDetailID SERIAL PRIMARY KEY,
      OrderID INT REFERENCES Orders(OrderID) ON DELETE CASCADE,
      ProductID INT REFERENCES Products(ProductID) ON DELETE CASCADE,
      Quantity INT NOT NULL
);

SELECT * FROM Products;

SELECT * FROM Categories;

SELECT * FROM Customers;

SELECT * FROM Orders;

SELECT * FROM OrderDetails;

SELECT * FROM Products WHERE ProductID = 1;

SELECT * FROM Products WHERE CategoryID = 1;

SELECT * FROM Customers WHERE CustomerID = 1;

SELECT * FROM Orders WHERE CustomerID = 1;

SELECT * FROM OrderDetails WHERE OrderID = 1;

UPDATE Products SET Price = 19.99 WHERE ProductID = 1;

INSERT INTO Products (Name, Price, Quantity, Description, CategoryID)
VALUES ('Apple', 10.99, 100, 'Product description', 1);

DELETE FROM Products WHERE ProductID = 1;
