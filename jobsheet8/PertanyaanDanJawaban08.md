Pertanyaan 2.1

1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?

Jawaban :
Program akan mencetak bintang (*) lebih banyak satu kali dari sebelumnya (menjadi n+1 kali). Hal ini terjadi karena perulangan dimulai dari angka 0 sampai n, sehingga jumlah putarannya bertambah satu.

2. Jika pada perulangan for, kondisi i<=n diubah menjadi i<n, bagaimana bentuk outputnya jika input n=5? Mengapa hasilnya berbeda?

Jawaban :
Output bintang yang muncul hanya 4 buah (****). Hasilnya berbeda karena kondisi i < 5 artinya perulangan akan berhenti sebelum angka 5, jadi angka 5 tidak ikut dihitung.

3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian?

Jawaban :
Program tidak akan menampilkan apa-apa (kosong). Alasannya karena sejak awal kondisinya sudah salah (1 tidak lebih besar dari 5), jadi perulangan tidak pernah dijalankan sama sekali.

4. Jika pada perulangan for, kondisi step i++ diubah menjadi i--, apa akibatnya? Mengapa bisa demikian?

Jawaban :
Akan terjadi infinite loop atau perulangan tanpa henti. Ini karena nilai i akan terus berkurang (menjadi 0, -1, -2, dst) dan kondisinya akan selalu dianggap benar karena nilainya selalu kurang dari n.

5. Jika pada perulangan for, step i++ diubah menjadi i+=2 bagaimana pola outputnya jika input n=6? Apa yang menyebabkan perubahan tersebut?

Jawaban :
Bintang yang muncul hanya 3 buah. Ini terjadi karena setiap kali perulangan, nilai i langsung bertambah 2 (lompat angka), yaitu 1, 3, dan 5.

Pertanyaan 2.2

1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter = 1 diubah menjadi iOuter = 0, apa yang akibatnya? Mengapa bisa demikian?

Jawaban :
Jumlah baris ke bawah akan bertambah satu. Ini karena perulangan luar (outer loop) yang mengatur baris dimulai dari 0, jadi hitungannya nambah satu kali.

2. Kembalikan program semula dimana inisialisasi iOuter = 1. Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i = 1 diubah menjadi i = 0, apa yang akibatnya? Mengapa bisa demikian?

Jawaban :
Jumlah bintang ke samping akan bertambah satu per barisnya. Ini karena perulangan dalam (inner loop) dimulai dari 0, jadi proses cetak bintangnya nambah satu kali.

3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?

Jawaban :
Perulangan luar (outer loop) gunanya untuk mengatur ganti baris atau urutan vertikal. Sedangkan perulangan dalam (inner loop) gunanya untuk mencetak bintang ke samping atau urutan horizontal dalam satu baris itu.

4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?

Jawaban :
Perintah itu gunanya untuk memberi Enter atau pindah ke baris baru setelah selesai mencetak bintang di satu baris. Kalau dihapus, semua bintang akan tercetak terus ke samping jadi satu baris panjang dan tidak membentuk kotak.

Pertanyaan 2.3

1. Perhatikan, apakah output yang dihasilkan dengan nilai n = 5 sesuai dengan tampilan berikut?

Jawaban :
Ya, outputnya sudah sesuai membentuk segitiga siku-siku.

2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.

Jawaban :
Kode program sudah benar dan tidak ada yang perlu diperbaiki.

4. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?

Jawaban :
Variabel i berperan menentukan kita sedang di baris ke berapa dan membatasi jumlah bintang. Variabel j berperan melakukan perulangan cetak bintangnya. Nilai j harus dikembalikan ke 0 supaya saat pindah ke baris baru, hitungan bintangnya mulai lagi dari awal. Kalau tidak di-reset, hitungannya jadi kacau dan bintangnya tidak sesuai pola.

Pertanyaan 2.4

1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total=0) berada di dalam outer loop, bukan di luar.

Jawaban :
Variabel totalNilai dikosongkan lagi jadi 0 setiap kali ganti kelompok. Inisialisasi harus di dalam loop supaya nilai kelompok sebelumnya tidak ikut terbawa ke kelompok yang baru. Kalau ditaruh di luar, nanti nilai semua kelompok malah dijumlahkan semua.

2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut.

Jawaban :
Untuk mencari nilai tertinggi, saya menambahkan variabel baru di luar loop untuk menyimpan nilai maksimal. Lalu di dalam loop, saya pakai if untuk mengecek apakah rata-rata kelompok sekarang lebih tinggi dari nilai maksimal yang tersimpan. Kodenya sudah saya kerjakan di file latihan.