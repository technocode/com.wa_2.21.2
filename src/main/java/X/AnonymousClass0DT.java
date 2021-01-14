package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0DT  reason: invalid class name */
public class AnonymousClass0DT {
    public static volatile AnonymousClass0DT A02;
    public final AnonymousClass0DU A00;
    public final Map A01 = new HashMap();

    public AnonymousClass0DT(AnonymousClass0DU r2) {
        this.A00 = r2;
    }

    public static AnonymousClass0DT A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0DT.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0DT(AnonymousClass0DU.A00());
                }
            }
        }
        return A02;
    }

    public final AnonymousClass0DZ A01(AbstractC48162Ld r4) {
        AnonymousClass0DZ r0;
        String str = r4.A03()[0];
        synchronized (this) {
            r0 = (AnonymousClass0DZ) this.A01.get(str);
        }
        return r0;
    }

    public Object A02(String str) {
        Object obj;
        synchronized (this) {
            obj = this.A01.get(str);
            if (obj == null) {
                throw null;
            }
        }
        return obj;
    }

    public synchronized Set A03(Collection collection) {
        return this.A00.A0B(collection);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A04() {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DT.A04():void");
    }

    public synchronized void A05(String str, AnonymousClass0DZ r4) {
        Map map = this.A01;
        if (!map.containsKey(str)) {
            map.put(str, r4);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("mutation-handlers/add-handler handler exists with key: ");
            sb.append(str);
            Log.w(sb.toString());
        }
    }

    public synchronized void A06(Collection collection) {
        AnonymousClass0DU r1 = this.A00;
        r1.A0G(r1.A0B(collection));
    }
}
