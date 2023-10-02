-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-10-2023 a las 01:05:34
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `calculadora`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calculador`
--

CREATE TABLE `calculador` (
  `NUMERO` int(11) NOT NULL,
  `RAIZ_CUADRADA` int(11) NOT NULL,
  `RAIZ_CUBICA` int(11) NOT NULL,
  `CUADRADA` int(11) NOT NULL,
  `CUBICA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `calculador`
--

INSERT INTO `calculador` (`NUMERO`, `RAIZ_CUADRADA`, `RAIZ_CUBICA`, `CUADRADA`, `CUBICA`) VALUES
(1, 1, 1, 1, 1),
(1, 1, 1, 1, 1),
(2, 1, 1, 4, 8),
(3, 2, 1, 9, 27),
(4, 2, 2, 16, 64),
(5, 2, 2, 25, 125),
(6, 2, 2, 36, 216),
(7, 3, 2, 49, 343),
(8, 3, 2, 64, 512),
(9, 3, 2, 81, 729),
(10, 3, 2, 100, 1000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
