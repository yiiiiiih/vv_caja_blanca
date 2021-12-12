package com.practica.cajablanca;

import static org.junit.jupiter.api.Assertions.*;

import com.cajanegra.EmptyCollectionException;
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
	
	//************************** Camino de numPlabras *****************
	//** Camino 1: 106-107-108-126 **
    @Test
    void testnumPalabras1() {
        assertThrows(IllegalArgumentException.class, () -> {editor.numPalabras(0, 0, "hola");});
    }

    //** Camino 2:  106-107-109-110-126 **
    @Test
    void testnumPalabras2() {
        assertThrows(IllegalArgumentException.class, () -> {editor.numPalabras(2, 10, "hola");});
    }

    //** Camino 3:  106-107-109-111-112-126 **
    @Test
    void testnumPalabras3() {
        editor.leerFichero("vacio.txt");
        assertEquals(editor.numPalabras(1, 0, "cajablanca"), 0);
    }

    //** Camino 4:  106-107-109-111-112-113-126 **
    @Test
    void testnumPalabras4() {
        editor.leerFichero("cancion.txt");
        System.out.print(editor.size());
        assertEquals(editor.numPalabras(1, 1, "I'm"), 0);
    }

    //** Camino 5: 106-107-109-111-112-113-114-115-116-117-118-119-121-123-113-126 **
    @Test
    void testnumPalabras5() {
        editor.leerFichero("cancion.txt");
        System.out.print(editor.size());
        assertEquals(editor.numPalabras(1, 2, "I'm"), 1);
    }
    //** Camino 6: 106-107-109-111-112-113-114-115-116-117-118-121-123-113-126 **
    @Test
    void testnumPalabras6() {
        editor.leerFichero("cancion.txt");
        assertEquals(editor.numPalabras(1, 20, "cajablanca"), 0);
    }

    //** Camino 7: 106-109-111-112-113-114-115-116-117-118-119-121-116-117-118-119-121-123-113-126 *
    @Test
    void testnumPalabras7() {
        editor.leerFichero("cancion.txt");
        assertEquals(editor.numPalabras(1, 20, "I"), 11);
    }
	//************************** Camino de mayorLongitud *****************
	//************************** Camino 1: 152-153-154-167 *****************
	@Test
	void testmayorLongitud1() throws EmptyCollectionException {
		assertEquals(editor.mayorLongitud(),null);
	}
	
	//************************** Camino 4: 152-153-154-155-156-157-158-159-160-163-157-155-167 *****************
	@Test
	void testmayorLongitud2() throws EmptyCollectionException {
		editor.leerFichero("1linea.txt");
		assertEquals(editor.mayorLongitud(),"a");
	}
	
	//************************** Camino de sustituirPalabras *****************
	//************************** Camino 1: 175-176-197 *****************
	@Test
	void testsustituirPalabras1() {
		editor.leerFichero("vacio.txt");
		editor.sustituirPalabra("a", "o");
		assertEquals(editor.size(), 0);
	}
	
	//************************** Camino 2: 175-176-(177-178)-179-180-(181-184)-(192-193)-194-195-197 *****************
	@Test
	void testsustituirPalabras2() {
		editor.leerFichero("vacio1.txt");
		editor.sustituirPalabra("a", "o");
		assertEquals(editor.size(), 1);
	}
	
	//************************** Camino 3: 175-176-(177-178)-179-180-(181-184)-185-186-190-(181-184)-(192-193)-194-195-197 *****************
	@Test
	void testsustituirPalabras3() {
		editor.leerFichero("1linea.txt");
		editor.sustituirPalabra("a", "o");
		assertEquals(editor.size(), 1);
	}
	
	//************************** Camino 4: 175-176-(177-178)-179-180-(181-184)-(192-193)-194-(181-184)-(192-193)-194-195-197 *****************
	@Test
	void testsustituirPalabras4() {
		editor.leerFichero("1linea.txt");
		editor.sustituirPalabra("x", "o");
		assertEquals(editor.size(), 1);
	}
	
	//************************** Camino 5: 175-176-(177-178)-179-180-(181-184)-185-(187-189)-190-(181-184)-(192-193)-194-195-197 *****************
	@Test
	void testsustituirPalabras5() {
		editor.leerFichero("cancion.txt");
		editor.sustituirPalabra("i", "o");
		assertEquals(editor.size(), 46);
	}
}
