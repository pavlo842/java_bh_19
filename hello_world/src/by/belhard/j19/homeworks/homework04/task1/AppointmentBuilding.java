package by.belhard.j19.homeworks.homework04.task1;

public enum AppointmentBuilding {

    HOUSE {
        @Override
        public String toString() {
            return "Жилой дом";
        }
    },
    OFFICEBUILDING {
        @Override
        public String toString() {
            return "Офисное здание";
        }
    },
    INDUSTRIALFACILITY {
        @Override
        public String toString() {
            return "Промышленный объект";
        }
    },
    FARMBUILDING {
        @Override
        public String toString() {
            return "Хоз. постройка";
        }
    };

}
