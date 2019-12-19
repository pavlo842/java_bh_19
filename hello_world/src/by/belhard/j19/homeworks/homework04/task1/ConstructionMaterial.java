package by.belhard.j19.homeworks.homework04.task1;

public enum ConstructionMaterial {

    BRICK {
        @Override
        public String toString() {
            return "Кирпич";
        }
    },
    MONOLITH {
        @Override
        public String toString() {
            return "Монолит";
        }
    },
    BLOCKS {
        @Override
        public String toString() {
            return "Газосиликатные блоки";
        }
    },
    CARDBOARD {
        @Override
        public String toString() {
            return "Картон";
        }
    };

}
