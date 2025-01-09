package ru.agabekova.transactionalcrudapp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.agabekova.transactionalcrudapp.model.dto.TransactionRequestDto;
import ru.agabekova.transactionalcrudapp.model.dto.TransactionResponseDto;
import ru.agabekova.transactionalcrudapp.services.TransactionService;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class TransactionController implements TransactionControllerApi {
    private final TransactionService transactionService;

    @Override
    public List<TransactionResponseDto> getListTransactions() {
        return transactionService.getListTransactions();
    }

    @Override
    public TransactionResponseDto getTransactionById(UUID id) {
        return transactionService.getListTransactionById(id);
    }

    @Override
    public TransactionResponseDto createNewRecord(TransactionRequestDto transactionRequestDto) {
        return transactionService.createTransaction(transactionRequestDto);
    }

    @Override
    public TransactionResponseDto changeRecord(UUID id, TransactionRequestDto transactionRequestDto) {
        return transactionService.updateTransaction(id, transactionRequestDto);
    }

    @Override
    public void deleteRecord(UUID id) {
        transactionService.deleteTransaction(id);
    }
}

