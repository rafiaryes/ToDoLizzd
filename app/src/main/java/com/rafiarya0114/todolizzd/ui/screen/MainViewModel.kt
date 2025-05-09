package com.rafiarya0114.todolizzd.ui.screen

import androidx.lifecycle.ViewModel
import com.rafiarya0114.todolizzd.model.Task

class MainViewModel : ViewModel() {
    val data = listOf(
        Task(1, "Assessment 2 Mobpro", "buset assessment skrg ini susah bet coyyyy", 1, false),
        Task(2, "Tugas Akhir PAB", "Deadline minggu depan, harus buru-buru!", 3, true),
        Task(3, "Ngoding Jetpack Compose", "Belajar layout sama state management", 2, false),
        Task(4, "Review Materi Kotlin", "Fokus di lambda expression sama coroutine", 1, false),
        Task(5, "Project UTS GameDev", "Poker Royale harus selesai minggu ini", 3, true),
        Task(6, "Daily Standup HIMADIRA", "Persiapan agenda minggu depan", 2, false),
        Task(7, "Revisi Proposal KP", "Komentar dospem banyak banget woy", 1, false),
        Task(8, "Ngumpulin LP Praktikum", "Laporan minggu ke-5 belum dikumpul", 3, true),
        Task(9, "Ngoding bareng temen", "Biar ga suntuk ngoding sendirian", 2, false),
        Task(10, "Survey topik skripsi", "Masih bingung ambil yang mana", 1, false)
    )
}