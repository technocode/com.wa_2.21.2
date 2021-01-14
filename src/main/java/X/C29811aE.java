package X;

import java.util.ArrayList;

/* renamed from: X.1aE  reason: invalid class name and case insensitive filesystem */
public class C29811aE extends AnonymousClass0WC {
    public float A00 = -1.0f;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public AnonymousClass0WG A04;

    public C29811aE() {
        AnonymousClass0WG r3 = this.A0Y;
        this.A04 = r3;
        this.A01 = 0;
        ArrayList arrayList = this.A0g;
        arrayList.clear();
        arrayList.add(r3);
        AnonymousClass0WG[] r1 = this.A0n;
        int length = r1.length;
        for (int i = 0; i < length; i++) {
            r1[i] = r3;
        }
    }

    public void A0I(int i) {
        AnonymousClass0WG r3;
        if (this.A01 != i) {
            this.A01 = i;
            ArrayList arrayList = this.A0g;
            arrayList.clear();
            if (i == 1) {
                r3 = this.A0W;
                this.A04 = r3;
            } else {
                r3 = this.A0Y;
                this.A04 = r3;
            }
            arrayList.add(r3);
            AnonymousClass0WG[] r2 = this.A0n;
            int length = r2.length;
            for (int i2 = 0; i2 < length; i2++) {
                r2[i2] = r3;
            }
        }
    }
}
