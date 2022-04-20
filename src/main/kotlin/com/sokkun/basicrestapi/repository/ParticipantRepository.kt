package com.sokkun.basicrestapi.repository

import com.sokkun.basicrestapi.model.Participant
import org.springframework.data.jpa.repository.JpaRepository

interface ParticipantRepository: JpaRepository<Participant, Long>