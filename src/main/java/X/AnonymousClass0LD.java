package X;

import android.database.ContentObserver;

/* renamed from: X.0LD  reason: invalid class name */
public class AnonymousClass0LD extends ContentObserver {
    public final /* synthetic */ AnonymousClass01I A00;
    public final /* synthetic */ AnonymousClass0HN A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0LD(AnonymousClass01I r2, AnonymousClass0HN r3) {
        super(null);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void onChange(boolean z) {
        AnonymousClass01I r0 = this.A00;
        r0.A04();
        if (r0.A00 != null) {
            this.A01.A05();
        }
    }
}
