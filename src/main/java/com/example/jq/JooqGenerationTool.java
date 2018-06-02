package com.example.jq;

import org.jooq.util.GenerationTool;

public class JooqGenerationTool {
    public static void main(String[] args) throws Exception {
        GenerationTool.main(new String[]{"jooq-config.xml"});
    }
}
