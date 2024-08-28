package com.healthcare.model


import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field


@Document("Claim")
data class Claim(
    @Id
    val id: ObjectId = ObjectId(), // try to map with mongodb data type
    @Field("claimAmount")
    val claimAmount: Double,
    @Field("claimType")
    val claimType: String,
    @Field("issueDescription")
    val issueDescription: String
)
