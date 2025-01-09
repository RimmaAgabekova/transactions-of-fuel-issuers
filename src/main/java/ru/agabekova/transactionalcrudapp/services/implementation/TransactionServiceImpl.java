package ru.agabekova.transactionalcrudapp.services.implementation;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.agabekova.transactionalcrudapp.mappers.TransactionsMappers;
import ru.agabekova.transactionalcrudapp.model.dto.TransactionRequestDto;
import ru.agabekova.transactionalcrudapp.model.dto.TransactionResponseDto;
import ru.agabekova.transactionalcrudapp.models.TransactionsEntity;
import ru.agabekova.transactionalcrudapp.repositories.TransactionsRepository;
import ru.agabekova.transactionalcrudapp.services.TransactionService;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionsRepository transactionsRepository;
    private final TransactionsMappers transactionsMappers;

    @Override
    public List<TransactionResponseDto> getListTransactions() {
        List<TransactionsEntity> transactionsEntities = transactionsRepository.findAll();
        return transactionsMappers.getTransactionDtoMapper(transactionsEntities);
    }

    @Override
    public TransactionResponseDto getListTransactionById(UUID id) {
        return transactionsMappers.transactionDtoMapper(transactionsRepository.findById(id).orElseThrow(()
                -> new EntityNotFoundException("C данным идентификатором не найдено - " + id)));
    }

    @Override
    @Transactional
    public TransactionResponseDto createTransaction(TransactionRequestDto transactionRequestDto) {
        return transactionsMappers.transactionDtoMapper(transactionsRepository.save(
                transactionsMappers.transactionEntityMapper(transactionRequestDto)));
    }

    @Override
    @Transactional
    public TransactionResponseDto updateTransaction(UUID id, TransactionRequestDto transactionRequestDto) {
        return transactionsMappers.transactionDtoMapper(
                transactionsRepository.save(
                        transactionsMappers.transactionsUpdateEntityMapper(id, transactionRequestDto)));
    }

    @Override
    @Transactional
    public void deleteTransaction(UUID id) {
        TransactionsEntity transaction = transactionsRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("C данным идентификатором не найдено - " + id));
        transaction.setDeleted(true);
        transaction.setDateUpdated(LocalDate.now());
        transactionsRepository.save(transaction);
    }
}
