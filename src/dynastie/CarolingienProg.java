package dynastie;

import dynastie.models.Dynastie;
import dynastie.models.Femme;
import dynastie.models.Homme;

public class CarolingienProg {

	public static void main(String[] args) {
		
		Dynastie carolingiens = new Dynastie("Caroligiens");
		
		Homme pepin = new Homme("Pépin", "Le bref");
		pepin.naitre(715);
		pepin.mourir(768);
		Femme bertrade = new Femme("Bertrade", "");
		bertrade.naitre(726);
		bertrade.mourir(783);
		pepin.epouser(bertrade);
		
		carolingiens.ajouter(pepin);
		
		Homme carloman = new Homme("Carloman","");
		bertrade.enfanter(carloman, 751);
		carloman.naitre(751);
		carloman.mourir(771);
		
		carolingiens.ajouter(carloman);
		
		Homme charlemagne = new Homme("Charlemagne", "");
		bertrade.enfanter(charlemagne, 742);
		charlemagne.naitre(742);
		charlemagne.mourir(814);
		Femme hildegarde = new Femme("Hildegarde","");
		hildegarde.naitre(757);
		hildegarde.mourir(783);
		charlemagne.epouser(hildegarde);
		
		carolingiens.ajouter(charlemagne);
		
		Homme louislepieux = new Homme("Louis 1er", "Le pieux");
		hildegarde.enfanter(louislepieux, 778);
		louislepieux.naitre(778);
		louislepieux.mourir(840);
		Femme ermengarde = new Femme("Ermengarde","");
		Femme judithdebaviere = new Femme("Judith de Bavière", "");
		ermengarde.naitre(780);
		ermengarde.mourir(818);
		louislepieux.epouser(ermengarde);
		judithdebaviere.naitre(800);
		judithdebaviere.mourir(843);
		louislepieux.epouser(judithdebaviere);
		
		carolingiens.ajouter(louislepieux);
		
		Homme charleslepauvre = new Homme("Charles II", "Le chauve");
		hildegarde.enfanter(charleslepauvre, 823);
		charleslepauvre.naitre(823);
		charleslepauvre.mourir(877);
		Femme ermentrude = new Femme("Ermentrude","");
		ermentrude.naitre(830);
		ermentrude.mourir(869);
		charleslepauvre.epouser(ermentrude);
		
		carolingiens.ajouter(charleslepauvre);
		
		Homme louislebegue = new Homme("Louis II", "Le bègue");
		judithdebaviere.enfanter(louislebegue, 846);
		louislebegue.naitre(846);
		louislebegue.mourir(879);
		Femme ansgarde = new Femme("Ansgarde","");
		Femme adelaide = new Femme("Adélaide","");
		ansgarde.naitre(826);
		ansgarde.mourir(879);
		louislebegue.epouser(ansgarde);
		
		carolingiens.ajouter(louislebegue);
		
		Homme charleslesimple = new Homme("Charles III", "Le simple");
		adelaide.enfanter(charleslesimple, 879);
		charleslesimple.naitre(879);
		charleslesimple.mourir(929);
		Femme ogivedangleterre = new Femme("Ogive d'Angleterre","");
		ogivedangleterre.naitre(903);
		ogivedangleterre.mourir(995);
		charleslesimple.epouser(ogivedangleterre);
		
		carolingiens.ajouter(charleslesimple);
		
		Homme louisdoutremer = new Homme("Louis IV d'outremer", "");
		ogivedangleterre.enfanter(louisdoutremer, 920);
		charleslesimple.naitre(920);
		charleslesimple.mourir(954);
		Femme gerbergedesaxe = new Femme("Gerberge de Saxe", "");
		gerbergedesaxe.naitre(915);
		gerbergedesaxe.mourir(984);
		louisdoutremer.epouser(gerbergedesaxe);
		
		carolingiens.ajouter(louisdoutremer);
		
		Homme lothaire = new Homme("Louis IV d'outremer", "");
		gerbergedesaxe.enfanter(lothaire, 941);
		lothaire.naitre(941);
		lothaire.mourir(986);
		Femme emma = new Femme("Emma", "");
		emma.naitre(948);
		emma.mourir(987);
		lothaire.epouser(emma);
		
		carolingiens.ajouter(louisdoutremer);
	}

}
