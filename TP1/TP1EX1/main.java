package TP1EX1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=3) {
			
		}
		 String operation = args[0];
        double valeur1 = Integer.parseInt(args[1]);
        double valeur2 = Integer.parseInt(args[2]);
        double resultat = 0;
        System.out.println(switch(operation) {
        case "add" -> valeur1 + valeur2;
        case "sous" -> valeur1 - valeur2;
        case "mul" -> valeur1 * valeur2;
        case "div" -> valeur1 / valeur2;
        default -> "operateur" +operation+"est indefini ..." ;
        });
	}

}
