package com.jetbrains.test.demospringdatajdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jdbc.core.convert.Identifier;
import org.springframework.data.jdbc.core.convert.JdbcConverter;
import org.springframework.data.jdbc.core.convert.MappingJdbcConverter;
import org.springframework.data.jdbc.core.convert.RelationResolver;
import org.springframework.data.jdbc.core.dialect.JdbcDialect;
import org.springframework.data.jdbc.core.dialect.JdbcPostgresDialect;
import org.springframework.data.mapping.PersistentPropertyPath;
import org.springframework.data.relational.core.mapping.RelationalMappingContext;
import org.springframework.data.relational.core.mapping.RelationalPersistentProperty;

@Profile("aot")
@Configuration
class AotConfiguration {
    @Bean
    JdbcConverter jdbcConverter(RelationalMappingContext context) {
        return new MappingJdbcConverter(context, new RelationResolver() {
            @Override
            public Iterable<Object> findAllByPath(Identifier identifier,
                                                  PersistentPropertyPath<? extends RelationalPersistentProperty> path) {
                return null;
            }
        });
    }

    @Bean
    JdbcDialect dialect() {
        return JdbcPostgresDialect.INSTANCE;
    }
}
