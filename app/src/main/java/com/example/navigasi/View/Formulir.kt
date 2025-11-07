package com.example.navigasi.View

import androidx.annotation.OptIn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    Jenis:List<String> = listOf("laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){

