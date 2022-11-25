package com.ivan.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Car(
    val name: String,
    val description: String,
    val imageUrl: String
)
