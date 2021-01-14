package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3Ak  reason: invalid class name */
public abstract class AnonymousClass3Ak {
    public final CountDownLatch A00 = new CountDownLatch(1);
    public volatile Object A01;

    public static Object A00(AnonymousClass3Ak r26) {
        try {
            if (r26 instanceof AnonymousClass3WB) {
                AnonymousClass3WB r4 = (AnonymousClass3WB) r26;
                try {
                    AnonymousClass0CM r11 = r4.A02.A01;
                    AbstractC21010xx r7 = r4.A00;
                    AnonymousClass3Am r1 = r4.A01;
                    int i = r1.A00;
                    String str = r1.A04;
                    int i2 = r1.A02;
                    int i3 = r1.A01;
                    String str2 = r1.A05;
                    String str3 = r1.A03;
                    if (r11.A00 != null) {
                        JniBridge.jvidispatchIIIIIOOOO((long) i, (long) i2, (long) i3, (long) 0, str, str2, str3, r7);
                    } else {
                        throw null;
                    }
                } catch (Exception unused) {
                    Log.e("Error : Could not enqueue upload request in wa-msys.");
                    ((AnonymousClass3Ak) r4).A01 = 23;
                    ((AnonymousClass3Ak) r4).A00.countDown();
                }
            } else if (r26 instanceof AnonymousClass3W9) {
                AnonymousClass3W9 r9 = (AnonymousClass3W9) r26;
                try {
                    AnonymousClass0CM r5 = r9.A02.A01;
                    AbstractC20980xu r12 = r9.A00;
                    AnonymousClass3Al r6 = r9.A01;
                    int i4 = r6.A01;
                    int i5 = r6.A00;
                    String str4 = r6.A06;
                    String str5 = r6.A05;
                    String str6 = r6.A03;
                    byte[] bArr = r6.A08;
                    byte[] bArr2 = r6.A07;
                    byte[] bArr3 = r6.A09;
                    String str7 = r6.A02;
                    String str8 = r6.A04;
                    if (r5.A00 != null) {
                        JniBridge.jvidispatchIIIIOOOOOOOOO((long) i4, (long) i5, (long) 0, str4, str5, str6, str7, str8, r12, bArr, bArr2, bArr3);
                    } else {
                        throw null;
                    }
                } catch (Exception unused2) {
                    Log.e("Error: Could not enqueue download request in wa-msys");
                    ((AnonymousClass3Ak) r9).A01 = new AnonymousClass1W8(17, null, false);
                    ((AnonymousClass3Ak) r9).A00.countDown();
                }
            } else if (r26 instanceof AnonymousClass3W8) {
                AnonymousClass3W8 r3 = (AnonymousClass3W8) r26;
                C20950xr A002 = C20950xr.A00();
                AnonymousClass3W7 r72 = new AnonymousClass3W7(r3);
                String str9 = r3.A04;
                int i6 = r3.A00;
                byte[] bArr4 = r3.A08;
                String str10 = r3.A02;
                String str11 = r3.A03;
                byte[] bArr5 = r3.A07;
                Map map = r3.A06;
                List list = r3.A05;
                if (A002.A00 != null) {
                    JniBridge.jvidispatchIIOOOOOOOO((long) i6, str9, str10, str11, r72, bArr4, bArr5, map, list);
                } else {
                    throw null;
                }
            } else if (r26 instanceof AnonymousClass3W6) {
                AnonymousClass3W6 r2 = (AnonymousClass3W6) r26;
                C20950xr A003 = C20950xr.A00();
                AnonymousClass3W5 r62 = new AnonymousClass3W5(r2);
                String str12 = r2.A03;
                String str13 = r2.A01;
                String str14 = r2.A02;
                byte[] bArr6 = r2.A06;
                Map map2 = r2.A05;
                List list2 = r2.A04;
                if (A003.A00 != null) {
                    JniBridge.jvidispatchIOOOOOOO(1, str12, str13, str14, r62, bArr6, map2, list2);
                } else {
                    throw null;
                }
            } else if (!(r26 instanceof AnonymousClass3W4)) {
                AnonymousClass3W2 r22 = (AnonymousClass3W2) r26;
                C20950xr A004 = C20950xr.A00();
                AnonymousClass3W1 r52 = new AnonymousClass3W1(r22);
                String str15 = r22.A01;
                String str16 = r22.A02;
                byte[] bArr7 = r22.A06;
                byte[] bArr8 = r22.A05;
                Map map3 = r22.A04;
                List list3 = r22.A03;
                if (A004.A00 != null) {
                    JniBridge.jvidispatchIOOOOOOO(0, str15, str16, r52, bArr7, bArr8, map3, list3);
                } else {
                    throw null;
                }
            } else {
                AnonymousClass3W4 r23 = (AnonymousClass3W4) r26;
                C20950xr A005 = C20950xr.A00();
                AnonymousClass3W3 r73 = new AnonymousClass3W3(r23);
                String str17 = r23.A02;
                String str18 = r23.A03;
                byte[] bArr9 = r23.A07;
                String str19 = r23.A04;
                String str20 = r23.A01;
                Map map4 = r23.A06;
                List list4 = r23.A05;
                if (A005.A00 != null) {
                    JniBridge.jvidispatchIOOOOOOOO(str17, str18, str19, str20, r73, bArr9, map4, list4);
                } else {
                    throw null;
                }
            }
            r26.A00.await();
            return r26.A01;
        } catch (Exception e) {
            Log.e("AsyncRunnable/runAndWait", e);
            return null;
        }
    }
}
