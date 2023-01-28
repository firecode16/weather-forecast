package com.weather.forecast.model;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.TypeDef;

/**
 *
 * @author hfredi35@gmail.com
 */
@TypeDef(name = "json", typeClass = JsonType.class)
@MappedSuperclass
public class BaseEntity {
}
