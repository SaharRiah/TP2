package tp2;
//----------------------------------ex3--------------------------------------
/*public class Testlivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre l1 = new Livre("alchimiste"," Coelho", 225);
		Livre l2 = new Livre( 508,"La Tunisie");
		Livre l3 = new Livre("JK Rowling","Harry Potter");
		Livre Tab[] = new Livre[3];
		Tab[0]=l1;
		Tab[1]=l2;
		Tab[2]=l3;
		for(int i=0;i<3;i++) {
			Tab[i].affiche();
		}
		Tab[1].setAuteur("Paulo Coelho");
		Tab[2].setNbPages(461);
		
		for(int i=0;i<3;i++) {
			Tab[i].affiche();
		}
		
		
		

	}

}*/
//----------------------------------ex4--------------------------------------
public class Testlivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Auteur 1", "Titre 1", 25.0);
        livre1.affiche(); 
        livre1.setPrix(30.0); 
        livre1.affiche();
        // Tester si le prix est fixé
        System.out.println("Prix fixé ? " + livre1.testPrix()); 
        Livre livre2 = new Livre("Auteur 2", "Titre 2");
        livre2.setPrix(15.0); 
        livre2.affiche();
        livre2.setPrix(20.0); 
        livre2.affiche();
    }
}

