package X;

import android.graphics.Bitmap;

/* renamed from: X.0el  reason: invalid class name and case insensitive filesystem */
public class C10520el extends AnonymousClass0JW {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ AnonymousClass2OT A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;

    public C10520el(AnonymousClass2OT r1, Bitmap bitmap, int i, Runnable runnable, Runnable runnable2) {
        this.A02 = r1;
        this.A01 = bitmap;
        this.A00 = i;
        this.A04 = runnable;
        this.A03 = runnable2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            AnonymousClass2OT r3 = this.A02;
            r3.A04 = bitmap;
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
            r3.A02 = this.A00;
            r3.A0W.A02();
            r3.A0T.A05(r3.A0a, r3.A04);
            return;
        }
        Bitmap bitmap2 = this.A01;
        if (bitmap2 != null) {
            AnonymousClass2OT r32 = this.A02;
            r32.A04 = bitmap2;
            r32.A0W.A02();
            r32.A0T.A05(r32.A0a, r32.A04);
            Runnable runnable2 = this.A03;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        Runnable runnable3 = this.A03;
        if (runnable3 != null) {
            runnable3.run();
        }
    }
}
