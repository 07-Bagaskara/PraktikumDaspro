Pertanyaan dan Jawaban Jobsheet 12 - Fungsi 1

Pertanyaan Percobaan 1

1. Apakah fungsi tanpa parameter selalu harus bertipe void?
Jawaban: Tidak selalu, Bapak/Ibu. Fungsi tanpa parameter juga bisa mengembalikan nilai (seperti angka atau teks) jika memang tujuannya untuk memberikan hasil tertentu, bukan sekadar melakukan perintah.

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
Jawaban: Bisa, Bapak/Ibu. Caranya adalah dengan memindahkan semua tulisan daftar menu yang ada di dalam fungsi Menu langsung ke dalam fungsi main.

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
Jawaban: Keuntungannya adalah agar kode program kita terlihat lebih rapi dan tidak berantakan. Selain itu, jika kita ingin menampilkan menu berkali-kali, kita cukup memanggil nama fungsinya saja, tidak perlu menulis ulang daftar menunya dari awal.

4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).
Jawaban: Pertama, program akan mulai berjalan dari main. Saat bertemu panggilan fungsi Menu, program akan melompat ke bagian kode fungsi Menu tersebut. Program lalu menjalankan semua perintah di dalamnya (menampilkan menu). Setelah selesai, program akan kembali lagi ke main untuk melanjutkan perintah berikutnya.

Pertanyaan Percobaan 2

1. Apakah kegunaan parameter di dalam fungsi?
Jawaban: Parameter berguna sebagai tempat untuk menitipkan data ke dalam fungsi. Dengan parameter, fungsi bisa bekerja dengan data yang berubah-ubah sesuai dengan apa yang kita berikan saat memanggilnya.

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
Jawaban: Karena nama pelanggan dan status member setiap orang itu berbeda-beda. Jadi, fungsi perlu menerima data tersebut agar bisa menyapa nama yang benar dan memberikan diskon yang sesuai untuk orang tersebut.

3. Apakah parameter sama dengan variabel? Jelaskan.
Jawaban: Hampir sama, Bapak/Ibu. Bedanya, parameter adalah variabel yang letaknya ada di pintu masuk fungsi (di dalam kurung) untuk menerima data dari luar. Sedangkan variabel biasa dibuat di dalam fungsi untuk menyimpan data sementara.

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
Jawaban: Cara kerjanya adalah dengan dicek menggunakan perintah if. Jika isMember bernilai true (benar), maka program akan menampilkan pesan diskon. Jika bernilai false (salah), pesan diskon tidak akan muncul.

5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
Jawaban: Program akan error dan tidak bisa dijalankan. Hal ini karena fungsi sudah meminta dua data (nama dan status member), tetapi kita tidak memberikannya, sehingga fungsi bingung.

7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah Budi, pelanggan tersebut member, dan menggunakan kode promo DISKON30, tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
Jawaban: Menu("Budi", true, "DISKON30");

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan? Jelaskan.
Jawaban: Iya, sangat membantu. Kita jadi tahu data apa saja yang dibutuhkan oleh fungsi tersebut agar bisa bekerja. Jika nanti ada perubahan data pelanggan, kita cukup mengganti data saat memanggilnya saja tanpa membongkar isi fungsinya.

Pertanyaan Percobaan 3

1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai.
Jawaban: Fungsi butuh nilai kembalian (return) kalau kita ingin hasil hitungannya dipakai lagi untuk proses lain. Fungsi tidak butuh kembalian (void) kalau tugasnya hanya sekadar menampilkan sesuatu ke layar dan selesai.

2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga... Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter.
Jawaban: Tipe datanya adalah int (bilangan bulat). Dua parameternya adalah pilihanMenu (untuk tahu menu nomor berapa yang dipesan) dan banyakItem (untuk tahu berapa jumlah porsi yang dibeli).

Pertanyaan Percobaan 4

1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung!
Jawaban: Itu disebut Varargs. Tujuannya agar fungsi tersebut bisa menerima banyak nama sekaligus, bisa satu nama, dua nama, atau lebih, tanpa dibatasi jumlahnya. Nanti data-data itu akan dianggap sebagai kumpulan data (array).

3. Bisakah menggunakan dua tipe data varargs dalam satu fungsi? Jelaskan dan berikan contohnya!
Jawaban: Tidak bisa, Bapak/Ibu. Satu fungsi hanya boleh punya satu parameter varargs, dan letaknya harus paling belakang. Kalau ada dua, komputer akan bingung membedakan mana data untuk varargs pertama dan mana untuk yang kedua.

4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen.
Jawaban: Program tidak akan error dan tetap berjalan. Namun, karena tidak ada nama yang dikirim, program hanya akan menampilkan judulnya saja, lalu selesai tanpa menampilkan nama siapa pun.

Pertanyaan Percobaan 5

1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
Jawaban: Pertama, kita memasukkan angka panjang, lebar, dan tinggi. Lalu program memanggil fungsi hitungLuas untuk mencari luas dan menampilkannya. Setelah itu, program memanggil fungsi hitungVolume. Di dalam fungsi volume ini, ia minta tolong lagi ke fungsi hitungLuas. Setelah ketemu hasilnya, baru dikalikan tinggi, dan hasil akhirnya ditampilkan.

2. Tuliskan output yang dihasilkan program jika panjang=4, lebar=3, tinggi=5. Jelaskan alur jalannya.
Jawaban: Outputnya adalah Luas Persegi Panjang adalah 12 dan Volume Balok adalah 60. Alurnya: Luas dihitung dari 4 dikali 3 hasilnya 12. Volume dihitung dari luas tadi (12) dikali tinggi (5), jadi hasilnya 60.

3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
Jawaban: Outputnya angka 12345. Alurnya: Pertama hitung 1 tambah 1 hasilnya 2. Lalu hasil 2 itu ditambah 5 hasilnya 7. Terakhir, program akan menampilkan angka urut dari 1 sampai 7 (1234567). Namun jika melihat soal yang mungkin tercetak 5 angka saja, berarti perulangan berhenti di angka 5.

4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah harus memiliki nilai kembalian?
Jawaban: Kita pakai parameter kalau fungsi butuh bahan dari luar untuk diolah. Kita pakai nilai kembalian kalau hasil olahannya mau kita simpan atau pakai lagi untuk hitungan selanjutnya.

5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume.
Jawaban: Fungsi hitungLuas dan hitungVolume wajib pakai parameter karena rumus luas dan volume butuh angka panjang, lebar, dan tinggi. Kalau tidak pakai parameter, fungsinya jadi tidak berguna karena hanya bisa menghitung satu ukuran yang itu-itu saja.

6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value)... mengacu pada fungsi main, hitungLuas, dan hitungVolume.
Jawaban: Fungsi hitungLuas dan hitungVolume sebaiknya punya nilai kembalian agar hasil hitungannya (angka) bisa diambil dan ditampilkan dengan kalimat yang rapi di fungsi main. Sedangkan fungsi main tidak perlu nilai kembalian karena dia adalah bos yang menjalankan program, bukan yang melayani hitungan.