package student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Student.TABLE_NAME)
public class Student {
    public final static String TABLE_NAME = "STUDENT";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String groupe;
    private String classement;
    private String codeAmenagementOuiSi;
    private String numero;
    private String codeFormation;
    private String formation;
    private String filiere;
    private String nom;
    private String prenom;
    private String libelleGroupe;
    private String deuxiemePrenom;
    private String troisiemePrenom;
    private String civilite;
    private String sexe;
    private String dateDeNaissance;
    private String villeDeNaissance;
    private String departementDeNaissance;
    private String paysDeNaissance;
    private String nationalite;
    private String boursierDesLycees;
    private String boursier;
    private String boursierCertifie;
    private String nombreDePartsOuEchelon;
    private String aCBCode;
    private String profilDuCandidat;
    private String typeEtablissement;
    private String contratEtablissement;
    private String uAIEtablissement;
    private String libelleEtablissement;
    private String communeEtablissement;
    private String departementEtablissement;
    private String paysEtablissement;
    private String telephoneEtablissement;
    private String faxEtablissement;
    private String niveauDEtudeActuelle;
    private String numeroINE;
    private String numeroCEF;
    private String typeDeFormation;
    private String serieDomaineFiliere;
    private String classe;
    private String optionInternationale;
    private String dominante;
    private String specialiteMentionVoie;
    private String lV1Scolarite;
    private String lV2Scolarite;
    private String lV3Scolarite;
    private String option1;
    private String option2;
    private String diplome;
    private String serieDiplome;
    private String dominanteDiplome;
    private String specialiteDiplome;
    private String mentionDiplome;
    private String moisEtAnneeDObtentionDuBac;
    private String academieDuBac;
    private String lV1Bac;
    private String lV2Bac;
    private String optionDuBac;
    private String diplomeEtranger;
    private String testDeFrançais;
    private String niveauDeFrançais;
    private String dateTestDeFrançais;
    private String amenagementHandicap;
    private String dateDeValidation;
    private String candidatureValideeON;
    private String sportifDeHautNiveau;
    private String artisteDeHautNiveau;
    private String dateInscription;
    private String dateDImpression;
    private String ficheImprimeeON;
    private String eligibleALaPolitiqueDeLaVille;
    private String ficheDeReorientation;
    private String anneeDEntreeEnSeconde;
    private String dossierDematerialise;
    private String dossierPapier;

    public Student() {
	// default constructor
    }

