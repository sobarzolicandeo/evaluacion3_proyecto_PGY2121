-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 30, 2021 at 10:38 PM
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
-- Dumping data for table `empleado`
--

INSERT INTO `empleado` (`numrut_emp`, `dvrut_emp`, `nombre_emp`, `appaterno_emp`, `apmaterno_emp`, `genero_emp`, `fecnac_emp`, `estcivil_emp`, `fono_emp`, `direccion_emp`, `feccont_emp`, `activo_emp`) VALUES
('17752433', '6', 'Diego', 'Licandeo', 'Licandeo', 'Masculino', '1988-07-06', 'Soltero(a)', 964955002, 'dedededededede', '2021-11-29', 0);

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
