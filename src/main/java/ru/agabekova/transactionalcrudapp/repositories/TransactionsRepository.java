package ru.agabekova.transactionalcrudapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.agabekova.transactionalcrudapp.models.TransactionsEntity;

import java.util.UUID;

public interface TransactionsRepository extends JpaRepository <TransactionsEntity, UUID>{
}
