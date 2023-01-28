/**
 * Author:  hfredi35@gmail.com
 * Created: Jan 27, 2023
 */

CREATE TABLE forecast_weather
(
    city_id             BIGINT NOT NULL,
    city_name           VARCHAR(100) NOT NULL,
    time_zone           VARCHAR(100) NOT NULL,
    time_data_calc      BIGINT NOT NULL,
    register_date       TIMESTAMP NOT NULL,
    coordinates         JSON NOT NULL,
    weather             JSON NOT NULL,
    main                JSON NOT NULL,
    wind                JSON NOT NULL,
    clouds              JSON NOT NULL,
    rain                JSON NOT NULL,
    snow                JSON NOT NULL,
    sys                 JSON NOT NULL,
    PRIMARY KEY (city_id)
)
