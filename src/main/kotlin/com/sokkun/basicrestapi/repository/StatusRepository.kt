package com.sokkun.basicrestapi.repository

import com.sokkun.basicrestapi.model.Status
import org.springframework.data.jpa.repository.JpaRepository

interface StatusRepository : JpaRepository<Status, Long>