package com.example.flo

import java.util.*

// 앨범 데이터 클래스
data class Album(
    var title: String? = "",
    var singer: String? = "",
    var coverImg: Int? = null,
    var songs: ArrayList<Song>? = null
)