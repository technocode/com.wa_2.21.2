package X;

import android.database.Cursor;

/* renamed from: X.09Q  reason: invalid class name */
public class AnonymousClass09Q {
    public static volatile AnonymousClass09Q A0A;
    public final AnonymousClass009 A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass09R A02;
    public final C014408c A03;
    public final C015308l A04;
    public final C014508d A05;
    public final C015408m A06;
    public final C015708p A07;
    public final AnonymousClass09S A08;
    public final AnonymousClass0AL A09;

    public AnonymousClass09Q(AnonymousClass00S r1, C015308l r2, C014408c r3, AnonymousClass009 r4, AnonymousClass09R r5, AnonymousClass0AL r6, C015408m r7, C015708p r8, AnonymousClass09S r9, C014508d r10) {
        this.A01 = r1;
        this.A04 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = r5;
        this.A09 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A05 = r10;
    }

    public static AnonymousClass09Q A00() {
        if (A0A == null) {
            synchronized (AnonymousClass09Q.class) {
                if (A0A == null) {
                    A0A = new AnonymousClass09Q(AnonymousClass00S.A00(), C015308l.A00(), C014408c.A00(), AnonymousClass009.A00(), AnonymousClass09R.A00(), AnonymousClass0AL.A01(), C015408m.A00(), C015708p.A00(), AnonymousClass09S.A00(), C014508d.A00());
                }
            }
        }
        return A0A;
    }

    public static C007303n A01(Cursor cursor, AnonymousClass02N r4) {
        int columnIndex = cursor.getColumnIndex("key_id");
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("key_id");
        }
        String string = cursor.getString(columnIndex);
        int columnIndex2 = cursor.getColumnIndex("from_me");
        if (columnIndex2 < 0) {
            columnIndex2 = cursor.getColumnIndex("key_from_me");
        }
        boolean z = true;
        if (cursor.getInt(columnIndex2) != 1) {
            z = false;
        }
        if (string != null && !string.equals("-1")) {
            return new C007303n(r4, z, string);
        }
        AnonymousClass008.A13("CachedMessageStore/getMessage/id is null or no messages for jid=", r4);
        return null;
    }

    public AbstractC007503q A02(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z = true;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("from_me")) != 1) {
            z = false;
        }
        AnonymousClass02N A082 = this.A03.A08(cursor.getLong(cursor.getColumnIndexOrThrow("chat_row_id")));
        if (A082 == null) {
            return null;
        }
        return A03(cursor, new C007303n(A082, z, string));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC007503q A03(android.database.Cursor r9, X.C007303n r10) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Q.A03(android.database.Cursor, X.03n):X.03q");
    }

    public AbstractC007503q A04(Cursor cursor, C007303n r7) {
        AbstractC007503q A022;
        byte b = (byte) cursor.getInt(cursor.getColumnIndexOrThrow("message_type"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
        if (AnonymousClass0FI.A0I(b, cursor.getInt(cursor.getColumnIndexOrThrow("status")))) {
            AnonymousClass09S r4 = this.A08;
            if (r4 != null) {
                int i = cursor.getInt(cursor.getColumnIndexOrThrow("media_size"));
                if (i == 38) {
                    A022 = r4.A05.A02(r7, j, (byte) 33);
                } else {
                    A022 = AnonymousClass01R.A00(r7, j, i);
                }
            } else {
                throw null;
            }
        } else {
            A022 = this.A09.A02(r7, j, b);
        }
        A022.A0X(this.A04, cursor);
        A022.A0W(cursor);
        return A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0203, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0204, code lost:
        if (r1 != null) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0209, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x025b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x025c, code lost:
        if (r2 != null) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0261, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0359, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x035a, code lost:
        if (r1 != null) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x035f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c5, code lost:
        if (r1 != null) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ca, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03ce, code lost:
        if (r11 != null) goto L_0x03d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0413, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0414, code lost:
        if (r1 != null) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0419, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x045a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x045b, code lost:
        if (r1 != null) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0460, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0498, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0499, code lost:
        if (r1 != null) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x049e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04d4, code lost:
        if (r1 != null) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x051c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x051d, code lost:
        if (r1 != null) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0522, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x053d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0541, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0544, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0545, code lost:
        if (r8 != null) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x054a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x054d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0551, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d5, code lost:
        if (r2 != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010f, code lost:
        if (r2 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0114, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (r2 != null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0192, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0195, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0196, code lost:
        if (r2 != null) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0537  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AbstractC007503q A05(android.database.Cursor r18, X.C007303n r19) {
        /*
        // Method dump skipped, instructions count: 1362
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Q.A05(android.database.Cursor, X.03n):X.03q");
    }

    public final void A06(AbstractC007503q r10, AnonymousClass1VB r11) {
        long j;
        long A022;
        long j2;
        byte b;
        r11.A06(18, r10.A0q);
        C014408c r1 = this.A03;
        C007303n r8 = r10.A0n;
        AnonymousClass02N r0 = r8.A00;
        if (r0 != null) {
            r11.A06(1, r1.A05(r0));
            long j3 = 1;
            if (r8.A02) {
                j = 1;
            } else {
                j = 0;
            }
            r11.A06(2, j);
            r11.A07(3, r8.A01);
            AnonymousClass02N A072 = r10.A07();
            if (A072 == null) {
                A022 = 0;
            } else {
                A022 = this.A04.A02(A072);
            }
            r11.A06(4, A022);
            r11.A06(5, (long) r10.A08);
            if (r10.A0f) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            r11.A06(6, j2);
            r11.A06(7, (long) r10.A06);
            String str = r10.A0a;
            if (str == null) {
                r11.A04(8);
            } else {
                r11.A07(8, str);
            }
            r11.A06(9, (long) r10.A04());
            r11.A06(10, (long) r10.A04);
            r11.A06(11, r10.A0E);
            long j4 = r10.A0C;
            if (j4 == 0) {
                j4 = this.A01.A05();
            }
            r11.A06(12, j4);
            r11.A06(13, r10.A0D);
            if (!(r10 instanceof C05390Oi)) {
                b = r10.A0m;
            } else {
                b = 7;
            }
            r11.A06(14, (long) b);
            String A0L = r10.A0L();
            if (A0L == null) {
                r11.A04(15);
            } else {
                r11.A07(15, A0L);
            }
            if (!r10.A0j) {
                j3 = 0;
            }
            r11.A06(16, j3);
            r11.A06(17, r10.A06());
            if (r10.A0p > 0) {
                r11.A06(19, r10.A0p);
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0242, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0246, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC007503q r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 583
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Q.A07(X.03q, boolean):void");
    }

    public boolean A08() {
        if (A09()) {
            return true;
        }
        String A012 = this.A06.A01("migration_message_main_index");
        return A012 != null && Long.parseLong(A012) > 0;
    }

    public boolean A09() {
        String A012 = this.A06.A01("main_message_ready");
        return A012 != null && Long.parseLong(A012) == 1;
    }
}
