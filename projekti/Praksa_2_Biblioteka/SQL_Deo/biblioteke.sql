-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 07, 2023 at 06:17 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biblioteke`
--

-- --------------------------------------------------------

--
-- Table structure for table `autori`
--

CREATE TABLE `autori` (
  `autorID` int(11) NOT NULL,
  `ime` varchar(45) NOT NULL,
  `prezime` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `autori`
--

INSERT INTO `autori` (`autorID`, `ime`, `prezime`) VALUES
(1, 'Nikola', 'Tucić'),
(2, 'Ljubinka', 'Culafić'),
(3, 'Mirjana', 'Neškov'),
(4, 'Nina', 'Seničar'),
(5, 'Sem', 'Teplin'),
(6, 'Dragoljub', 'Zamurović'),
(7, 'Nenad', 'Stefanović');

-- --------------------------------------------------------

--
-- Table structure for table `bibliotekari`
--

CREATE TABLE `bibliotekari` (
  `bibliotekarID` int(11) NOT NULL,
  `sifraZaposlenog` varchar(10) NOT NULL,
  `ime` varchar(45) NOT NULL,
  `prezime` varchar(45) NOT NULL,
  `jmbg` bigint(20) NOT NULL,
  `telefon` varchar(45) DEFAULT NULL,
  `mesto` varchar(45) NOT NULL,
  `ulica` varchar(65) NOT NULL,
  `broj` varchar(10) NOT NULL,
  `bibliotekaID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bibliotekari`
--

INSERT INTO `bibliotekari` (`bibliotekarID`, `sifraZaposlenog`, `ime`, `prezime`, `jmbg`, `telefon`, `mesto`, `ulica`, `broj`, `bibliotekaID`) VALUES
(1, 'BG-0002547', 'Milica', 'Petronijević', 2009970717554, '+381(65)123-45-67', 'Zemun', 'Oračka', '17a', 1),
(2, 'ZE-0000786', 'Aleksandar', 'Milčić', 1001968710182, '+381(63)234-45-67', 'Beograd', 'Žička', '171b', 1),
(3, 'BT-0024786', 'Denis', 'Karamatijević', 1303959710571, '+381(64)872-45-67', 'Beograd', 'Sarajevska', '185', 2),
(4, 'SU-0000457', 'Snežana', 'Samardžić', 2504975719354, '+381(62)828-46-67', 'Surčin', 'Kosovska', '18', 2),
(5, 'VR-0000218', 'Slavica', 'Petrović', 1302978716872, '+381(65)456-12-35', 'Užice', 'Dimitrija Tucovića', '28a', 4);

-- --------------------------------------------------------

--
-- Table structure for table `biblioteke`
--

CREATE TABLE `biblioteke` (
  `bibliotekaID` int(11) NOT NULL,
  `naziv` varchar(45) NOT NULL,
  `mesto` varchar(45) NOT NULL,
  `ulica` varchar(65) NOT NULL,
  `broj` varchar(10) NOT NULL,
  `telefon` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `biblioteke`
--

INSERT INTO `biblioteke` (`bibliotekaID`, `naziv`, `mesto`, `ulica`, `broj`, `telefon`) VALUES
(1, 'Sveti Sava', 'Beograd', 'Petra Zrinjskog', '8', '+381(11)30-77-616'),
(2, 'Vuk Karadžić', 'Novi Beograd', 'Bulevar Zorana Đinđića', '152', '+381(11)26-97-427'),
(3, 'Novi Grad', 'Zemun', 'Prvomajska', '8', '+381(11)261-41-07'),
(4, 'Fontana', 'Novi Beograd', 'Pariske komune', '13', '+381(11)269-36-36'),
(5, 'Petar Kočić', 'Beograd', 'Viška', '3', '+381(11)243-02-50');

-- --------------------------------------------------------

--
-- Table structure for table `bibliotekeclanovi`
--

CREATE TABLE `bibliotekeclanovi` (
  `bibliotekaclanID` int(11) NOT NULL,
  `datumUpisa` date NOT NULL,
  `bibliotekaID` int(11) NOT NULL,
  `clanID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bibliotekeclanovi`
--

INSERT INTO `bibliotekeclanovi` (`bibliotekaclanID`, `datumUpisa`, `bibliotekaID`, `clanID`) VALUES
(1, '2019-03-18', 1, 1),
(2, '2017-06-23', 1, 2),
(3, '2014-01-27', 1, 3),
(4, '2022-08-09', 2, 4),
(5, '2023-11-08', 2, 5),
(6, '2020-12-01', 2, 6),
(7, '2023-05-05', 3, 7);

-- --------------------------------------------------------

--
-- Table structure for table `clanovi`
--

CREATE TABLE `clanovi` (
  `clanID` int(11) NOT NULL,
  `clanskaKarta` bigint(20) NOT NULL,
  `ime` varchar(45) NOT NULL,
  `prezime` varchar(45) NOT NULL,
  `datumRodjenja` date NOT NULL,
  `telefon` varchar(20) DEFAULT NULL,
  `mesto` varchar(45) NOT NULL,
  `ulica` varchar(65) NOT NULL,
  `broj` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `clanovi`
--

INSERT INTO `clanovi` (`clanID`, `clanskaKarta`, `ime`, `prezime`, `datumRodjenja`, `telefon`, `mesto`, `ulica`, `broj`) VALUES
(1, 1201903181637, 'Jagodinka', 'Simonović', '2000-04-05', '+381(64)487-56-65', 'Zemun', 'Bežanijska', '65a'),
(2, 1201706230233, 'Miroslav', 'Seničić', '2008-03-15', '+381(62)821-12-65', 'Batajnica', 'Majora Zorana Živkovića', '19'),
(3, 1201401274523, 'Zorica', 'Perković', '1978-12-28', '+381(62)245-46-61', 'Beograd', 'Cara Dušana', '45'),
(4, 2202208099143, 'Lazar', 'Subotić', '2013-10-25', NULL, 'Novi Beograd', 'Omladinskih brigada', '12a'),
(5, 2202311080873, 'Dragoslav', 'Protić', '2012-11-13', NULL, 'Beograd', 'Bulevar Kraljice Natalije', '121'),
(6, 2202012010369, 'Milena', 'Karić', '2002-07-08', '+381(61)874-10-61', 'Barajevo', 'Otona Župančića', '17'),
(7, 3201803190143, 'Borislav', 'Kovačić', '2001-05-25', '+381(64)175-32-48', 'Zemun', 'Prvomajska', '97');

-- --------------------------------------------------------

--
-- Table structure for table `decija`
--

CREATE TABLE `decija` (
  `decijeID` int(11) NOT NULL,
  `uzrast` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `decija`
--

INSERT INTO `decija` (`decijeID`, `uzrast`) VALUES
(3, 7),
(4, 3);

-- --------------------------------------------------------

--
-- Table structure for table `izdavaci`
--

CREATE TABLE `izdavaci` (
  `izdavacID` int(11) NOT NULL,
  `naziv` varchar(65) NOT NULL,
  `telefon` varchar(20) NOT NULL,
  `mesto` varchar(45) NOT NULL,
  `ulica` varchar(65) NOT NULL,
  `broj` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `izdavaci`
--

INSERT INTO `izdavaci` (`izdavacID`, `naziv`, `telefon`, `mesto`, `ulica`, `broj`) VALUES
(1, 'Laguna d.o.o.', '+381(11)715-50-42', 'Beograd', 'Kralja Petra', '45'),
(2, 'Vulkan izdavaštvo', '+381(11)308-75-15', 'Beograd', 'Gospodara Vučića', '245'),
(3, 'Pčelica izdavaštvo', '+381(32)348-252', 'Čačak', 'Kolubarska', '4');

-- --------------------------------------------------------

--
-- Table structure for table `izdavanja`
--

CREATE TABLE `izdavanja` (
  `izdavanjeID` int(11) NOT NULL,
  `datumIzdavanja` date NOT NULL,
  `datumVracanja` date DEFAULT NULL,
  `knjigaID` int(11) NOT NULL,
  `bibliotekarID` int(11) NOT NULL,
  `clanID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `izdavanja`
