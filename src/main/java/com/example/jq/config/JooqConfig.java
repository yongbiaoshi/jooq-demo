package com.example.jq.config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.boot.lang.UsesUnsafeJava;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class JooqConfig {

    //    private static final String DEFAULT_DB = "sakila";
    @Resource
    private DataSource dataSource;

    @Bean
    public DSLContext dsl() {
        return new DefaultDSLContext(config());
    }

    @Bean
    public org.jooq.Configuration config() {
        DefaultConfiguration config = new DefaultConfiguration();
        config.setDataSource(dataSource);
        config.setSQLDialect(SQLDialect.MYSQL_5_7);
        config.setSettings(settings());
        return config;
    }

    @Bean
    public Settings settings() {

        Settings settings = new Settings();
//        //数据库映射 jooq生成代码时的db => 现在要使用的db
//        settings.withRenderMapping(
//                new RenderMapping().withSchemata(
//                        new MappedSchema().withInput("DEV").withOutput("MY_BOOK_WORLD"),
//                        new MappedSchema().withInput("LOG").withOutput("MY_BOOK_WORLD_LOG")));
//        //表映射
//        settings.withRenderMapping(
//                new RenderMapping().withSchemata(
//                        new MappedSchema()
//                                .withInput("DEV").withTables(
//                                new MappedTable().withInput("AUTHOR").withOutput("MY_APP__AUTHOR"))));

        return settings;
    }

}
