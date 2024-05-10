public class Praktikum {
    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        String nameSurname = "Тимоти Шаламе";
        Account account = new Account(nameSurname);
        boolean isValid = account.checkNameToEmboss();
        if (isValid) {
            System.out.println("Можно использовать фамилию и имя для печати на банковской карте.");
        } else {
            System.out.println("Нельзя использовать фамилию и имя для печати на банковской карте.");
        }
    }

}
