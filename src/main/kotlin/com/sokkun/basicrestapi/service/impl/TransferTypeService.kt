package com.sokkun.basicrestapi.service.impl

import com.sokkun.basicrestapi.api.response.TransferTypeRes
import com.sokkun.basicrestapi.repository.TransferTypeRepository
import com.sokkun.basicrestapi.service.ITransferTypeService
import org.springframework.stereotype.Service

@Service
class TransferTypeService(
    private val transferTypeRepo: TransferTypeRepository
) : ITransferTypeService {
    override fun findAllTransferType(): List<TransferTypeRes> = transferTypeRepo.findAll().map { TransferTypeRes(it.id, it.name) }
}