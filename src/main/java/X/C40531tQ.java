package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1tQ  reason: invalid class name and case insensitive filesystem */
public class C40531tQ {
    public AnonymousClass0M3 A00;
    public final CopyOnWriteArrayList A01;

    public C40531tQ(List list) {
        this.A01 = new CopyOnWriteArrayList(list);
        AnonymousClass0M3 r0 = (AnonymousClass0M3) list.get(0);
        this.A00 = r0;
        AnonymousClass0M4 r2 = r0.A02;
        AnonymousClass00E.A08(r2 != null, "First media data is null");
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0M3 r4 = (AnonymousClass0M3) it.next();
            AnonymousClass0M4 r3 = r4.A02;
            AnonymousClass00E.A08(r3 != null, "Media data is null");
            AnonymousClass00E.A08(this.A00.A0m == r4.A0m, "Media type mismatch");
            AnonymousClass00E.A08(((AbstractC007503q) this.A00).A04 == ((AbstractC007503q) r4).A04, "Origin mismatch");
            AnonymousClass00E.A08(C006803i.A0q(this.A00.A0v(), r4.A0v()), "Caption mismatch");
            AnonymousClass00E.A08(C006803i.A0q(this.A00.A06, r4.A06), "Hash mismatch");
            AnonymousClass00E.A08(C006803i.A0q(this.A00.A05, r4.A05), "Encrypted hash mismatch");
            AnonymousClass00E.A08(this.A00.A00 == r4.A00, "Duration mismatch");
            AnonymousClass00E.A08(C006803i.A0q(this.A00.A07, r4.A07), "Mime mismatch");
            AnonymousClass00E.A08(C006803i.A0q(this.A00.A0w(), r4.A0w()), "Name mismatch");
            AnonymousClass00E.A08(C006803i.A0q(this.A00.A0A, r4.A0A), "Multicast id mismatch");
            if (r2 != null) {
                String str = r2.A0I;
                if (r3 != null) {
                    AnonymousClass00E.A08(C006803i.A0q(str, r3.A0I), "Media Job Id mismatch");
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    public synchronized AnonymousClass0M3 A00() {
        return this.A00;
    }

    public final AnonymousClass0M3 A01(C007303n r5) {
        if (r5 == null) {
            return null;
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0M3 r1 = (AnonymousClass0M3) it.next();
            if (r5.equals(r1.A0n)) {
                return r1;
            }
        }
        return null;
    }

    public String A02() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AbstractC007503q r1 = (AbstractC007503q) it.next();
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append(r1.A0n);
        }
        return sb.toString();
    }

    public synchronized void A03(C007303n r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("messagelist/remove ");
        sb.append(r3);
        sb.append(" from ");
        sb.append(A02());
        Log.i(sb.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        copyOnWriteArrayList.remove(A01(r3));
        if (!copyOnWriteArrayList.isEmpty()) {
            this.A00 = (AnonymousClass0M3) copyOnWriteArrayList.get(0);
        }
    }

    public boolean A04() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (AnonymousClass1VY.A0b(((AbstractC007503q) it.next()).A0n.A00)) {
                return true;
            }
        }
        return false;
    }
}
