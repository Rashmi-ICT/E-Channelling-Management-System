-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 30, 2021 at 02:33 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `e-channeling`
--

-- --------------------------------------------------------

--
-- Table structure for table `chanel`
--

CREATE TABLE `chanel` (
  `id` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `tp` varchar(255) NOT NULL,
  `pathologie` varchar(255) NOT NULL,
  `Did` int(11) NOT NULL,
  `Dname` varchar(255) NOT NULL,
  `doccharge` varchar(255) NOT NULL,
  `hoscharge` varchar(255) NOT NULL,
  `room` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `zoom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chanel`
--

INSERT INTO `chanel` (`id`, `pid`, `pname`, `address`, `tp`, `pathologie`, `Did`, `Dname`, `doccharge`, `hoscharge`, `room`, `date`, `zoom`) VALUES
(2, 1, 'sadaru', 'thalawa', '0715131458', 'head', 2, 'samantha', '1750', '500', '4', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511'),
(4, 1, 'sadaru', 'thalawa', '0715131458', 'head', 1, 'rashmi', '1500', '500', '3', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511'),
(5, 4, 'mihiri', 'kuliyapitiya', '076254965', 'canser', 7, 'susantha', '1750', '500', '10', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511'),
(6, 2, 'malee', 'thalawa', '0716419861', 'head', 10, 'jeewan', '1800', '500', '9', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511'),
(7, 3, 'kalani', 'eppawala', '0715131458', 'head', 6, 'dahami', '2000', '500', '5', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511'),
(8, 7, 'vijitha', 'gall', '071822010', 'hair', 8, 'kalpa ', '1500', '500', '2', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511'),
(9, 5, 'oshitha', 'thalawa', '0715136548', 'leg', 2, 'samantha', '1750', '500', '4', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511'),
(10, 6, 'sachini', 'galgamuwa', '078456214', 'hair', 9, 'hansi', '1800', '500', '4', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511'),
(11, 2, 'malee', 'thalawa', '0716419861', 'head', 5, 'haridu', '2000', '500', '7', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `tp` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `room` varchar(255) NOT NULL,
  `specialist` varchar(255) NOT NULL,
  `charge` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `zoom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`id`, `name`, `address`, `tp`, `email`, `room`, `specialist`, `charge`, `gender`, `date`, `zoom`) VALUES
(2, 'samantha', 'kaluthara', '0772931127', 'sama@gmail.com', '4', 'gasrytes', '1750', 'male ', 'saterday', 'https://plymouth.zoom.us/j/98403165511'),
(5, 'haridu', 'gall', '075124586', 'harindu@gmail.com', '7', 'head', '2000', 'male ', 'thuesday', 'https://plymouth.zoom.us/j/98403165511'),
(6, 'dahami', 'anuradhapur', '071578945', 'DAHA@GMAIL.COM', '5', 'leg', '2000', 'female', 'sunday', 'https://plymouth.zoom.us/j/98403165511'),
(7, 'susantha', 'kakirawa', '078456125', 'susa@gmail.com', '10', 'canser', '1750', 'female', 'wendsday', 'https://plymouth.zoom.us/j/98403165511'),
(8, 'kalpa ', 'gall', '078546212', 'kalpa@gmail.com', '2', 'eye', '1500', 'male ', 'friday', 'https://plymouth.zoom.us/j/98403165511'),
(9, 'hansi', 'kurunagala', '071569456', 'hansi@gmail.com', '4', 'canser', '1800', 'female', 'tuesday', 'https://plymouth.zoom.us/j/98403165511'),
(10, 'jeewan', 'kollupitiya', '07564853', 'jeewa@gmail.com', '9', 'head', '1800', 'male ', 'sunday', 'https://plymouth.zoom.us/j/98403165511'),
(11, 'ramesh', 'kandy', '07854123', 'ramesh@gmail.com', '2', 'nail & hair', '1900', 'male ', 'thuesday', 'https://plymouth.zoom.us/j/98403165511');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `id` int(11) NOT NULL,
  `item` int(11) NOT NULL,
  `itemName` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `selprice` int(11) NOT NULL,
  `buyPrice` int(11) NOT NULL,
  `quty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`id`, `item`, `itemName`, `description`, `selprice`, `buyPrice`, `quty`) VALUES
(1, 1, 'asprin', 'head', 100, 95, 500),
(2, 2, 'zincovid', 'gasritees', 45, 37, 21),
(3, 5, 'flu', 'headec', 750, 735, 15),
(4, 3, 'panadol', 'headec', 12, 9, 1000),
(5, 5, 'whit uv', 'body', 750, 700, 50),
(6, 6, 'vitamin E', 'hair damage', 12, 8, 500),
(7, 7, 'coolgel', 'basritees', 150, 135, 500),
(8, 8, 'maxiva', 'vitamin', 80, 70, 500),
(9, 9, 'revitees', 'hair', 98, 85, 500),
(10, 10, 'piriton', 'headec', 4, 1, 250),
(11, 4, 'fasia', 'faicail', 175, 160, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `tp` varchar(255) NOT NULL,
  `pathologie` varchar(255) NOT NULL,
  `blood` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`id`, `name`, `address`, `gender`, `tp`, `pathologie`, `blood`, `email`, `date`) VALUES
(1, 'sadaru', 'thalawa', 'male', '0715131458', 'head', 'O', 'sadaru@gmail.com', '2021-05-07'),
(2, 'malee', 'thalawa', 'female', '0716419861', 'head', 'B', 'malee@gmail.com', '2021-07-29'),
(3, 'kalani', 'eppawala', 'female', '0715131458', 'head', 'A+', 'kalani@gmail.com', '2021-07-28'),
(4, 'mihiri', 'kuliyapitiya', 'female', '076254965', 'canser', 'A+', 'mihi@gmail.com', '2021-08-05'),
(5, 'oshitha', 'thalawa', 'male', '0715136548', 'leg', 'O', 'oshi@gmail.com', '2021-08-09'),
(6, 'sachini', 'galgamuwa', 'female', '078456214', 'hair', 'B+', 'sachi@gmail.com', '2021-07-26'),
(7, 'vijitha', 'gall', 'male', '071822010', 'hair', 'AB', 'viji@gmail.com', '2021-08-06'),
(8, 'dilakshi', 'panadura', 'female', '0711548965', 'stomac', 'B+', 'dila@gmail.com', '2021-08-06'),
(9, 'sadaru', 'kurunagala', 'male', '075654120', 'gasritees', 'B', 'sada@gmail.com', '2020-08-09');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `utype` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `username`, `password`, `utype`) VALUES
(1, 'rashmi', 'rashmi', '123', 'doctor '),
(2, 'saman ', 'saman', '123', 'doctor '),
(3, 'malee', 'malee', '123', 'patient'),
(4, 'danu', 'danu', '123', 'pharmacis'),
(5, 'mayuri', 'mayuri', '1234', 'reception'),
(6, 'haridu', 'haridu', '123', 'doctor '),
(7, 'dilakshi', 'dilakshi', '123', 'patient'),
(8, 'ramesh', 'ramesh', '123', 'doctor '),
(9, 'sada', 'sada', '123', 'patient');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chanel`
--
ALTER TABLE `chanel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chanel`
--
ALTER TABLE `chanel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
