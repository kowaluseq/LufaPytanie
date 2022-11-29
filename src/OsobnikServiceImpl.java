public class OsobnikServiceImpl implements OsobnikService{


    @Override
    public void pytanie() {
        System.out.println("Bonus, lufa?");
        System.out.println("TAAAAA");
    }

    @Override
    public void lufa(int lufa, Osobnik osobnik) {
        osobnik.setStanUpojenia(osobnik.getStanUpojenia() + lufa);
        if(lufa<2){
        System.out.println(osobnik + "wali " + lufa + " lufę");}
        else{
            System.out.println(osobnik + "wali " + lufa + " lufy");
        }



    }

    @Override
    public void otworzRyjTej() {
        System.out.println("Bonus otwiera ryj");
    }


}
