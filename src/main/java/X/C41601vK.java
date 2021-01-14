package X;

import java.io.File;

/* renamed from: X.1vK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41601vK implements AbstractC007203m {
    public final /* synthetic */ AnonymousClass088 A00;
    public final /* synthetic */ C000300f A01;
    public final /* synthetic */ AnonymousClass00D A02;

    public /* synthetic */ C41601vK(AnonymousClass00D r1, C000300f r2, AnonymousClass088 r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC007203m
    public final Object A2O(Object obj) {
        return Boolean.valueOf(AnonymousClass0JJ.A0L((File) obj, this.A02, this.A01, this.A00));
    }
}
