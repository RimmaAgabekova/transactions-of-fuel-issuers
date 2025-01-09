package ru.agabekova.transactionalcrudapp.services;

import ru.agabekova.transactionalcrudapp.model.dto.TransactionRequestDto;
import ru.agabekova.transactionalcrudapp.model.dto.TransactionResponseDto;

import java.util.List;
import java.util.UUID;

public interface TransactionService {

    List<TransactionResponseDto> getListTransactions();

    TransactionResponseDto getListTransactionById(UUID id);

    TransactionResponseDto createTransaction(TransactionRequestDto transactionsRequestDto);

    TransactionResponseDto updateTransaction(UUID id, TransactionRequestDto transactionsRequestDto);

    void deleteTransaction(UUID id);
}
