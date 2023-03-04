USE littlelemondm;

#Week 2

#Task 1

CREATE VIEW OrdersView
AS 
SELECT O.OrderID, O.BillAmount AS Cost, OD.Quantity
FROM Orders AS O
INNER JOIN OrderDetail AS OD
ON O.OrderID = OD.OrderID;

SELECT * FROM OrdersView;


#Task 2 

SELECT C.CustomerID, CONCAT(C.CustomerFirstName, ' ', C.CustomerLastName) AS CustomerFullName, O.OrderID, O.BillAmount AS Cost, M.MenuName, MI.CourseName, MI.StarterName
FROM Customers AS C
INNER JOIN Bookings AS B
ON C.CustomerID = B.CustomerID
INNER JOIN 
Orders AS O
ON B.BookingID = O.BookingID
INNER JOIN OrderDetail AS OD
ON O.OrderID = OD.OrderID
INNER JOIN Menus AS M
ON M.MenuID = OD.MenuID
INNER JOIN  MenuItems AS MI
ON M.MenuItemsID = MI.MenuItemID 
WHERE O.BillAmount > 150;



#Task 3
SELECT M.MenuName FROM
Menus AS M
INNER JOIN 
(SELECT M.MenuID, COUNT(O.OrderID) 
FROM Menus AS M
INNER JOIN OrderDetail O 
ON O.MenuID = M.MenuID
GROUP BY M.MenuID
HAVING COUNT(OrderID) > 2) AS B
ON M.MenuID = B.MenuID;



#Optimization

#Task 1

CREATE PROCEDURE GetMaxQuantity()
SELECT MAX(Quantity) FROM OrderDetail;

CALL GetMaxQuantity;


#Task 2
PREPARE GetOrderDetail FROM 'SELECT O.OrderID, O.BillAmount, OD.Quantity FROM Customers AS C INNER JOIN Bookings AS B ON C.CustomerID=B.CustomerID INNER JOIN Orders AS O ON O.BookingID=B.BookingID INNER JOIN OrderDetail AS OD ON O.OrderID=OD.OrderID WHERE C.CustomerID=?';
SET @CustomerID = 2;
EXECUTE GetOrderDetail USING @CustomerID;



#Task 3
CREATE PROCEDURE CancelOrder(orderid INT)
DELETE FROM Orders WHERE OrderID = orderid;

CALL CancelOrder(5);

SELECT * FROM Bookings;
DESCRIBE Bookings;



#Table booking system

#task 1
INSERT INTO Bookings
VALUES
(7, 1, 6, 5, '2022-10-10', '21:00:00'),
(8, 3, 2, 3, '2022-11-12', '22:00:00'),
(9, 2, 3, 2, '2022-10-11', '20:00:00'),
(10, 1, 4, 2, '2022-10-13', '11:00:00');


#Task 2
DELIMITER //
CREATE PROCEDURE CheckBooking (dateInput DATE, tableNum INT)
BEGIN
DECLARE bookingStatus VARCHAR(255);
DECLARE count INT;
SELECT COUNT(*) INTO count FROM Bookings WHERE TableNumber=tableNum AND BookingDate=dateInput;
IF count>0 THEN
	SET bookingStatus = CONCAT( 'Table ', tableNum, ' is already booked');
ELSE
	SET bookingStatus = CONCAT('Table', tableNum, ' is still available');
END IF;
SELECT bookingStatus;
END//
DELIMITER ;
CALL CheckBooking('2022-11-12', 20);


#Task 3
DELIMITER //
CREATE PROCEDURE AddValidBooking(bookingDate DATE, tableNumber INT, customerID INT, employeeID INT)
BEGIN
DECLARE bookingStatus VARCHAR(255);
DECLARE countTotal INT;
DECLARE newMessage VARCHAR(255);
SELECT COUNT(*) INTO countTotal FROM Bookings WHERE TableNumber=tableNumber AND BookingDate=bookingDate;
IF countTotal>0 THEN
	SET bookingStatus = CONCAT( 'Table ', tableNumber, ' is already booked');
ELSE
	SET bookingStatus = CONCAT('Table', tableNumber, ' is still available');
END IF;

START TRANSACTION;
INSERT INTO Bookings VALUES (13, customerID, employeeID, tableNumber, bookingDate, '20:00:00');
IF countTotal>0 THEN
	ROLLBACK;
    SET newMessage = "Booking Cancelled";
ELSE
	COMMIT;
    SET newMessage = "Booking Saved";
END IF;
SELECT CONCAT(bookingStatus, ' ', newMessage);
END//

DELIMITER ;

CALL AddValidBooking("2022-12-17", 1, 1, 1);




#Add and update bookings
#Task 1
DELIMITER //
CREATE PROCEDURE AddBooking(bookingID INT, customerID INT, tableNumber INT, bookingDate DATE)
BEGIN
INSERT INTO Bookings VALUES (bookingID, customerID, 1, tableNumber, bookingDate, '12:00:00');
SELECT "New Booking Added";
END//
DELIMITER ;
CALL AddBooking(11, 3, 4, "2022-12-30");



#Task 2
DELIMITER //
CREATE PROCEDURE UpdateBooking(bookingIDInput INT, bookingDate DATE)
BEGIN
UPDATE Bookings SET BookingDate = bookingDate WHERE BookingID=2;
SELECT CONCAT('Booking', bookingIDInput, ' has been successfully updated');
END//
DELIMITER ;


CALL UpdateBooking(10, '2022-10-21');


#Task 3
DELIMITER //
CREATE PROCEDURE CancelBooking(bookingIDInput INT)
BEGIN
DELETE FROM Bookings WHERE BookingID=bookingIDInput;
SELECT CONCAT('Booking', bookingIDInput, ' has been successfully deleted');
END//
DELIMITER ;

