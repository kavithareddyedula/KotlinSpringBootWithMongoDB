package com.healthcare.service


import com.healthcare.model.Claim
import com.healthcare.repository.ClaimRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClaimService(val repository:ClaimRepository) {
/// with in the contrctor .. the repository interface will be autowired

    ///@Autowired -->
    fun creatAClaim(claim:Claim):Claim{
        return repository.save(claim)  /// insert SQL query will be created automatically by MongoDB repository operations intervface
    }

}
