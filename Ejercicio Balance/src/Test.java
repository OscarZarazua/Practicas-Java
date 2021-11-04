public class Test {
        public static void main(String[] args) {

            Account a = new Account(0);
            Account a2 = new Account(0);
            Customer c = new Customer("Oscar", "Zarazua", a);
            Customer c2 = new Customer("Javier", "Muñoz", a2);

            a.deposit(1500);
            a.withdraw(1200);

            System.out.println("Nombre de usuario " + c.getFirstName() + c.getLastname() + " el balance es " + a.getBalance());

            a2.withdraw(1700);
            a2.deposit(1500);

            System.out.println(" Nombre de usuario " + c2.getFirstName() + c2.getLastname() + " el balance es " + a2.getBalance());
        }
}
