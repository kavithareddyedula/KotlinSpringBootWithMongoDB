package com.healthcare.repository



import com.healthcare.model.Claim
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ClaimRepository:MongoRepository<Claim,String>  {
    //  HQL --> auto genared
    // save === insert
    // find == get
}