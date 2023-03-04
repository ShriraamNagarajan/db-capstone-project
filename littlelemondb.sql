-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: littlelemondm
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bookings`
--

DROP TABLE IF EXISTS `bookings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bookings` (
  `BookingID` int NOT NULL,
  `CustomerID` int NOT NULL,
  `EmployeeID` int NOT NULL,
  `TableNumber` int NOT NULL,
  `BookingDate` date NOT NULL,
  `BookingTime` time NOT NULL,
  PRIMARY KEY (`BookingID`),
  KEY `CustomerID_idx` (`CustomerID`),
  KEY `EmployeeID_idx` (`EmployeeID`),
  CONSTRAINT `CustomerID` FOREIGN KEY (`CustomerID`) REFERENCES `customers` (`CustomerID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `EmployeeID` FOREIGN KEY (`EmployeeID`) REFERENCES `employees` (`EmployeeID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookings`
--

LOCK TABLES `bookings` WRITE;
/*!40000 ALTER TABLE `bookings` DISABLE KEYS */;
INSERT INTO `bookings` VALUES (1,1,1,12,'2022-10-15','19:00:00'),(2,2,1,6,'2022-10-21','19:00:00'),(3,3,3,18,'2022-10-15','15:00:00'),(4,4,4,5,'2022-10-15','17:30:00'),(5,5,2,1,'2022-10-15','18:30:00'),(6,6,5,2,'2022-10-15','20:00:00'),(7,1,6,5,'2022-10-15','21:00:00'),(8,3,2,3,'2022-10-15','22:00:00'),(9,2,3,2,'2022-10-15','20:00:00'),(10,1,4,2,'2022-10-19','11:00:00'),(11,3,1,4,'2022-10-15','12:00:00');
/*!40000 ALTER TABLE `bookings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `CustomerID` int NOT NULL,
  `CustomerFirstName` varchar(45) NOT NULL,
  `CustomerLastName` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Address` varchar(255) NOT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'Anna','Iversen','anaa@gmail.com','101234234-234234'),(2,'Joakim','Iversen','joakim@gmail.com','1234234-234'),(3,'Vanessa','McCarthy','van@gmail.com','1234234-234'),(4,'Marcos','Romero','marc@gmail.com','1234-234'),(5,'Hiroki','Yamane','hiroki@gmail.com','1234-23452'),(6,'Diana','Pinto','dia@gmail.com','123424-234');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `EmployeeID` int NOT NULL,
  `EmployeeName` varchar(45) NOT NULL,
  `Role` varchar(45) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `ContactNumber` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `AnnualSalary` decimal(10,0) NOT NULL,
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'Mario Gollini','Manager','724, Parsley Lane, Old Town, Chicago, IL','351258074','Mario.g@littlelemon.com',70000),(2,'Adrian Gollini','Assistant Manager','334, Dill Square, Lincoln Park, Chicago, IL','351474048','Adrian.g@littlelemon.com',65000),(3,'Giorgos Dioudis','Head Chef','879 Sage Street, West Loop, Chicago, IL','351970582','Giorgos.d@littlelemon.com',50000),(4,'Fatma Kaya','Assistant Chef','132  Bay Lane, Chicago, IL','351963569','Fatma.k@littlelemon.com',45000),(5,'Elena Salvai','Head Waiter','989 Thyme Square, EdgeWater, Chicago, IL','351074198','Elena.s@littlelemon.com',40000),(6,'John Millar','Receptionist','245 Dill Square, Lincoln Park, Chicago, IL','351584508','John.m@littlelemon.com',35000);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menuitems`
--

DROP TABLE IF EXISTS `menuitems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menuitems` (
  `MenuItemID` int NOT NULL,
  `CourseName` varchar(255) NOT NULL,
  `StarterName` varchar(255) DEFAULT NULL,
  `DesertName` varchar(255) DEFAULT NULL,
  `Price` decimal(5,2) NOT NULL,
  PRIMARY KEY (`MenuItemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menuitems`
--

LOCK TABLES `menuitems` WRITE;
/*!40000 ALTER TABLE `menuitems` DISABLE KEYS */;
INSERT INTO `menuitems` VALUES (1,'Olive Burger','Olive Cookie','Olive Ice Cream',85.00),(2,'Cheese Burger','Cheese Cookie','Cheese Ice Cream',75.00),(3,'Beef Burger','Beef Cookie','Beef Ice Cream',65.00),(4,'Chicken Burger','Chicken Cookie','Chicken Ice Cream',25.00),(5,'Hummus Burger','Hummus Cookie','Hummus Ice Cream',95.00),(6,'Octopos Burger','Octopos Cookie','Octopos Ice Cream',85.00),(7,'Cucumber Burger','Cucumber Cookie','Cucumber Ice Cream',75.00),(8,'Butter Burger','Butter Cookie','Butter Ice Cream',55.50),(9,'Garlic Burger','Garlic Cookie','Garlic Ice Cream',59.00),(10,'Onion Burger','Onion Cookie','Onion Ice Cream',25.00),(11,'Chocolate Burger','Chocolate Cookie','Chocolate Ice Cream',15.00),(12,'Vanilla Burger','Vanilla Cookie','Vanilla Ice Cream',54.00),(13,'Butterscotch Burger','Butterscotch Cookie','Butterscotch Ice Cream',65.00);
/*!40000 ALTER TABLE `menuitems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menus`
--

DROP TABLE IF EXISTS `menus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menus` (
  `MenuID` int NOT NULL,
  `MenuItemsID` int NOT NULL,
  `MenuName` varchar(255) NOT NULL,
  `Cuisine` varchar(255) NOT NULL,
  PRIMARY KEY (`MenuID`),
  KEY `MenuItemsID` (`MenuItemsID`),
  CONSTRAINT `menus_ibfk_1` FOREIGN KEY (`MenuItemsID`) REFERENCES `menuitems` (`MenuItemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menus`
--

LOCK TABLES `menus` WRITE;
/*!40000 ALTER TABLE `menus` DISABLE KEYS */;
INSERT INTO `menus` VALUES (1,1,'Homely Food','Greek'),(2,7,'The Firshery','Greek'),(3,10,'Meatarian','Greek'),(4,13,'Island Vibez','Greek'),(5,3,'Smart Meals','Italian'),(6,9,'Golden Food','Italian'),(7,12,'Local Feast','Italian'),(8,13,'The Eatery','Italian'),(9,5,'Fruity Bag','Turkish'),(10,8,'Snap Kitchen','Turkish'),(11,11,'Tender Panda','Turkish'),(12,4,'Hot and Spicy','Turkish');
/*!40000 ALTER TABLE `menus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdelivery`
--

DROP TABLE IF EXISTS `orderdelivery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderdelivery` (
  `OrderDeliveryID` int NOT NULL,
  `Status` varchar(50) NOT NULL,
  `DeliveryDate` date NOT NULL,
  `OrderID` int NOT NULL,
  PRIMARY KEY (`OrderDeliveryID`),
  KEY `OrderID` (`OrderID`),
  CONSTRAINT `orderdelivery_ibfk_1` FOREIGN KEY (`OrderID`) REFERENCES `orders` (`OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdelivery`
--

LOCK TABLES `orderdelivery` WRITE;
/*!40000 ALTER TABLE `orderdelivery` DISABLE KEYS */;
INSERT INTO `orderdelivery` VALUES (1,'Complete','2022-10-11',1),(2,'Complete','2022-10-12',2),(3,'Complete','2022-10-13',3),(4,'Complete','2022-10-14',4),(5,'Pending','2022-10-15',5);
/*!40000 ALTER TABLE `orderdelivery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderdetail`
--

DROP TABLE IF EXISTS `orderdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderdetail` (
  `OrderDetailID` int NOT NULL,
  `OrderID` int NOT NULL,
  `MenuID` int NOT NULL,
  `Quantity` int NOT NULL,
  PRIMARY KEY (`OrderDetailID`),
  KEY `OrderID` (`OrderID`),
  KEY `MenuID` (`MenuID`),
  CONSTRAINT `orderdetail_ibfk_1` FOREIGN KEY (`OrderID`) REFERENCES `orders` (`OrderID`),
  CONSTRAINT `orderdetail_ibfk_2` FOREIGN KEY (`MenuID`) REFERENCES `menus` (`MenuID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderdetail`
--

LOCK TABLES `orderdetail` WRITE;
/*!40000 ALTER TABLE `orderdetail` DISABLE KEYS */;
INSERT INTO `orderdetail` VALUES (1,1,2,2),(2,2,4,2),(3,3,6,3),(4,4,2,2),(5,5,7,5),(6,5,2,2);
/*!40000 ALTER TABLE `orderdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `OrderID` int NOT NULL,
  `BookingID` int NOT NULL,
  `OrderDate` date NOT NULL,
  `BillAmount` decimal(10,0) NOT NULL,
  PRIMARY KEY (`OrderID`),
  KEY `BookingID_idx` (`BookingID`),
  CONSTRAINT `BookingID` FOREIGN KEY (`BookingID`) REFERENCES `bookings` (`BookingID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,2,'2022-10-11',186),(2,3,'2022-10-12',37),(3,4,'2022-10-13',37),(4,5,'2022-10-14',240),(5,6,'2022-10-15',43);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `ordersview`
--

DROP TABLE IF EXISTS `ordersview`;
/*!50001 DROP VIEW IF EXISTS `ordersview`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `ordersview` AS SELECT 
 1 AS `OrderID`,
 1 AS `Cost`,
 1 AS `Quantity`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `ordersview`
--

/*!50001 DROP VIEW IF EXISTS `ordersview`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ordersview` AS select `o`.`OrderID` AS `OrderID`,`o`.`BillAmount` AS `Cost`,`od`.`Quantity` AS `Quantity` from (`orders` `o` join `orderdetail` `od` on((`o`.`OrderID` = `od`.`OrderID`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-17  8:24:40
