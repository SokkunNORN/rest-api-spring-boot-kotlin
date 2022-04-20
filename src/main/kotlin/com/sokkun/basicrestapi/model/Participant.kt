package com.sokkun.basicrestapi.model

import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "participant")
data class Participant(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqParticipant")
    @SequenceGenerator(name = "seqParticipant", sequenceName = "SEQ_PARTICIPANT", initialValue = 10, allocationSize = 10)
    val id: Long = 0L,
    @Column(name = "name")
    val name: String,
    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now()
)
