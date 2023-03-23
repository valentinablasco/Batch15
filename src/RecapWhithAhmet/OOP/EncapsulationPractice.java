package RecapWhithAhmet.OOP;

public class EncapsulationPractice {
    private String name = "Ahmet";
    int age = 31;
    private long creditCard = 123456789;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 99) {
            this.age = age;
        } else {
            System.out.println();
        }
    }
            public long getCreditCard () {
                return creditCard;
            }

            public void setCreditCard ( long creditCard){
                this.creditCard = creditCard;
            }
        }
