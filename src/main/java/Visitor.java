    public class Visitor {

        public Visitor(String name, int age,String height, double money){
            this.name = name;
            this.age = age;
            this.height = height;
            this.money = money;
        }

        public String getName();{
            return this.name;
        }

        public int getAge(){
            return this.age;
        }

        public int getHeight(){
            return this.height;
        }

        public double getMoney(){
            return this.money;
        }

    }