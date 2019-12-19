package by.belhard.j19.homeworks.homework04.task1;

public enum Elevator {

    YES {
        @Override
        public String toString() {
            return "Лифт имеется";
        }
    },
    NO {
        @Override
        public String toString() {
            return "Лифт отсутсвует";
        }
    };

}
