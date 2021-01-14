package X;

import java.util.HashMap;

/* renamed from: X.0uc  reason: invalid class name and case insensitive filesystem */
public class C19190uc extends HashMap<String, Object> {
    public final /* synthetic */ C32061eH this$0;
    public final /* synthetic */ long val$currentTime;
    public final /* synthetic */ String val$surface = null;

    public C19190uc(C32061eH r3, long j) {
        this.this$0 = r3;
        this.val$currentTime = j;
        put("duration", Long.valueOf(j - r3.A0H));
        put("surface", "unknown");
    }
}
