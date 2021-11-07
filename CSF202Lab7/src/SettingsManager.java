public class SettingsManager {
    private String deviceName;
    private float backLightLevel;

    private static final SettingsManager INSTANCE = new SettingsManager();

    private SettingsManager() {

    }

    public static SettingsManager getInstance() {
        return INSTANCE;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public float getBackLightLevel() {
        return backLightLevel;
    }

    public void setBackLightLevel(float backLightLevel) {
        if (0.0f > backLightLevel) {
            backLightLevel = 0.0f;
        } else {
            if (1.0f < backLightLevel) {
                backLightLevel = 1.0f;
            }
        }
        this.backLightLevel = backLightLevel;
    }
}
