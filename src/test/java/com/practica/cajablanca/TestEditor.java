package vv_caja_blanca;

import static org.junit.jupiter.api.Assertions.*;

import com.cajanegra.EmptyCollectionException;
import com.practica.cajablanca.Editor;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEditor {
	Editor editor;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		editor = new Editor();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testnumPalabras1() {
		assertThrows(IllegalArgumentException.class, () -> {editor.numPalabras(0, 0, "hola");});
	}
	@Test
	void testnumPalabras2() {
		assertThrows(IllegalArgumentException.class, () -> {editor.numPalabras(2, 10, "hola");});
	}
	@Test
	void testnumPalabras3() {
		editor.leerFichero("vacio.txt");
		assertEquals(editor.numPalabras(1, 0, "cajablanca"), 0);
	}
	@Test
	void testnumPalabras4() {
		editor.leerFichero("1linea.txt");
		
		assertEquals(editor.numPalabras(1, 1, "a"), 1);
	}
	@Test
	void testnumPalabras5() {
		editor.leerFichero("cancion.txt");
		System.out.print(editor.size());
		assertEquals(editor.numPalabras(1, 1, "so"), 1);
	}
	@Test
	void testnumPalabras6() {
		editor.leerFichero("cancion.txt");
		assertEquals(editor.numPalabras(1, 20, "cajablanca"), 0);
	}
	@Test
	void testnumPalabras7() {
		editor.leerFichero("cancion.txt");
		assertEquals(editor.numPalabras(1, 20, "I"), 11);
	}
	@Test
	void testmayorLongitud1() throws EmptyCollectionException {
		assertEquals(editor.mayorLongitud(),null);
	}
	@Test
	void testmayorLongitud2() throws EmptyCollectionException {
		editor.leerFichero("1linea.txt");
		assertEquals(editor.mayorLongitud(),"a");
	}
	@Test
	void testmayorLongitud3() throws EmptyCollectionException {
		editor.leerFichero("cancion.txt");
		assertEquals(editor.mayorLongitud(),"everybody");
	}
	@Test
	void testsustituirPalabras1() {
		editor.leerFichero("vacio.txt");
		editor.sustituirPalabra("a", "o");
		assertEquals(editor.size(), 0);
	}
	@Test
	void testsustituirPalabras2() {
		editor.leerFichero("vacio1.txt");
		editor.sustituirPalabra("a", "o");
		assertEquals(editor.size(), 1);
	}
	@Test
	void testsustituirPalabras3() {
		editor.leerFichero("1linea.txt");
		editor.sustituirPalabra("a", "o");
		assertEquals(editor.size(), 1);
	}
	@Test
	void testsustituirPalabras4() {
		editor.leerFichero("1linea.txt");
		editor.sustituirPalabra("x", "o");
		assertEquals(editor.size(), 1);
	}
	@Test
	void testsustituirPalabras5() {
		editor.leerFichero("cancion.txt");
		editor.sustituirPalabra("x", "o");
		assertEquals(editor.size(), 46);
	}
}
