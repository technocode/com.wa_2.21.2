package X;

import android.database.Cursor;

/* renamed from: X.0M2  reason: invalid class name */
public class AnonymousClass0M2 extends AnonymousClass0M3 implements AbstractC02870Du, AbstractC02880Dv {
    public int A00;

    public AnonymousClass0M2(C007303n r2, long j) {
        super(r2, j, (byte) 9);
    }

    public AnonymousClass0M2(C007303n r2, long j, byte b) {
        super(r2, j, (byte) 26);
    }

    public AnonymousClass0M2(C007303n r2, long j, C75923di r5, boolean z, boolean z2) {
        super(r2, j, (byte) 9);
        A12(r5, z, z2);
    }

    public AnonymousClass0M2(AnonymousClass0M2 r10, C007303n r11, long j, AnonymousClass0M4 r14) {
        super(r10, r11, j, r14, false, (byte) 9);
        this.A00 = r10.A00;
    }

    public AnonymousClass0M2(AnonymousClass0M2 r10, C007303n r11, long j, AnonymousClass0M4 r14, boolean z) {
        super(r10, r11, j, r14, z, r10.A0m);
        this.A00 = r10.A00;
    }

    @Override // X.AbstractC007503q
    public C05440On A0B() {
        C05440On A0B = super.A0B();
        if (A0B != null) {
            return A0B;
        }
        throw null;
    }

