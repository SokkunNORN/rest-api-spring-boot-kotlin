package com.sokkun.basicrestapi.service.impl

import com.sokkun.basicrestapi.api.request.TransferTypeReq
import com.sokkun.basicrestapi.api.response.TransferTypeRes
import com.sokkun.basicrestapi.model.TransferType
import com.sokkun.basicrestapi.repository.TransferTypeRepository
import com.sokkun.basicrestapi.service.ITransferTypeService
import org.springframework.stereotype.Service

@Service
class TransferTypeService(
    private val transferTypeRepo: TransferTypeRepository
) : ITransferTypeService {
    override fun findAllTransferType(): List<TransferTypeRes> = transferTypeRepo.findAll().map { TransferTypeRes(it.id, it.name) }
    override fun createTransferType(transferTypeReq: TransferTypeReq): TransferTypeRes {
        val transferType = TransferType(0, transferTypeReq.name, transferTypeReq.description)
        val createTransferType = transferTypeRepo.save(transferType)

        return TransferTypeRes(createTransferType.id, createTransferType.name)
    }
}