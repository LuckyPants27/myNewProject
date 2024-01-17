public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        dog = dog +4;
        cat = cat +4;
        paper = paper +4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);

        friend = friend * 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(friend);

        frog = frog / 3.5;
        System.out.println(friend);

        frog = frog + 4;
        System.out.println(frog);


        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifference);


        var workHours = 640;
        var eachEmployeeWorkHours = 8;
        var employeesAmount = workHours / eachEmployeeWorkHours;
        System.out.println("Всего работников в компании — " + employeesAmount + " человек");

        employeesAmount += 94;
        workHours = employeesAmount * 8;
        System.out.println("Если в компании работает " + employeesAmount + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");
    }
}