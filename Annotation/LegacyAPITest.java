class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("This feature is deprecated.");
    }

    void newFeature() {
        System.out.println("This is the new feature.");
    }
}

public class LegacyAPITest {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}
