import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion;

public class Main {
    public static void main(String[] args) {
        // Nope
        // SettingsManager settingsManager = new SettingsManager();
        SettingsManager sm1 = SettingsManager.getInstance();
        SettingsManager sm2 = SettingsManager.getInstance();
        sm1.setDeviceName("device_one");
        System.out.println("sm1 "+sm1.getDeviceName());
        sm1.setBackLightLevel((2.0f));
        System.out.println("sm1 "+ sm1.getBackLightLevel());

        System.out.println("sm2 "+sm2.getDeviceName());
        System.out.println("sm2 "+ sm2.getBackLightLevel());


    }
}
