package HWL12;

public enum Ages {
         CHILDHOOD(1),
        YOUTH(18),
        MATURITY(40);
        public int value;

        Ages(int value) {
            this.value = value;
        }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}