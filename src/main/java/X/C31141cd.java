package X;

import android.os.Build;

/* renamed from: X.1cd  reason: invalid class name and case insensitive filesystem */
public final class C31141cd extends AbstractC16820qU {
    public C31141cd() {
        super(3, 4);
    }

    @Override // X.AbstractC16820qU
    public void A00(AbstractC16990qn r3) {
        if (Build.VERSION.SDK_INT >= 23) {
            ((C30761bu) r3).A00.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }
}