    @Override // X.AnonymousClass0M3
    public void A0x(Cursor cursor, AnonymousClass0M4 r3) {
        super.A0x(cursor, r3);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("page_count"));
    }

    @Override // X.AnonymousClass0M3
    public void A0y(Cursor cursor, AnonymousClass0M4 r3) {
        super.A0y(cursor, r3);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("page_count"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d7, code lost:
        if (r10 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        if (r14.A0U != null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        r1 = r14.A0U;
        r2 = X.AnonymousClass071.A00(r1, 0, r1.length);
        r9.A02();
        r1 = (X.C75923di) r9.A00;
        r1.A00 |= 64;
        r1.A09 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f3, code lost:
        r0 = r14.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f7, code lost:
        if (r0 <= 0) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f9, code lost:
        r9.A02();
        r3 = (X.C75923di) r9.A00;
        r3.A00 |= 1024;
        r3.A05 = r0 / 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
        r5 = r7.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
        if (r5 == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        if (r5.A03 == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        if (r5.A05 == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0119, code lost:
        if (r5.A04 == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011d, code lost:
        if (r5.A08 == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0127, code lost:
        if (java.util.Arrays.equals(r5.A07, r14.A0U) == false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012f, code lost:
        if (r5.A02 != r14.A0B) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0131, code lost:
        r6 = true;
        r2 = r5.A03;
        r9.A02();
        r1 = (X.C75923di) r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013b, code lost:
        if (r2 == null) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        r1.A00 |= 4096;
        r1.A0G = r2;
        r1 = android.util.Base64.decode(r5.A05, 0);
        r2 = X.AnonymousClass071.A00(r1, 0, r1.length);
        r9.A02();
        r1 = (X.C75923di) r9.A00;
        r1.A00 |= 8192;
        r1.A0B = r2;
        r2 = android.util.Base64.decode(r5.A04, 0);
        r2 = X.AnonymousClass071.A00(r2, 0, r2.length);
        r9.A02();
        r1 = (X.C75923di) r9.A00;
        r1.A00 |= 16384;
        r1.A0A = r2;
        r3 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017b, code lost:
        if (r3 <= 0) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017f, code lost:
        if (r5.A00 <= 0) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0181, code lost:
        r9.A02();
        r2 = (X.C75923di) r9.A00;
        r2.A00 |= 262144;
        r2.A03 = r3;
        r3 = r5.A00;
        r9.A02();
        r2 = (X.C75923di) r9.A00;
        r2.A00 |= 131072;
        r2.A02 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a3, code lost:
        if (r11 != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a5, code lost:
        if (r6 == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a9, code lost:
        if (r5.A09 != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ab, code lost:
        r2 = r5.A08;
        r3 = X.AnonymousClass071.A00(r2, 0, r2.length);
        r9.A02();
        r2 = (X.C75923di) r9.A00;
        r2.A00 |= 32768;
        r2.A08 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c7, code lost:
        if (X.AnonymousClass0ZG.A0M(r7, r12, r13) == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c9, code lost:
        r0 = X.AnonymousClass0ZG.A02(r8, r7, r11, r12, r13);
        r9.A02();
        r2 = (X.C75923di) r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d4, code lost:
        if (r0 == null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d6, code lost:
        r2.A0C = r0;
        r2.A00 |= 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e5, code lost:
        if (android.text.TextUtils.isEmpty(r14.A0G) != false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e7, code lost:
        r2 = r14.A0G;
        r9.A02();
        r1 = (X.C75923di) r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f0, code lost:
        if (r2 == null) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f2, code lost:
        r1.A00 |= 512;
        r1.A0D = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fd, code lost:
        if (((X.AbstractC007503q) r7).A04 != 7) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ff, code lost:
        r9.A02();
        r1 = (X.C75923di) r9.A00;
        r1.A00 |= 2048;
        r1.A0J = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0214, code lost:
        if (r15.A08() == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0216, code lost:
        r2 = r15.A08();
        r3 = X.AnonymousClass071.A00(r2, 0, r2.length);
        r9.A02();
        r2 = (X.C75923di) r9.A00;
        r2.A00 |= 32768;
        r2.A08 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0231, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0235, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0237, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0239, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A11(X.AnonymousClass01I r8, X.C75913dh r9, boolean r10, boolean r11, X.C007103l r12, byte[] r13, X.AnonymousClass0M4 r14, X.C05440On r15) {
        /*
        // Method dump skipped, instructions count: 574
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0M2.A11(X.01I, X.3dh, boolean, boolean, X.03l, byte[], X.0M4, X.0On):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r0 != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r0 != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009f, code lost:
        if (r0 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        if (r0 != false) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A12(X.C75923di r12, boolean r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 518
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0M2.A12(X.3di, boolean, boolean):void");
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r16) {
        boolean z;
        AnonymousClass078 r1;
        boolean z2;
        if (!(this instanceof AnonymousClass2A6)) {
            AnonymousClass0M4 r10 = ((AnonymousClass0M3) this).A02;
            C05440On A0B = A0B();
            if (r10 == null || (!(z2 = r16.A04) && r10.A0U == null)) {
                StringBuilder A0S = AnonymousClass008.A0S("FMessageDocument/unable to send encrypted media message due to missing mediaKey; message.key=");
                A0S.append(this.A0n);
                A0S.append("; media_wa_type=");
                AnonymousClass008.A1M(A0S, this.A0m);
                return;
            }
            C04970Mo r2 = r16.A01;
            AnonymousClass01I r4 = r16.A00;
            C75923di r12 = ((C02840Dr) r2.A00).A0C;
            if (r12 == null) {
                r12 = C75923di.A0K;
            }
            C75913dh r5 = (C75913dh) r12.AQb();
            A11(r4, r5, z2, r16.A03, r16.A02, r16.A05, r10, A0B);
            r2.A02();
            C02840Dr r13 = (C02840Dr) r2.A00;
            if (r13 != null) {
                r13.A0C = (C75923di) r5.A01();
                r13.A00 |= 64;
                return;
            }
            throw null;
        }
        AnonymousClass2A6 r6 = (AnonymousClass2A6) this;
        AnonymousClass0M4 r132 = ((AnonymousClass0M3) r6).A02;
        C05440On A0B2 = r6.A0B();
        if (r132 == null || (!(z = r16.A04) && r132.A0U == null)) {
            StringBuilder A0S2 = AnonymousClass008.A0S("FMessageTemplateDocument/unable to send encrypted media message due to missing mediaKey; message.key=");
            A0S2.append(r6.A0n);
            A0S2.append("; media_wa_type=");
            AnonymousClass008.A1M(A0S2, r6.A0m);
            return;
        }
        C04970Mo r42 = r16.A01;
        C76523eg r3 = (C76523eg) r42.A04().AQb();
        AnonymousClass01I r7 = r16.A00;
        AnonymousClass0OH r52 = r42.A04().A03;
        if (r52 == null) {
            r52 = AnonymousClass0OH.A07;
        }
        if (r52.A01 == 1) {
            r1 = (AnonymousClass078) r52.A03;
        } else {
            r1 = C75923di.A0K;
        }
        C75913dh r8 = (C75913dh) r1.AQb();
        r6.A11(r7, r8, z, r16.A03, r16.A02, r16.A05, r132, A0B2);
        AnonymousClass0OF r0 = r6.A00;
        if (r0 != null) {
            AnonymousClass0OI A0x = C002001d.A0x(r42, r0);
            A0x.A02();
            AnonymousClass0OH r14 = (AnonymousClass0OH) A0x.A00;
            if (r14 != null) {
                r14.A03 = r8.A01();
                r14.A01 = 1;
                r3.A05(A0x);
                r3.A04(A0x);
                r42.A0A(r3);
                return;
            }
            throw null;
        }
        AnonymousClass008.A1M(AnonymousClass008.A0S("MessageTemplateDocument: cannot send encrypted document message, "), r6.A0m);
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r8) {
        if (!(this instanceof AnonymousClass2A6)) {
            return new AnonymousClass0M2(this, r8, this.A0E, ((AnonymousClass0M3) this).A02, true);
        }
        AnonymousClass2A6 r1 = (AnonymousClass2A6) this;
        return new AnonymousClass2A6(r1, r8, r1.A0E, ((AnonymousClass0M3) r1).A02);
    }
}
