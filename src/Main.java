import  java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);


    obousmernyList list = new obousmernyList();

    list.addFirst("KKKK", "KKKK", 8);
    list.addFirst("LL", "LL", 1);
    list.addFirst("WWW", "WWW", 2);
    list.addFirst("MMMMMMMM", "MMMMMMM", 15);
    list.addFirst("a", "a", 5);
    list.addFirst("chybny",  "chybny", -8);
    list.addFirst("chybny2",  "chybny2", 9999999);
    list.addFirst("prvniii", "prvniiii", 7);


    list.printAll();




for(;;){
    System.out.println("SEZNAAM MENUUU");
    System.out.println("1 - Odstranění prvního zvířete ze seznamu");
    System.out.println("2 - Výpis všech živočichů starších než 5 let");
    System.out.println("3 - Výpis nejstaršího zvířátka v seznamu");

    int choice = sc.nextInt();
    sc.nextLine();
    switch(choice){
        case 1:
            list.removeFirst();
            list.printAll();
            break;

        case 2:
            list.printAllOlderThan5();
            break;

        case 3:
            System.out.println("nefunguje");
            break;
    }

}































}

