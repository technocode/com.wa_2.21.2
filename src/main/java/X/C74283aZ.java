package X;

import android.graphics.Bitmap;

/* renamed from: X.3aZ  reason: invalid class name and case insensitive filesystem */
public class C74283aZ implements AbstractC27251Ot {
    public final C007303n A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass377 A02;
    public final /* synthetic */ Bitmap[] A03;

    public C74283aZ(AnonymousClass377 r1, C007303n r2, int i, Bitmap[] bitmapArr) {
        this.A02 = r1;
        this.A01 = i;
        this.A03 = bitmapArr;
        this.A00 = r2;
    }

    @Override // X.AbstractC27251Ot
    public void AIE(C27241Os r6, boolean z) {
        C007303n r4 = this.A00;
        AnonymousClass377 r3 = this.A02;
        if (r4 == r3.A09) {
            r3.A0B(r6.A08, r4, this.A01, this.A03);
        }
    }
}
