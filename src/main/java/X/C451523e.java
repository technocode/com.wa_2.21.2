package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.23e  reason: invalid class name and case insensitive filesystem */
public class C451523e extends AbstractC29841aH {
    public int A00;
    public ArrayList A01;

    public C451523e(AnonymousClass0WC r6, int i) {
        super(r6);
        Object obj;
        int i2;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        super.A01 = i;
        AnonymousClass0WC r2 = this.A03;
        AnonymousClass0WC A06 = r2.A06(i);
        while (true) {
            r2 = A06;
            if (A06 == null) {
                break;
            }
            A06 = A06.A06(i);
        }
        this.A03 = r2;
        if (i == 0) {
            obj = r2.A0c;
        } else {
            obj = i == 1 ? r2.A0d : null;
        }
        arrayList.add(obj);
        AnonymousClass0WC A05 = r2.A05(i);
        while (A05 != null) {
            if (i == 0) {
                obj2 = A05.A0c;
            } else {
                obj2 = i == 1 ? A05.A0d : null;
            }
            arrayList.add(obj2);
            A05 = A05.A05(i);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC29841aH r1 = (AbstractC29841aH) it.next();
            int i3 = super.A01;
            if (i3 == 0) {
                r1.A03.A0a = this;
            } else if (i3 == 1) {
                r1.A03.A0b = this;
            }
        }
        int i4 = super.A01;
        if (i4 == 0 && ((AnonymousClass0WA) this.A03.A0Z).A0A) {
            ArrayList arrayList2 = this.A01;
            if (arrayList2.size() > 1) {
                this.A03 = ((AbstractC29841aH) arrayList2.get(arrayList2.size() - 1)).A03;
            }
        }
        AnonymousClass0WC r0 = this.A03;
        if (i4 == 0) {
            i2 = r0.A0A;
        } else {
            i2 = r0.A0L;
        }
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018e, code lost:
        if (r0 != r2) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0270, code lost:
        if (r13 != false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x030c, code lost:
        if (r13 != false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x03a6, code lost:
        if (r13 != false) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0164, code lost:
        if (r0 != r2) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03b0  */
    @Override // X.AbstractC14050lR, X.AbstractC29841aH
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AQn(X.AbstractC14050lR r24) {
        /*
        // Method dump skipped, instructions count: 953
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451523e.AQn(X.0lR):void");
    }

    public String toString() {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("ChainRun ");
        if (super.A01 == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        A0S.append(str);
        String obj = A0S.toString();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String A0K = AnonymousClass008.A0K(obj, "<");
            StringBuilder sb = new StringBuilder();
            sb.append(A0K);
            sb.append(next);
            obj = AnonymousClass008.A0K(sb.toString(), "> ");
        }
        return obj;
    }
}
