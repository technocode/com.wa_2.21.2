package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1S3  reason: invalid class name */
public class AnonymousClass1S3 {
    public static volatile AnonymousClass1S3 A0B;
    public boolean A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final C27831Rq A03;
    public final AnonymousClass0HL A04;
    public final C42391wd A05;
    public final AnonymousClass04j A06;
    public final AnonymousClass09H A07;
    public final List A08 = new ArrayList();
    public final List A09 = new ArrayList();
    public final Map A0A = new HashMap();

    public AnonymousClass1S3(AnonymousClass02M r2, AnonymousClass01I r3, AnonymousClass09H r4, C42391wd r5, AnonymousClass0HL r6, AnonymousClass04j r7, C27831Rq r8) {
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r4;
        this.A05 = r5;
        this.A06 = r7;
        this.A03 = r8;
        this.A04 = r6;
    }

    public static AnonymousClass1S3 A00() {
        if (A0B == null) {
            synchronized (AnonymousClass1S3.class) {
                if (A0B == null) {
                    A0B = new AnonymousClass1S3(AnonymousClass02M.A00(), AnonymousClass01I.A00(), AnonymousClass09H.A01(), C42391wd.A00, AnonymousClass0HL.A00(), AnonymousClass04j.A00(), C27831Rq.A00());
                }
            }
        }
        return A0B;
    }

    public void A01(AnonymousClass2KZ r4, int i) {
        AnonymousClass02M r2 = this.A01;
        r2.A02.post(new RunnableEBaseShape1S0201000_I1(r4, i, this, 11));
    }

    public void A02(C48082Kv r4, boolean z) {
        AnonymousClass02M r2 = this.A01;
        r2.A02.post(new RunnableEBaseShape1S0210000_I1(this, r4, z, 2));
    }

    public void A03(UserJid userJid, int i) {
        Map map;
        boolean z;
        int i2 = 1;
        if (this.A02.A09(userJid)) {
            i2 = 4;
        }
        int i3 = i2 * 6;
        AnonymousClass0HL r6 = this.A04;
        synchronized (r6) {
            map = r6.A00;
            z = false;
            if (map.get(userJid) != null) {
                z = true;
            }
        }
        if (z) {
            synchronized (r6) {
                AnonymousClass1Rs r7 = (AnonymousClass1Rs) map.get(userJid);
                if (r7 != null) {
                    r7.A00 = new AnonymousClass2KY(true, null);
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList = r7.A01;
                        if (i4 >= arrayList.size() - i3) {
                            break;
                        }
                        int size = arrayList.size() - 1;
                        String str = ((C48052Ks) arrayList.get(size)).A06;
                        r6.A02.remove(str);
                        r6.A01.remove(str);
                        arrayList.remove(size);
                        i4++;
                    }
                }
            }
            C42391wd r0 = this.A05;
            AnonymousClass00E.A01();
            Iterator it = r0.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC03690Hg) r1.next()).AFv(userJid);
                } else {
                    A04(userJid, i, i3 << 1);
                    return;
                }
            }
        } else {
            A04(userJid, i, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r22.A00 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(com.whatsapp.jid.UserJid r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S3.A04(com.whatsapp.jid.UserJid, int, int):void");
    }

    public boolean A05(C48092Kw r18) {
        C42401we r9 = new C42401we(this.A07, this, r18, this.A04, this.A06, new AnonymousClass1SX());
        boolean z = false;
        if (r9.A03.A05()) {
            AnonymousClass09H r10 = r9.A05;
            String A022 = r10.A02();
            C48092Kw r8 = r9.A04;
            String str = r8.A03;
            AnonymousClass00E.A09(!TextUtils.isEmpty(str), "catalog productId cannot be null or empty");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AnonymousClass0M5("product_id", (AnonymousClass0OS[]) null, str));
            Integer num = r8.A02;
            if (num != null) {
                arrayList.add(new AnonymousClass0M5("width", (AnonymousClass0OS[]) null, num.toString()));
            }
            Integer num2 = r8.A01;
            if (num2 != null) {
                arrayList.add(new AnonymousClass0M5("height", (AnonymousClass0OS[]) null, num2.toString()));
            }
            arrayList.add(new AnonymousClass0M5("catalog_session_id", (AnonymousClass0OS[]) null, r8.A04));
            AnonymousClass0M5 r5 = new AnonymousClass0M5("product", new AnonymousClass0OS[]{new AnonymousClass0OS("jid", r8.A00)}, (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]), null);
            r10.A07(196, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "w:biz:catalog", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00)}, r5), r9, 32000);
            z = true;
        }
        StringBuilder A0S = AnonymousClass008.A0S("app/send-get-biz-product productId=");
        A0S.append(r9.A04.A03);
        A0S.append(" success:");
        A0S.append(z);
        Log.i(A0S.toString());
        return z;
    }
}
