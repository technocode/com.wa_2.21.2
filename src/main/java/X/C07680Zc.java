package X;

import android.graphics.Typeface;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: X.0Zc  reason: invalid class name and case insensitive filesystem */
public class C07680Zc extends AbstractC04990Mq {
    public final int A00;
    public final int A01;
    public final WeakReference A02;

    public C07680Zc(AnonymousClass0ZX r2, int i, int i2) {
        this.A02 = new WeakReference(r2);
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.AbstractC04990Mq
    public void A02(Typeface typeface) {
        int i;
        WeakReference weakReference = this.A02;
        AnonymousClass0ZX r3 = (AnonymousClass0ZX) weakReference.get();
        if (r3 != null) {
            if (Build.VERSION.SDK_INT >= 28 && (i = this.A00) != -1) {
                boolean z = false;
                if ((this.A01 & 2) != 0) {
                    z = true;
                }
                typeface = Typeface.create(typeface, i, z);
            }
            r3.A0B.post(new RunnableEBaseShape1S0200000_I0_0(weakReference, typeface));
        }
    }
}
