-- MySQL dump 10.16  Distrib 10.1.31-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: hp
-- ------------------------------------------------------
-- Server version	10.1.31-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `baranghp`
--

DROP TABLE IF EXISTS `baranghp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baranghp` (
  `noseri` varchar(8) NOT NULL,
  `kd_merk` varchar(5) NOT NULL,
  `warna` varchar(10) NOT NULL,
  PRIMARY KEY (`noseri`),
  KEY `FK_merk` (`kd_merk`),
  CONSTRAINT `FK_merk` FOREIGN KEY (`kd_merk`) REFERENCES `tipehp` (`kd_merk`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baranghp`
--

LOCK TABLES `baranghp` WRITE;
/*!40000 ALTER TABLE `baranghp` DISABLE KEYS */;
INSERT INTO `baranghp` VALUES ('11aa22bb','10001','Putih'),('11ab22cc','10001','Hitam'),('11ac33dd','10002','Putih'),('11ad33ee','10002','Hitam'),('11ae44ff','10003','Merah'),('11af44gg','10003','Biru'),('22ba22bb','20001','Putih'),('22bb22cc','20001','Hitam'),('22bc33dd','20002','Putih'),('22bd33ee','20002','Hitam'),('22be44ff','20003','Merah'),('22bf44gg','20003','Biru'),('33ca22bb','30001','Putih'),('33cb22cc','30001','Putih'),('33cc33dd','30002','Hitam'),('33cd33ee','30002','Merah'),('33ce44ff','30003','Biru'),('33ce44gg','30003','Putih'),('33cg55bb','30004','Putih'),('33ch55ii','30004','Hitam');
/*!40000 ALTER TABLE `baranghp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `karyawan`
--

DROP TABLE IF EXISTS `karyawan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `karyawan` (
  `kd_kar` varchar(3) NOT NULL,
  `nama_karyawan` varchar(10) NOT NULL,
  `jabatan` varchar(10) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `telp_karyawan` varchar(12) NOT NULL,
  PRIMARY KEY (`kd_kar`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `karyawan`
--

LOCK TABLES `karyawan` WRITE;
/*!40000 ALTER TABLE `karyawan` DISABLE KEYS */;
INSERT INTO `karyawan` VALUES ('K01','Andi','Supervisor','Jl. Surabaya','0812334501'),('K02','Budi','Staf','Jl. Malang','0855382900'),('K03','Lisa','Staf','Jl. Jakarta','0813245601'),('K04','Mona','Staf','Jl. Bandung','0821435332');
/*!40000 ALTER TABLE `karyawan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pelanggan`
--

DROP TABLE IF EXISTS `pelanggan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pelanggan` (
  `kd_pel` varchar(6) NOT NULL,
  `nama_pel` varchar(15) NOT NULL,
  `alamat_pel` varchar(15) NOT NULL,
  `telp_pel` varchar(12) NOT NULL,
  PRIMARY KEY (`kd_pel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelanggan`
--

LOCK TABLES `pelanggan` WRITE;
/*!40000 ALTER TABLE `pelanggan` DISABLE KEYS */;
INSERT INTO `pelanggan` VALUES ('P00001','Dika','Surabaya','0811123456'),('P00002','Anisah','Malang','0821345778'),('P00003','Wulan','Jakarta','0888056403'),('P00004','Bety','Bandung','0856749901'),('P00005','Dody','Malang','0822333564'),('P00006','Iwan','Banyuwngi','0854327861'),('P00007','Fery','Bali','0888092342');
/*!40000 ALTER TABLE `pelanggan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipehp`
--

DROP TABLE IF EXISTS `tipehp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipehp` (
  `kd_merk` varchar(5) NOT NULL,
  `merk` varchar(10) NOT NULL,
  `tipe` varchar(30) NOT NULL,
  `harga` int(11) NOT NULL,
  PRIMARY KEY (`kd_merk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipehp`
--

LOCK TABLES `tipehp` WRITE;
/*!40000 ALTER TABLE `tipehp` DISABLE KEYS */;
INSERT INTO `tipehp` VALUES ('10001','Nokia','Nokia CD',1000000),('10002','Nokia','Nokia ES-01',1675000),('10003','Nokia','Nokia C7',3385000),('20001','Sony','SE Iperis Mini',5000000),('20002','Sony','SE Iperis Mini Pro',9000000),('20003','Sony','SE Eim',1250000),('30001','Samsung','Galaxy Geo',2000000),('30002','Samsung','Galaxy Young',900000),('30003','Samsung','Galaxy Active',2550000),('30004','Samsung','Galaxy Tab',4000000);
/*!40000 ALTER TABLE `tipehp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transjual`
--

DROP TABLE IF EXISTS `transjual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transjual` (
  `nota` varchar(7) NOT NULL,
  `tanggal` date NOT NULL,
  `noseri` varchar(8) NOT NULL,
  `kd_kar` varchar(3) NOT NULL,
  `kd_pel` varchar(6) NOT NULL,
  `total` int(11) NOT NULL,
  PRIMARY KEY (`nota`),
  KEY `FK_seri` (`noseri`),
  KEY `FK_kar` (`kd_kar`),
  KEY `FK_pel` (`kd_pel`),
  CONSTRAINT `FK_kar` FOREIGN KEY (`kd_kar`) REFERENCES `karyawan` (`kd_kar`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_pel` FOREIGN KEY (`kd_pel`) REFERENCES `pelanggan` (`kd_pel`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_seri` FOREIGN KEY (`noseri`) REFERENCES `baranghp` (`noseri`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transjual`
--

LOCK TABLES `transjual` WRITE;
/*!40000 ALTER TABLE `transjual` DISABLE KEYS */;
INSERT INTO `transjual` VALUES ('T000001','2013-02-10','11ac33dd','K01','P00001',1675000),('T000002','2013-02-10','22bf44gg','K01','P00002',1250000),('T000003','2013-02-11','22bd33ee','K02','P00003',9000000),('T000004','2013-02-12','11aa22bb','K03','P00004',1000000),('T000005','2013-02-15','33cb22cc','K04','P00001',2000000),('T000006','2013-02-25','33ce44gg','K01','P00005',2550000),('T000007','2013-02-26','33ce44gg','K02','P00006',2550000),('T000008','2013-03-01','11ad33ee','K03','P00007',1675000),('T000009','2013-03-01','22bc33dd','K03','P00002',9000000),('T000010','2013-03-04','33ce44ff','K04','P00003',2550000),('T000011','2013-03-04','33ch55ii','K04','P00006',4000000),('T000012','2013-03-06','11ab22cc','K01','P00007',1000000),('T000013','2013-03-10','11ac33dd','K02','P00005',1675000),('T000014','2013-03-10','11aa22bb','K02','P00002',1000000),('T000015','2013-03-12','33ce44gg','K03','P00001',2550000);
/*!40000 ALTER TABLE `transjual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `view_transaksi`
--

DROP TABLE IF EXISTS `view_transaksi`;
/*!50001 DROP VIEW IF EXISTS `view_transaksi`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `view_transaksi` (
  `nota` tinyint NOT NULL,
  `tanggal` tinyint NOT NULL,
  `merk` tinyint NOT NULL,
  `tipe` tinyint NOT NULL,
  `warna` tinyint NOT NULL,
  `nama_karyawan` tinyint NOT NULL,
  `nama_pel` tinyint NOT NULL
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `view_transaksi`
--

/*!50001 DROP TABLE IF EXISTS `view_transaksi`*/;
/*!50001 DROP VIEW IF EXISTS `view_transaksi`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_transaksi` AS select `j`.`nota` AS `nota`,`j`.`tanggal` AS `tanggal`,`t`.`merk` AS `merk`,`t`.`tipe` AS `tipe`,`b`.`warna` AS `warna`,`k`.`nama_karyawan` AS `nama_karyawan`,`p`.`nama_pel` AS `nama_pel` from ((((`transjual` `j` join `baranghp` `b` on((`j`.`noseri` = `b`.`noseri`))) join `tipehp` `t` on((`b`.`kd_merk` = `t`.`kd_merk`))) join `karyawan` `k` on((`j`.`kd_kar` = `k`.`kd_kar`))) join `pelanggan` `p` on((`j`.`kd_pel` = `p`.`kd_pel`))) order by `j`.`nota` */;
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

-- Dump completed on 2018-05-03 22:32:41
