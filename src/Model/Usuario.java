package Model;

public class Usuario {
    public enum Tier {
        FREE("Free"),
        PREMIUM("Premium");
        private final String tierName;

        Tier(String tierName) {
            this.tierName = tierName;
        }

        public String getTierName() {
            return tierName;
        }

        @Override
        public String toString() {
            return tierName;
        }
    }
    private Tier tier;
    private int id;

    public Usuario(Tier tier, int id) {
        this.tier = tier;
        this.id = id;
    }

    public Tier getTier() {
        return tier;
    }

    public int getId() {
        return id;
    }
}
