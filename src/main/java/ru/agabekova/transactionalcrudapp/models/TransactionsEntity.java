package ru.agabekova.transactionalcrudapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;


@ToString
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transactions")
public class TransactionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "op_date")
    private LocalDate opDate;

    @Column(name = "gas_station_id")
    private UUID gasStationId;

    @Column(name = "card_id")
    private UUID cardId;

    @Column(name = "contract_id")
    private UUID contractId;

    @Column(name = "nomenclature_id")
    private UUID nomenclatureId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "stella_sum")
    private BigDecimal stellaSum;

    @Column(name = "stella_nds_sum")
    private BigDecimal stellaNdsSum;

    @Column(name = "refund")
    private Boolean refund;

    @Column(name = "buy_sum_plan")
    private BigDecimal buySumPlan;

    @Column(name = "buy_nds_sum_plan")
    private BigDecimal buyNdsSumPlan;

    @Column(name = "buy_sum_fact")
    private BigDecimal buySumFact;

    @Column(name = "buy_nds_sum_fact")
    private BigDecimal buyNdsSumFact;

    @Column(name = "sell_sum_plan")
    private BigDecimal sellSumPlan;

    @Column(name = "sell_nds_sum_plan")
    private BigDecimal sellNdsSumPlan;

    @Column(name = "sell_sum_fact")
    private BigDecimal sellSumFact;

    @Column(name = "sell_nds_sum_fact")
    private BigDecimal sellNdsSumFact;

    @Column(name = "implementation_id")
    private UUID implementationId;

    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "date_created")
    private LocalDate dateCreated;

    @Column(name = "date_updated")
    private LocalDate dateUpdated;

    @Column(name = "deleted")
    private Boolean deleted;
}
