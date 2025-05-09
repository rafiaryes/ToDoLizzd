package com.rafiarya0114.todolizzd.ui.screen

import androidx.lifecycle.ViewModel
import com.rafiarya0114.todolizzd.model.Task

class MainViewModel : ViewModel() {
    val data = listOf(
        Task(1, "Assessment 2 Mobpro", "buset assessment skrg ini susah bet coyyyy", "Tinggi", false),
        Task(2, "Tugas Akhir PAB", "Deadline minggu depan, harus buru-buru!", "Rendah", true),
        Task(3, "Ngoding Jetpack Compose", "Belajar layout sama state management", "Sedang", false),
        Task(4, "Review Materi Kotlin", "Fokus di lambda expression sama coroutine", "Tinggi", false),
        Task(5, "Project UTS GameDev", "Poker Royale harus selesai minggu ini", "Rendah", true),
        Task(6, "Daily Standup HIMADIRA", "Persiapan agenda minggu depan", "Sedang", false),
        Task(7, "Revisi Proposal KP", "Komentar dospem banyak banget woy", "Tinggi", false),
        Task(8, "Ngumpulin LP Praktikum", "Laporan minggu ke-5 belum dikumpul", "Rendah", true),
        Task(9, "Ngoding bareng temen", "Biar ga suntuk ngoding sendirian", "Sedang", false),
        Task(10, "Survey topik skripsi", "Masih bingung ambil yang mana", "Tinggi", false)
    )

    fun getTask(id: Long): Task?{
        return  data.find { it.id == id }
    }
}