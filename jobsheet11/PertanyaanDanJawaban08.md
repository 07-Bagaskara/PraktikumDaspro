Pertanyaan 2.1

1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
Jawaban: Tidak harus. Kita bisa mengisi elemen array pada indeks manapun secara acak asalkan indeks tersebut masih berada dalam jangkauan ukuran array yang telah dibuat. Namun, indeks yang dilewati atau belum diisi akan memiliki nilai default (null untuk String).

2. Mengapa terdapat null pada daftar nama penonton?
Jawaban: Karena elemen array pada indeks tersebut belum diinisialisasi atau belum diisi dengan data nama penonton. Secara default, array tipe data objek seperti String akan berisi null jika belum diisi.

3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut.
Jawaban: Sudah diimplementasikan langsung di dalam kode program.

4. Jelaskan fungsi dari penonton.length dan penonton[0].length!
Jawaban: penonton.length berfungsi untuk mengetahui jumlah baris (total elemen utama) dari array. Sedangkan penonton[0].length berfungsi untuk mengetahui jumlah kolom (panjang elemen) yang ada pada baris ke-0.

5. Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
Jawaban: Ya, nilainya sama yaitu 2. Hal ini karena saat inisialisasi awal new String[4][2], kita menetapkan bahwa setiap baris memiliki kapasitas kolom yang sama.

6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan for loop.
Jawaban: Sudah diimplementasikan pada kode program.

7. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop.
Jawaban: Sudah diimplementasikan pada kode program.

8. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop.
Jawaban: Sudah diimplementasikan pada kode program.

9. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop.
Jawaban: Sudah diimplementasikan pada kode program.

10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
Jawaban: Kelebihan foreach adalah sintaksnya lebih ringkas, mudah dibaca, dan meminimalkan kesalahan indeks. Kekurangannya adalah kita tidak bisa mengakses indeks secara langsung, sehingga sulit jika ingin mengubah nilai elemen tertentu atau memproses array dengan urutan yang tidak biasa.

11. Berapa indeks baris maksimal untuk array penonton?
Jawaban: Indeks maksimal baris adalah 3 (karena panjang baris 4, indeks dimulai dari 0 sampai 3).

12. Berapa indeks kolom maksimal untuk array penonton?
Jawaban: Indeks maksimal kolom adalah 1 (karena panjang kolom 2, indeks dimulai dari 0 sampai 1).

13. Apa fungsi dari String.join()?
Jawaban: String.join() berfungsi untuk menggabungkan elemen-elemen string menjadi satu teks utuh dengan memberikan tanda pemisah (delimiter) tertentu di antara setiap elemennya, misalnya koma atau spasi.

---------------------------------------------------------

Pertanyaan 2.2

1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
Jawaban: Tidak harus. Pengguna bebas memilih baris dan kolom mana saja yang ingin diisi terlebih dahulu sesuai input yang dimasukkan, selama nomor baris dan kolom tersebut valid.

2. Modifikasi kode program untuk memberikan opsi menu.
Jawaban: Sudah diimplementasikan pada kode program BioskopWithScanner08.java.

3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia.
Jawaban: Sudah diimplementasikan dengan logika if-else untuk validasi range indeks.

4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi.
Jawaban: Sudah diimplementasikan dengan mengecek apakah nilai array tidak null sebelum mengisi data.

5. Pada menu 2, jika kursi kosong, ganti null dengan ***.
Jawaban: Sudah diimplementasikan saat menampilkan daftar penonton.

---------------------------------------------------------

Pertanyaan 2.3

1. Tambahkan kode program sebagai berikut.
Jawaban: Sudah ditambahkan pada file Numbers08.java.

2. Apa fungsi dari Arrays.toString()?
Jawaban: Arrays.toString() adalah method bantuan di Java untuk mengubah isi array menjadi bentuk teks (String) agar mudah dibaca dan dicetak ke layar.

3. Apa nilai default untuk elemen pada array dengan tipe data int?
Jawaban: Nilai default untuk tipe data int adalah 0.

4. Tambahkan kode program berikut.
Jawaban: Sudah ditambahkan pada file Numbers08.java.

5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?
Jawaban: Tidak bisa. Di Java, panjang array bersifat tetap (fixed) setelah dibuat. Kita tidak bisa menambah atau mengurangi ukurannya secara langsung. Jika ingin ukuran berbeda, harus membuat array baru.

---------------------------------------------------------

Pertanyaan 2.4

1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah yang dinamis.
Jawaban: Kita harus mengganti inisialisasi array yang statis (new int[4][3]) menjadi dinamis menggunakan variabel input dari user. Saya sudah memodifikasinya menjadi new int[jmlSiswa][jmlMatkul] pada file SIAKAD08.java agar fleksibel mengikuti input pengguna.