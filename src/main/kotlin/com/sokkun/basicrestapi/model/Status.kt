package com.sokkun.basicrestapi.model

import javax.persistence.*

@Entity
@Table(name = "status")
data class Status(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqStatus")
    @SequenceGenerator(name = "seqStatus", sequenceName = "SEQ_STATUS", initialValue = 10, allocationSize = 10)
    val id: Long = 0L,
    @Column(name = "name")
    val name: String,
    @Column(name = "description")
    val description: String,
//    @CreationTimestamp
//    @Column(name = "created_at")
//    val createdAt: LocalDateTime = LocalDateTime.now(),
//    @UpdateTimestamp
//    @Column(name = "updated_at")
//    val updatedAt: LocalDateTime = LocalDateTime.now()
)