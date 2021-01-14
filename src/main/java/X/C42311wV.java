package X;

import android.graphics.Bitmap;

/* renamed from: X.1wV  reason: invalid class name and case insensitive filesystem */
public class C42311wV implements AbstractC27871Rx {
    public boolean A00;
    public final /* synthetic */ C42301wU A01;

    public C42311wV(C42301wU r1) {
        this.A01 = r1;
    }

    @Override // X.AbstractC27871Rx
    public void AHF(C42301wU r3, Bitmap bitmap, boolean z) {
        if (this.A00) {
            return;
        }
        if (r3.A04 == 3) {
            this.A00 = true;
            C42301wU r1 = this.A01;
            r1.A07.AHF(r1, bitmap, z);
            return;
        }
        this.A01.A07.AHF(r3, bitmap, z);
    }
}
