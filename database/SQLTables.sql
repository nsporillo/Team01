CREATE TABLE IF NOT EXISTS Vehicle(VIN INT PRIMARY KEY, ModelID INT, OptionID INT, SaleID INT, Year INT, Price DOUBLE);
CREATE TABLE IF NOT EXISTS Sale(SaleID INT PRIMARY KEY, DealerID INT, CustomerID INT, Date TIMESTAMP, VIN INT);
CREATE TABLE IF NOT EXISTS Dealer(DealerID INT PRIMARY KEY, Name VARCHAR(255), Street VARCHAR(255), City VARCHAR(255), State VARCHAR(255), ZIP INT, Phone VARCHAR(255));
CREATE TABLE IF NOT EXISTS Customer(CustomerID INT PRIMARY KEY, FirstName VARCHAR(255), LastName VARCHAR(255), Street VARCHAR(255), City VARCHAR(255), State VARCHAR(255), ZIP INT, Phone VARCHAR(255), Gender INT, Income INT);
CREATE TABLE IF NOT EXISTS DealerInventory(VIN INT PRIMARY KEY, DealerID INT);
CREATE TABLE IF NOT EXISTS Option(OptionID INT PRIMARY KEY, Color VARCHAR(255), Engine VARCHAR(2), Transmission VARCHAR(255));
CREATE TABLE IF NOT EXISTS Model(ModelID INT PRIMARY KEY, BrandName VARCHAR(255), BodyStyle VARCHAR(255));