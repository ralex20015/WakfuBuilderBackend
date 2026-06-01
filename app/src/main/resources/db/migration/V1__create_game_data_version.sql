CREATE TABLE game_data_version (
    id      BIGINT       NOT NULL,
    version VARCHAR(20)  NOT NULL,
    CONSTRAINT pk_game_data_version PRIMARY KEY (id)
);
