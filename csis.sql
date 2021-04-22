-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 22, 2021 at 05:42 AM
-- Server version: 5.7.24
-- PHP Version: 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `csis`
--

-- --------------------------------------------------------

--
-- Table structure for table `cars`
--

CREATE TABLE `cars` (
  `id` int(11) NOT NULL,
  `Manufacturer` varchar(20) NOT NULL,
  `Model` varchar(30) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `Year_of_Manufacturing` int(11) NOT NULL,
  `miles` int(11) NOT NULL,
  `price` float NOT NULL,
  `hasAC` char(1) NOT NULL,
  `hasDVD` char(1) NOT NULL,
  `comments` varchar(200) NOT NULL,
  `CreationDateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cars`
--

INSERT INTO `cars` (`id`, `Manufacturer`, `Model`, `Type`, `Year_of_Manufacturing`, `miles`, `price`, `hasAC`, `hasDVD`, `comments`, `CreationDateTime`) VALUES
(1, 'Honda', '2dfefdf', 'Normal', 2018, 120, 1200.3, 'F', 'T', '1200.3', '2021-04-22 07:38:52'),
(2, 'Honda', '2dfefdf', 'Normal', 2018, 120, 1200.3, 'F', 'T', 'ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff', '2021-04-22 07:39:16'),
(3, 'Honda', '2dfefdf', 'Normal', 2018, 120, 1200.3, 'F', 'T', 'ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff', '2021-04-22 07:39:39'),
(4, 'Honda', '2dfefdf', 'Normal', 2018, 120, 1200.3, 'T', 'T', 'ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff', '2021-04-22 07:46:56'),
(5, 'Honda', '2dfefdf', 'Normal', 2021, 120, 120.2, 'T', 'T', '11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111', '2021-04-22 07:51:42'),
(6, 'Honda', '2dfefdf', 'Normal', 2021, 120, 120.2, 'T', 'T', '11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111', '2021-04-22 08:05:35'),
(7, 'Honda', '2dfefdf', 'Normal', 2021, 120, 120.2, 'T', 'T', '11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111', '2021-04-22 08:05:42'),
(8, 'Toyota', '1111fff', 'SUV', 2006, 120000, 5400.5, 'T', 'F', 'perfect and goood eer adiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii', '2021-04-22 08:27:37'),
(9, 'Honda', 'aaa123', 'SUV', 2003, 50000, 10000.2, 'T', 'T', 'does it occueer some of this ....................................................................................................', '2021-04-22 08:28:50');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cars`
--
ALTER TABLE `cars`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
