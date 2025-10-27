#  Tugas 2 – Modul 3
**Program Simulasi Tiket Taksi (TaxiTicket Program)**

##  Deskripsi Program
Program ini merupakan implementasi **konsep OOP (Object-Oriented Programming)** dalam bahasa **Java**, yang menampilkan sistem sederhana untuk memproses **tiket perjalanan taksi**.  
Melalui program ini, pengguna dapat melihat detail tiket, memeriksa status perjalanan, menampilkan rute, serta melakukan simulasi perubahan kecepatan (menambah atau mengurangi kecepatan taksi).

## ️ Struktur Program
Package: `Tugas2_Modul3`  


### Penjelasan Kelas:
1. **TicketInfo**
    - Menyimpan data dasar tiket: nama penumpang, titik awal, tujuan, dan jarak tempuh.
    - Berperan sebagai *data model*.

2. **TaxiTicket**
    - Kelas utama yang mengatur logika tiket taksi.
    - Atribut: tarif per km, kecepatan rata-rata, dan waktu tempuh.
    - Metode penting:
        - `detailedInfo()` — Menampilkan informasi tiket lengkap.
        - `checkStatus()` — Menampilkan status perjalanan.
        - `displayRoute()` — Menampilkan rute dari titik awal ke tujuan.
        - `displayEstimatedDurationD()` — Menghitung estimasi waktu perjalanan.
        - `sLowDown(int value)` dan `speedUp(int value)` — Simulasi perubahan kecepatan.

3. **MainApp**
    - Sebagai *driver class* yang menjalankan program.
    - Membuat objek `TaxiTicket` dari `TicketInfo` dan menjalankan semua metode simulasi.

Contoh kode di `MainApp.java`:
```java
TaxiTicket ticket = new TaxiTicket(
    new TicketInfo("Alisah", "Downtown", "Airport", 50.0),
    30.0, 60.0
);

ticket.detailedInfo();
ticket.checkStatus();
ticket.displayRoute();
ticket.displayEstimanatedDurationD();

// Simulasi kecepatan
ticket.sLowDown(20);
ticket.speedUp(15);
