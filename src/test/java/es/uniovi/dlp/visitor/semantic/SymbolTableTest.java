package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.VariableDefinition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolTableTest {

    @Test
    void testInsert() {
        var st = new SymbolTable();
        VariableDefinition definition = new VariableDefinition(null, "a", 0, 0);
        VariableDefinition definition2 = new VariableDefinition(null, "a", 0, 0);

        assertTrue(st.insert(definition));
        assertEquals(definition.getScope(), 0);
        assertFalse(st.insert(definition));

        st.set();

        assertTrue(st.insert(definition2));
        assertEquals(definition2.getScope(), 1);
        assertFalse(st.insert(definition2));

        st.reset();

        assertFalse(st.insert(definition));
    }

    @Test
    void testFind() {
        SymbolTable st = new SymbolTable();
        VariableDefinition definition = new VariableDefinition(null, "a", 0, 0);
        VariableDefinition definition2 = new VariableDefinition(null, "b", 0, 0);

        assertTrue(st.insert(definition));
        assertNotNull(st.find("a"));
        assertNull(st.find("b"));

        st.set();

        assertTrue(st.insert(definition2));
        assertNotNull(st.find("a"));
        assertNotNull(st.find("b"));
        assertNull(st.find("c"));

        st.reset();

        assertNotNull(st.find("a"));
        assertNull(st.find("b"));
    }

    @Test
    void testFindInCurrentScope() {
        SymbolTable st = new SymbolTable();
        VariableDefinition definition = new VariableDefinition(null, "a", 0, 0);
        VariableDefinition definition2 = new VariableDefinition(null, "b", 0, 0);

        assertTrue(st.insert(definition));
        assertNotNull(st.findInCurrentScope("a"));
        assertNull(st.findInCurrentScope("b"));

        st.set();

        assertTrue(st.insert(definition2));
        assertNotNull(st.findInCurrentScope("b"));
        assertNull(st.findInCurrentScope("a"));
        assertNull(st.findInCurrentScope("c"));

        st.reset();

        assertNotNull(st.findInCurrentScope("a"));
        assertNull(st.findInCurrentScope("b"));
    }
}
