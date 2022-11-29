public class Main {
    public static void main(String[] args) {
       Osobnik osobnik1 = new Osobnik("Bonus", 0);
       Osobnik osobnik2 = new Osobnik("Pakol", 0);

       OsobnikServiceImpl osobnikservice = new OsobnikServiceImpl();

       osobnikservice.pytanie();
       for(int i=0; i<10; i++) {

           osobnikservice.lufa(2, osobnik1);
           osobnikservice.lufa(1,osobnik2);
       }

        System.out.println("Bonus zajebał glebę");
        osobnikservice.otworzRyjTej();
        osobnikservice.lufa(1,osobnik1);
        System.out.println(osobnik1);
        System.out.println("*BLEEEEEEEEEEE*");




    }
}