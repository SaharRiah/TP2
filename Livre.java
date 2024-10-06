package tp2;
//--------------------------ex3-------------------------
/*public class Livre {
	private String titre, auteur;
	private float nbPages;
	public Livre (String auteur,String  titre) {
	this.auteur = auteur;
	this.titre = titre;
	this.nbPages=0;
	}
	public String getTitre() {
		return titre;
	}

	public float getNbPages () {
		//this.nbPages = nbPages;
		return nbPages;
		}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
		
	}
	public void setTitre(String  titre) {
		this.titre = titre;
	}
	public void setNbPages (float nbPages) {
		//this.nbPages = nbPages;
		if(nbPages>20) {
			this.nbPages = nbPages;
		}
		else
			System.out.println("le nombre des page est faible");
		}
	public String toString() {
		return "Livre intitulé" + titre +" de "+ auteur +", contenant "+ nbPages + " pages ";
		
	}
	public void affiche()
	{
		System.out.println(toString());
	}
	public Livre () {
		this.nbPages = 0;
	}
	public Livre (float nbPages,String  titre) {
		this.nbPages = nbPages;
		this.titre= titre ;
	}
	public Livre (String  titre,String auteur,float nbPages) {
		this.nbPages = nbPages;
		this.titre= titre ;
		this.auteur=auteur;
	}
}*/
//--------------------------ex3-------------------------
public class Livre {
    private String titre;
    private String auteur;
    private float nbPages;
    private double prix;     
    private boolean prixFixe;    
    
    public Livre(String auteur, String titre, double prix) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = 0; 
        setPrix(prix);
    }

    public Livre() {
        this.titre = "aaa";
        this.auteur = "aaa";
        this.nbPages = 0; 
        this.prixFixe = false;
    }

    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = 0; 
        this.prix = 0.0; 
        this.prixFixe = false; 
    }
    public Livre(float nbPages, String titre) {
        this.nbPages = nbPages ;
        this.titre = titre;
        this.prixFixe = false; 
    }
    public Livre(String titre, String auteur, float nbPages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        setPrix(prix);
    }

    public String getTitre() {
        return titre;
    }

    public float getNbPages() {
        return nbPages;
    }

    public double getPrix() {
        return prix;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbPages(float nbPages) {
        if (nbPages > 20) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Le nombre de pages est faible");
            this.nbPages = 0; 
        }
    }

    public void setPrix(double prix) {
        if (!prixFixe) {
            this.prix = prix;
            prixFixe = true;
        } else {
            System.out.println("Le prix ne peut pas être modifié une fois fixé.");
        }
    }

    public boolean testPrix() {
        return prixFixe; 
    }
    public String toString() {
        return "Livre intitulé " + titre + " de " + auteur + ", contenant " + nbPages + " pages, prix: " + prix + "€.";
    }

    public void affiche() {
        System.out.println(toString());
    }
}
