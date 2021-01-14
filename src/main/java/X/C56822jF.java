package X;

import java.util.HashMap;

/* renamed from: X.2jF  reason: invalid class name and case insensitive filesystem */
public class C56822jF implements AnonymousClass1W7 {
    public final /* synthetic */ AnonymousClass0CH A00;
    public final /* synthetic */ String A01;

    public C56822jF(AnonymousClass0CH r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    @Override // X.AnonymousClass1W7
    public void AFF(boolean z) {
        HashMap hashMap = this.A00.A0j;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }

    @Override // X.AnonymousClass1W7
    public void AFG(AnonymousClass1W8 r3, C49982Sy r4) {
        HashMap hashMap = this.A00.A0j;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }
}
