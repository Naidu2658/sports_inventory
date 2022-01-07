package com.example.sports_inventory.database.sp

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class spo(
    @PrimaryKey val id: Int,
    @NonNull @ColumnInfo(name = "type") val stopName: String,
@NonNull @ColumnInfo(name = "total") val total: Int,
    @NonNull @ColumnInfo(name = "avilable") val available: Int,
)
