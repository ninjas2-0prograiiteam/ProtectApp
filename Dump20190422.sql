-- MySQL dump 10.13  Distrib 8.0.14, for Win64 (x86_64)
--
-- Host: localhost    Database: tourdatabase
-- ------------------------------------------------------
-- Server version	8.0.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carritodecompras`
--

DROP TABLE IF EXISTS `carritodecompras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `carritodecompras` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idusuario` int(11) NOT NULL,
  `idevento` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carritodecompras`
--

LOCK TABLES `carritodecompras` WRITE;
/*!40000 ALTER TABLE `carritodecompras` DISABLE KEYS */;
INSERT INTO `carritodecompras` VALUES (1,11,9,20),(2,11,13,20);
/*!40000 ALTER TABLE `carritodecompras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `categoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  `descripcion` varchar(205) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Cultural','Relacionado con la cultura de El Salvadorr'),(2,'Recreativo','Relacionado con el entertenimiento recreativo personal'),(3,'Grupos Ideologicos','Relacionado con grupos que comparten una ideología como LGBT, feministas, socialistas, entre otros'),(4,'Deportivo','Relacionado con el deporte'),(5,'Rural','Realizados en las zonas rurales El Salvador'),(6,'Urbano','Realizado en las zonas urbanas de El Salvador'),(7,'De Aventura','Relacionado con la exploración de lugares, caminatas, canopi, escaladas, entre otros eventos'),(8,'De Negocios','Eventos para grupos de empresas'),(9,'Ecologico','Para ayudar a mejorar o limpiar zonas de El Salvador'),(10,'Religioso','Para personas que comparten una religión'),(11,'Gatronomico','Relacionado con la comida típica de El Salvador');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `departamentos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES (1,'Ahuachapán'),(2,'Santa Ana'),(3,'Sonsonate'),(4,'Chalatenango'),(5,'Cuscatlán'),(6,'San Salvador'),(7,'La Libertad'),(8,'San Vicente'),(9,'Cabañas'),(10,'La Paz'),(11,'Usulután'),(12,'San Miguel'),(13,'Morazán'),(14,'La Unión');
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `empresa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(300) NOT NULL,
  `email` varchar(300) NOT NULL,
  `telefono` int(11) NOT NULL,
  `nit` varchar(45) NOT NULL,
  `username` varchar(85) NOT NULL,
  `password` varchar(45) NOT NULL,
  `nodecuenta` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (11,'1','helen.9.dic@gmail.com',79399834,'23122131231211','hola123','123456','123453453'),(12,'Helen','helen.9.dic@gmail.com',79399834,'13215445465465','20171564','12345','12365478');
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento`
--

DROP TABLE IF EXISTS `evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `evento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idempresa` int(11) NOT NULL,
  `idcategoria` int(11) NOT NULL,
  `iddepartamento` int(11) NOT NULL,
  `horadesalida` varchar(45) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `horaderetorno` varchar(45) NOT NULL,
  `puntodeencuentro` varchar(500) NOT NULL,
  `precio` int(11) NOT NULL,
  `cupo` int(11) NOT NULL,
  `cuposrestantes` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento`
--

LOCK TABLES `evento` WRITE;
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
INSERT INTO `evento` VALUES (13,9,2,1,'09:11','2019-04-18','12:10','parque',10,11,11),(14,12,1,10,'13:13','2019-04-19','13:12','parque',15,14,14),(15,12,3,2,'08:08','2019-04-06','09:50','Gasolinera Puma',15,16,16);
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `eventos`
--

DROP TABLE IF EXISTS `eventos`;
/*!50001 DROP VIEW IF EXISTS `eventos`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `eventos` AS SELECT 
 1 AS `empresa`,
 1 AS `categoria`,
 1 AS `departamento`,
 1 AS `horadesalida`,
 1 AS `fecha`,
 1 AS `horaderetorno`,
 1 AS `puntodeencuentro`,
 1 AS `precio`,
 1 AS `cuposrestantes`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `miseventos`
--

DROP TABLE IF EXISTS `miseventos`;
/*!50001 DROP VIEW IF EXISTS `miseventos`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `miseventos` AS SELECT 
 1 AS `empresa`,
 1 AS `username`,
 1 AS `categoria`,
 1 AS `departamento`,
 1 AS `horadesalida`,
 1 AS `fecha`,
 1 AS `horaderetorno`,
 1 AS `puntodeencuentro`,
 1 AS `precio`,
 1 AS `cuposrestantes`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `miseventosusuario`
--

DROP TABLE IF EXISTS `miseventosusuario`;
/*!50001 DROP VIEW IF EXISTS `miseventosusuario`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `miseventosusuario` AS SELECT 
 1 AS `username`,
 1 AS `categoria`,
 1 AS `departamento`,
 1 AS `horadesalida`,
 1 AS `fecha`,
 1 AS `horaderetorno`,
 1 AS `puntodeencuentro`,
 1 AS `precio`,
 1 AS `cuposrestantes`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pago` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idusuario` int(11) NOT NULL,
  `nodetarjeta` varchar(45) NOT NULL,
  `cvv` int(11) NOT NULL,
  `fechadevencimiento` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (3,1,'',123,1234),(9,11,'1234567893214569',123,1234),(10,11,'120365789632104',123,1235),(11,11,'165461231',32165,3145);
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL,
  `dui` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(85) NOT NULL,
  `password` varchar(45) NOT NULL,
  `iddepartamento` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (11,'Helen','Fuentes',19,205698741,'helen.9.dic@gmail.com','Helen Fuentes','12345',1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'tourdatabase'
--

--
-- Dumping routines for database 'tourdatabase'
--

--
-- Final view structure for view `eventos`
--

/*!50001 DROP VIEW IF EXISTS `eventos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `eventos` AS select `empresa`.`nombre` AS `empresa`,`categoria`.`tipo` AS `categoria`,`departamentos`.`nombre` AS `departamento`,`evento`.`horadesalida` AS `horadesalida`,`evento`.`fecha` AS `fecha`,`evento`.`horaderetorno` AS `horaderetorno`,`evento`.`puntodeencuentro` AS `puntodeencuentro`,`evento`.`precio` AS `precio`,`evento`.`cuposrestantes` AS `cuposrestantes` from (((`evento` join `empresa` on((`evento`.`idempresa` = `empresa`.`id`))) join `categoria` on((`evento`.`idcategoria` = `categoria`.`id`))) join `departamentos` on((`evento`.`iddepartamento` = `departamentos`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `miseventos`
--

/*!50001 DROP VIEW IF EXISTS `miseventos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `miseventos` AS select `empresa`.`nombre` AS `empresa`,`empresa`.`username` AS `username`,`categoria`.`tipo` AS `categoria`,`departamentos`.`nombre` AS `departamento`,`evento`.`horadesalida` AS `horadesalida`,`evento`.`fecha` AS `fecha`,`evento`.`horaderetorno` AS `horaderetorno`,`evento`.`puntodeencuentro` AS `puntodeencuentro`,`evento`.`precio` AS `precio`,`evento`.`cuposrestantes` AS `cuposrestantes` from (((`evento` join `empresa` on((`evento`.`idempresa` = `empresa`.`id`))) join `categoria` on((`evento`.`idcategoria` = `categoria`.`id`))) join `departamentos` on((`evento`.`iddepartamento` = `departamentos`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `miseventosusuario`
--

/*!50001 DROP VIEW IF EXISTS `miseventosusuario`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `miseventosusuario` AS select `usuarios`.`username` AS `username`,`categoria`.`tipo` AS `categoria`,`departamentos`.`nombre` AS `departamento`,`evento`.`horadesalida` AS `horadesalida`,`evento`.`fecha` AS `fecha`,`evento`.`horaderetorno` AS `horaderetorno`,`evento`.`puntodeencuentro` AS `puntodeencuentro`,`evento`.`precio` AS `precio`,`evento`.`cuposrestantes` AS `cuposrestantes` from ((((`evento` join `carritodecompras` on((`carritodecompras`.`idevento` = `evento`.`id`))) join `categoria` on((`categoria`.`id` = `evento`.`idcategoria`))) join `departamentos` on((`departamentos`.`id` = `evento`.`iddepartamento`))) join `usuarios` on((`carritodecompras`.`idusuario` = `usuarios`.`id`))) where (`usuarios`.`username` = 'Helen Fuentes') */;
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

-- Dump completed on 2019-04-22  0:28:11
