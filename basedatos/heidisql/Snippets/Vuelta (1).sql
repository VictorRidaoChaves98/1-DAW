-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.39 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para vuelta
CREATE DATABASE IF NOT EXISTS `vuelta` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `vuelta`;

-- Volcando estructura para tabla vuelta.ciclista
CREATE TABLE IF NOT EXISTS `ciclista` (
  `dorsal` int NOT NULL,
  `nombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `edad` int DEFAULT NULL,
  `nomeq` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`dorsal`),
  KEY `nomeq` (`nomeq`),
  CONSTRAINT `ciclista_ibfk_1` FOREIGN KEY (`nomeq`) REFERENCES `equipo` (`nomeq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla vuelta.ciclista: ~100 rows (aproximadamente)
DELETE FROM `ciclista`;
INSERT INTO `ciclista` (`dorsal`, `nombre`, `edad`, `nomeq`) VALUES
	(1, 'Miguel Indurain', 32, 'Banesto'),
	(2, 'Pedro Delgado', 35, 'Banesto'),
	(3, 'Alex Zulle', 27, 'ONCE'),
	(4, 'Tony Rominger', 30, 'Mapei-Clas'),
	(5, 'Gert-Jan Theunisse', 32, 'TVM'),
	(6, 'Adriano Baffi', 33, 'Mercatone Uno'),
	(7, 'Massimiliano Lelli', 30, 'Mercatone Uno'),
	(8, 'Jean Van Poppel', 33, 'Lotus Festina'),
	(9, 'Massimo Podenzana', 34, 'Navigare'),
	(10, 'Mario Cipollini', 28, 'Mercatone Uno'),
	(11, 'Flavio Giupponi', 31, 'Bresciali-Refin'),
	(12, 'Alessio Di Basco', 31, 'Amore Vita'),
	(13, 'Lale Cubino', 28, 'Seguros Amaya'),
	(14, 'Roberto Pagnin', 33, 'Navigare'),
	(15, 'Jesper Skibby', 31, 'TVM'),
	(16, 'Dimitri Konishev', 29, 'Jolly Club'),
	(17, 'Bruno Leali', 37, 'Bresciali-Refin'),
	(18, 'Robert Millar', 37, 'TVM'),
	(19, 'Julian Gorospe', 34, 'Banesto'),
	(20, 'Alfonso Gutiu00e9rrez', 29, 'Artiach'),
	(21, 'Erwin Nijboer', 31, 'Artiach'),
	(22, 'Giorgio Furlan', 32, 'Gewiss'),
	(23, 'Lance Armstrong', 27, 'Motorola'),
	(24, 'Claudio Chiappucci', 29, 'Carrera'),
	(25, 'Gianni Bugno', 32, 'Gatorade'),
	(26, 'Mikel Zarrabeitia', 27, 'Banesto'),
	(27, 'Laurent Jalabert', 28, 'ONCE'),
	(28, 'Jesus Montoya', 33, 'Banesto'),
	(29, 'Angel Edo', 28, 'Kelme'),
	(30, 'Melchor Mauri', 28, 'Banesto'),
	(31, 'Vicente Aparicio', 30, 'Banesto'),
	(32, 'Laurent Dufaux', 28, 'ONCE'),
	(33, 'Stefano della Santa', 29, 'Mapei-Clas'),
	(34, 'Angel Yesid Camargo', 30, 'Kelme'),
	(35, 'Erik Dekker', 28, 'Wordperfect'),
	(36, 'Gian Matteo Fagnini', 32, 'Mercatone Uno'),
	(37, 'Scott Sunderland', 29, 'TVM'),
	(38, 'Javier Palacin', 25, 'Euskadi'),
	(39, 'Rudy Verdonck', 30, 'Lotus Festina'),
	(40, 'Viatceslav Ekimov', 32, 'Wordperfect'),
	(41, 'Rolf Aldag', 25, 'Telecom'),
	(42, 'Davide Cassani', 29, 'TVM'),
	(43, 'Francesco Casagrande', 28, 'Mercatone Uno'),
	(44, 'Luca Gelfi', 27, 'Gatorade'),
	(45, 'Alberto Elli', 26, 'Artiach'),
	(46, 'Agustin Sagasti', 24, 'Euskadi'),
	(47, 'Laurent Pillon', 32, 'Gewiss'),
	(48, 'Marco Saligari', 29, 'Gewiss'),
	(49, 'Eugeni Berzin', 23, 'Gewiss'),
	(50, 'Fernando Escartin', 27, 'Mapei-Clas'),
	(51, 'Udo Bolts', 30, 'Telecom'),
	(52, 'Vladislav Bobrik', 26, 'Gewiss'),
	(53, 'Michele Bartoli', 28, 'Mercatone Uno'),
	(54, 'Steffen Wesemann', 30, 'Telecom'),
	(55, 'Nicola Minali', 28, 'Gewiss'),
	(56, 'Andrew Hampsten', 29, 'Banesto'),
	(57, 'Stefano Zanini', 28, 'Navigare'),
	(58, 'Gerd Audehm', 34, 'Telecom'),
	(59, 'Mariano Picolli', 28, 'Mercatone Uno'),
	(60, 'Giovanni Lombardi', 28, 'Bresciali-Refin'),
	(61, 'Walte Castignola', 26, 'Navigare'),
	(62, 'Raul Alcala', 30, 'Motorola'),
	(63, 'Alvaro Mejia', 32, 'Motorola'),
	(64, 'Giuseppe Petito', 28, 'Mercatone Uno'),
	(65, 'Pascal Lino', 29, 'Amore Vita'),
	(66, 'Enrico Zaina', 24, 'Gewiss'),
	(67, 'Armand de las Cuevas', 28, 'Castorama'),
	(68, 'Angel Citracca', 28, 'Navigare'),
	(69, 'Eddy Seigneur', 27, 'Castorama'),
	(70, 'Sandro Heulot', 29, 'Banesto'),
	(71, 'Prudencio Induru00e1in', 27, 'Banesto'),
	(72, 'Stefano Colage', 28, 'Bresciali-Refin'),
	(73, 'Laurent Fignon', 35, 'Gatorade'),
	(74, 'Claudio Chioccioli', 36, 'Amore Vita'),
	(75, 'Juan Romero', 32, 'Seguros Amaya'),
	(76, 'Marco Giovannetti', 34, 'Gatorade'),
	(77, 'Javier Mauleon', 33, 'Mapei-Clas'),
	(78, 'Antonio Esparza', 35, 'Kelme'),
	(79, 'Johan Bruyneel', 33, 'ONCE'),
	(80, 'Federico Echave', 37, 'Mapei-Clas'),
	(81, 'Piotr Ugrumov', 33, 'Gewiss'),
	(82, 'Edgar Corredor', 30, 'Kelme'),
	(83, 'Hernan Buenahora', 32, 'Kelme'),
	(84, 'Jon Unzaga', 31, 'Mapei-Clas'),
	(85, 'Dimitri Abdoujaparov', 30, 'Carrera'),
	(86, 'Juan Martinez Oliver', 32, 'Kelme'),
	(87, 'Fernando Mota', 32, 'Artiach'),
	(88, 'Angel Camarillo', 28, 'Mapei-Clas'),
	(89, 'Stefan Roche', 36, 'Carrera'),
	(90, 'Ivan Ivanov', 27, 'Artiach'),
	(91, 'Nestor Mora', 28, 'Kelme'),
	(92, 'Federico Garcia', 27, 'Artiach'),
	(93, 'Bo Hamburger', 29, 'TVM'),
	(94, 'Marino Alonso', 30, 'Banesto'),
	(95, 'Manuel Guijarro', 31, 'Lotus Festina'),
	(96, 'Tom Cordes', 29, 'Wordperfect'),
	(97, 'Casimiro Moreda', 28, 'ONCE'),
	(98, 'Eleuterio Anguita', 25, 'Artiach'),
	(99, 'Per Pedersen', 29, 'Seguros Amaya'),
	(100, 'William Palacios', 30, 'Jolly Club');

-- Volcando estructura para tabla vuelta.equipo
CREATE TABLE IF NOT EXISTS `equipo` (
  `nomeq` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `director` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`nomeq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla vuelta.equipo: ~22 rows (aproximadamente)
DELETE FROM `equipo`;
INSERT INTO `equipo` (`nomeq`, `director`) VALUES
	('Amore Vita', 'Ricardo Padacci'),
	('Artiach', 'Jose Perez'),
	('Banesto', 'Miguel Echevarria'),
	('Bresciali-Refin', 'Pietro Armani'),
	('Carrera', 'Luigi Petroni'),
	('Castorama', 'Jean Philip'),
	('Euskadi', 'Pedro Txucaru'),
	('Gatorade', 'Gian Luca Pacceli'),
	('Gewiss', 'Moreno Argentin'),
	('Jolly Club', 'Johan Richard'),
	('Kelme', 'Alvaro Pino'),
	('Lotus Festina', 'Suarez Cuevas'),
	('Mapei-Clas', 'Juan Fernandez'),
	('Mercatone Uno', 'Ettore Romano'),
	('Motorola', 'John Fidwell'),
	('Navigare', 'Lonrenzo Sciacci'),
	('ONCE', 'Manuel Sainz'),
	('PDM', 'Piet Van Der Kruis'),
	('Seguros Amaya', 'Minguez'),
	('Telecom', 'Morgan Reikcard'),
	('TVM', 'Steveens Henk'),
	('Wordperfect', 'Bill Gates');

-- Volcando estructura para tabla vuelta.etapa
CREATE TABLE IF NOT EXISTS `etapa` (
  `netapa` int NOT NULL,
  `km` int DEFAULT NULL,
  `salida` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `llegada` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `dorsal` int DEFAULT NULL,
  PRIMARY KEY (`netapa`),
  KEY `dorsal` (`dorsal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla vuelta.etapa: ~21 rows (aproximadamente)
DELETE FROM `etapa`;
INSERT INTO `etapa` (`netapa`, `km`, `salida`, `llegada`, `dorsal`) VALUES
	(1, 9, 'Valladolid', 'Valladolid', 1),
	(2, 180, 'Valladolid', 'Salamanca', 36),
	(3, 240, 'Salamanca', 'Caceres', 12),
	(4, 230, 'Almendralejo', 'Cordoba', 83),
	(5, 170, 'Cordoba', 'Granada', 27),
	(6, 150, 'Granada', 'Sierra Nevada', 52),
	(7, 250, 'Baza', 'Alicante', 22),
	(8, 40, 'Benidorm', 'Benidorm', 1),
	(9, 150, 'Benidorm', 'Valencia', 35),
	(10, 200, 'Igualada', 'Andorra', 2),
	(11, 195, 'Andorra', 'Estacion de Cerler', 65),
	(12, 220, 'Benasque', 'Zaragoza', 12),
	(13, 200, 'Zaragoza', 'Pamplona', 93),
	(14, 172, 'Pamplona', 'Alto de la Cruz de l', 86),
	(15, 207, 'Santo Domingo de la ', 'Santander', 10),
	(16, 160, 'Santander', 'Lagos de Covadonga', 5),
	(17, 140, 'Cangas de Onis', 'Alto del Naranco', 4),
	(18, 195, 'Avila', 'Avila', 8),
	(19, 190, 'Avila', 'Destilerias Dyc', 2),
	(20, 52, 'Segovia', 'Destilerias Dyc', 2),
	(21, 170, 'Destilerias Dyc', 'Madrid', 27);

-- Volcando estructura para tabla vuelta.lleva
CREATE TABLE IF NOT EXISTS `lleva` (
  `netapa` int DEFAULT NULL,
  `dorsal` int DEFAULT NULL,
  `codigo` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  KEY `codigo` (`codigo`),
  KEY `netapa` (`netapa`,`dorsal`),
  KEY `dorsal` (`dorsal`),
  CONSTRAINT `lleva_ibfk_1` FOREIGN KEY (`codigo`) REFERENCES `maillot` (`codigo`),
  CONSTRAINT `lleva_ibfk_2` FOREIGN KEY (`netapa`) REFERENCES `etapa` (`netapa`),
  CONSTRAINT `lleva_ibfk_3` FOREIGN KEY (`dorsal`) REFERENCES `ciclista` (`dorsal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla vuelta.lleva: ~109 rows (aproximadamente)
DELETE FROM `lleva`;
INSERT INTO `lleva` (`netapa`, `dorsal`, `codigo`) VALUES
	(1, 1, 'MGE'),
	(2, 1, 'MGE'),
	(3, 1, 'MGE'),
	(4, 1, 'MGE'),
	(5, 2, 'MGE'),
	(6, 2, 'MGE'),
	(7, 2, 'MGE'),
	(8, 4, 'MGE'),
	(9, 26, 'MGE'),
	(10, 26, 'MGE'),
	(11, 3, 'MGE'),
	(12, 3, 'MGE'),
	(13, 30, 'MGE'),
	(14, 30, 'MGE'),
	(15, 30, 'MGE'),
	(16, 1, 'MGE'),
	(17, 1, 'MGE'),
	(18, 1, 'MGE'),
	(19, 1, 'MGE'),
	(20, 1, 'MGE'),
	(21, 1, 'MGE'),
	(1, 1, 'MMO'),
	(2, 25, 'MMO'),
	(3, 25, 'MMO'),
	(4, 24, 'MMO'),
	(5, 25, 'MMO'),
	(6, 26, 'MMO'),
	(7, 26, 'MMO'),
	(8, 26, 'MMO'),
	(9, 26, 'MMO'),
	(10, 30, 'MMO'),
	(11, 30, 'MMO'),
	(12, 30, 'MMO'),
	(13, 30, 'MMO'),
	(14, 28, 'MMO'),
	(15, 28, 'MMO'),
	(16, 28, 'MMO'),
	(17, 28, 'MMO'),
	(18, 26, 'MMO'),
	(19, 28, 'MMO'),
	(20, 28, 'MMO'),
	(21, 2, 'MMO'),
	(1, 67, 'MMS'),
	(2, 69, 'MMS'),
	(3, 67, 'MMS'),
	(4, 69, 'MMS'),
	(1, 1, 'MMV'),
	(2, 16, 'MMV'),
	(3, 16, 'MMV'),
	(4, 17, 'MMV'),
	(5, 16, 'MMV'),
	(6, 16, 'MMV'),
	(7, 33, 'MMV'),
	(8, 33, 'MMV'),
	(9, 48, 'MMV'),
	(10, 48, 'MMV'),
	(11, 48, 'MMV'),
	(12, 48, 'MMV'),
	(13, 48, 'MMV'),
	(14, 42, 'MMV'),
	(15, 42, 'MMV'),
	(16, 42, 'MMV'),
	(17, 42, 'MMV'),
	(18, 20, 'MMV'),
	(19, 42, 'MMV'),
	(20, 42, 'MMV'),
	(21, 42, 'MMV'),
	(1, 1, 'MRE'),
	(2, 27, 'MRE'),
	(3, 27, 'MRE'),
	(4, 27, 'MRE'),
	(5, 27, 'MRE'),
	(6, 20, 'MRE'),
	(7, 20, 'MRE'),
	(8, 20, 'MRE'),
	(9, 20, 'MRE'),
	(10, 20, 'MRE'),
	(11, 20, 'MRE'),
	(12, 20, 'MRE'),
	(13, 20, 'MRE'),
	(14, 20, 'MRE'),
	(15, 20, 'MRE'),
	(16, 20, 'MRE'),
	(17, 20, 'MRE'),
	(18, 27, 'MRE'),
	(19, 20, 'MRE'),
	(20, 20, 'MRE'),
	(21, 20, 'MRE'),
	(1, 1, 'MSE'),
	(2, 8, 'MSE'),
	(3, 12, 'MSE'),
	(4, 8, 'MSE'),
	(5, 12, 'MSE'),
	(6, 12, 'MSE'),
	(7, 99, 'MSE'),
	(8, 99, 'MSE'),
	(9, 99, 'MSE'),
	(10, 99, 'MSE'),
	(11, 99, 'MSE'),
	(12, 99, 'MSE'),
	(13, 99, 'MSE'),
	(14, 22, 'MSE'),
	(15, 22, 'MSE'),
	(16, 22, 'MSE'),
	(17, 22, 'MSE'),
	(18, 10, 'MSE'),
	(19, 22, 'MSE'),
	(20, 22, 'MSE'),
	(21, 22, 'MSE');

-- Volcando estructura para tabla vuelta.maillot
CREATE TABLE IF NOT EXISTS `maillot` (
  `codigo` varchar(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `tipo` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `color` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `premio` int DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla vuelta.maillot: ~6 rows (aproximadamente)
DELETE FROM `maillot`;
INSERT INTO `maillot` (`codigo`, `tipo`, `color`, `premio`) VALUES
	('MGE', 'General', 'amarillo', 8000000),
	('MMO', 'Montaña', 'blanco y rojo', 2000000),
	('MMS', 'Mas Sufrido', 'estrellas moradas', 2000000),
	('MMV', 'Metas volantes', 'rojo', 2000000),
	('MRE', 'Regularidad', 'verde', 2000000),
	('MSE', 'Sprints especiales', 'rosa', 2000000);

-- Volcando estructura para tabla vuelta.puerto
CREATE TABLE IF NOT EXISTS `puerto` (
  `nompuerto` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `altura` int DEFAULT NULL,
  `categoria` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `pendiente` int DEFAULT NULL,
  `netapa` int DEFAULT NULL,
  `dorsal` int DEFAULT NULL,
  PRIMARY KEY (`nompuerto`),
  KEY `netapa` (`netapa`,`dorsal`),
  KEY `dorsal` (`dorsal`),
  CONSTRAINT `puerto_ibfk_1` FOREIGN KEY (`netapa`) REFERENCES `etapa` (`netapa`),
  CONSTRAINT `puerto_ibfk_2` FOREIGN KEY (`dorsal`) REFERENCES `ciclista` (`dorsal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla vuelta.puerto: ~14 rows (aproximadamente)
DELETE FROM `puerto`;
INSERT INTO `puerto` (`nompuerto`, `altura`, `categoria`, `pendiente`, `netapa`, `dorsal`) VALUES
	('Alto del Naranco', 565, '1', 7, 10, 30),
	('Arcalis', 2230, 'E', 6, 10, 4),
	('Cerler-Circo de Ampr', 2500, 'E', 6, 11, 9),
	('Coll de la Comella', 1362, '1', 8, 10, 2),
	('Coll de Ordino', 1980, 'E', 5, 10, 7),
	('Cruz de la Demanda', 1850, 'E', 7, 11, 20),
	('Lagos de Covadonga', 1134, 'E', 7, 16, 42),
	('Navacerrada', 1860, '1', 8, 19, 2),
	('Puerto de Alisas', 672, '1', 6, 15, 1),
	('Puerto de la Morcuer', 1760, '2', 6, 19, 2),
	('Puerto de Mijares', 1525, '1', 5, 18, 24),
	('Puerto de Navalmoral', 1521, '2', 4, 18, 2),
	('Puerto de Pedro Bern', 1250, '1', 4, 18, 25),
	('Sierra Nevada', 2500, 'E', 6, 2, 26);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
