package com.example.jq.config;

import org.jooq.conf.MappedSchema;
import org.jooq.conf.RenderMapping;
import org.jooq.conf.Settings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JooqConfig {

    /**
     * 用于Jooq的配置，包括数据库映射（生成表的数据名与生产表的数据库名不一致时）、表名映射
     *
     * @return Jooq设置
     */
    @Bean
    public Settings settings() {

        Settings settings = new Settings();
        // 生成代码的数据库名 =》 部署环境的数据库名
        settings.withRenderMapping(new RenderMapping().withSchemata(new MappedSchema().withInput("sakila").withOutput("test")));
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
