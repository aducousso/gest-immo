package metier;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.gestimmo.metier.exceptions.AppDataException;

import com.gestimmo.metier.model.Bien;
import junit.framework.TestCase;

public class testBien extends TestCase {
	 Bien unBien;

	public void setUp(){
		unBien = new Bien();
	}

	public void testObjetExiste() {
		assertNotNull(unBien);
	}
	
	public void testSurface (){
	  unBien.setSurface(40.00);
	  assertThat(unBien.getSurface(), is(40.00));
	}
	
	public void testEnergie(){
		unBien.setEnergie('A');
		assertThat(unBien.getEnergie(), is('A'));
	}
	
	public void testAdresse(){
		unBien.setAdresse("adresse");
		assertThat(unBien.getAdresse(), is("adresse"));
	}
	
	public void testCodePostale(){
		unBien.setCodePostale("64600");
		assertThat(unBien.getCodePostale(), is("64600"));
	}
	
	public void testVille(){
		unBien.setVille("AngletCityBitch");
		assertThat(unBien.getVille(), is("AngletCityBitch"));
	}
	
	public void testNbPieces(){
		unBien.setNbPieces(1);
		assertThat(unBien.getNbPieces(), is(1));
	}
	
	public void testNbPiecesPas0() {
		try {
			unBien.setNbPieces(0);
			fail("Impossible");
		} catch (AppDataException e) {
		}
	}
}

	