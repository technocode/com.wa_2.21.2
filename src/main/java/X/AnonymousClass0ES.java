package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0ES  reason: invalid class name */
public class AnonymousClass0ES {
    public static volatile AnonymousClass0ES A0C;
    public long A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass09K A03;
    public final AnonymousClass0EV A04;
    public final AnonymousClass00S A05;
    public final C002701k A06;
    public final AnonymousClass0ET A07;
    public final AnonymousClass0EX A08;
    public final AnonymousClass09H A09;
    public final AnonymousClass0AT A0A;
    public final AnonymousClass00T A0B;

    public AnonymousClass0ES(AnonymousClass00S r1, C002701k r2, AnonymousClass02M r3, AnonymousClass009 r4, AnonymousClass00T r5, AnonymousClass09H r6, AnonymousClass0AT r7, AnonymousClass09K r8, AnonymousClass0ET r9, AnonymousClass0EV r10, AnonymousClass0EX r11) {
        this.A05 = r1;
        this.A06 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A0B = r5;
        this.A09 = r6;
        this.A0A = r7;
        this.A03 = r8;
        this.A07 = r9;
        this.A04 = r10;
        this.A08 = r11;
    }

    public static AnonymousClass0ES A00() {
        if (A0C == null) {
            synchronized (AnonymousClass0ES.class) {
                if (A0C == null) {
                    A0C = new AnonymousClass0ES(AnonymousClass00S.A00(), C002701k.A00(), AnonymousClass02M.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass09H.A01(), AnonymousClass0AT.A03, AnonymousClass09K.A07, AnonymousClass0ET.A00(), AnonymousClass0EV.A00(), AnonymousClass0EX.A00());
                }
            }
        }
        return A0C;
    }

    public void A01(C40411tE r18) {
        String A022;
        AnonymousClass0OS[] r6;
        AnonymousClass0M5 r0;
        AnonymousClass0OS[] r1;
        AnonymousClass0M5 r13;
        AnonymousClass0M5[] r02;
        AnonymousClass0M5[] r12;
        AnonymousClass02N r5 = r18.A0K;
        if (AnonymousClass1VY.A0Z(r5) && this.A03.A06 && this.A00 < this.A05.A05()) {
            Log.w("app/sendSetProfilePhoto");
            C450222o r14 = new C450222o(r5, r18.A0L, this.A09, r18);
            byte[] bArr = r18.A06;
            boolean z = false;
            if (bArr == null) {
                z = true;
            }
            r14.A00 = z;
            AnonymousClass1Xa r9 = r14.A04;
            if (r9 != null) {
                A022 = r9.A01;
            } else {
                A022 = r14.A03.A02();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new AnonymousClass0OS("id", A022, null, (byte) 0));
            arrayList2.add(new AnonymousClass0OS("xmlns", "w:profile:picture", null, (byte) 0));
            arrayList2.add(new AnonymousClass0OS("to", r14.A02));
            arrayList2.add(new AnonymousClass0OS("type", "set", null, (byte) 0));
            if (r9 != null) {
                arrayList2.add(new AnonymousClass0OS("web", r9.A00, null, (byte) 0));
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new AnonymousClass0OS("type", "image", null, (byte) 0));
            if (!arrayList4.isEmpty()) {
                r6 = (AnonymousClass0OS[]) arrayList4.toArray(new AnonymousClass0OS[0]);
            } else {
                r6 = null;
            }
            if (arrayList3.isEmpty() || (r12 = (AnonymousClass0M5[]) arrayList3.toArray(new AnonymousClass0M5[0])) == null) {
                r0 = new AnonymousClass0M5("picture", r6, null, bArr);
            } else {
                r0 = new AnonymousClass0M5("picture", r6, r12, null);
            }
            arrayList.add(r0);
            AnonymousClass09H r10 = r14.A03;
            if (!arrayList2.isEmpty()) {
                r1 = (AnonymousClass0OS[]) arrayList2.toArray(new AnonymousClass0OS[0]);
            } else {
                r1 = null;
            }
            if (arrayList.isEmpty() || (r02 = (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0])) == null) {
                r13 = new AnonymousClass0M5("iq", r1, null, null);
            } else {
                r13 = new AnonymousClass0M5("iq", r1, r02, null);
            }
            r10.A0B(25, A022, r13, r14, 0);
        }
    }

    public void A02(AnonymousClass02N r5, int i) {
        if (i == 500 || i == 501 || i == 503) {
            this.A00 = this.A05.A05() + 3600000;
        } else if (i == 401 && r5 != null && !AnonymousClass1VY.A0Y(r5)) {
            this.A04.A03(r5);
        }
    }

    public void A03(AnonymousClass02N r11, int i, int i2, AbstractC03810Hu r14) {
        if (AnonymousClass1VY.A0Z(r11) && !AnonymousClass1VY.A0T(r11) && this.A00 < this.A05.A05()) {
            AnonymousClass0AT r1 = this.A0A;
            if (r1 == null) {
                throw null;
            } else if (((i2 & 1) != 0 && r1.A01.A02(r11)) || ((i2 & 2) != 0 && r1.A02.A02(r11))) {
                AnonymousClass02M r0 = this.A02;
                r0.A02.post(new RunnableC25831Im(this, i, i2, r11, r14));
            }
        }
    }
}
