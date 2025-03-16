public class LockAdapter implements Device {
    private LegacyLockSystem legacyLockSystem;

    public LockAdapter(LegacyLockSystem legacyLockSystem) {
        this.legacyLockSystem = legacyLockSystem;
    }

    public String operate() {
        return legacyLockSystem.unlock();
    }
}