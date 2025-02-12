CREATE TABLE transactions (
    id uuid PRIMARY KEY,
    op_date date,
    gas_station_id uuid,
    card_id uuid,
    contract_id uuid,
    nomenclature_id uuid,
    amount numeric(15,2),
    stella_sum numeric(15,2),
    stella_nds_sum numeric(15,2),
    refund boolean,
    buy_sum_plan numeric(15,2),
    buy_nds_sum_plan numeric(15,2),
    buy_sum_fact numeric(15,2),
    buy_nds_sum_fact numeric(15,2),
    sell_sum_plan numeric(15,2),
    sell_nds_sum_plan numeric(15,2),
    sell_sum_fact numeric(15,2),
    sell_nds_sum_fact numeric(15,2),
    implementation_id uuid,
    user_id uuid,
    date_created date,
    date_updated date,
    deleted boolean
);