package ru.agabekova.transactionalcrudapp.mappers;

import org.mapstruct.Mapper;
import ru.agabekova.transactionalcrudapp.model.dto.TransactionRequestDto;
import ru.agabekova.transactionalcrudapp.model.dto.TransactionResponseDto;
import ru.agabekova.transactionalcrudapp.models.TransactionsEntity;


import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring")
public interface TransactionsMappers {
    List<TransactionResponseDto> getTransactionDtoMapper(List<TransactionsEntity> entities);

    TransactionsEntity transactionEntityMapper(TransactionRequestDto transactionsRequest);

    TransactionResponseDto transactionDtoMapper(TransactionsEntity entity);

    TransactionsEntity transactionsUpdateEntityMapper(UUID id, TransactionRequestDto transactionsRequest);

}
