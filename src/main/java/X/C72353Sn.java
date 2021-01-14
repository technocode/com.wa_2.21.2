package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: X.3Sn  reason: invalid class name and case insensitive filesystem */
public class C72353Sn implements AnonymousClass12N {
    public final Context A00;

    public C72353Sn(Context context) {
        this.A00 = context;
    }

    @Override // X.AnonymousClass12N
    public AbstractC33821hR[] A3R(Handler handler, AnonymousClass16A r14, AbstractC225612g r15, AnonymousClass14I r16, AbstractC228213h r17, AnonymousClass138 r18) {
        ArrayList arrayList = new ArrayList();
        Context context = this.A00;
        AnonymousClass13X r6 = AnonymousClass13X.A00;
        arrayList.add(new AnonymousClass2AM(context, r6, r18, handler, r14));
        arrayList.add(new AnonymousClass2AL(context, r6, r18, handler, r15, AnonymousClass12Y.A00(context), new AbstractC225412e[0]));
        arrayList.add(new C461828l(r16, handler.getLooper()));
        return (AbstractC33821hR[]) arrayList.toArray(new AbstractC33821hR[0]);
    }
}
