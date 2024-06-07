package com.amazonaws.services.marketplacecatalog.utils;

import com.amazonaws.services.marketplacecatalog.utils.DocumentUnmarshaller;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import software.amazon.awssdk.core.document.Document;
import software.amazon.awssdk.protocols.jsoncore.JsonNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DocumentUnmarshallerTests {
    public static DocumentUnmarshaller unmarshaller = new DocumentUnmarshaller();

    @Test
    public void testVisitNull() {
        Document actualDocument = unmarshaller.visitNull();
        Document expectedDocument = Document.fromNull();

        assertEquals(expectedDocument, actualDocument);
        assertTrue(actualDocument.isNull());
    }

    @Test
    public void testVisitBoolean() {
        Document actualDocument = unmarshaller.visitBoolean(true);
        Document expectedDocument = Document.fromBoolean(true);

        assertEquals(expectedDocument, actualDocument);
        assertTrue(actualDocument.isBoolean());
        assertEquals(true, actualDocument.asBoolean());
    }

    @Test
    public void testVisitNumber() {
        Document actualDocument = unmarshaller.visitNumber("15");
        Document expectedDocument = Document.fromNumber(15);

        assertEquals(expectedDocument, actualDocument);
        assertTrue(actualDocument.isNumber());
        assertEquals(15, actualDocument.asNumber().intValue());
    }

    @Test
    public void testVisitString() {
        Document actualDocument = unmarshaller.visitString("Test");
        Document expectedDocument = Document.fromString("Test");

        assertEquals(expectedDocument, actualDocument);
        assertTrue(actualDocument.isString());
        assertEquals("Test", actualDocument.asString());
    }

    @Test
    public void testVisitArray() {
        JsonNode node = JsonNode.parser().parse("{ \"key\": \"value\" }");
        List<JsonNode> actualList = Collections.singletonList(node);

        Map<String, Document> value = new HashMap<>();
        value.put("key", Document.fromString("value"));

        List<Document> expectedList = Collections.singletonList(Document.fromMap(value));

        Document actualDocument = unmarshaller.visitArray(actualList);
        Document expectedDocument = Document.fromList(expectedList);

        assertEquals(expectedDocument, actualDocument);
        assertTrue(actualDocument.isList());
        assertEquals(expectedList, actualDocument.asList());
    }

    @Test
    public void testVisitObject() {
        JsonNode node = JsonNode.parser().parse("{ \"key\": \"value\" }");

        Map<String, JsonNode> actualMap = new HashMap<>();
        actualMap.put("key", node);

        Map<String, Document> value = new HashMap<>();
        value.put("key", Document.fromString("value"));

        Map<String, Document> expectedMap = new HashMap<>();
        expectedMap.put("key", Document.fromMap(value));

        Document actualDocument = unmarshaller.visitObject(actualMap);
        Document expectedDocument = Document.fromMap(expectedMap);

        assertEquals(expectedDocument, actualDocument);
        assertTrue(actualDocument.isMap());
        assertEquals(expectedMap, actualDocument.asMap());
    }

    @Test
    public void testVisitNestedObject() {
        Object obj = new Object();

        assertThrows(UnsupportedOperationException.class, () -> { unmarshaller.visitEmbeddedObject(obj); });
    }
}
