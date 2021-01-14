package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2w3  reason: invalid class name */
public class AnonymousClass2w3 {
    public static volatile AnonymousClass2w3 A01;
    public final AnonymousClass01X A00;

    public AnonymousClass2w3(AnonymousClass01X r1) {
        this.A00 = r1;
    }

    public static AnonymousClass2w3 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass2w3.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass2w3(AnonymousClass01X.A00());
                }
            }
        }
        return A01;
    }

    public AnonymousClass3HZ A01(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        return new AnonymousClass3HZ(this.A00, instance.get(6), new GregorianCalendar(instance.get(1), instance.get(2), 1));
    }

    public C63222w4 A02(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        return new C63222w4(this.A00, instance.get(6), new GregorianCalendar(instance.get(1), instance.get(2), instance.get(5)));
    }

    public List A03(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        C63222w4 r2 = null;
        while (it.hasNext()) {
            C63222w4 A02 = A02(((AnonymousClass0MH) it.next()).A04);
            if (r2 != null) {
                if (!r2.equals(A02)) {
                    arrayList.add(r2);
                } else {
                    r2.count++;
                }
            }
            A02.count = 0;
            r2 = A02;
            r2.count++;
        }
        if (r2 != null) {
            arrayList.add(r2);
        }
        return arrayList;
    }
}
