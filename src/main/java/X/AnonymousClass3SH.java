package X;

import android.graphics.Bitmap;
import android.view.View;

/* renamed from: X.3SH  reason: invalid class name */
public class AnonymousClass3SH implements AbstractC667235o {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC007503q A01;
    public final /* synthetic */ AnonymousClass0D9 A02;
    public final /* synthetic */ C02580Cq A03;
    public final /* synthetic */ Object A04;

    public AnonymousClass3SH(C02580Cq r1, AbstractC007503q r2, Object obj, View view, AnonymousClass0D9 r5) {
        this.A03 = r1;
        this.A01 = r2;
        this.A04 = obj;
        this.A00 = view;
        this.A02 = r5;
    }

    @Override // X.AbstractC667235o
    public void AG1() {
        this.A02.AG1();
    }

    @Override // X.AbstractC667235o
    public void AJW(Bitmap bitmap) {
        String str;
        C02580Cq r1 = this.A03;
        AbstractC007503q r3 = this.A01;
        synchronized (r1) {
            C007303n r0 = r3.A0n;
            if (r0 == null || (str = r0.A01) == null) {
                str = "null";
            }
            r1.A0F(str, bitmap);
        }
        Object obj = this.A04;
        View view = this.A00;
        if (obj.equals(view.getTag())) {
            this.A02.APh(view, bitmap, r3);
        }
    }
}
