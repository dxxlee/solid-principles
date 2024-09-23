public class Main {
    //Task1

    public static void main(String[] args) {
        User user = new User("Daniel", "danielexample.com");
        EmailValidator validator = new EmailValidator();

        if (validator.isValid(user.getEmail())) {
            System.out.println(user.getName() + "'s email is valid");
        }
        else {
            System.out.println(user.getName() + "'s email is invalid");
        }
    }


    //TASK 2
//    public static void main(String[] args) {
//        Shape rectangle = new Rectangle(5,3);
//        Shape circle = new Circle(5);
//
//        System.out.println("rectangle area: " + rectangle.area());
//        System.out.println("circle area: " + circle.area());
//    }


//Task 3
//    public static void main(String[] args) {
//        Bird sparrow = new Sparrow();
//        ((Flyable) sparrow) .fly();
//
//        Bird penguin = new Penguin();
//        penguin.eat();
//    }


//Task 4
//    public static void main(String[] args){
//        Workable humanWorker = new HumanWorker();
//        Workable robotWorker = new RobotWorker();
//
//        humanWorker.work();
//        ((Eatable) humanWorker).eat();
//
//        robotWorker.work();
//    }

////Task 5
//        public static void main(String[] args){
//            Switchable light = new Light();
//            Button button = new Button(light);
//
//            button.press();
//            button.press();
//            button.press();
//            button.press();
//            button.press();
//            button.press();
//            button.press();
//            button.press();
//            button.press();
//        }
}