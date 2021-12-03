-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 03-12-2021 a las 01:17:31
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `trauko`
--
CREATE DATABASE IF NOT EXISTS `trauko` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `trauko`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
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
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`numrut_emp`, `dvrut_emp`, `nombre_emp`, `appaterno_emp`, `apmaterno_emp`, `genero_emp`, `fecnac_emp`, `estcivil_emp`, `fono_emp`, `direccion_emp`, `feccont_emp`, `activo_emp`) VALUES
('08764035', '3', 'Mauricio ', 'Segovia', 'Arancibia', 'Masculino', '1959-10-03', 'Casado(a)', 973265471, 'Calle ecuador 34', '1978-12-26', 1),
('11736726', '6', 'Gonzalo ', 'Andrade', 'Risso', 'Masculino', '1974-04-28', 'Soltero(a)', 983513458, 'Calle Valencia SN', '1989-01-26', 0),
('13989545', '2', 'Felipe ', 'Airola', 'De la Fuente', 'Masculino', '1981-01-23', 'Casado(a)', 87523453, 'Calle los almendros 345', '2016-04-29', 1),
('18298633', '1', 'Antonio ', 'Quevedo', 'Alvarez', 'Masculino', '1983-09-15', 'Casado(a)', 983464214, 'Jose Manuel 678', '1990-12-26', 0),
('18547767', '3', 'Felipe', 'Ahumada', 'Ahumada', 'Masculino', '1933-09-22', 'Soltero(a)', 987687543, 'Los delirios 3', '2017-11-28', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`numrut_emp`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
