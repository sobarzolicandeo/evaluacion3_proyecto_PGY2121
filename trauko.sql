-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 01, 2021 at 12:37 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trauko`
--
CREATE DATABASE IF NOT EXISTS `trauko` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `trauko`;

-- --------------------------------------------------------

--
-- Table structure for table `empleado`
--

CREATE TABLE `empleado` (
  `numrut_emp` varchar(10) NOT NULL,
  `dvrut_emp` varchar(1) NOT NULL,
  `nombre_emp` varchar(25) NOT NULL,
  `appaterno_emp` varchar(16) NOT NULL,
  `apmaterno_emp` varchar(16) NOT NULL,
  `genero_emp` varchar(10) NOT NULL,
  `fecnac_emp` date NOT NULL,
  `estcivil_emp` varchar(15) NOT NULL,
  `fono_emp` int(15) NOT NULL,
  `direccion_emp` varchar(100) NOT NULL,
  `feccont_emp` date NOT NULL,
  `activo_emp` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`numrut_emp`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
