package com.amazonaws.services.marketplacecatalog.utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import software.amazon.awssdk.core.document.Document;
import software.amazon.awssdk.protocols.jsoncore.JsonNode;
import software.amazon.awssdk.protocols.jsoncore.JsonNodeVisitor;

public class DocumentUnmarshaller implements JsonNodeVisitor<Document> {
    @Override
    public Document visitNull() {
        return Document.fromNull();
    }

    @Override
    public Document visitBoolean(boolean bool) {
        return Document.fromBoolean(bool);
    }

    @Override
    public Document visitNumber(String number) {
        return Document.fromNumber(number);
    }

    @Override
    public Document visitString(String string) {
        return Document.fromString(string);
    }

    @Override
    public Document visitArray(List<JsonNode> array) {
        return Document.fromList(array.stream()
                .map(node -> node.visit(this))
                .collect(Collectors.toList()));
    }

    @Override
    public Document visitObject(Map<String, JsonNode> object) {
        return Document.fromMap(object.entrySet()
                .stream().collect(Collectors.toMap(entry -> entry.getKey(),
                        entry -> entry.getValue().visit(this),
                        (left, right) -> left,
                        LinkedHashMap::new)));
    }

    @Override
    public Document visitEmbeddedObject(Object embeddedObject) {
        throw new UnsupportedOperationException("Embedded objects are not supported within Document types.");
    }
}
