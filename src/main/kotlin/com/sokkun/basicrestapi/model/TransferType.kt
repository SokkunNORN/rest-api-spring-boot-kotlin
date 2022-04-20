package com.sokkun.basicrestapi.model

import javax.persistence.*

@Entity
@Table(name = "transfer_type")
data class TransferType(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTransferType")
    @SequenceGenerator(name = "seqTransferType", sequenceName = "SEQ_TRANSFER_TYPE", initialValue = 10, allocationSize = 10)
    val id: Long = 0L,
    @Column(name = "name")
    val name: String,
    @Column(name = "description")
    val description: String
)