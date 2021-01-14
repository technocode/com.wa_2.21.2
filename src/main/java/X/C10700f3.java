package X;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0f3  reason: invalid class name and case insensitive filesystem */
public class C10700f3 extends AnonymousClass0JW {
    public final C04080Iy A00;
    public final AbstractC47922Kf A01;
    public final AnonymousClass0BV A02;
    public final HashMap A03 = new HashMap();

    public C10700f3(AnonymousClass0BV r5, Collection collection, C04080Iy r7, AbstractC47922Kf r8) {
        File file;
        this.A02 = r5;
        this.A00 = r7;
        this.A01 = r8;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC007503q r1 = (AbstractC007503q) it.next();
            if (r1 instanceof AnonymousClass0M3) {
                AnonymousClass0M3 r12 = (AnonymousClass0M3) r1;
                String str = r12.A06;
                AnonymousClass0M4 r0 = r12.A02;
                if (r0 != null) {
                    file = r0.A0F;
                } else {
                    file = null;
                }
                if (!(str == null || file == null)) {
                    this.A03.put(str, file);
                }
            }
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        this.A01.AFN((Collection) obj);
    }
}
