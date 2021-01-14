package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.0Bn  reason: invalid class name and case insensitive filesystem */
public class C02320Bn {
    public static volatile C02320Bn A0Y;
    public final AnonymousClass01I A00;
    public final AnonymousClass09G A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass09A A03;
    public final AnonymousClass09V A04;
    public final C014408c A05;
    public final C006903j A06;
    public final AnonymousClass01K A07;
    public final AnonymousClass0A2 A08;
    public final AnonymousClass0A0 A09;
    public final C018509r A0A;
    public final AnonymousClass0AB A0B;
    public final C015308l A0C;
    public final AnonymousClass0B6 A0D;
    public final AnonymousClass09Q A0E;
    public final C017809k A0F;
    public final AnonymousClass0B2 A0G;
    public final AnonymousClass0AC A0H;
    public final C014508d A0I;
    public final C018409q A0J;
    public final C016809a A0K;
    public final AnonymousClass0A1 A0L;
    public final C02330Bo A0M;
    public final C019009w A0N;
    public final AnonymousClass09E A0O;
    public final C018309p A0P;
    public final AnonymousClass09Y A0Q;
    public final C016909b A0R;
    public final AnonymousClass0CF A0S;
    public final AnonymousClass00Y A0T;
    public final AnonymousClass0CH A0U;
    public final C02360Br A0V;
    public final AnonymousClass0AL A0W;
    public final Object A0X = new Object();

    public C02320Bn(AnonymousClass00S r2, C015308l r3, C014408c r4, AnonymousClass01I r5, C006903j r6, AnonymousClass00Y r7, AnonymousClass09E r8, AnonymousClass09G r9, AnonymousClass0AB r10, C02330Bo r11, C02360Br r12, AnonymousClass0AL r13, AnonymousClass0CF r14, AnonymousClass01K r15, AnonymousClass09Q r16, AnonymousClass0AC r17, C016809a r18, C016909b r19, AnonymousClass09A r20, AnonymousClass09V r21, C017809k r22, C014508d r23, C019009w r24, AnonymousClass0CH r25, C018309p r26, AnonymousClass0A0 r27, AnonymousClass09Y r28, C018409q r29, C018509r r30, AnonymousClass0A1 r31, AnonymousClass0A2 r32, AnonymousClass0B2 r33, AnonymousClass0B6 r34) {
        this.A02 = r2;
        this.A0C = r3;
        this.A05 = r4;
        this.A00 = r5;
        this.A06 = r6;
        this.A0T = r7;
        this.A0O = r8;
        this.A01 = r9;
        this.A0B = r10;
        this.A0M = r11;
        this.A0V = r12;
        this.A0W = r13;
        this.A0S = r14;
        this.A07 = r15;
        this.A0E = r16;
        this.A0H = r17;
        this.A0K = r18;
        this.A0R = r19;
        this.A03 = r20;
        this.A04 = r21;
        this.A0F = r22;
        this.A0I = r23;
        this.A0N = r24;
        this.A0U = r25;
        this.A0P = r26;
        this.A09 = r27;
        this.A0Q = r28;
        this.A0J = r29;
        this.A0A = r30;
        this.A0L = r31;
        this.A08 = r32;
        this.A0G = r33;
        this.A0D = r34;
    }

    public static C02320Bn A00() {
        if (A0Y == null) {
            synchronized (C02320Bn.class) {
                if (A0Y == null) {
                    A0Y = new C02320Bn(AnonymousClass00S.A00(), C015308l.A00(), C014408c.A00(), AnonymousClass01I.A00(), C006903j.A00(), AnonymousClass00Y.A00(), AnonymousClass09E.A00(), AnonymousClass09G.A00(), AnonymousClass0AB.A00(), C02330Bo.A00(), C02360Br.A00(), AnonymousClass0AL.A01(), AnonymousClass0CF.A00(), AnonymousClass01K.A00(), AnonymousClass09Q.A00(), AnonymousClass0AC.A00, C016809a.A00(), C016909b.A00(), AnonymousClass09A.A02, AnonymousClass09V.A00(), C017809k.A00(), C014508d.A00(), C019009w.A00(), AnonymousClass0CH.A00(), C018309p.A00(), AnonymousClass0A0.A00(), AnonymousClass09Y.A00(), C018409q.A00(), C018509r.A00(), AnonymousClass0A1.A00(), AnonymousClass0A2.A00(), AnonymousClass0B2.A00(), AnonymousClass0B6.A00());
                }
            }
        }
        return A0Y;
    }

    public C47902Kd A01(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("from_me")) > 0) {
            z = true;
        }
        AnonymousClass02N A082 = this.A05.A08(cursor.getLong(cursor.getColumnIndexOrThrow("chat_row_id")));
        if (A082 == null) {
            return null;
        }
        cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        return new C47902Kd(new C007303n(A082, z, string), (AnonymousClass02N) this.A0C.A07(AnonymousClass02N.class, cursor.getLong(cursor.getColumnIndexOrThrow("sender_jid_row_id"))), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getInt(cursor.getColumnIndexOrThrow("message_type")), cursor.getString(cursor.getColumnIndexOrThrow("revoked_key_id")), cursor.getInt(cursor.getColumnIndexOrThrow("retry_count")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0842, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0846, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x084d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0851, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0854, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0858, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x085b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x085f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0862, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0866, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0869, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x086d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0870, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0874, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0877, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x087b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x087e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0882, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0887, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x088b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x088e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0892, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0895, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0899, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x089c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x08a0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x08a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x08aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x08ae, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x08b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08b5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x08b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x08bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08c3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x08ca, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:?, code lost:
        r19.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x08d1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x08d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x08d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x08db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x08df, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0154, code lost:
        if (r6.A09 != 1) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r33, X.AnonymousClass0ZJ r34, boolean r35, boolean r36) {
        /*
        // Method dump skipped, instructions count: 2313
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02320Bn.A02(int, X.0ZJ, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        if (r4 != null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0104, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C47902Kd r18) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02320Bn.A03(X.2Kd):void");
    }

    public void A04(AnonymousClass0ZJ r5, boolean z) {
        String str;
        StringBuilder A0S2 = AnonymousClass008.A0S("msgstore/edit/revoke ");
        C007303n r2 = r5.A0n;
        if (r2.A02) {
            StringBuilder sb = new StringBuilder("send deleteMedia=");
            sb.append(z);
            str = sb.toString();
        } else {
            str = "recv";
        }
        A0S2.append(str);
        A0S2.append(" key=");
        A0S2.append(r2);
        Log.i(A0S2.toString());
        A02(-1, r5, true, z);
    }
}
