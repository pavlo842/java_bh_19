package by.belhard.j19.homeworks.homework04.task3;

public enum TypeOfAviation {
        //  Тип авиации

    AIRPLANE {
        @Override
        public String toString() {
            return "Самолет";
        }
    },
    HELICOPTER {
        @Override
        public String toString() {
            return "Вертолет";
        }
    },
    HOVERCRAFT {
        @Override
        public String toString() {
            return "Судно на воздушной подушке - Ховеркрафт";
        }
    },
    ROCKET {
        @Override
        public String toString() {
            return "Ракета";
        }
    }

}
