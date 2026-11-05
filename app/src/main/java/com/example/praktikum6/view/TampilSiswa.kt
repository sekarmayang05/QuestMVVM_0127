package com.example.praktikum6.view

import androidx.compose.runtime.Composable
import com.example.praktikum6.model.Siswa

@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit
){
    val items = listOf(
        Pair("Nama", statusUiSiswa.nama),
        Pair("Jenis Kelamin", statusUiSiswa.gender),
        Pair("Alamat", statusUiSiswa.alamat)
    )

}