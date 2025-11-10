Pertanyaan 2.1

1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?

Jawaban : Program akan error (kompilasi gagal) karena angka 5.0 dan 7.5 adalah bilangan pecahan (tipe data double), sedangkan array bil dideklarasikan bertipe int.
Java tidak bisa otomatis mengubah double menjadi int tanpa konversi eksplisit (casting).

2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.

Jawaban : 

3. Ubah statement pada langkah No 4 menjadi seperti berikut Apa keluaran dari program? Jelaskan maksud dari statement tersebut.

Jawaban : Keluaran program adalah daftar nilai array tanpa keterangan indeks.

4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

Jawaban : Program akan error “ArrayIndexOutOfBoundsException” karena indeks array di Java dimulai dari 0 dan berakhir di bil.length - 1 (yaitu 3).
Saat i = 4, program mencoba mengakses bil[4], yang tidak ada.

Pertanyaan 2.2

1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:

Jawaban: Ya, terjadi error saat runtime (ArrayIndexOutOfBoundsException).
Karena <= membuat perulangan berjalan satu langkah lebih banyak dari jumlah elemen yang ada.
Indeks terakhir yang valid adalah length - 1.

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?

Jawaban : Kondisi ini memastikan perulangan berjalan sebanyak jumlah elemen array (dari 0 hingga length - 1).
Dengan begitu, tidak akan ada kesalahan indeks di luar batas array.

3. Ubah statement langkah nomor 6 menjadi menampilkan nilai mahasiswa yang lulus saja (nilai > 70). Jelaskan alur program!

Jawaban :
Program akan menampilkan hanya nilai mahasiswa yang lebih besar dari 70.
Alurnya:
Program menerima input nilai mahasiswa.
Setiap nilai dicek dengan if (nilaiAkhir[i] > 70).
Jika benar, nilai tersebut ditampilkan sebagai mahasiswa yang lulus.

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa.

Jawaban : Program akan menampilkan seluruh nilai beserta statusnya:

Pertanyaan 2.3 

1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70).


2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini:


Pertanyaan 2.4 

1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas

Jawaban : break; digunakan untuk menghentikan perulangan setelah nilai yang dicari ditemukan, sehingga program tidak perlu melanjutkan pencarian ke elemen berikutnya.
2. Modifikasi program agar dapat menerima input banyaknya elemen array, isi array, dan nilai (key) yang ingin dicari.

. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil program:



3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut


    