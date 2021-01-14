package X;

/* renamed from: X.2Q4  reason: invalid class name */
public enum AnonymousClass2Q4 {
    UPTO_DATE(true, true, "UPTO_DATE"),
    FETCH_ERROR(false, false, "FETCH_ERROR"),
    NETWORK_ERROR(false, false, "NETWORK_ERROR"),
    LANGUAGE_UNAVAILABLE(false, true, "LANGUAGE_UNAVAILABLE");
    
    public final boolean fetchSuccessful;
    public final String fieldStatString;
    public final boolean gotDictionary;

    /* access modifiers changed from: public */
    AnonymousClass2Q4(boolean z, boolean z2, String str) {
        this.gotDictionary = z;
        this.fetchSuccessful = z2;
        this.fieldStatString = str;
    }
}
