-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jun 06, 2021 at 07:13 PM
-- Server version: 5.7.23
-- PHP Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `prison-web-service-dev`
--

-- --------------------------------------------------------

--
-- Table structure for table `cells`
--

CREATE TABLE `cells` (
  `id` bigint(20) NOT NULL,
  `cell_number` int(11) NOT NULL,
  `spots` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cells`
--

INSERT INTO `cells` (`id`, `cell_number`, `spots`) VALUES
(0, 117, 2),
(3, 282, 3),
(4, 124, 5),
(5, 256, 3),
(6, 105, 3),
(7, 266, 1),
(9, 261, 5),
(20, 210, 3),
(21, 130, 3),
(26, 198, 1),
(35, 113, 2),
(37, 240, 2),
(42, 221, 1),
(43, 200, 5),
(46, 290, 5),
(51, 110, 3),
(57, 129, 4),
(70, 143, 5),
(77, 277, 5),
(81, 270, 3),
(399, 153, 3),
(503, 161, 4),
(516, 150, 5),
(533, 141, 4),
(619, 137, 4),
(729, 276, 5),
(736, 196, 5),
(957, 239, 3),
(1247, 291, 4),
(2935, 230, 3),
(3331, 120, 5),
(3588, 208, 4),
(4634, 228, 3),
(5386, 247, 2),
(7575, 181, 3),
(9874, 127, 5),
(16211, 152, 4),
(71203, 286, 3),
(114075, 212, 4),
(211110, 187, 5),
(582366, 133, 3),
(986977, 214, 5),
(2792571, 149, 5),
(4386274, 111, 1),
(5135423, 139, 3),
(9673942, 182, 2),
(21640626, 164, 4),
(68700889, 284, 5),
(91103739, 295, 2),
(9223372036854775807, 262, 1);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `meetings`
--

CREATE TABLE `meetings` (
  `id` bigint(20) NOT NULL,
  `is_finished` bit(1) NOT NULL,
  `meeting_end` datetime(6) DEFAULT NULL,
  `meeting_room_id` bigint(20) DEFAULT NULL,
  `meeting_start` datetime(6) DEFAULT NULL,
  `prisoner_officer_id` bigint(20) DEFAULT NULL,
  `prisoner_id` bigint(20) DEFAULT NULL,
  `visitor_data` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `meetings`
--

INSERT INTO `meetings` (`id`, `is_finished`, `meeting_end`, `meeting_room_id`, `meeting_start`, `prisoner_officer_id`, `prisoner_id`, `visitor_data`) VALUES
(0, b'1', '2021-05-31 20:07:35.000000', 0, '2021-05-31 19:07:35.000000', 0, 0, 'Anahi Ledner'),
(2, b'1', '2020-07-26 02:41:14.000000', 0, '2020-07-26 01:41:14.000000', 6816, 5, 'Tyra Herzog DVM'),
(3, b'0', '2021-02-21 20:33:00.000000', 4, '2021-02-21 19:33:00.000000', 6, 785, 'Annabel Orn'),
(5, b'0', '2021-02-02 06:47:58.000000', 69, '2021-02-02 05:47:58.000000', 6816, 4515637, 'Prof. Anderson Lueilwitz'),
(8, b'0', '2020-10-21 03:10:52.000000', 69, '2020-10-21 02:10:52.000000', 9223372036854775807, 4, 'Tyreek Kessler'),
(9, b'1', '2021-04-22 05:01:57.000000', 119, '2021-04-22 04:01:57.000000', 9223372036854775807, 558, 'Marianna Conn'),
(11, b'0', '2020-12-16 08:13:13.000000', 0, '2020-12-16 07:13:13.000000', 6, 19, 'Destini Kuhlman'),
(12, b'0', '2020-11-10 20:13:20.000000', 119, '2020-11-10 19:13:20.000000', 0, 5, 'Sedrick Murphy'),
(32, b'1', '2020-08-12 03:45:53.000000', 9223372036854775807, '2020-08-12 02:45:53.000000', 898, 4, 'Lupe Witting'),
(47, b'1', '2020-12-01 06:42:59.000000', 119, '2020-12-01 05:42:59.000000', 50, 0, 'Katlyn Conn'),
(50, b'0', '2021-01-22 07:00:24.000000', 4, '2021-01-22 06:00:24.000000', 0, 62, 'Dr. Ransom Mayert DDS'),
(56, b'1', '2020-10-02 16:51:35.000000', 119, '2020-10-02 15:51:35.000000', 6816, 26, 'Tyshawn Heller'),
(59, b'0', '2021-01-27 01:24:50.000000', 4, '2021-01-27 00:24:50.000000', 3, 1, 'Ms. Willie Doyle III'),
(86, b'1', '2020-09-12 21:52:47.000000', 69, '2020-09-12 20:52:47.000000', 7015, 370, 'Prof. Sonny Kris'),
(87, b'1', '2020-11-08 15:45:04.000000', 9223372036854775807, '2020-11-08 14:45:04.000000', 9223372036854775807, 37493032, 'Ms. Kasandra Kassulke'),
(97, b'0', '2021-03-15 02:33:49.000000', 0, '2021-03-15 01:33:49.000000', 6816, 2, 'Sidney Homenick'),
(144, b'1', '2020-06-13 18:37:28.000000', 4, '2020-06-13 17:37:28.000000', 50, 20, 'Damion Bosco PhD'),
(145, b'1', '2020-09-04 14:43:23.000000', 119, '2020-09-04 13:43:23.000000', 898, 9494, 'Olaf Johnston'),
(773, b'0', '2020-08-18 14:40:17.000000', 0, '2020-08-18 13:40:17.000000', 0, 45326215, 'Ms. Maritza Muller'),
(3212, b'0', '2021-01-30 22:45:21.000000', 69, '2021-01-30 21:45:21.000000', 6, 2, 'Mrs. Thelma Paucek'),
(58139, b'0', '2020-10-28 10:24:13.000000', 9223372036854775807, '2020-10-28 09:24:13.000000', 898, 1, 'Amelie Wyman Sr.'),
(812310, b'0', '2021-05-22 11:03:10.000000', 119, '2021-05-22 10:03:10.000000', 6, 120, 'Leonora Roob'),
(5234950, b'1', '2020-09-12 23:51:43.000000', 69, '2020-09-12 23:41:43.000000', 898, 22, 'Cleta Harvey'),
(9223372036854775807, b'1', '2020-06-17 17:34:11.000000', 9223372036854775807, '2020-06-17 16:34:11.000000', 0, 561, 'Leonora Frami I');

-- --------------------------------------------------------

--
-- Table structure for table `meeting_rooms`
--

CREATE TABLE `meeting_rooms` (
  `id` bigint(20) NOT NULL,
  `room_number` int(11) NOT NULL,
  `spots` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `meeting_rooms`
--

INSERT INTO `meeting_rooms` (`id`, `room_number`, `spots`) VALUES
(0, 17, 5),
(4, 18, 2),
(69, 10, 6),
(119, 20, 5),
(9223372036854775807, 11, 2);

-- --------------------------------------------------------

--
-- Table structure for table `prisoners`
--

CREATE TABLE `prisoners` (
  `id` bigint(20) NOT NULL,
  `cell_id` bigint(20) DEFAULT NULL,
  `judgement` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `prisoners`
--

INSERT INTO `prisoners` (`id`, `cell_id`, `judgement`, `name`, `surname`) VALUES
(0, NULL, 'Deleniti voluptas dolorem voluptatem eos nostrum quam est vero earum perspiciatis accusantium est ullam hic.', 'Jordane', 'Hansen'),
(1, NULL, 'Rerum cum error adipisci voluptates aliquam maxime dolores temporibus aut.', 'Skylar', 'Hodkiewicz'),
(2, NULL, 'Cum itaque accusamus optio rerum magni quidem maxime quae quia molestias eaque tempore et dolores ut sapiente odit numquam.', 'Maryse', 'Herzog'),
(3, NULL, 'Porro veritatis repudiandae voluptatem blanditiis distinctio eligendi repellendus doloribus ducimus voluptatum ullam atque nobis ut.', 'Mafalda', 'Douglas'),
(4, NULL, 'Aut aspernatur sapiente illum nesciunt distinctio rerum qui a qui magnam laborum illum quidem similique accusamus error veniam maxime quod.', 'Abbigail', 'Satterfield'),
(5, NULL, 'Quo quisquam a doloremque id eveniet aliquid ipsa aut blanditiis ut eos eos accusantium facilis harum totam.', 'Maya', 'Rowe'),
(6, NULL, 'Libero sit facere sed error aspernatur ut accusamus quod rerum repellendus dolor quia tempore explicabo sit modi non aperiam nesciunt.', 'Monica', 'Dach'),
(7, NULL, 'Iusto odio culpa at maxime natus quia nisi voluptatem tempore aut atque adipisci dolore voluptas et repellat.', 'Betsy', 'Runte'),
(9, NULL, 'Et sunt ratione sapiente ut qui porro quam dicta eveniet dignissimos.', 'Clementina', 'Lubowitz'),
(16, NULL, 'Qui facilis qui harum commodi similique odio iusto optio voluptatem pariatur hic.', 'Barrett', 'Grady'),
(19, NULL, 'Nisi voluptatibus corrupti illum recusandae laboriosam rerum sit occaecati quia quo vitae dolores dolores doloremque.', 'Adrian', 'Fay'),
(20, NULL, 'Ut fugiat reprehenderit repudiandae consequuntur dolores deleniti et pariatur nihil sunt ut laboriosam quia nulla et.', 'Abdiel', 'Brakus'),
(22, NULL, 'Aliquam culpa officiis sed sit quis laborum et maxime totam ducimus autem omnis et excepturi nobis pariatur eveniet.', 'Tierra', 'Volkman'),
(26, NULL, 'Vero aliquam ea qui dolores quo eveniet repellendus libero quia exercitationem amet dolor dolorum in tempora et perferendis.', 'Aileen', 'Padberg'),
(57, NULL, 'Eius a totam eos qui nesciunt qui ea ea est vitae voluptas molestiae ducimus.', 'Liam', 'Labadie'),
(59, NULL, 'Quis et corrupti excepturi enim est hic et qui molestiae perspiciatis at nobis reprehenderit nostrum possimus assumenda quisquam ut nobis.', 'Trycia', 'Crona'),
(62, NULL, 'Ratione temporibus iusto voluptas quisquam aliquid ut esse ad facere id.', 'Ned', 'Gorczany'),
(98, NULL, 'Maiores sit aperiam dolores reiciendis porro quo aut ut iure quo facilis.', 'Danielle', 'Romaguera'),
(120, NULL, 'Nam culpa error architecto corporis quos quia et pariatur quaerat dolor sit eum et ullam at debitis asperiores.', 'Danika', 'Runte'),
(314, NULL, 'Quod illo perferendis iure laudantium in consequatur consequatur accusantium rerum.', 'Maybell', 'Adams'),
(315, NULL, 'Qui a sed quidem cumque dolore nihil ea aut voluptatem.', 'Gene', 'Schimmel'),
(321, NULL, 'Dolores eos non pariatur dolorem magni voluptatem et eos eum qui culpa voluptas consequatur maiores sint ut architecto sed alias qui.', 'Wanda', 'Dach'),
(370, NULL, 'Qui est et quibusdam cupiditate omnis deserunt qui perspiciatis voluptas minus voluptate unde non praesentium rerum.', 'Irma', 'Greenholt'),
(558, NULL, 'Velit perferendis nemo rerum nostrum dolores minus explicabo doloribus qui ab velit illum sint nam in non neque assumenda labore ea maxime.', 'Norbert', 'Stehr'),
(561, NULL, 'Delectus qui autem officia sunt aut aliquid ex ratione eos voluptates.', 'Okey', 'Green'),
(567, NULL, 'Officia quidem eos laboriosam occaecati deserunt nesciunt dolorem veritatis facere in et quos.', 'Dante', 'Kozey'),
(785, NULL, 'Saepe esse temporibus qui animi et quibusdam numquam aliquam praesentium inventore non provident illum officia ipsam quidem deserunt quia.', 'Wendy', 'Kutch'),
(8291, NULL, 'Accusantium vitae deserunt velit culpa distinctio est qui rem necessitatibus fugit saepe aut dolorem esse quibusdam.', 'Keith', 'Hauck'),
(9494, NULL, 'Atque qui nesciunt nostrum sint sunt nisi voluptatem aut nesciunt accusantium saepe quos facere rerum sit enim.', 'Demarcus', 'Muller'),
(24965, NULL, 'Et voluptatem dolorem consequatur iusto accusantium deserunt nisi similique aut velit.', 'Christy', 'Rutherford'),
(38240, NULL, 'Qui dolores animi fugit magni et nisi distinctio suscipit reiciendis quod rerum quia ratione tempora ea deserunt incidunt autem cumque minima.', 'Clementine', 'Heathcote'),
(70947, NULL, 'Dolore recusandae ab mollitia et vel ad qui magni voluptates qui est est maiores eum cum.', 'Myrtice', 'Farrell'),
(90964, NULL, 'Omnis autem porro non quo dolorem et in minus commodi in ea totam repellat autem numquam repudiandae praesentium.', 'Danielle', 'Hoeger'),
(99324, NULL, 'Amet labore magnam doloribus perspiciatis officiis quisquam aliquam et est.', 'Filiberto', 'Hintz'),
(127653, NULL, 'Ipsam maiores iure voluptas dignissimos et et vero vero molestiae voluptates.', 'Yolanda', 'Roob'),
(1693251, NULL, 'Cumque quisquam magnam quia commodi nesciunt aut soluta sunt mollitia quaerat provident quo voluptatem praesentium maxime expedita laboriosam.', 'Zakary', 'Sauer'),
(3217990, NULL, 'Perferendis illum laborum cum qui enim tempore a soluta in.', 'Alfonso', 'Sawayn'),
(4515637, NULL, 'Fugit perferendis consequatur velit delectus error enim eum omnis quidem voluptate sit quia impedit ducimus quo.', 'Bernie', 'Hilpert'),
(4639683, NULL, 'Fuga molestias dolore optio autem iusto quae labore nemo a eius.', 'Rashawn', 'Harber'),
(37493032, NULL, 'Qui atque corporis autem architecto quae doloremque aut nemo ratione asperiores doloribus est sunt qui tenetur quis.', 'Solon', 'Treutel'),
(45326215, NULL, 'Perferendis laborum aut consequatur sed consequatur qui ipsa eligendi ex voluptas ea similique placeat blanditiis deserunt eaque in et.', 'Clair', 'Hickle'),
(83917824, NULL, 'Temporibus facilis ut mollitia eos facere dolor aperiam cum est.', 'Makenzie', 'Gleason'),
(9223372036854775807, NULL, 'Iure quasi excepturi excepturi ut cumque doloribus et harum explicabo.', 'Salvador', 'Wisozk');

-- --------------------------------------------------------

--
-- Table structure for table `prison_officers`
--

CREATE TABLE `prison_officers` (
  `id` bigint(20) NOT NULL,
  `is_active` bit(1) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `prison_officers`
--

INSERT INTO `prison_officers` (`id`, `is_active`, `name`, `password`, `role`, `surname`, `username`) VALUES
(0, b'1', 'Caroline', 'ae99df726ef2d19178f818bd61e0b51569ee4b4b', 'ROLE_USER', 'Upton', 'elfrieda.klocko'),
(3, b'0', 'Felipa', 'e19e47121b6c02e7db9ce1e6977ff411c8327bf0', 'ROLE_USER', 'Lang', 'katelyn98'),
(6, b'1', 'Randall', '4d23d189c6d6261925eaec8ad0f2e2445deb7e7c', 'ROLE_USER', 'Fisher', 'tconn'),
(50, b'1', 'Kaci', '49812ff5e42ad948ee491700d825974cd4601c3a', 'ROLE_USER', 'Kris', 'sipes.dovie'),
(898, b'0', 'Verla', 'b35dcc405c5619e29e4d0dbeeae8aed67e2ce7b4', 'ROLE_USER', 'Prohaska', 'o\'hara.madison'),
(6816, b'1', 'Chloe', 'ef780129765a357d61a29127094f55cb49f9b934', 'ROLE_USER', 'Rodriguez', 'victor.adams'),
(7015, b'1', 'Laila', '3bfc00742c5932eabf8de1e23ec606f80460cbd7', 'ROLE_USER', 'Ferry', 'mafalda20'),
(9223372036854775807, b'0', 'Ethyl', '8502d927c6466d434e4293600ff08045f01c436e', 'ROLE_USER', 'Marquardt', 'jairo.langosh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cells`
--
ALTER TABLE `cells`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `meetings`
--
ALTER TABLE `meetings`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKr9lumpijlcgccyyjw74y9hhnd` (`prisoner_id`),
  ADD KEY `FK7f9jf703blj1rfdsgiyoog9gl` (`prisoner_officer_id`),
  ADD KEY `FKgr4r60oefsd72nnov73gsy8gq` (`meeting_room_id`);

--
-- Indexes for table `meeting_rooms`
--
ALTER TABLE `meeting_rooms`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prisoners`
--
ALTER TABLE `prisoners`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prison_officers`
--
ALTER TABLE `prison_officers`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `meetings`
--
ALTER TABLE `meetings`
  ADD CONSTRAINT `FK7f9jf703blj1rfdsgiyoog9gl` FOREIGN KEY (`prisoner_officer_id`) REFERENCES `prison_officers` (`id`),
  ADD CONSTRAINT `FKgr4r60oefsd72nnov73gsy8gq` FOREIGN KEY (`meeting_room_id`) REFERENCES `meeting_rooms` (`id`),
  ADD CONSTRAINT `FKr9lumpijlcgccyyjw74y9hhnd` FOREIGN KEY (`prisoner_id`) REFERENCES `prisoners` (`id`);
