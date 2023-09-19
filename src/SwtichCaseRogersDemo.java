import java.util.Scanner;

public class SwtichCaseRogersDemo {
    public static void main(String[] args) {

        System.out.println("Thanks for calling....");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                // +++++++++++++++  English Portal  ++++++++++++++++++
                System.out.println("Welcome to our English Portal.....");
                System.out.println("Press 1 for Internet");
                System.out.println("Press 2 for Mobile");
                System.out.println("Press 3 for Cable");
                int engInput = scanner.nextInt();
                if (engInput == 1) {
                    // Internet
                    System.out.println("Now Please select one of the following options:....");
                    System.out.println("Press 1 for New Connections");
                    System.out.println("Press 2 for Existing Customer");
                    System.out.println("Press 3 for Billing");
                    System.out.println("Press 4 for Technical Support");
                    System.out.println("Press 5 to talk to an agent");
                    int thirdInput = scanner.nextInt();
                     if (thirdInput == 1) {
                         System.out.println("Welcome to new connections");
                     }
                     else if (thirdInput == 2){
                         System.out.println("Please let us know you questions related to your existing account.");
                     }
                     else if (thirdInput == 3){
                         System.out.println("Check your online account for billing and payment");
                     }
                     else if (thirdInput == 4){
                         System.out.println("Please wait while a technical support is getting available for you");
                     }
                     else if (thirdInput == 5){
                         System.out.println("All our agents are currently helping other customers.., please wait or try again later...");
                     }
                     else {
                         System.out.println("you have chosen wrong option... Please Try again");
                     }
                }
                    else if (engInput == 2) {
                        // Mobile
                    System.out.println("Now Please select one of the following options:....");
                    System.out.println("Press 1 for New Mobile deals");
                    System.out.println("Press 2 for Existing Mobile connection");
                    System.out.println("Press 3 for Mobile Billing");
                    System.out.println("Press 4 for Technical Support");
                    System.out.println("Press 5 to talk to an agent");
                    int thirdInput = scanner.nextInt();
                    if (thirdInput == 1) {
                        System.out.println("Welcome to Our New Mobile Deals and Perks...");
                    }
                    else if (thirdInput == 2){
                        System.out.println("Please let us know you questions related to your existing mobile account.");
                    }
                    else if (thirdInput == 3){
                        System.out.println("Check your online mobile account for billing and payment");
                    }
                    else if (thirdInput == 4){
                        System.out.println("Please wait while a technical support is getting available for you");
                    }
                    else if (thirdInput == 5){
                        System.out.println("All our agents are currently helping other customers.., please wait or try again later...");
                    }
                    else {
                        System.out.println("you have chosen wrong option... Please Try again");
                    }
                }
                    else if (engInput == 3) {
                        // Cable
                    System.out.println("Now Please select one of the following options:....");
                    System.out.println("Press 1 for New Cable connection");
                    System.out.println("Press 2 for Existing Cable connection");
                    System.out.println("Press 3 for Billing");
                    System.out.println("Press 4 for Technical Support");
                    System.out.println("Press 5 to talk to an agent");
                    int thirdInput = scanner.nextInt();
                    if (thirdInput == 1) {
                        System.out.println("Welcome to Our New Cable Connection...");
                    }
                    else if (thirdInput == 2){
                        System.out.println("Please let us know you questions related to your existing cable account.");
                    }
                    else if (thirdInput == 3){
                        System.out.println("Check your online account for billing and payment");
                    }
                    else if (thirdInput == 4){
                        System.out.println("Please wait while a technical support is getting available for you");
                    }
                    else if (thirdInput == 5){
                        System.out.println("All our agents are currently helping other customers.., please wait or try again later...");
                    }
                    else {
                        System.out.println("you have chosen wrong option... Please Try again");
                    }
                }
                    else {
                    System.out.println("you have chosen wrong option... Please Try again");
                }
                break;
            case 2:
                // ++++++++++++++++++++   French Portal ++++++++++++++++++++
                System.out.println("Welcome to our French Portal..... /n Bienvenue sur notre portail français");
                System.out.println("Appuyez sur 1 pour Internet");
                System.out.println("Appuyez sur 2 pour mobile");
                System.out.println("Appuyez sur 3 pour le câble");
                int frenchInput = scanner.nextInt();
                if (frenchInput == 1) {
                    // Internet
                    System.out.println("Maintenant, veuillez sélectionner l'une des options suivantes :....");
                    System.out.println("Appuyez sur 1 pour de nouvelles connexions");
                    System.out.println("Appuyez sur 2 pour un client existant");
                    System.out.println("Appuyez sur 3 pour la facturation");
                    System.out.println("Appuyez sur 4 pour le support technique");
                    System.out.println("Appuyez sur 5 pour parler à un agent");
                    int thirdInput = scanner.nextInt();
                    if (thirdInput == 1) {
                        System.out.println("Bienvenue dans de nouvelles connexions");
                    }
                    else if (thirdInput == 2){
                        System.out.println("Veuillez nous faire part de vos questions liées à votre compte existant.");
                    }
                    else if (thirdInput == 3){
                        System.out.println("Vérifiez votre compte en ligne pour la facturation et le paiement");
                    }
                    else if (thirdInput == 4){
                        System.out.println("Veuillez patienter pendant qu'un support technique est disponible pour vous");
                    }
                    else if (thirdInput == 5){
                        System.out.println("Tous nos agents aident actuellement d'autres clients. Veuillez patienter ou réessayer plus tard...");
                    }
                    else {
                        System.out.println("vous avez choisi la mauvaise option... Veuillez réessayer");
                    }
                }
                else if (frenchInput == 2) {
                    // Mobile
                    System.out.println("Maintenant, veuillez sélectionner l'une des options suivantes :....");
                    System.out.println("Appuyez sur 1 pour les nouvelles offres mobiles");
                    System.out.println("Appuyez sur 2 pour une connexion mobile existante");
                    System.out.println("Appuyez sur 3 pour la facturation mobile");
                    System.out.println("Appuyez sur 4 pour le support technique");
                    System.out.println("Appuyez sur 5 pour parler à un agent");
                    int thirdInput = scanner.nextInt();
                    if (thirdInput == 1) {
                        System.out.println("Bienvenue dans nos nouvelles offres et avantages mobiles...");
                    }
                    else if (thirdInput == 2){
                        System.out.println("Veuillez nous faire part de vos questions liées à votre compte mobile existant.");
                    }
                    else if (thirdInput == 3){
                        System.out.println("Vérifiez votre compte mobile en ligne pour la facturation et le paiement");
                    }
                    else if (thirdInput == 4){
                        System.out.println("Veuillez patienter pendant qu'un support technique est disponible pour vous");
                    }
                    else if (thirdInput == 5){
                        System.out.println("Tous nos agents aident actuellement d'autres clients. Veuillez patienter ou réessayer plus tard...");
                    }
                    else {
                        System.out.println("vous avez choisi la mauvaise option... Veuillez réessayer");
                    }
                }
                else if (frenchInput == 3) {
                    // Cable
                    System.out.println("Maintenant, veuillez sélectionner l'une des options suivantes :....");
                    System.out.println("Appuyez sur 1 pour une nouvelle connexion par câble");
                    System.out.println("Appuyez sur 2 pour une connexion par câble existante");
                    System.out.println("Appuyez sur 3 pour la facturation");
                    System.out.println("Appuyez sur 4 pour le support technique");
                    System.out.println("Appuyez sur 5 pour parler à un agent");
                    int thirdInput = scanner.nextInt();
                    if (thirdInput == 1) {
                        System.out.println("Bienvenue dans notre nouvelle connexion par câble...");
                    }
                    else if (thirdInput == 2){
                        System.out.println("Veuillez nous faire part de vos questions liées à votre compte câble existant.");
                    }
                    else if (thirdInput == 3){
                        System.out.println("Vérifiez votre compte en ligne pour la facturation et le paiement");
                    }
                    else if (thirdInput == 4){
                        System.out.println("Veuillez patienter pendant qu'un support technique est disponible pour vous");
                    }
                    else if (thirdInput == 5){
                        System.out.println("Tous nos agents aident actuellement d'autres clients. Veuillez patienter ou réessayer plus tard...");
                    }
                    else {
                        System.out.println("vous avez choisi la mauvaise option... Veuillez réessayer");
                    }
                }
                else {
                    System.out.println("vous avez choisi la mauvaise option... Veuillez réessayer");
                }
                break;
            default:
                System.out.println("Please select your language either English or French.");
            }


        }

    }

