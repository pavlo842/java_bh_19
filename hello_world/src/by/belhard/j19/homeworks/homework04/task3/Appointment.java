package by.belhard.j19.homeworks.homework04.task3;

public enum Appointment {
        // Назначение

    CIVILAVIATION {
        @Override
        public String toString() {
            return "Гражданская авиация";
        }
    },
    MILITARYAIRCRAFT {
        @Override
        public String toString() {
            return "Военная авиация";
        }
    },
    SPACEAVIATION {
        @Override
        public String toString() {
            return "Космическая авиация";
        }
    };

}
