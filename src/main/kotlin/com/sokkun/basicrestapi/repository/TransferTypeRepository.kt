package com.sokkun.basicrestapi.repository

import com.sokkun.basicrestapi.model.TransferType
import org.springframework.data.jpa.repository.JpaRepository

interface TransferTypeRepository : JpaRepository<TransferType, Long>