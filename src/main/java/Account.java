public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }

        if (name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ') {
            return false;
        }
        int spaceCount = 0;
        for (char c : name.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount == 1;
    }
}
