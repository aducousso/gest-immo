package metier;

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

	}

	
}
