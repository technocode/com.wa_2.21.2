package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: X.3T0  reason: invalid class name */
public class AnonymousClass3T0 implements AnonymousClass12N {
    public boolean A00;
    public final Context A01;

    public AnonymousClass3T0(Context context, boolean z) {
        this.A01 = context;
        this.A00 = z;
    }

    @Override // X.AnonymousClass12N
    public AbstractC33821hR[] A3R(Handler handler, AnonymousClass16A r10, AbstractC225612g r11, AnonymousClass14I r12, AbstractC228213h r13, AnonymousClass138 r14) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass2AM(this.A01, new C72473Sz(this), r14, handler, r10));
        return (AbstractC33821hR[]) arrayList.toArray(new AbstractC33821hR[0]);
    }
}
