package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email emp1 = new Email("Ajay", "Akkineni" );
        emp1.changePassword("Navya");
        emp1.setMailboxCapacity(600);
        emp1.setAlternateEmail("navya.nadella@gmail.com");
        System.out.println("Your alternate email is: " + emp1.getAlternateEmail());
        System.out.println("Mailbox capacity is " + emp1.getMailboxCapacity());
        System.out.println(emp1.showInfo());
        System.out.println("Your passoword is: "+ emp1.getPassword());
    }
}
