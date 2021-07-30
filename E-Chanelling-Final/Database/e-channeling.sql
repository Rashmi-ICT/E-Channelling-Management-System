-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 30, 2021 at 12:37 PM
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
(4, 1, 'sadaru', 'thalawa', '0715131458', 'head', 1, 'rashmi', '1500', '500', '3', '2021-07-30', 'https://plymouth.zoom.us/j/98403165511');

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
(1, 'rashmi', 'thalawa', '0715131458', 'rash@gmail.com', '3', 'head', '1500', 'female', 'tuesday', 'https://plymouth.zoom.us/j/98403165511'),
(2, 'samantha', 'kaluthara', '0772931127', 'sama@gmail.com', '4', 'gasrytes', '1750', 'male ', 'saterday', 'https://plymouth.zoom.us/j/98403165511');

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
(2, 2, 'zincovid', 'gasritees', 45, 37, 21);

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
(1, 'sadaru', 'thalawa', 'male', '0715131458', 'head', 'O', 'sadaru@gmail.com', '2021-05-07');

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
(1, 'rashmi', 'rashmi', '123', 'doctor ');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
