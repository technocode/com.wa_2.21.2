package X;

/* renamed from: X.09o  reason: invalid class name and case insensitive filesystem */
public class C018209o {
    public static volatile C018209o A05;
    public final AnonymousClass01I A00;
    public final C014408c A01;
    public final C014508d A02;
    public final C015408m A03;
    public final C015708p A04;

    public C018209o(C014408c r1, AnonymousClass01I r2, C015408m r3, C015708p r4, C014508d r5) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }

    public static C018209o A00() {
        if (A05 == null) {
            synchronized (C018209o.class) {
                if (A05 == null) {
                    A05 = new C018209o(C014408c.A00(), AnonymousClass01I.A00(), C015408m.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A05;
    }

    public static final void A01(long j, AbstractC02860Dt r5, AnonymousClass1VB r6) {
        r6.A06(1, j);
        r6.A05(2, r5.A00);
        r6.A05(3, r5.A01);
        if (r5 instanceof C05470Or) {
            C05470Or r1 = (C05470Or) r5;
            String str = r1.A01;
            if (str == null) {
                r6.A04(4);
            } else {
                r6.A07(4, str);
            }
            String str2 = r1.A00;
            if (str2 == null) {
                r6.A04(5);
            } else {
                r6.A07(5, str2);
            }
            String str3 = r1.A02;
            if (str3 == null) {
                r6.A04(6);
            } else {
                r6.A07(6, str3);
            }
        } else if (r5 instanceof C02850Ds) {
            r6.A04(4);
            r6.A04(5);
            r6.A04(6);
        }
        byte[] A08 = r5.A0B().A08();
        if (A08 == null) {
            r6.A04(7);
        } else {
            r6.A08(7, A08);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AbstractC02860Dt r11) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018209o.A02(X.0Dt):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AbstractC02860Dt r7, long r8) {
        /*
            r6 = this;
            int r1 = r7.A09
            r0 = 2
            r5 = 0
            r4 = 1
            r2 = 0
            if (r1 != r0) goto L_0x0009
            r2 = 1
        L_0x0009:
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateQuotedLocationMessage/message in main storage; key="
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            X.03n r0 = r7.A0n
            X.AnonymousClass008.A1R(r1, r0, r2)
            X.08d r0 = r6.A02     // Catch:{ SQLiteConstraintException -> 0x0040 }
            X.0OQ r3 = r0.A04()     // Catch:{ SQLiteConstraintException -> 0x0040 }
            X.08p r2 = r6.A04     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "INSERT INTO message_quoted_location (    message_row_id,    latitude,    longitude,    place_name,    place_address,    url,    thumbnail) VALUES (?, ?, ?, ?, ?, ?, ?)"
            java.lang.String r0 = "INSERT_MESSAGE_QUOTED_LOCATION_SQL"
            X.1VB r0 = r2.A01(r1, r0)     // Catch:{ all -> 0x0039 }
            A01(r8, r7, r0)     // Catch:{ all -> 0x0039 }
            long r1 = r0.A01()     // Catch:{ all -> 0x0039 }
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
            r5 = 1
        L_0x0030:
            java.lang.String r0 = "LocationMessageStore/insertOrUpdateQuotedLocationMessage/inserted row should have same row_id"
            X.AnonymousClass00E.A0A(r5, r0)     // Catch:{ all -> 0x0039 }
            r3.close()
            return
        L_0x0039:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0
        L_0x0040:
            r3 = move-exception
            X.08p r2 = r6.A04
            java.lang.String r1 = "UPDATE message_quoted_location    SET message_row_id = ?,        latitude = ?,        longitude = ?,        place_name = ?,        place_address = ?,        url = ?,        thumbnail = ? WHERE message_row_id = ?"
            java.lang.String r0 = "UPDATE_MESSAGE_QUOTED_LOCATION_SQL"
            X.1VB r2 = r2.A01(r1, r0)
            A01(r8, r7, r2)
            r1 = 8
            java.lang.String r0 = java.lang.Long.toString(r8)
            r2.A07(r1, r0)
            int r0 = r2.A00()
            if (r0 == r4) goto L_0x005e
            throw r3
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018209o.A03(X.0Dt, long):void");
    }

    public final void A04(AbstractC02860Dt r12, AnonymousClass1VB r13) {
        r13.A06(1, r12.A0p);
        C014408c r1 = this.A01;
        AnonymousClass02N r0 = r12.A0n.A00;
        if (r0 != null) {
            r13.A06(2, r1.A05(r0));
            r13.A05(3, r12.A00);
            r13.A05(4, r12.A01);
            if (r12 instanceof C05470Or) {
                C05470Or r14 = (C05470Or) r12;
                String str = r14.A01;
                if (str == null) {
                    r13.A04(5);
                } else {
                    r13.A07(5, str);
                }
                String str2 = r14.A00;
                if (str2 == null) {
                    r13.A04(6);
                } else {
                    r13.A07(6, str2);
                }
                String str3 = r14.A02;
                if (str3 == null) {
                    r13.A04(7);
                } else {
                    r13.A07(7, str3);
                }
                r13.A04(8);
                r13.A04(9);
                r13.A04(10);
                r13.A04(11);
                r13.A04(12);
            } else if (r12 instanceof C02850Ds) {
                r13.A04(5);
                r13.A04(6);
                r13.A04(7);
                C02850Ds r2 = (C02850Ds) r12;
                r13.A06(8, (long) r2.A00);
                r13.A06(9, r2.A01);
                C02900Dx r22 = r2.A02;
                if (r22 != null) {
                    r13.A05(10, r22.A00);
                    r13.A05(11, r22.A01);
                    r13.A06(12, r22.A05);
                } else {
                    r13.A04(10);
                    r13.A04(11);
                    r13.A04(12);
                }
            }
            int i = r12.A02;
            if (i == 1) {
                i = 0;
            }
            r13.A06(13, (long) i);
            return;
        }
        throw null;
    }

    public boolean A05() {
        String A012;
        return this.A01.A0G() && (A012 = this.A03.A01("location_ready")) != null && Long.parseLong(A012) == 2;
    }
}
