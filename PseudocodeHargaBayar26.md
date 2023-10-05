Algoritma: Harga_Bayar_26
{dibaca harga barang dan jumlah baran dan piranti masukan. Hitunglah jumlah diskon dan harga barang}

Deklarasi:
harga, jumlah, jmlHlmBuku : int
dis=0.2, total, bayar, jmlDis : double
merkBuku : string

Deskripsi:
1. print "Masukkan merkBuku yang dibeli"
2. read merkBuku
3. print "Masukkan jmlHlmBuku yang dibeli"
4. read jmlHlmBuku
5. print "Masukkan harga barang yang dibeli"
6. read harga
7. print "Masukkan jumlah barang yang dibeli"
8. read jumlah
9. total = harga * jumlah
10. jmlDis = total * dis
11. bayar = total - jmlDis
12. print "Diskon yang anda dapatkan adalah"
13. print jmlDis
14. print "Jumlah yang harus dibayar adalah"
15. print bayar