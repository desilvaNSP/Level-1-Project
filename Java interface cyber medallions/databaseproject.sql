-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.54-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema cyberm
--

CREATE DATABASE IF NOT EXISTS cyberm;
USE cyberm;

--
-- Definition of table `consumer`
--

DROP TABLE IF EXISTS `consumer`;
CREATE TABLE `consumer` (
  `owner_id` varchar(12) NOT NULL DEFAULT '',
  `name` varchar(45) NOT NULL DEFAULT '',
  `NIC` varchar(10) NOT NULL DEFAULT '',
  `HomeNo` varchar(45) NOT NULL DEFAULT '',
  `Street` varchar(45) NOT NULL DEFAULT '',
  `HomeTown` varchar(45) NOT NULL DEFAULT '',
  `MainCity` varchar(45) DEFAULT NULL,
  `TlpNo` int(12) unsigned DEFAULT NULL,
  PRIMARY KEY (`owner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `consumer`
--

/*!40000 ALTER TABLE `consumer` DISABLE KEYS */;
INSERT INTO `consumer` (`owner_id`,`name`,`NIC`,`HomeNo`,`Street`,`HomeTown`,`MainCity`,`TlpNo`) VALUES 
 ('cid002','N.P.De Silva','893004567V','46','Nilammahara Rd','null','Maharagama',734346734),
 ('cid003','M.V.Amarasiri','892665213v','50','null','Kurudugaha','Elpitiya',715246398),
 ('cid004','W.D.Karunawathi','707860486v','44','Vauxhall Street','null','Colombo 2',112567893),
 ('cid005','J.K. Kumara','897652836V','78','null','Maramba','Akurassa',912285545),
 ('cid006','D.N. Fernando','578945898v','67','null','Waththegama','Kandy',775678025),
 ('cid007','S.D.M.A.Perera','860044455v','90','Temple Rd','Kirikiththamulla ','Yakkala',774649880),
 ('cid008','A.W. Soysa','796609968v','56','Seeduwa Rd','Seeduwa','Gampaha',725889978),
 ('cid009','Y.W.K. Pushpakumara','896844449v','77','Pasyala Mawatha','null','Negambo',724569102),
 ('cid010','J.S.D. Menuwan','795588480v','28','Ella Rd','Thanabaddegama','Elpitiya',912278490),
 ('cid011','K.R. Lakshan','696604386v','60/5','Maligakanda Mawatha ','Maradana','Colombo  10',112477899),
 ('cid012','S.Sudarshan','678893009v','39','Ranawiru Mawatha','Uragaha','Elpitiya',714567896),
 ('cid013','F.H. Thilan','769999909v','567','Senanayaka Mawatha','null','Pittigala',714678867),
 ('cid014','G.L.Nuwan','678889405v','789','Dutugamunu Mawatha','Thalangama','Malabe',112467788),
 ('cid015','K.W.E. Kumari','567789900v','59/3','Rohala Mawatha','null','Dehiwala',112785009),
 ('cid016','D.E.Senanayaka','780008767v','81','Senadira Mawatha','Buddegama','Galle',724656777),
 ('cid017','T.B.Ekanayaka','580008767v','93','Kumarathunga Munidasa Mawatha','null','Colombo 7',112776859),
 ('cid018','M.S.R. Jayasuriya','689995007v','845','Darmasena Mawatha','null','Badulla',726464777),
 ('cid019','','','','','','',713348657),
 ('cid020','Mahendrarajah Darasha','905526656V','55','K.K.S Rd','jaffna','jaffna',714522363),
 ('cid021','A.S.Dilshan','','46/2','Darmaloka Rd','null','Kaduwella',714778456),
 ('cid022','K.M.G kulasiri','755521364V','89','Subadddarama Rd','Wellawaththa','Colombo 6',112256935),
 ('cid023','R.V.S. Appuhamy','678895046v','45','Cross Street','Thalangama','Malabe',112455689);
/*!40000 ALTER TABLE `consumer` ENABLE KEYS */;


--
-- Definition of table `currentfallout`
--

DROP TABLE IF EXISTS `currentfallout`;
CREATE TABLE `currentfallout` (
  `CFLID` varchar(12) NOT NULL DEFAULT '',
  `Customer_name` varchar(45) NOT NULL DEFAULT '',
  `Telephone_no` varchar(10) NOT NULL DEFAULT '',
  `Datestimes` varchar(45) NOT NULL DEFAULT '0000-00-00 00:00:00',
  `Address` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`CFLID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `currentfallout`
--

/*!40000 ALTER TABLE `currentfallout` DISABLE KEYS */;
INSERT INTO `currentfallout` (`CFLID`,`Customer_name`,`Telephone_no`,`Datestimes`,`Address`) VALUES 
 ('CFLID001','sandun priyanka','0714256855','12/05/2011','Subaddrama road,Balapitiya'),
 ('CFLID002','sandun tharaka','0711022545','12/02/2012','malpe road ,katubedda');
/*!40000 ALTER TABLE `currentfallout` ENABLE KEYS */;


--
-- Definition of table `hastopay`
--

DROP TABLE IF EXISTS `hastopay`;
CREATE TABLE `hastopay` (
  `account_id` varchar(12) NOT NULL DEFAULT '',
  `months` varchar(45) DEFAULT NULL,
  `amount` decimal(7,2) NOT NULL DEFAULT '0.00',
  `owner_id` varchar(12) NOT NULL DEFAULT '',
  `account_no` varchar(12) NOT NULL DEFAULT '',
  `readingID` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`account_id`),
  KEY `owner_id3` (`owner_id`),
  KEY `ReadingID` (`readingID`),
  CONSTRAINT `owner_id3` FOREIGN KEY (`owner_id`) REFERENCES `consumer` (`owner_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ReadingID` FOREIGN KEY (`readingID`) REFERENCES `reading` (`reading_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hastopay`
--

/*!40000 ALTER TABLE `hastopay` DISABLE KEYS */;
INSERT INTO `hastopay` (`account_id`,`months`,`amount`,`owner_id`,`account_no`,`readingID`) VALUES 
 ('HAID001','28','1140.00','cid008','22332233','rid009'),
 ('HAID0011','May','259.90','cid009','56105228','rid006'),
 ('HAID0012','May','297.50','cid010','56654901','rid003'),
 ('HAID0013','May','60.00','cid011','57204574','rid004'),
 ('HAID0014','May','90.00','cid012','57754247','rid005'),
 ('HAID0015','May','259.90','cid013','58303920','rid006'),
 ('HAID0016','May','4083.00','cid014','58853593','rid007'),
 ('HAID0017','May','613.50','cid015','59403266','rid008'),
 ('HAID0018','May','1140.00','cid016','59952939','rid009'),
 ('HAID0019','May','463.50','cid017','60502612','rid010'),
 ('HAID002','jan','2323.00','cid004','21212131',NULL),
 ('HAID0020','May','546.00','cid018','61052285','rid011'),
 ('HAID0021','May','66.00','cid019','61601958','rid012'),
 ('HAID0022','May','269.30','cid020','62151631','rid013'),
 ('HAID0023','May','546.00','cid021','62701304','rid014'),
 ('HAID0024','May','180.00','cid022','63250977','rid015'),
 ('HAID0025','May','114.00','cid023','63800650','rid016'),
 ('HAID003','march','43443.00','cid002','23232342',NULL),
 ('HAID005','jan','232.00','cid003','23243434',NULL),
 ('HAID007','jan','2424.00','cid005','34554354',NULL),
 ('HAID008','May','613.50','cid008','22332233','rid008'),
 ('HAID009','feb','333.00','cid002','53533242',NULL),
 ('HAID010','jan','2510.00','cid003','55555555',NULL);
/*!40000 ALTER TABLE `hastopay` ENABLE KEYS */;


--
-- Definition of table `meter`
--

DROP TABLE IF EXISTS `meter`;
CREATE TABLE `meter` (
  `meter_id` varchar(12) NOT NULL DEFAULT '',
  `meter_no` varchar(15) NOT NULL DEFAULT '',
  `rpu` int(4) unsigned NOT NULL DEFAULT '0',
  `connected_date` varchar(10) DEFAULT NULL,
  `made_in` varchar(45) NOT NULL DEFAULT '',
  `owner_id` varchar(10) NOT NULL DEFAULT '',
  PRIMARY KEY (`meter_id`),
  KEY `owner_id` (`owner_id`),
  CONSTRAINT `owner_id` FOREIGN KEY (`owner_id`) REFERENCES `consumer` (`owner_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `meter`
--

/*!40000 ALTER TABLE `meter` DISABLE KEYS */;
INSERT INTO `meter` (`meter_id`,`meter_no`,`rpu`,`connected_date`,`made_in`,`owner_id`) VALUES 
 ('mid003','615235335',100,'6/03/2012','MALAYSIA','cid002'),
 ('mid004','678984930',100,'7/03/2012','CHINA','cid003'),
 ('mid005','467787898',200,'7/03/2012','INDIA','cid004'),
 ('mid006','564748778',100,'7/03/2012','CHINA','cid005'),
 ('mid007','478789799',100,'8/05/2012','CHINA','cid006'),
 ('mid008','849895095',100,'2/09/2010','CHINA','cid006'),
 ('mid009','676575888',100,'6/02/2012','CHINA','cid007'),
 ('mid010','489890009',50,'8/09/2011','INDIA','cid008'),
 ('mid011','456454515',400,'26/09/1998','INDIA','cid008'),
 ('mid012','545481655',100,'16/10/1998','MALAYASIA','cid008'),
 ('mid013','564565469',200,'05/11/1998','CHAINA','cid008'),
 ('mid014','356236856',100,'21/01/1999','CHINA','cid008'),
 ('mid015','854848454',50,'12/05/2006','CHINA','cid008'),
 ('mid016','965985659',100,'26/09/2008','MALAYASIA','cid009'),
 ('mid017','356526856',50,'10/07/1999','CHINA','cid010'),
 ('mid018','215615521',100,'30/10/1989','MALAYASIA','cid011'),
 ('mid019','454518454',50,'15/08/1999','CHINA','cid012'),
 ('mid020','245154152',100,'22/05/2000','CHIANA','cid013'),
 ('mid021','596526565',100,'26/10/1988','MALAYASIA','cid013'),
 ('mid022','484561255',100,'26/10/1999','CHINA','cid014'),
 ('mid023','545454541',100,'12/11/1989','CHINA','cid015'),
 ('mid024','548545847',200,'22/12/2010','CHINA','cid015'),
 ('mid025','545845455',100,'29/11/2009','MALAYASIA','cid015'),
 ('mid026','398944788',200,'22/05/2010','CHINA','cid016'),
 ('mid027','495689997',100,'7/04/1983','INDIA','cid017'),
 ('mid028','898984244',100,'22/12/1990','CHINA','cid018'),
 ('mid029','394895878',200,'5/06/1995','CHINA','cid018'),
 ('mid030','489896786',100,'7/04/1993','MALAYSIA','cid018');
/*!40000 ALTER TABLE `meter` ENABLE KEYS */;


--
-- Definition of table `paidaccount`
--

DROP TABLE IF EXISTS `paidaccount`;
CREATE TABLE `paidaccount` (
  `paid_id` varchar(12) NOT NULL DEFAULT '',
  `months` varchar(45) NOT NULL DEFAULT '',
  `amount` decimal(7,2) NOT NULL DEFAULT '0.00',
  `owner_id` varchar(12) NOT NULL DEFAULT '',
  `account_no` varchar(12) NOT NULL DEFAULT '',
  `ReadingID` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`paid_id`),
  KEY `owner_id4` (`owner_id`),
  KEY `ReadingID2` (`ReadingID`),
  CONSTRAINT `owner_id4` FOREIGN KEY (`owner_id`) REFERENCES `consumer` (`owner_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ReadingID2` FOREIGN KEY (`ReadingID`) REFERENCES `reading` (`reading_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paidaccount`
--

/*!40000 ALTER TABLE `paidaccount` DISABLE KEYS */;
INSERT INTO `paidaccount` (`paid_id`,`months`,`amount`,`owner_id`,`account_no`,`ReadingID`) VALUES 
 ('PID','hgfhfghfgh','323.00','cid003','3746238467',NULL),
 ('PID002','dfdfsdf','333.00','cid002','4533746477',NULL);
/*!40000 ALTER TABLE `paidaccount` ENABLE KEYS */;


--
-- Definition of table `reading`
--

DROP TABLE IF EXISTS `reading`;
CREATE TABLE `reading` (
  `reading_id` varchar(12) NOT NULL DEFAULT '',
  `dates` varchar(10) NOT NULL DEFAULT '',
  `times` varchar(10) NOT NULL DEFAULT '',
  `units` float NOT NULL DEFAULT '0',
  `no_of_dates` int(10) unsigned NOT NULL DEFAULT '0',
  `months` varchar(15) DEFAULT NULL,
  `meter_id` varchar(12) NOT NULL DEFAULT '',
  `RDState` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`reading_id`),
  KEY `meter_id` (`meter_id`),
  CONSTRAINT `meter_id` FOREIGN KEY (`meter_id`) REFERENCES `meter` (`meter_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reading`
--

/*!40000 ALTER TABLE `reading` DISABLE KEYS */;
INSERT INTO `reading` (`reading_id`,`dates`,`times`,`units`,`no_of_dates`,`months`,`meter_id`,`RDState`) VALUES 
 ('rid003','6/06/2012','4.43pm',55,32,'May','mid003','ok'),
 ('rid004','6/06/2012','4.55pm',10,30,'May','mid004','ok'),
 ('rid005','16/06/2012','11.50am',20,29,'May','mid005','ok'),
 ('rid006','5/06/2012','2.30pm',47,30,'May','mid006','ok'),
 ('rid007','7/06/2012','1.26pm',192,28,'May','mid007','ok'),
 ('rid008','13/06/2012','12.30pm',87,31,'May','mid008','ok'),
 ('rid009','13/06/2012','9.45am',99,28,'May','mid009','ok'),
 ('rid010','6/06/2012','2.40pm',67,27,'May','mid010','ok'),
 ('rid011','14/06/2012','1.25pm',78,28,'May','mid011','ok'),
 ('rid012','3/06/2012','3.15pm',12,30,'May','mid012','ok'),
 ('rid013','6/06/2012','4.24pm',49,29,'May','mid013','ok'),
 ('rid014','5/06/2012','3.40pm',78,24,'May','mid014','ok'),
 ('rid015','11/06/2012','1.34pm',60,25,'May','mid015','ok'),
 ('rid016','11/06/2012','3.30pm',28,31,'May','mid016','ok'),
 ('rid017','12/06/2012','10.13am',49,25,'May','mid017',NULL),
 ('rid018','12/06/2012','11.40am',40,27,'May','mid018',NULL),
 ('rid019','11/06/2012','9.50am',9,29,'May','mid019',NULL),
 ('rid020','14/06/2012','12.30pm',30,29,'May','mid020',NULL),
 ('rid021','9/06/2012','9.20am',59,30,'May','mid021',NULL),
 ('rid022','15/06/2012','3.40pm',78,28,'May','mid022',NULL),
 ('rid023','17/06/2012','4.56pm',37,26,'May','mid023',NULL),
 ('rid024','13/06/2012','10.30am',56,27,'May','mid024',NULL),
 ('rid025','9/06/2012','4.26pm',67,30,'May','mid025',NULL),
 ('rid026','10/06/2012','5.19pm',32,30,'May','mid026',NULL),
 ('rid027','15/06/2012','2.40pm',50,28,'May','mid027',NULL),
 ('rid028','11/06/2012','1.20pm',45,29,'May','mid028',NULL),
 ('rid029','8/06/2012','1.30pm',57,31,'May','mid029',NULL),
 ('rid030','12/06/2012','2.30pm',67,32,'May','mid030',NULL);
/*!40000 ALTER TABLE `reading` ENABLE KEYS */;


--
-- Definition of table `unit`
--

DROP TABLE IF EXISTS `unit`;
CREATE TABLE `unit` (
  `Unit_ID` varchar(12) NOT NULL DEFAULT '',
  `Unit_Type` varchar(20) NOT NULL DEFAULT '',
  `Unit_Range` varchar(70) NOT NULL DEFAULT '',
  `Unit_Price` float NOT NULL DEFAULT '0',
  `ServiceType` varchar(45) NOT NULL DEFAULT '',
  `LowerLimit` float DEFAULT NULL,
  `UpperLimit` float DEFAULT NULL,
  PRIMARY KEY (`Unit_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `unit`
--

/*!40000 ALTER TABLE `unit` DISABLE KEYS */;
INSERT INTO `unit` (`Unit_ID`,`Unit_Type`,`Unit_Range`,`Unit_Price`,`ServiceType`,`LowerLimit`,`UpperLimit`) VALUES 
 ('UID001','Domestic','0-30',3,'30.00',0,30),
 ('UID002','Domestic','30-60',4.7,'60.00',30,60),
 ('UID003','Domestic','30-90',7.5,'90.00',30,90),
 ('UID004','Domestic','90-120',21,'315.00',90,120),
 ('UID005','Domestic','120-180',24,'315.00',120,180),
 ('UID006','Domestic','180<',36,'315.00',180,900),
 ('UID007','Religious','0-30',1.9,'30.00',0,30),
 ('UID008','Religious','30-90',2.8,'60.00',30,90),
 ('UID009','Religious','90-120',6.75,'180.00',90,120),
 ('UID010','Religious','120-180',7.5,'180.00',120,180),
 ('UID011','Religious','180<',9.4,'240.00',180,900);
/*!40000 ALTER TABLE `unit` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(12) NOT NULL DEFAULT '',
  `name` varchar(45) NOT NULL DEFAULT '',
  `nic` varchar(12) NOT NULL DEFAULT '',
  `user_name` varchar(45) NOT NULL DEFAULT '',
  `password` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`,`name`,`nic`,`user_name`,`password`) VALUES 
 ('U002','m','1','m','123'),
 ('uid001','sandun','893004599V','sandun','fit11');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