--

INSERT INTO `izdavanja` (`izdavanjeID`, `datumIzdavanja`, `datumVracanja`, `knjigaID`, `bibliotekarID`, `clanID`) VALUES
(1, '2022-07-05', '2022-07-15', 1, 1, 1),
(2, '2022-12-01', '2022-12-15', 3, 2, 2),
(3, '2022-12-01', '2022-12-15', 5, 1, 3),
(4, '2023-01-25', '2023-02-12', 2, 3, 4),
(5, '2022-12-01', '2022-12-15', 4, 3, 5),
(6, '2022-12-01', '2022-12-15', 6, 4, 6),
(7, '2023-05-04', NULL, 1, 1, 1),
(8, '2023-05-05', NULL, 3, 2, 2),
(9, '2023-04-28', NULL, 4, 3, 6);

-- --------------------------------------------------------

--
-- Table structure for table `knjige`
--

CREATE TABLE `knjige` (
  `knjigaID` int(11) NOT NULL,
  `isbn` bigint(45) NOT NULL,
  `naziv` varchar(255) NOT NULL,
  `jezik` varchar(45) NOT NULL,
  `izdavacID` int(11) NOT NULL,
  `bibliotekaID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `knjige`
--

INSERT INTO `knjige` (`knjigaID`, `isbn`, `naziv`, `jezik`, `izdavacID`, `bibliotekaID`) VALUES
(1, 9788683635245, 'Evoluciona biologija', 'srpski', 2, 1),
(2, 9788683635924, 'Fiziologija biljaka', 'srpski', 2, 2),
(3, 9788652144556, 'Zvezda Slavica', 'srpski', 1, 1),
(4, 9788660899134, 'Zvuci šume', 'srpski', 3, 2),
(5, 9788652113835, 'My Belgrade', 'engleski', 1, 1),
(6, 9788652124848, 'Vodič kroz ljubavnu istoriju Beograda', 'srpski', 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `knjigeautori`
--

CREATE TABLE `knjigeautori` (
  `knjigaAutorID` int(11) NOT NULL,
  `knjigaID` int(11) NOT NULL,
  `autorID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `knjigeautori`
--

INSERT INTO `knjigeautori` (`knjigaAutorID`, `knjigaID`, `autorID`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 2, 3),
(4, 3, 4),
(5, 4, 5),
(6, 5, 6),
(7, 6, 7);

-- --------------------------------------------------------

--
-- Table structure for table `naucna`
--

CREATE TABLE `naucna` (
  `naucnoID` int(11) NOT NULL,
  `oblastNauke` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `naucna`
--

INSERT INTO `naucna` (`naucnoID`, `oblastNauke`) VALUES
(1, 'Biologija'),
(2, 'Biologija');

-- --------------------------------------------------------

--
-- Table structure for table `pozajmna`
--

CREATE TABLE `pozajmna` (
  `pozajmnoID` int(11) NOT NULL,
  `aktuelnost` varchar(45) NOT NULL,
  `zanr` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pozajmna`
--

INSERT INTO `pozajmna` (`pozajmnoID`, `aktuelnost`, `zanr`) VALUES
(5, 'aktuelna', 'Foto monografija'),
(6, 'bestseler', 'Lirska povest');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `autori`
--
ALTER TABLE `autori`
  ADD PRIMARY KEY (`autorID`);

--
-- Indexes for table `bibliotekari`
--
ALTER TABLE `bibliotekari`
  ADD PRIMARY KEY (`bibliotekarID`),
  ADD KEY `bibliotekaID` (`bibliotekaID`);

--
-- Indexes for table `biblioteke`
--
ALTER TABLE `biblioteke`
  ADD PRIMARY KEY (`bibliotekaID`);

--
-- Indexes for table `bibliotekeclanovi`
--
ALTER TABLE `bibliotekeclanovi`
  ADD PRIMARY KEY (`bibliotekaclanID`),
  ADD KEY `bibliotekaID` (`bibliotekaID`),
  ADD KEY `clanID` (`clanID`);

--
-- Indexes for table `clanovi`
--
ALTER TABLE `clanovi`
  ADD PRIMARY KEY (`clanID`);

--
-- Indexes for table `decija`
--
ALTER TABLE `decija`
  ADD PRIMARY KEY (`decijeID`);

--
-- Indexes for table `izdavaci`
--
ALTER TABLE `izdavaci`
  ADD PRIMARY KEY (`izdavacID`);

--
-- Indexes for table `izdavanja`
--
ALTER TABLE `izdavanja`
  ADD PRIMARY KEY (`izdavanjeID`),
  ADD KEY `knjigaID` (`knjigaID`),
  ADD KEY `bibliotekarID` (`bibliotekarID`),
  ADD KEY `clanID` (`clanID`);

--
-- Indexes for table `knjige`
--
ALTER TABLE `knjige`
  ADD PRIMARY KEY (`knjigaID`),
  ADD KEY `izdavacID` (`izdavacID`),
  ADD KEY `bibliotekaID` (`bibliotekaID`);

--
-- Indexes for table `knjigeautori`
--
ALTER TABLE `knjigeautori`
  ADD PRIMARY KEY (`knjigaAutorID`),
  ADD KEY `knjigaID` (`knjigaID`),
  ADD KEY `autorID` (`autorID`);

--
-- Indexes for table `naucna`
--
ALTER TABLE `naucna`
  ADD PRIMARY KEY (`naucnoID`);

--
-- Indexes for table `pozajmna`
--
ALTER TABLE `pozajmna`
  ADD PRIMARY KEY (`pozajmnoID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bibliotekeclanovi`
--
ALTER TABLE `bibliotekeclanovi`
  MODIFY `bibliotekaclanID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `izdavanja`
--
ALTER TABLE `izdavanja`
  MODIFY `izdavanjeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `knjigeautori`
--
ALTER TABLE `knjigeautori`
  MODIFY `knjigaAutorID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bibliotekari`
--
ALTER TABLE `bibliotekari`
  ADD CONSTRAINT `bibliotekari_ibfk_1` FOREIGN KEY (`bibliotekaID`) REFERENCES `biblioteke` (`bibliotekaID`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `bibliotekeclanovi`
--
ALTER TABLE `bibliotekeclanovi`
  ADD CONSTRAINT `bibliotekeclanovi_ibfk_1` FOREIGN KEY (`bibliotekaID`) REFERENCES `biblioteke` (`bibliotekaID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `bibliotekeclanovi_ibfk_2` FOREIGN KEY (`clanID`) REFERENCES `clanovi` (`clanID`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `decija`
--
ALTER TABLE `decija`
  ADD CONSTRAINT `decija_ibfk_1` FOREIGN KEY (`decijeID`) REFERENCES `knjige` (`knjigaID`);

--
-- Constraints for table `izdavanja`
--
ALTER TABLE `izdavanja`
  ADD CONSTRAINT `izdavanja_ibfk_1` FOREIGN KEY (`knjigaID`) REFERENCES `knjige` (`knjigaID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `izdavanja_ibfk_2` FOREIGN KEY (`bibliotekarID`) REFERENCES `bibliotekari` (`bibliotekarID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `izdavanja_ibfk_3` FOREIGN KEY (`clanID`) REFERENCES `clanovi` (`clanID`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `knjige`
--
ALTER TABLE `knjige`
  ADD CONSTRAINT `knjige_ibfk_1` FOREIGN KEY (`izdavacID`) REFERENCES `izdavaci` (`izdavacID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `knjige_ibfk_2` FOREIGN KEY (`bibliotekaID`) REFERENCES `biblioteke` (`bibliotekaID`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `knjigeautori`
--
ALTER TABLE `knjigeautori`
  ADD CONSTRAINT `knjigeautori_ibfk_1` FOREIGN KEY (`knjigaID`) REFERENCES `knjige` (`knjigaID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `knjigeautori_ibfk_2` FOREIGN KEY (`autorID`) REFERENCES `autori` (`autorID`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `naucna`
--
ALTER TABLE `naucna`
  ADD CONSTRAINT `naucna_ibfk_1` FOREIGN KEY (`naucnoID`) REFERENCES `knjige` (`knjigaID`);

--
-- Constraints for table `pozajmna`
--
ALTER TABLE `pozajmna`
  ADD CONSTRAINT `pozajmna_ibfk_1` FOREIGN KEY (`pozajmnoID`) REFERENCES `knjige` (`knjigaID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
