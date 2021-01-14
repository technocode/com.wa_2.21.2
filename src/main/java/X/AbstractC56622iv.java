package X;

import android.content.Context;

/* renamed from: X.2iv  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC56622iv implements AbstractRunnableC49892Sp {
    public final Context A00;
    public final AnonymousClass088 A01;
    public final C02590Cr A02;
    public final AnonymousClass2T4 A03;
    public final String A04;

    public AbstractC56622iv(AnonymousClass088 r1, C02590Cr r2, AnonymousClass2T4 r3, String str, Context context) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = str;
        this.A00 = context;
    }

    @Override // X.AbstractRunnableC49892Sp
    public AnonymousClass2T4 A7L() {
        return this.A03;
    }
}
