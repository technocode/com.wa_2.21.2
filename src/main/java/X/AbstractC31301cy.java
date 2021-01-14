package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1cy  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC31301cy implements AbstractC17800sI {
    public AbstractC17830sL A00;
    public AbstractC17850sN A01;
    public Object A02;
    public final List A03 = new ArrayList();

    public AbstractC31301cy(AbstractC17850sN r2) {
        this.A01 = r2;
    }

    public final void A00(AbstractC17830sL r10, Object obj) {
        List<String> list = this.A03;
        if (!(list.isEmpty() || r10 == null)) {
            if (obj == null || A01(obj)) {
                C31291cx r102 = (C31291cx) r10;
                synchronized (r102.A01) {
                    AbstractC17820sK r0 = r102.A00;
                    if (r0 != null) {
                        r0.ACh(list);
                    }
                }
                return;
            }
            C31291cx r103 = (C31291cx) r10;
            synchronized (r103.A01) {
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (r103.A02(str)) {
                        AbstractC17610rq.A00().A02(C31291cx.A03, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                AbstractC17820sK r02 = r103.A00;
                if (r02 != null) {
                    r02.ACg(arrayList);
                }
            }
        }
    }

    public boolean A01(Object obj) {
        if (this instanceof AnonymousClass24Z) {
            return !((Boolean) obj).booleanValue();
        }
        if (this instanceof AnonymousClass24Y) {
            C17810sJ r3 = (C17810sJ) obj;
            return !r3.A00 || r3.A01;
        } else if (!(this instanceof AnonymousClass24U)) {
            return !((Boolean) obj).booleanValue();
        } else {
            return !((Boolean) obj).booleanValue();
        }
    }

    @Override // X.AbstractC17800sI
    public void AEb(Object obj) {
        this.A02 = obj;
        A00(this.A00, obj);
    }
}
