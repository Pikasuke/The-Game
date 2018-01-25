package com.thegame.model;


import java.util.Scanner;
/**
 * Importer le début du jeux séléction du personnage
 * @author Administrateur
 *
 */
public class PersonnageSelection {
	public static Bon personnageSelection() {
		
		
		System.out.println(" _____       ___   _   _  __    __       _____   _   __   _       ___   _            _____       ___   __   _   _____       ___   _____  __    __ \r\n" + 
				"|  ___|     /   | | | | | \\ \\  / /      |  ___| | | |  \\ | |     /   | | |          |  ___|     /   | |  \\ | | |_   _|     /   | /  ___/ \\ \\  / / \r\n" + 
				"| |__      / /| | | | | |  \\ \\/ /       | |__   | | |   \\| |    / /| | | |          | |__      / /| | |   \\| |   | |      / /| | | |___   \\ \\/ /  \r\n" + 
				"|  __|    / / | | | | | |   }  {        |  __|  | | | |\\   |   / / | | | |          |  __|    / / | | | |\\   |   | |     / / | | \\___  \\   \\  /   \r\n" + 
				"| |      / /  | | | |_| |  / /\\ \\       | |     | | | | \\  |  / /  | | | |___       | |      / /  | | | | \\  |   | |    / /  | |  ___| |   / /    \r\n" + 
				"|_|     /_/   |_| \\_____/ /_/  \\_\\      |_|     |_| |_|  \\_| /_/   |_| |_____|      |_|     /_/   |_| |_|  \\_|   |_|   /_/   |_| /_____/  /_/     ");
		
		
		System.out.println("################################################################################################################################################ \r\n" + 
				"###################################################   ########################################################################################## \r\n" + 
				"###############################################   /~\\   ######################################################       ###########################\r\n" + 
				"############################################   _- `~~~', ##################################################             ########################\r\n" + 
				"##########################################  _-~       )  ###############################################                   #####################\r\n" + 
				"#######################################  _-~          |  ##############################################################     ####################\r\n" + 
				"####################################  _-~            ;  ###############################################    #####################################\r\n" + 
				"##########################  __---___-~              |   ################################################     ###################################\r\n" + 
				"#######################   _~   ,,                  ;  `,,  #############################################################   #####################\r\n" + 
				"#####################  _-~    ;'                  |  ,'  ; ###############################################                ######################\r\n" + 
				"###################  _~      '                    `~'   ; ####################################################       ###########################\r\n" + 
				"############   __---;                                 ,' #######################################################################################\r\n" + 
				"########   __~~  ___                                ,' #########################################################################################\r\n" + 
				"#####  _-~~   -~~ _                               ,' ###########################################################################################\r\n" + 
				"##### `-_         _                              ; #############################################################################################\r\n" + 
				"#######  ~~----~~~   ;                          ; ##############################################################################################\r\n" + 
				"#########  /          ;                        ; ###############################################################################################\r\n" + 
				"#######  /             ;                      ; ################################################################################################\r\n" + 
				"#####  /                `                    ; #################################################################################################\r\n" + 
				"###  /                                      ; ##################################################################################################\r\n" + 
				"#                                            ###################################################################################################");
		
		
		System.out.println("Bonjour! Bienvenue dans Faux Final Fantasy !");
		System.out.println("Veuillez choisir votre Héros : 1) Archère, 2) Mage, 3) Guerrier; puis Entrer.");
		Bon player = new Bon();
		Scanner scanner = new Scanner(System.in);
//Rentre dans le while pour éviter les bug venant d'une mauvaise séléction de l'utilisateur
	
		while (true) {

			try {
				Integer perso = Integer.parseInt(scanner.next());
				if (perso == 1) {
					//importation de l'objet Archere qui h�rite de personnage
					player = new Archer();
					System.out.println("Vous avez choisie l'Archére! Que les fleches transpercent vos ennemies!");

					System.out.println("                                                        |\r\n" + 
							"                                                         \\.\r\n" + 
							"                                                         /|.\r\n" + 
							"                                                       /  `|.\r\n" + 
							"                                                     /     |.\r\n" + 
							"                                                   /       |.\r\n" + 
							"                                                 /         `|.\r\n" + 
							"                                               /            |.\r\n" + 
							"                                             /              |.\r\n" + 
							"                                           /                |.\r\n" + 
							"                                         /                  `|.\r\n" + 
							"                                        /                     |.\r\n" + 
							"                                       /                       |.\r\n" + 
							"           \\                         /                         |.\r\n" + 
							"            \\|                     /                           |\\\r\n" + 
							"              \\#####\\            /                             ||\r\n" + 
							"          --###########>       /                               ||\r\n" + 
							"           #######     \\     /                                 ||\r\n" + 
							"      ______ #####   =|__/___                                ||\r\n" + 
							"  ,--' ,----`-,#_ ___/'  --,-`-==============================##==========>>\r\n" + 
							" \\               '        ##_______ ______   ______,--,____,=##,__\r\n" + 
							"  `,    __________,-,__,--'#'  ==='      `-'              | ##,-/\r\n" + 
							"    `-,____,---'#        \\####\\              |        ____,--\\_##,/\r\n" + 
							"        #_   ##           |##   \\  _____,---==,__,---'         ##\r\n" + 
							"         #    ##           ]===--==\\                            ||\r\n" + 
							"         #,     #         /         \\                          ||\r\n" + 
							"          #_      #     /           \\                        ||\r\n" + 
							"           ##_         /              \\                      ||\r\n" + 
							"            ####='    |                 \\                    |/\r\n" + 
							"             ###      ]                  \\                  |.\r\n" + 
							"             ##       |                    \\                |.\r\n" + 
							"            ###=======]                       \\              |.\r\n" + 
							"           ///        |                         \\           ,|.\r\n" + 
							"           //         |                           \\         |.\r\n" + 
							"                                                    \\      ,|.\r\n" + 
							"                                                      \\    |.\r\n" + 
							"                                                        \\  |.\r\n" + 
							"                                                          \\|.\r\n" + 
							"                                                          /.\r\n" + 
							"                                                         |");
					
					break;
				} else if (perso == 2) {
					//importation de l'objet mage qui h�rite de personnage
					player = new Mage();
					
					System.out.println("Vous avez choisie le Mage! Que vos sorts désintègres vos ennemies!");

					
					System.out.println("                     ____\r\n" + 
							"                  .'* *.'\r\n" + 
							"               __/_*_*(_\r\n" + 
							"              / _______ \\\r\n" + 
							"             _\\_)/_ _\\(_/_\r\n" + 
							"            / _((\\ - /))_ \\\r\n" + 
							"            \\ \\())(-)(()/ /\r\n" + 
							"             ' \\(((()))/ '\r\n" + 
							"            / ' \\)).))/ ' \\\r\n" + 
							"           / _ \\ - | - /_  \\\r\n" + 
							"          (   ( .;''';. .'  )\r\n" + 
							"          _\\\"__ /    )\\ __\"/_\r\n" + 
							"            \\/  \\   ' /  \\/\r\n" + 
							"             .'  '...' ' )\r\n" + 
							"              / /  |  \\ \\\r\n" + 
							"             / .   .   . \\\r\n" + 
							"            /   .     .   \\\r\n" + 
							"           /   /   |   \\   \\\r\n" + 
							"         .'   /    b    '.  '.\r\n" + 
							"     _.-'    /     Bb     '-. '-._\r\n" + 
							" _.-'       |      BBb       '-.  '-.\r\n" + 
							"(___________\\____.dBBBb.________)____)");
					break;
					
				}

				else if (perso == 3) {
					//importation de l'objet guerrier qui h�rite de personnage
					player = new Guerrier();
					
					System.out.println("Vous avez choisie le Guerrier! Que votre furreur ce déchaine sur vos ennemies!");

					System.out.println("         \r\n" + 
							"                         dMMP\r\n" + 
							"                        dMMM'\r\n" + 
							"                        \\MM/\r\n" + 
							"                        dMMm.\r\n" + 
							"                       dMMP'_\\---.\r\n" + 
							"                      _| _  p ;88;`.\r\n" + 
							"                    ,db; p >  ;8P|  `.\r\n" + 
							"                   (``T8b,__,'dP |   |\r\n" + 
							"                   |   `Y8b..dP  ;_  |\r\n" + 
							"                   |    |`T88P_ /  `\\;\r\n" + 
							"                   :_.-~|d8P'`Y/    /\r\n" + 
							"                    \\_   TP    ;   7`\\\r\n" + 
							"         ,,__        >   `._  /'  /   `\\_\r\n" + 
							"         `._ \"\"\"\"~~~~------|`\\;' ;     ,'\r\n" + 
							"            \"\"\"~~~-----~~~'\\__[|;' _.-'  `\\\r\n" + 
							"                    ;--..._     .-'-._     ;\r\n" + 
							"                   /      /`~~\"'   ,'`\\_ ,/\r\n" + 
							"                  ;_    /'        /    ,/\r\n" + 
							"                  | `~-l         ;    /\r\n" + 
							"                  `\\    ;       /\\.._|\r\n" + 
							"                    \\    \\      \\     \\\r\n" + 
							"                    /`---';      `----'\r\n" + 
							"                   (     /            \r\n" + 
							"                    `---'");
					break;
				} else {
					
					System.out.println("Veuillez choisir entre '1', '2' ou '3'.");
				}
			} catch (Exception e) {
				System.out.println("Exception : Veuillez choisir entre '1', '2' ou '3'.");
				break;
			}

		}

		
		return player;
	}

}