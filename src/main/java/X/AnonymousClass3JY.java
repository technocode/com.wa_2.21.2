package X;

/* renamed from: X.3JY  reason: invalid class name */
public enum AnonymousClass3JY {
    REVOKE(0),
    EPHEMERAL_SETTING(3),
    EPHEMERAL_SYNC_RESPONSE(4),
    HISTORY_SYNC_NOTIFICATION(5),
    APP_STATE_SYNC_KEY_SHARE(6),
    APP_STATE_SYNC_KEY_REQUEST(7),
    MSG_FANOUT_BACKFILL_REQUEST(8),
    INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC(9);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass3JY(int i) {
        this.value = i;
    }

    public static AnonymousClass3JY A00(int i) {
        if (i == 0) {
            return REVOKE;
        }
        switch (i) {
            case 3:
                return EPHEMERAL_SETTING;
            case 4:
                return EPHEMERAL_SYNC_RESPONSE;
            case 5:
                return HISTORY_SYNC_NOTIFICATION;
            case 6:
                return APP_STATE_SYNC_KEY_SHARE;
            case 7:
                return APP_STATE_SYNC_KEY_REQUEST;
            case 8:
                return MSG_FANOUT_BACKFILL_REQUEST;
            case 9:
                return INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC;
            default:
                return null;
        }
    }
}
