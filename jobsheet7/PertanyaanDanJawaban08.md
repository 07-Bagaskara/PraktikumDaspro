Pertanyaan 2.1

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!

Jawaban : Inisialisasi: int i = 1; (nilai awal), Kondisi: i <= 10; (syarat berjalan), Update: i++ (penambahan nilai).

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?

Jawaban : Agar perbandingan berjalan benar. Nilai input pasti > 0 sehingga akan menggantikan 0, dan nilai input pasti < 100 sehingga akan menggantikan 100. Jika dibalik, logika error karena kondisi if tidak akan pernah terpenuhi (nilai input tidak mungkin > 100 atau < 0), sehingga nilai tertinggi tetap 100 dan terendah tetap 0.

3. Jelaskan fungsi dan alur kerja dari potongan kode if (nilai > tertinggi) dan if (nilai < terendah)!

Jawaban : if (nilai > tertinggi) mengecek apakah nilai baru lebih besar dari nilai tertinggi saat ini; jika ya, variabel tertinggi diupdate. if (nilai < terendah) mengecek apakah nilai baru lebih kecil dari nilai terendah saat ini; jika ya, variabel terendah diupdate.

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).

Jawaban : Tambahkan variabel int lulus = 0, tidakLulus = 0; lalu di dalam loop tambahkan logika: if (nilai >= 60) { lulus++; } else { tidakLulus++; }.

Pertanyaan 2.2

1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut: a. nilai < 0 || nilai > 100 b. continue

Jawaban : a. Validasi rentang nilai (mencegah input negatif atau lebih dari 100). b. continue berfungsi melewati sisa kode di bawahnya dalam iterasi saat ini dan memaksa program langsung kembali ke awal loop untuk meminta input ulang tanpa menambah i.

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?

Jawaban : Agar variabel i bertambah setelah data mahasiswa saat ini selesai diproses. Jika ditaruh di awal, urutan i akan lompat (misal data pertama langsung dianggap ke-2) atau jumlah perulangan efektif berkurang, menyebabkan output data tidak sinkron.

3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?

Jawaban : Perulangan akan berjalan sebanyak 19 kali.

4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!

Jawaban : Tambahkan baris System.out.println("Bagus, pertahankan nilainya!"); di dalam blok if (nilai > 80 && nilai <= 100).

Pertanyaan 2.3

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah "batal", maka berapa kali perulangan dilakukan?

Jawaban : Perulangan dilakukan 1 kali (masuk loop, cek input, lalu break).

2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!

Jawaban : Kondisi berhenti dipicu oleh perintah break yang dieksekusi ketika kondisi if (namaPelanggan.equalsIgnoreCase("batal")) bernilai true.

3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?

Jawaban : Untuk membuat infinite loop (perulangan tak terbatas) yang sengaja dirancang agar terus berjalan sampai user memberikan input tertentu untuk memicu break.

4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?

Jawaban : Karena perulangan ini menggunakan sentinel control (berhenti berdasarkan nilai input tertentu/event), bukan counter control (berdasarkan hitungan angka), sehingga tidak memerlukan variabel inisialisasi atau increment i++.