    public Student(String groupe, String classement, String codeAmenagementOuiSi, String numero, String codeFormation, String formation, String filiere, String nom, String prenom, String libelleGroupe, String deuxiemePrenom, String troisiemePrenom, String civilite, String sexe, String dateDeNaissance,
	    String villeDeNaissance, String departementDeNaissance, String paysDeNaissance, String nationalite, String boursierDesLycees, String boursier, String boursierCertifie, String nombreDePartsOuEchelon, String aCBCode, String profilDuCandidat, String typeEtablissement, String contratEtablissement,
	    String uAIEtablissement, String libelleEtablissement, String communeEtablissement, String departementEtablissement, String paysEtablissement, String telephoneEtablissement, String faxEtablissement, String niveauDEtudeActuelle, String numeroINE, String numeroCEF, String typeDeFormation,
	    String serieDomaineFiliere, String classe, String optionInternationale, String dominante, String specialiteMentionVoie, String lV1Scolarite, String lV2Scolarite, String lV3Scolarite, String option1, String option2, String diplome, String serieDiplome, String dominanteDiplome, String specialiteDiplome,
	    String mentionDiplome, String moisEtAnneeDObtentionDuBac, String academieDuBac, String lV1Bac, String lV2Bac, String optionDuBac, String diplomeEtranger, String testDeFrançais, String niveauDeFrançais, String dateTestDeFrançais, String amenagementHandicap, String dateDeValidation,
	    String candidatureValideeON, String sportifDeHautNiveau, String artisteDeHautNiveau, String dateInscription, String dateDImpression, String ficheImprimeeON, String eligibleALaPolitiqueDeLaVille, String ficheDeReorientation, String anneeDEntreeEnSeconde, String dossierDematerialise, String dossierPapier) {
	super();
	this.groupe = groupe;
	this.classement = classement;
	this.codeAmenagementOuiSi = codeAmenagementOuiSi;
	this.numero = numero;
	this.codeFormation = codeFormation;
	this.formation = formation;
	this.filiere = filiere;
	this.nom = nom;
	this.prenom = prenom;
	this.libelleGroupe = libelleGroupe;
	this.deuxiemePrenom = deuxiemePrenom;
	this.troisiemePrenom = troisiemePrenom;
	this.civilite = civilite;
	this.sexe = sexe;
	this.dateDeNaissance = dateDeNaissance;
	this.villeDeNaissance = villeDeNaissance;
	this.departementDeNaissance = departementDeNaissance;
	this.paysDeNaissance = paysDeNaissance;
	this.nationalite = nationalite;
	this.boursierDesLycees = boursierDesLycees;
	this.boursier = boursier;
	this.boursierCertifie = boursierCertifie;
	this.nombreDePartsOuEchelon = nombreDePartsOuEchelon;
	this.aCBCode = aCBCode;
	this.profilDuCandidat = profilDuCandidat;
	this.typeEtablissement = typeEtablissement;
	this.contratEtablissement = contratEtablissement;
	this.uAIEtablissement = uAIEtablissement;
	this.libelleEtablissement = libelleEtablissement;
	this.communeEtablissement = communeEtablissement;
	this.departementEtablissement = departementEtablissement;
	this.paysEtablissement = paysEtablissement;
	this.telephoneEtablissement = telephoneEtablissement;
	this.faxEtablissement = faxEtablissement;
	this.niveauDEtudeActuelle = niveauDEtudeActuelle;
	this.numeroINE = numeroINE;
	this.numeroCEF = numeroCEF;
	this.typeDeFormation = typeDeFormation;
	this.serieDomaineFiliere = serieDomaineFiliere;
	this.classe = classe;
	this.optionInternationale = optionInternationale;
	this.dominante = dominante;
	this.specialiteMentionVoie = specialiteMentionVoie;
	this.lV1Scolarite = lV1Scolarite;
	this.lV2Scolarite = lV2Scolarite;
	this.lV3Scolarite = lV3Scolarite;
	this.option1 = option1;
	this.option2 = option2;
	this.diplome = diplome;
	this.serieDiplome = serieDiplome;
	this.dominanteDiplome = dominanteDiplome;
	this.specialiteDiplome = specialiteDiplome;
	this.mentionDiplome = mentionDiplome;
	this.moisEtAnneeDObtentionDuBac = moisEtAnneeDObtentionDuBac;
	this.academieDuBac = academieDuBac;
	this.lV1Bac = lV1Bac;
	this.lV2Bac = lV2Bac;
	this.optionDuBac = optionDuBac;
	this.diplomeEtranger = diplomeEtranger;
	this.testDeFrançais = testDeFrançais;
	this.niveauDeFrançais = niveauDeFrançais;
	this.dateTestDeFrançais = dateTestDeFrançais;
	this.amenagementHandicap = amenagementHandicap;
	this.dateDeValidation = dateDeValidation;
	this.candidatureValideeON = candidatureValideeON;
	this.sportifDeHautNiveau = sportifDeHautNiveau;
	this.artisteDeHautNiveau = artisteDeHautNiveau;
	this.dateInscription = dateInscription;
	this.dateDImpression = dateDImpression;
	this.ficheImprimeeON = ficheImprimeeON;
	this.eligibleALaPolitiqueDeLaVille = eligibleALaPolitiqueDeLaVille;
	this.ficheDeReorientation = ficheDeReorientation;
	this.anneeDEntreeEnSeconde = anneeDEntreeEnSeconde;
	this.dossierDematerialise = dossierDematerialise;
	this.dossierPapier = dossierPapier;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getGroupe() {
	return groupe;
    }

    public void setGroupe(String groupe) {
	this.groupe = groupe;
    }

    public String getClassement() {
	return classement;
    }

    public void setClassement(String classement) {
	this.classement = classement;
    }

    public String getCodeAmenagementOuiSi() {
	return codeAmenagementOuiSi;
    }

    public void setCodeAmenagementOuiSi(String codeAmenagementOuiSi) {
	this.codeAmenagementOuiSi = codeAmenagementOuiSi;
    }

    public String getNumero() {
	return numero;
    }

    public void setNumero(String numero) {
	this.numero = numero;
    }

    public String getCodeFormation() {
	return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
	this.codeFormation = codeFormation;
    }

    public String getFormation() {
	return formation;
    }

    public void setFormation(String formation) {
	this.formation = formation;
    }

    public String getFiliere() {
	return filiere;
    }

    public void setFiliere(String filiere) {
	this.filiere = filiere;
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getPrenom() {
	return prenom;
    }

    public void setPrenom(String prenom) {
	this.prenom = prenom;
    }

    public String getLibelleGroupe() {
	return libelleGroupe;
    }

    public void setLibelleGroupe(String libelleGroupe) {
	this.libelleGroupe = libelleGroupe;
    }

    public String getDeuxiemePrenom() {
	return deuxiemePrenom;
    }

    public void setDeuxiemePrenom(String deuxiemePrenom) {
	this.deuxiemePrenom = deuxiemePrenom;
    }

    public String getTroisiemePrenom() {
	return troisiemePrenom;
    }

    public void setTroisiemePrenom(String troisiemePrenom) {
	this.troisiemePrenom = troisiemePrenom;
    }

    public String getCivilite() {
	return civilite;
    }

    public void setCivilite(String civilite) {
	this.civilite = civilite;
    }

    public String getSexe() {
	return sexe;
    }

    public void setSexe(String sexe) {
	this.sexe = sexe;
    }

    public String getDateDeNaissance() {
	return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
	this.dateDeNaissance = dateDeNaissance;
    }

    public String getVilleDeNaissance() {
	return villeDeNaissance;
    }

    public void setVilleDeNaissance(String villeDeNaissance) {
	this.villeDeNaissance = villeDeNaissance;
    }

    public String getDepartementDeNaissance() {
	return departementDeNaissance;
    }

    public void setDepartementDeNaissance(String departementDeNaissance) {
	this.departementDeNaissance = departementDeNaissance;
    }

    public String getPaysDeNaissance() {
	return paysDeNaissance;
    }

    public void setPaysDeNaissance(String paysDeNaissance) {
	this.paysDeNaissance = paysDeNaissance;
    }

    public String getNationalite() {
	return nationalite;
    }

    public void setNationalite(String nationalite) {
	this.nationalite = nationalite;
    }

    public String getBoursierDesLycees() {
	return boursierDesLycees;
    }

    public void setBoursierDesLycees(String boursierDesLycees) {
	this.boursierDesLycees = boursierDesLycees;
    }

    public String getBoursier() {
	return boursier;
    }

    public void setBoursier(String boursier) {
	this.boursier = boursier;
    }

    public String getBoursierCertifie() {
	return boursierCertifie;
    }

    public void setBoursierCertifie(String boursierCertifie) {
	this.boursierCertifie = boursierCertifie;
    }

    public String getNombreDePartsOuEchelon() {
	return nombreDePartsOuEchelon;
    }

    public void setNombreDePartsOuEchelon(String nombreDePartsOuEchelon) {
	this.nombreDePartsOuEchelon = nombreDePartsOuEchelon;
    }

    public String getaCBCode() {
	return aCBCode;
    }

    public void setaCBCode(String aCBCode) {
	this.aCBCode = aCBCode;
    }

    public String getProfilDuCandidat() {
	return profilDuCandidat;
    }

    public void setProfilDuCandidat(String profilDuCandidat) {
	this.profilDuCandidat = profilDuCandidat;
    }

    public String getTypeEtablissement() {
	return typeEtablissement;
    }

    public void setTypeEtablissement(String typeEtablissement) {
	this.typeEtablissement = typeEtablissement;
    }

    public String getContratEtablissement() {
	return contratEtablissement;
    }

    public void setContratEtablissement(String contratEtablissement) {
	this.contratEtablissement = contratEtablissement;
    }

    public String getuAIEtablissement() {
	return uAIEtablissement;
    }

    public void setuAIEtablissement(String uAIEtablissement) {
	this.uAIEtablissement = uAIEtablissement;
    }

    public String getLibelleEtablissement() {
	return libelleEtablissement;
    }

    public void setLibelleEtablissement(String libelleEtablissement) {
	this.libelleEtablissement = libelleEtablissement;
    }

    public String getCommuneEtablissement() {
	return communeEtablissement;
    }

    public void setCommuneEtablissement(String communeEtablissement) {
	this.communeEtablissement = communeEtablissement;
    }

    public String getDepartementEtablissement() {
	return departementEtablissement;
    }

    public void setDepartementEtablissement(String departementEtablissement) {
	this.departementEtablissement = departementEtablissement;
    }

    public String getPaysEtablissement() {
	return paysEtablissement;
    }

    public void setPaysEtablissement(String paysEtablissement) {
	this.paysEtablissement = paysEtablissement;
    }

    public String getTelephoneEtablissement() {
	return telephoneEtablissement;
    }

    public void setTelephoneEtablissement(String telephoneEtablissement) {
	this.telephoneEtablissement = telephoneEtablissement;
    }

    public String getFaxEtablissement() {
	return faxEtablissement;
    }

    public void setFaxEtablissement(String faxEtablissement) {
	this.faxEtablissement = faxEtablissement;
    }

    public String getNiveauDEtudeActuelle() {
	return niveauDEtudeActuelle;
    }

    public void setNiveauDEtudeActuelle(String niveauDEtudeActuelle) {
	this.niveauDEtudeActuelle = niveauDEtudeActuelle;
    }

    public String getNumeroINE() {
	return numeroINE;
    }

    public void setNumeroINE(String numeroINE) {
	this.numeroINE = numeroINE;
    }

    public String getNumeroCEF() {
	return numeroCEF;
    }

    public void setNumeroCEF(String numeroCEF) {
	this.numeroCEF = numeroCEF;
    }

    public String getTypeDeFormation() {
	return typeDeFormation;
    }

    public void setTypeDeFormation(String typeDeFormation) {
	this.typeDeFormation = typeDeFormation;
    }

    public String getSerieDomaineFiliere() {
	return serieDomaineFiliere;
    }

    public void setSerieDomaineFiliere(String serieDomaineFiliere) {
	this.serieDomaineFiliere = serieDomaineFiliere;
    }

    public String getClasse() {
	return classe;
    }

    public void setClasse(String classe) {
	this.classe = classe;
    }

    public String getOptionInternationale() {
	return optionInternationale;
    }

    public void setOptionInternationale(String optionInternationale) {
	this.optionInternationale = optionInternationale;
    }

    public String getDominante() {
	return dominante;
    }

    public void setDominante(String dominante) {
	this.dominante = dominante;
    }

    public String getSpecialiteMentionVoie() {
	return specialiteMentionVoie;
    }

    public void setSpecialiteMentionVoie(String specialiteMentionVoie) {
	this.specialiteMentionVoie = specialiteMentionVoie;
    }

    public String getlV1Scolarite() {
	return lV1Scolarite;
    }

    public void setlV1Scolarite(String lV1Scolarite) {
	this.lV1Scolarite = lV1Scolarite;
    }

    public String getlV2Scolarite() {
	return lV2Scolarite;
    }

    public void setlV2Scolarite(String lV2Scolarite) {
	this.lV2Scolarite = lV2Scolarite;
    }

    public String getlV3Scolarite() {
	return lV3Scolarite;
    }

    public void setlV3Scolarite(String lV3Scolarite) {
	this.lV3Scolarite = lV3Scolarite;
    }

    public String getOption1() {
	return option1;
    }

    public void setOption1(String option1) {
	this.option1 = option1;
    }

    public String getOption2() {
	return option2;
    }

    public void setOption2(String option2) {
	this.option2 = option2;
    }

    public String getDiplome() {
	return diplome;
    }

    public void setDiplome(String diplome) {
	this.diplome = diplome;
    }

    public String getSerieDiplome() {
	return serieDiplome;
    }

    public void setSerieDiplome(String serieDiplome) {
	this.serieDiplome = serieDiplome;
    }

    public String getDominanteDiplome() {
	return dominanteDiplome;
    }

    public void setDominanteDiplome(String dominanteDiplome) {
	this.dominanteDiplome = dominanteDiplome;
    }

    public String getSpecialiteDiplome() {
	return specialiteDiplome;
    }

    public void setSpecialiteDiplome(String specialiteDiplome) {
	this.specialiteDiplome = specialiteDiplome;
    }

    public String getMentionDiplome() {
	return mentionDiplome;
    }

    public void setMentionDiplome(String mentionDiplome) {
	this.mentionDiplome = mentionDiplome;
    }

    public String getMoisEtAnneeDObtentionDuBac() {
	return moisEtAnneeDObtentionDuBac;
    }

    public void setMoisEtAnneeDObtentionDuBac(String moisEtAnneeDObtentionDuBac) {
	this.moisEtAnneeDObtentionDuBac = moisEtAnneeDObtentionDuBac;
    }

    public String getAcademieDuBac() {
	return academieDuBac;
    }

    public void setAcademieDuBac(String academieDuBac) {
	this.academieDuBac = academieDuBac;
    }

    public String getlV1Bac() {
	return lV1Bac;
    }

    public void setlV1Bac(String lV1Bac) {
	this.lV1Bac = lV1Bac;
    }

    public String getlV2Bac() {
	return lV2Bac;
    }

    public void setlV2Bac(String lV2Bac) {
	this.lV2Bac = lV2Bac;
    }

    public String getOptionDuBac() {
	return optionDuBac;
    }

    public void setOptionDuBac(String optionDuBac) {
	this.optionDuBac = optionDuBac;
    }

    public String getDiplomeEtranger() {
	return diplomeEtranger;
    }

    public void setDiplomeEtranger(String diplomeEtranger) {
	this.diplomeEtranger = diplomeEtranger;
    }

    public String getTestDeFrançais() {
	return testDeFrançais;
    }

    public void setTestDeFrançais(String testDeFrançais) {
	this.testDeFrançais = testDeFrançais;
    }

    public String getNiveauDeFrançais() {
	return niveauDeFrançais;
    }

    public void setNiveauDeFrançais(String niveauDeFrançais) {
	this.niveauDeFrançais = niveauDeFrançais;
    }

    public String getDateTestDeFrançais() {
	return dateTestDeFrançais;
    }

    public void setDateTestDeFrançais(String dateTestDeFrançais) {
	this.dateTestDeFrançais = dateTestDeFrançais;
    }

    public String getAmenagementHandicap() {
	return amenagementHandicap;
    }

    public void setAmenagementHandicap(String amenagementHandicap) {
	this.amenagementHandicap = amenagementHandicap;
    }

    public String getDateDeValidation() {
	return dateDeValidation;
    }

    public void setDateDeValidation(String dateDeValidation) {
	this.dateDeValidation = dateDeValidation;
    }

    public String getCandidatureValideeON() {
	return candidatureValideeON;
    }

    public void setCandidatureValideeON(String candidatureValideeON) {
	this.candidatureValideeON = candidatureValideeON;
    }

    public String getSportifDeHautNiveau() {
	return sportifDeHautNiveau;
    }

    public void setSportifDeHautNiveau(String sportifDeHautNiveau) {
	this.sportifDeHautNiveau = sportifDeHautNiveau;
    }

    public String getArtisteDeHautNiveau() {
	return artisteDeHautNiveau;
    }

    public void setArtisteDeHautNiveau(String artisteDeHautNiveau) {
	this.artisteDeHautNiveau = artisteDeHautNiveau;
    }

    public String getDateInscription() {
	return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
	this.dateInscription = dateInscription;
    }

    public String getDateDImpression() {
	return dateDImpression;
    }

    public void setDateDImpression(String dateDImpression) {
	this.dateDImpression = dateDImpression;
    }

    public String getFicheImprimeeON() {
	return ficheImprimeeON;
    }

    public void setFicheImprimeeON(String ficheImprimeeON) {
	this.ficheImprimeeON = ficheImprimeeON;
    }

    public String getEligibleALaPolitiqueDeLaVille() {
	return eligibleALaPolitiqueDeLaVille;
    }

    public void setEligibleALaPolitiqueDeLaVille(String eligibleALaPolitiqueDeLaVille) {
	this.eligibleALaPolitiqueDeLaVille = eligibleALaPolitiqueDeLaVille;
    }

    public String getFicheDeReorientation() {
	return ficheDeReorientation;
    }

    public void setFicheDeReorientation(String ficheDeReorientation) {
	this.ficheDeReorientation = ficheDeReorientation;
    }

    public String getAnneeDEntreeEnSeconde() {
	return anneeDEntreeEnSeconde;
    }

    public void setAnneeDEntreeEnSeconde(String anneeDEntreeEnSeconde) {
	this.anneeDEntreeEnSeconde = anneeDEntreeEnSeconde;
    }

    public String getDossierDematerialise() {
	return dossierDematerialise;
    }

    public void setDossierDematerialise(String dossierDematerialise) {
	this.dossierDematerialise = dossierDematerialise;
    }

    public String getDossierPapier() {
	return dossierPapier;
    }

    public void setDossierPapier(String dossierPapier) {
	this.dossierPapier = dossierPapier;
    }

}
