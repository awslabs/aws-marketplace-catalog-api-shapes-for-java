package com.amazonaws.services.marketplacecatalog.utils;

import software.amazon.awssdk.core.document.Document;
import software.amazon.awssdk.protocols.jsoncore.JsonNodeParser;

public final class DocumentConverter {
    private DocumentConverter() {}

    public static Document jsonToDocument(String json) {
        JsonNodeParser jsonNodeParser = JsonNodeParser.create();
        return jsonNodeParser.
                parse(json.trim().replace('\n', ' '))
                .visit(new DocumentUnmarshaller());
    }
}
