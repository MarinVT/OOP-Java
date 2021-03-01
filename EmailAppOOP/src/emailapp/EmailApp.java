package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        EmailConf emailConf = new EmailConf("Marin", "VT");

//        emailConf.setAlternateEmail("marin@abv.bg");
//        System.out.println(emailConf.getAlternateEmail());
        System.out.println(emailConf.showInfo());
    }
}
