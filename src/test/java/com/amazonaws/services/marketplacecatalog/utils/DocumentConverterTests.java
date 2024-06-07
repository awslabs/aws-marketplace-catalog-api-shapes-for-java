package com.amazonaws.services.marketplacecatalog.utils;

import org.junit.jupiter.api.Test;
import software.amazon.awssdk.core.document.Document;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentConverterTests {
    @Test
    public void testJsonToNullDocument() {
        String json = "{\n" +
                "  \"Test\": null\n" +
                "}";

        Document actualDocument = DocumentConverter.jsonToDocument(json);
        Document expectedDocument = Document.mapBuilder()
                .putNull("Test")
                .build();

        assertEquals(expectedDocument, actualDocument);
    }

    @Test
    public void testJsonToBooleanDocument() {
        String json = "{\n" +
                "  \"Test\": true\n" +
                "}";

        Document actualDocument = DocumentConverter.jsonToDocument(json);
        Document expectedDocument = Document.mapBuilder()
                .putBoolean("Test", true)
                .build();

        assertEquals(expectedDocument, actualDocument);
    }

    @Test
    public void testJsonToNumberDocument() {
        String json = "{\n" +
                "  \"Test\": 15\n" +
                "}";

        Document actualDocument = DocumentConverter.jsonToDocument(json);
        Document expectedDocument = Document.mapBuilder()
                .putNumber("Test", 15)
                .build();

        assertEquals(expectedDocument, actualDocument);
    }

    @Test
    public void testJsonToStringDocument() {
        String json = "{\n" +
                "  \"Test\": \"Test Object\"\n" +
                "}";

        Document actualDocument = DocumentConverter.jsonToDocument(json);
        Document expectedDocument = Document.mapBuilder()
                .putString("Test", "Test Object")
                .build();

        assertEquals(expectedDocument, actualDocument);
    }

    @Test
    public void testJsonToArrayDocument() {
        String json = "{\n" +
                "  \"Test\": [\"This\", \"is\", \"a\", \"list\"]\n" +
                "}";

        Document actualDocument = DocumentConverter.jsonToDocument(json);
        List<Document> list = Arrays.asList(Document.fromString("This"), Document.fromString("is"),
                Document.fromString("a"), Document.fromString("list"));
        Document expectedDocument = Document.mapBuilder()
                .putList("Test", list)
                .build();

        assertEquals(expectedDocument, actualDocument);
    }

    @Test
    public void testJsonToObjectDocument() {
        String json = "{\n" +
                "  \"Test\": {\n" +
                "    \"key1\": \"value1\",\n" +
                "    \"key2\": \"value2\"\n" +
                "  }\n" +
                "}";

        Document actualDocument = DocumentConverter.jsonToDocument(json);
        Map<String, Document> map = new HashMap<>();
        map.put("key1", Document.fromString("value1"));
        map.put("key2", Document.fromString("value2"));
        Document expectedDocument = Document.mapBuilder()
                .putMap("Test", map)
                .build();

        assertEquals(expectedDocument, actualDocument);
    }

    @Test
    public void testJsonToNestedObjectDocument() {
        String json = "{\n" +
                "  \"Test\": {\n" +
                "    \"key1\": \"value1\",\n" +
                "    \"key2\": {\n" +
                "      \"embedded key\": \"embedded value\"" +
                "    }\n" +
                "  }\n" +
                "}";

        Document actualDocument = DocumentConverter.jsonToDocument(json);
        Map<String, Document> nestedMap = new HashMap<>();
        nestedMap.put("embedded key", Document.fromString("embedded value"));
        Map<String, Document> map = new HashMap<>();
        map.put("key1", Document.fromString("value1"));
        map.put("key2", Document.fromMap(nestedMap));
        Document expectedDocument = Document.mapBuilder()
                .putMap("Test", map)
                .build();

        assertEquals(expectedDocument, actualDocument);
    }
}
