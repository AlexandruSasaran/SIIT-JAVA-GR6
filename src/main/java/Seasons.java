public enum Seasons {
    SPRING{
        @Override
        public String toString() {
            return "SPRING";
        }
    },
    SUMMER{
        @Override
        public String toString() {
            return "SUMMER";
        }
    },
    AUTUM{
        @Override
        public String toString() {
            return "AUTUM";
        }
    },
    WINTER{
        @Override
        public String toString() {
            return "WINTER";
        }
    };

    public static Seasons getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
