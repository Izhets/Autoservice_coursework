CREATE TABLE autoservice.user
(
    id         BIGSERIAL PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name  TEXT NOT NULL,
    email      TEXT NOT NULL,
    password   TEXT NOT NULL
);

CREATE TABLE autoservice.client
(
    id           BIGSERIAL PRIMARY KEY,
    user_id      BIGINT NOT NULL REFERENCES autoservice.user (id),
    phone_number TEXT
);

CREATE TABLE autoservice.employee
(
    id      BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL REFERENCES autoservice.user (id),
    role    TEXT
);

CREATE TABLE autoservice.car
(
    id                  BIGSERIAL PRIMARY KEY,
    brand               TEXT    NOT NULL,
    model               TEXT    NOT NULL,
    year_of_manufacture INTEGER NOT NULL
);

CREATE TABLE autoservice.client_car
(
    id        BIGSERIAL PRIMARY KEY,
    car_id    BIGINT NOT NULL REFERENCES autoservice.car (id),
    client_id BIGINT NOT NULL REFERENCES autoservice.client (id)
);

CREATE TABLE autoservice.part
(
    id             BIGSERIAL PRIMARY KEY,
    catalog_number TEXT NOT NULL,
    name           TEXT NOT NULL,
    type           TEXT NOT NULL
);

CREATE TABLE autoservice.parts_on_car
(
    id      BIGSERIAL PRIMARY KEY,
    car_id  BIGINT NOT NULL REFERENCES autoservice.car (id),
    part_id BIGINT NOT NULL REFERENCES autoservice.part (id)
);

CREATE TABLE autoservice.order
(
    id          BIGSERIAL PRIMARY KEY,
    title       TEXT   NOT NULL,
    description TEXT   NOT NULL,
    car_id      BIGINT NOT NULL REFERENCES autoservice.car (id),
    part_id     BIGINT NOT NULL REFERENCES autoservice.part (id)
);

CREATE TABLE autoservice.order_list_of_parts
(
    id       BIGSERIAL PRIMARY KEY,
    order_id BIGINT NOT NULL REFERENCES autoservice.order (id),
    part_id  BIGINT NOT NULL REFERENCES autoservice.part (id)
);

CREATE TABLE autoservice.local_warehouse
(
    id           BIGSERIAL PRIMARY KEY,
    part_id      BIGINT  NOT NULL REFERENCES autoservice.part (id),
    amount       INTEGER NOT NULL,
    arrived_date DATE    NOT NULL
);