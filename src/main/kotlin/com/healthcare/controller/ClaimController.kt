package com.healthcare.controller

import com.healthcare.model.Claim
import com.healthcare.service.ClaimService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class ClaimController(val service: ClaimService) {


    @PostMapping(value= arrayOf("create"),consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun creatAClaim(@RequestBody claim: Claim): ResponseEntity<Claim> {
        var claimLocal =
            service.creatAClaim(claim)  /// insert SQL query will be created automatically by CRUD operations intervface
        return ResponseEntity<Claim>(claimLocal, HttpStatus.OK)
    }

}