-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2019 at 06:16 AM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `simbah`
--

-- --------------------------------------------------------

--
-- Table structure for table `artikel`
--

CREATE TABLE `artikel` (
  `id` int(11) NOT NULL,
  `title` varchar(150) NOT NULL,
  `news_title` varchar(5000) NOT NULL,
  `gambar` varchar(150) NOT NULL DEFAULT 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTxMT0vrVdU4HXSXdrumgmN9n7SmEkzn-z_LVzAa8j5ize-ck8juPYg3k&s',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `artikel`
--

INSERT INTO `artikel` (`id`, `title`, `news_title`, `gambar`, `created_at`, `updated_at`) VALUES
(8, '5 Tips Cara Hidup Sehat Untuk Lansia :', 'Memiliki tubuh yang sehat merupakan dambaan semua orang dari segala usia. Terlebih lagi bagi lansia yang masih aktif bekerja, tentunya tetap ingin bugar meski punya banyak kesibukan. Kesehatan tubuh dipengaruhi oleh beberapa faktor seperti pola makan, olahraga, dan kebiasaan hidup sehari-hari. Lalu bagaimana gaya hidup sehat untuk lansia agar tetap bisa aktif bekerja?\r\n\r\n1. Tidur yang cukup\r\nUntuk tetap menjaga kesehatan dan kebugaran tubuh lansia disela-sela pekerjaannya, Anda perlu mendapatkan istirahat malam yang cukup. Setidaknya waktu tidur malam yang cukup ialah 7 sampai 8 jam sehari.\r\n\r\n2. Pola makan yang sehat\r\nPilihlah makanan yang bergizi untuk dapat memenuhi kebutuhan nutrisi dan terhindar dari penyakit. Tingkatkan asupan sayur dan buah-buahan, makanan sumber protein, vitamin B12, asam folat, zinc, dan kalsium. Ganti asupan lemak jenuh Anda dengan jenis lemak sehat, seperti lemak tak jenuh dari alpukat, minyak zaitun, minyak kanola, dan kacang-kacangan.\r\n\r\n3. Perbanyak minum air putih\r\nSeiring bertambahnya usia, akan semakin mudah untuk tidak merasa haus, sehingga orang lanjut usia cenderung lebih berisiko untuk mengalami dehidrasi. Karena itu, sangat penting untuk memperbanyak konsumsi air untuk menjaga cairan tubuh agar tetap seimbang.\r\n\r\nMinum air putih juga penting agar asupan oksigen dalam darah, yang kemudian dialirkan ke otak, tetap terjaga. Dengan begitu, konsentrasi dan fungsi kognitif otak Anda pun akan tetap terjaga selama Anda berkegiatan.\r\n\r\n4. Olahraga\r\nJangan salah, olahraga adalah bagian yang penting dalam pola hidup sehat untuk lansia yang masih produktif. Olahraga dapat meningkat sistem kekebalan tubuh, proses metabolisme yang terjadi dalam tubuh semakin baik, serta mencegah terjadinya berbagai penyakit tidak menular seperti diabetes mellitus, penyakit jantung koroner, stroke, hipertensi, obesitas, dan berbagai kemungkinan penyakit lainnya yang umum dimiliki oleh lansia.\r\n\r\nOlahraga yang dilakukan pada orang dengan lanjut usia juga dapat membantu untuk menjaga kebugaran, membuat otot, sendi, serta tendon kuat dan menurunkan risiko terkena cedera.\r\n\r\nOlahraga yang cocok untuk lansia adalah yoga, jalan kaki di pagi hari, dan bersepeda. Jika Anda sudah lama tidak melakukan olahraga dan ingin memulai melakukannya kembali maka lakukan dengan pelan-pelan dan bertahap. Anda bisa secara bertahap membangun daya tahan otot, kekuatan otot, keseimbangan, lalu kelenturan tubuh.\r\n\r\nNamun, bila Anda memang punya kondisi kesehatan tertentu seperti rematik atau osteoarthritis, sebaiknya konsultasikan dengan dokter Anda olahraga seperti apa yang dianjurkan dan aman.\r\n\r\n5. Menjaga berat badan\r\nBerat badan sangat dipengaruhi oleh pola makan dan aktivitas fisik, untuk itu Anda perlu memerhatikan kedua hal tersebut. Lansia tidak harus menurunkan berat badannya, namun sebaiknya lebih fokus untuk mencegah kenaikan berat badan. Hal ini dilakukan untuk meningkatkan kualitas hidup lansia sehingga bisa menjadi lansia sehat. ', 'https://1.bp.blogspot.com/-x7B2-1lXupA/XMrB-X-VIfI/AAAAAAAAVBE/bT0v_CAFfCA8uXU6fn_iiXYE8hWiOzkIACLcBGAs/s1600/lansia.jpg', '2019-12-06 00:56:57', '2019-12-06 00:56:57'),
(10, 'Pola Makan Sehat22', 'Pola makan sehat dan seimbang sebenarnya sangat mudah karena semua orang bisa melakukannya dengan cara menjadikannya sebuah kebiasaan sehari-hari. Dengan melakukan pola makan yang sehat setiap hari tentunya akan banyak yang didapatkan, terutama dalam menjaga kesehatan tubuh. Dari sinilah polah hidup sehat juga akan tercipta pada diri kita. Kesehatan ialah sesuatu yang sangat berharga dan tidak bisa anda tukar dengan apapun. Dengan kondisi tubuh yang sehat kita memiliki lebih banyak kesempatan untuk melakukan apa saja yang kita sukai.\r\nBerikut beberapa tips mudah agar anda bisa memiliki pola makan sehat dan seimbang:\r\n\r\n1. Sayur dan Buah Segar\r\n\r\nSayur dan buah memang menjadi salah satu makanan yang paling sehat yang ada di dunia ini. Pada kedua jenis makanan tersebut hampir tidak ditemukan kandungan yang berbahaya bagi tubuh anda. Hal ini akan lebih baik lagi jika anda memilih sayuran dan buah-buahan yang segar, sehingga nutrisi yang ada di dalamnya masih benar-benar terjaga.\r\n\r\n2. Ikan dan daging\r\n\r\nSelain buah dan sayuran protein juga penting bagi tubuh kita. Konsumsi ikan laut segar atau daging segar membantu anda mendapatkan sumber protein yang penting bagi tubuh. Namun hindari terlalu banyak makan daging ya, makanlah secukupnya. Selain daging protein juga bisa diperoleh dari tumbuhan yakni protein nabati, seperti kedelai yang diolah menjadi tempe dan tahu. Jadi anda bisa mengganti menu harian anda dengan banyak macam jenis protein.\r\n\r\n3. Mengatur Jam Makan\r\n\r\nMakan pada waktu yang teratur juga menjadi bagian penting dalam pola makan sehat. Misalnya anda akan sarapan pada pukul 08.00 pagi, makan siang pada pukul 13.00 dan makan malam pada pukul 19.00. Tidak hanya baik untuk kesehatan anda, memiliki jadwal makan yang teratur juga secara tidak langsung akan membuat jadwal kegiatan yang lainnya menjadi lebih teratur karena mengikuti jam makan anda. Dengan begini hidup anda juga akan menjadi lebih baik.\r\n\r\n4. Mengkonsumsi Karbohidrat Secukupnya\r\n\r\nKarbohidrat memang menjadi salah satu sumber tenaga anda, namun bukan berarti anda harus memakannya secara berlebihan. Hal ini karena pada akhirnya karbohidrat akan diproses untuk menjadi glukosa. Dan tentu saja anda sudah mengetahui penyakit yang saat ini menjadi salah satu penyakit yang paling banyak menyerang manusia, yakni diabetes.\r\n\r\n5. Konsumsi air putih secukupnya\r\n\r\nAir putih sangat penting bagi tubuh kita, karena itu pola makan yang sehat memerlukan air putih yang cukup. Kenapa saya katakan cukup, tidak 8 gelas sehari? Karena setiap orang melakukan aktifitas yang berbeda. Karena itu anda yang bisa merasakan apakah anda memerlukan air putih yang banyak atau tidak.\r\n\r\n6. Hindari Junk Food dan Makanan Berlemak\r\n\r\nSalah satu makanan yang harus dihindari untuk menerapkan pola makan sehat ialah junk food, namun sayangnya makanan ini malah menjadi salah satu makanan yang paling populer didunia. Selain junk food, makanan berlemak juga harus anda hindari. Lemak berlebih hanya akan menghasilkan tumpukan kolesterol jahat pada tubuh anda, yang kapan saja akan menjadi ancaman berbahaya bagi tubuh anda sendiri.\r\n\r\n7. Kunyah Makanan lebih lama\r\n\r\nMengunyah makanan lebih lama akan membuat makanan dapat dengan mudah dicerna di dalam lambung sehingga kerja lambung tidak begitu berat. Dengan begitu sari sari makanan juga dapat dengan cepat dan mudah diserap oleh tubuh didalam usus halus.', 'https://tse3.mm.bing.net/th?id=OIP.B7oIPYlODB8M-0B0lfc_FwHaE8&pid=Api&P=0&w=285&h=190', '2019-12-06 01:24:27', '2019-12-06 01:24:27'),
(11, 'Cara Menjaga Kesehatan Agar Tidak Mud', 'Siapa yang mau kena serangan suatu penyakit? Tentu tidak ada. Ya, ada banyak hal yang bisa Anda lakukan untuk menjaganya. Berikut beberapa cara menjaga kesehatan tubuh yang mesti Anda lakukan.\r\n\r\n1. Makan sayuran hijau\r\nSayuran hijau dan berdaun kaya akan vitamin yang membantu Anda menjaga diet seimbang dan mendukung sistem kekebalan tubuh yang sehat.\r\n\r\nMenurut sebuah peercobaan yang dilakukan pada tikus, makan sayuran criciferous, seperti brokoli, kembang kol, dan kol, dapat membantu mengirimkan sinyal kimia ke tubuh yang meningkatkan protein pada permukaan sel yang diperlukan untuk membuat kerja sistem kekebalan tubuh lebih optimal.\r\n\r\n2. Konsumsi vitamin D\r\nKekurangan vitamin D dapat menyebabkan gejala seperti pertumbuhan tulang yang buruk, masalah jantung, dan sistem kekebalan tubuh yang lemah.\r\n\r\nMakanan yang mengandung sumber vitamin D terbaik antara lain kuning telur, jamur, ikan salmon, ikan tuna, dan hati sapi. Anda juga bisa membeli suplemen vitamin D dan pilih yang mengandung D3 (cholecalciferol), karena ini baik dalam meningkatkan kadar vitamin D dalam darah Anda.\r\n\r\nNamun sebelum mengnsumsi suplemen, sebaiknya konsultasikan hal ini pada dokter.\r\n\r\n3. Olahraga rutin\r\nTetap aktif dengan melakukan olahraga secara rutin. Anda bisa mulai dengan olahraga yang ringan seperti berjalan kaki. Olahraga dengan teratur bisa membuat Anda bugar dan langsing.\r\n\r\nSelain itu, sebuah penelitian membuktikan bahwa olahraga teratur dapat mencegah peradangan dan penyakit kronis, mengurangi stres, serta mempercepat peredaran sel darah putih dalam melawan penyakit.\r\n\r\n4. Minum teh hijau\r\nTeh hijau telah dikaitkan dengan kesehatan yang baik. Manfaat kesehatan teh hijau mungkin karena tingginya tingkat antioksidan, yang disebut flavonoid. Sehingga dapat menurunkan tekanan darah dan mengurangi risiko penyakit kardiovaskular.\r\n\r\nMaka itu, karena mudah untuk dilakukan cara menjaga kesehatan tubuh yang satu ini sudah banyak dilakukan.\r\n\r\n5. Tidur yang cukup\r\nTidur yang cukup merupakan salah satu kunci dari kekebalan tubuh yang kuat. Sebuah penelitian menunjukan bahwa orang yang tidur minimal delapan jam setiap malam selama dua minggu menunjukkan bahwa tubuh lebih kebal dari serangan virus dan kuman bakteri. Sementara, orang yang kurang dari 6 jam setiap malam akan 4 kali lebih mudah mengalami flu karena virus dibandingkan orang yang tidur 7 jam atau lebih.\r\n\r\n6. Kelola stres Anda\r\nStres sudah terbukti dapat melemahkan sistem kekebalan tubuh, sehingga membuat orang menjadi mudah terserang penyakit.\r\n\r\nKortisol membantu melawan peradangan dan penyakit. Pelepasan hormon secara konstan pada orang yang mengalami stres kronis ternyata dapat mengurangi kemampuan hormon tersebut.\r\n\r\nHal ini dapat mengakibatkan tubuh mengalami peradangan dan rentan terhadap penyakit. Jadi salah satu cara menjaga kesehatan tubuh yang tepat adalah dengan mengendalikan stres. Anda bisa coba lakukan latihan yoga atau meditasi untuk mengendalikan atau menghilangkan stres.\r\n\r\n7. Bersosialisasi dengan orang disekitar\r\nRasa kesepian sering dikaitkan sebagai pemicu dari beberapa penyakit, terutama pada orang yang baru sembuh dari operasi jantung.\r\n\r\nPenelitian yang diterbitkan dalam American Psychological Association menunjukkan bahwa isolasi sosial dapat meningkatkan stres, yang memperlambat respon kekebalan tubuh dan kemampuan untuk menyembuhkan dengan cepat.\r\n\r\n8. Menjaga kebersihan\r\nCara menjaga kesehatan lainnya adalah dengan menjaga kebersihan diri maupun lingkukan sekitar. Dengan begitu, Anda terhindar dari serangan berbagai penyakit. Berikut adalah beberapa cara menjaga kebersihan yang baik:\r\n\r\nMandi setiap hari\r\nCuci tangan Anda sebelum makan atau menyiapkan makanan, dan setelah makan.\r\nCuci tangan Anda sebelum memasukkan lensa kontak atau melakukan aktivitas lain yang membuat Anda bersentuhan dengan mata atau mulut.\r\nCuci tangan Anda selama 20 detik dan gosok di bawah kuku jari Anda.\r\nTutup mulut dan hidung Anda dengan tisu saat batuk atau bersin.\r\n9. Coba konsumsi probiotik\r\nPeneltian menunjukan bahwa orang yang mengalami stres yang mendapat probiotik, mengalami sakit dalam jangka waktu yang lebih sedikit.\r\n\r\n10. Hindari alkohol\r\nPenelitian menunjukan bahwa minum alkohol dapat merusak sel dendritik, yaitu komponen penting dari sistem kekebalan tubuh. Seiring berjalannya waktu, sering minum alkohol dapat meningkatkan seseorang terhadap infeksi bakteri dan virus.\r\n', 'https://www.solusisehatku.com/wp-content/uploads/2015/03/Tips-Untuk-Kesehatan-Tubuh.png', '2019-12-06 01:49:11', '2019-12-06 01:49:11'),
(12, 'Menjaga Kesehatan Tulang', 'Tulang adalah salah satu organ tubuh yang memiliki fungsi sangat penting. Meski berperan penting untuk menggerakan anggota tubuh, sering kali banyak orang tidak memberi perhatian khusus pada organ ini. Lantas, bagaimana cara menjaga kesehatan tulang yang mudah dilakukan?\r\nBerikut ini adalah cara menjaga kesehatan tulang yang bisa Anda lakukan, di antaranya:\r\n\r\n1. Mengatur posisi duduk\r\nCara menjaga kesehatan tulang yang sering disepelekan adalah tentang bagaimana posisi Anda duduk. Posisi duduk tidak hanya bisa membuat struktur tulang berubah, tapi juga bisa meningkatkan terjadinya kerusakan pada tulang.\r\n\r\nBiasanya, orang yang duduk dengan posisi tidak benar akan menyebabkan gangguan seperti pegal, nyeri, dan gangguan lainnya pada tulang bagian belakang. Oleh karena itu, lakukanlah posisi duduk yang baik dengan cara tegak (tidak bungkuk) dan kedua kaki menapak lantai.\r\n\r\n2. Perbanyak kalsium dan vitamin D\r\nCara memelihara kesehatan tulang berikutnya adalah dengan memperbanyak kalsium dan vitamin D. Kedua hal tersebut adalah nutrisi penting yang sangat dibutuhkan oleh tulang untuk membuatnya lebih sehat dan kuat. Kedua nutrisi tersebut juga sangat mudah didapatkan dari keju, kedelai, susu, salmon, sarden, telur dan yoghurt. Selain dari makanan, vitamin D juga dapat dibentuk di dalam tubuh dengan bantuan sinar matahari.\r\n\r\nPerlu Anda ketahui, asupan kalsium yang dibutuhkan orang dewasa adalah 1.000 miligram per hari, sedangkan vitamin D yang dibutuhkan sekitar 200 IU. Namun saat Anda memasuki usia di atas 50 tahun, maka asupan kalsium menjadi 1200 miligram dan 400-600 IU vitamin D per hari.\r\n\r\n3. Jalan kaki\r\nSalah satu cara menjaga kesehatan tulang yang paling mudah adalah dengan rutin berjalan kaki. Dengan jalan kaki setiap hari, struktur serta kepadatan tulang akan membaik. Cobalah untuk berjalan kaki sejauh 1 km setiap hari. Jarak tersebut adalah jarak yang cukup dekat bagi ukuran olahraga jalan kaki. Jika dirasa kurang, Anda bisa menambahnya namun dengan batas wajar dan tidak sampai terlalu lelah.\r\n\r\nSelain aktivitas fisik seperti berjalan kaki, hal penting lain untuk menjaga kesehatan tulang adalah dengan yoga, bersepeda, atau olahraga ringan lainnya. Apabila tubuh Anda jarang bergerak dalam jangka waktu yang lama, hal itu bisa mengacam kesehatan tulang.\r\n\r\n4. Penuhi kebutuhan protein\r\nFakta menunjukkan bahwa sekitar 50 persen tulang terbuat dari protein. Jika Anda ingin memiliki tulang yang kuat dan sehat, karenanya Anda harus memenuhi kebutuhan protein dengan baik. Asupan protein yang rendah bisa mengurangi penyerapan kalsium pada tulang. Kondisi ini membuat tulang menjadi rapuh dan pembentukan tulang terhambat.\r\n\r\n5. Konsumsi sayuran\r\nBrokoli, kubis dan beberapa sayuran lainnya dipercaya dapat mencegah kerusakan tulang. Bahkan, sayuran-sayuran yang mengandung vitamin C juga bisa merangsang sel-sel pembentuk tulang dan melindunginya dari kerusakan.\r\n\r\n6. Hindari alkohol dan rokok\r\nCara menjaga kesehatan tulang lainnya adalah menghindari alkohol dan rokok. Alkohol dan rokok dapat membawa pengaruh buruk pada tulang. Sebuah penelitian mengungkapkan, seorang pecandu alkohol lebih berisiko terkena osteoporosis. Sementara aktivitas merokok bisa mengganggu penyerapan kalsium.\r\n\r\n7. Olahraga angkat beban\r\nSalah satu jenis olahraga terbaik untuk menjaga kesehatan tulang adalah dengan latihan menahan beban. Pasalnya, cara yang satu ini dapat mendorong pembentukan tulang yang baru dan mencegah pengeroposan tulang.\r\n\r\n8. Hindari diet rendah kalori\r\nSelain menghambat proses metabolisme tubuh dan membuat Anda lebih lapar, diet rendah kalori adalah sesuatu yang berisiko karena bisa membahayakan kesehatan tulang dan menyebabkan hilangnya massa otot. Menjalankan diet rendah kalori justru membuat kepadatan tulang berkurang.\r\n\r\n9. Konsumsi suplemen kolagen\r\nSuplemen kolagen dipercaya dapat melindungi kesehatan tulang. Kolagen adalah protein utama yang ada pada tulang. Kolagen sendiri mengandung asam amino, lisin, prolin dan glisin, yang membantu menjaga kesehatan tulang. Meski begitu, cara ini perlu untuk diteliti lebih lanjut.\r\n\r\n10. Sertakan makanan tinggi magnesium dan seng\r\nKalsium bukan satu-satunya mineral yang penting untuk kesehatan tulang. Beberapa mineral lainnya juga berperan, termasuk magnesium dan seng. Magnesium memainkan peran penting dalam mengubah vitamin D menjadi bentuk aktif yang meningkatkan penyerapan kalsium\r\n\r\n11. Tidur pada posisi yang benar\r\nCara menjaga kesehatan tulang yang sering kali luput dari perhatian adalah mengenai posisi tidur. Kondisi kasur yang keras dan tidak nyaman berpotensi menimbulkan gejala pegal-pegal dan berujung rasa nyeri di bagian tulang. Menjaga kesehatan tulang bisa dilakukan dengan menggunakan tempat tidur yang empuk dan nyaman.', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTe9LoycXd-ToWHMPFKpd6iKN7bLfV385FPObXcuvYWenvoCa2B', '2019-12-06 01:49:16', '2019-12-06 01:49:16'),
(19, 'SIMBAH BERJUANG', '12345668', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTxMT0vrVdU4HXSXdrumgmN9n7SmEkzn-z_LVzAa8j5ize-ck8juPYg3k&s', '2019-12-15 06:55:15', '2019-12-15 06:55:15'),
(20, 'SEHAT ALA DOKTER MARINA', 'bvhcxfgsrgstdgcnvh', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTxMT0vrVdU4HXSXdrumgmN9n7SmEkzn-z_LVzAa8j5ize-ck8juPYg3k&s', '2019-12-15 06:55:30', '2019-12-15 06:55:30'),
(21, 'sayaaaaa', 'adfjhkhkj,n', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTxMT0vrVdU4HXSXdrumgmN9n7SmEkzn-z_LVzAa8j5ize-ck8juPYg3k&s', '2019-12-15 06:55:54', '2019-12-15 06:55:54');

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `id` int(11) NOT NULL,
  `nama` varchar(150) NOT NULL,
  `email` varchar(150) NOT NULL,
  `gambar` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`id`, `nama`, `email`, `gambar`, `created_at`, `updated_at`) VALUES
(1, 'dr.Hikmah', '17523096@students.uii.ac.id', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKVEZLeDYho9AKdn89bIiTeSprp51JR5qsN8cz-EOxYQxkwlJT&s', '2019-12-06 01:06:57', '0000-00-00 00:00:00'),
(2, 'dr.Raisha', '17523148@students.uii.ac.id', 'https://cdn.idntimes.com/content-images/post/20171024/22159307-136343310328956-6975121996459802624-n-30892d87415453de65d4e01ee22abe2c.jpg', '2019-12-10 03:23:57', '0000-00-00 00:00:00'),
(3, 'dr.Dewi', '17523235@students.uii.ac.id', 'https://cdns.klimg.com/dream.co.id/resources/photonews/2014/08/29/4311/664xauto-kumpulan-dokter-cantik-di-indonesia-banyak-yang-berhijab-1408298-002-rev3.jpg', '2019-12-10 03:24:18', '0000-00-00 00:00:00'),
(4, 'dr.Diah', '17523146@students.uii.ac.id', 'https://akcdn.detik.net.id/community/media/visual/2017/08/04/2e543f96-1c04-46fa-8d82-c4a3d52f4a49_916.jpg?w=770&q=90', '2019-12-10 03:24:35', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(45) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nama`, `username`, `password`, `created_at`, `updated_at`) VALUES
(1, 'Raisha', 'raisha', 'raisha', '2019-12-04 14:20:09', '2019-12-04 14:20:09');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `artikel`
--
ALTER TABLE `artikel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `artikel`
--
ALTER TABLE `artikel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
