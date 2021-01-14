package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0ZE  reason: invalid class name */
public class AnonymousClass0ZE extends AnonymousClass0M3 implements AbstractC02870Du, AbstractC02880Dv {
    public boolean A00;
    public transient C29251Xr A01;
    public transient Integer A02;

    public AnonymousClass0ZE(C007303n r2, long j) {
        super(r2, j, (byte) 20);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (((r2 & 2) == 2) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (((r13.A00 & 16) == 16) != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ba, code lost:
        if (((r4 & 128) == 128) != false) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0ZE(X.C007303n r10, long r11, X.C76493ed r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZE.<init>(X.03n, long, X.3ed, boolean):void");
    }

    public AnonymousClass0ZE(AnonymousClass0ZE r10, C007303n r11, long j, AnonymousClass0M4 r14, boolean z) {
        super(r10, r11, j, r14, z, r10.A0m);
        this.A01 = r10.A01;
        this.A00 = r10.A00;
    }

    @Override // X.AnonymousClass0M3
    public void A0x(Cursor cursor, AnonymousClass0M4 r3) {
        super.A0x(cursor, r3);
        this.A00 = AnonymousClass09R.A03(cursor, cursor.getColumnIndexOrThrow("is_animated_sticker"));
    }

    public C29241Xq A11() {
        C29241Xq r3 = new C29241Xq();
        AnonymousClass0M4 r4 = ((AnonymousClass0M3) this).A02;
        if (r4 != null) {
            File file = r4.A0F;
            if (file == null || !file.exists()) {
                String str = ((AnonymousClass0M3) this).A08;
                if (str != null) {
                    r3.A07 = str;
                    r3.A01 = 3;
                }
            } else {
                r3.A07 = r4.A0F.getAbsolutePath();
                r3.A01 = 1;
            }
            r3.A0A = ((AnonymousClass0M3) this).A06;
            r3.A06 = ((AnonymousClass0M3) this).A05;
            r3.A03 = r4.A08;
            r3.A02 = r4.A06;
            r3.A09 = ((AnonymousClass0M3) this).A07;
            byte[] bArr = r4.A0U;
            if (bArr != null) {
                r3.A08 = Base64.encodeToString(bArr, 1);
            }
            String str2 = r4.A0G;
            if (str2 != null) {
                r3.A05 = str2;
            }
        }
        return r3;
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r12) {
        AnonymousClass0M4 r6 = ((AnonymousClass0M3) this).A02;
        if (r6 == null || (!r12.A04 && r6.A0U == null)) {
            StringBuilder A0S = AnonymousClass008.A0S("FMessageSticker/unable to send encrypted media message due to missing mediaKey; message.key=");
            A0S.append(this.A0n);
            A0S.append("; media_wa_type=");
            AnonymousClass008.A1M(A0S, this.A0m);
            return;
        }
        C04970Mo r4 = r12.A01;
        C76493ed r0 = ((C02840Dr) r4.A00).A0V;
        if (r0 == null) {
            r0 = C76493ed.A0G;
        }
        AbstractC04160Jh A0B = r0.AQb();
        byte[] bArr = r6.A0U;
        if (bArr != null) {
            AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
            A0B.A02();
            C76493ed r1 = (C76493ed) A0B.A00;
            r1.A00 |= 8;
            r1.A09 = A002;
        } else {
            Log.w("FMessageSticker/buildE2eMessage/sticker media key missing");
        }
        long j = r6.A0B;
        if (j > 0) {
            A0B.A02();
            C76493ed r5 = (C76493ed) A0B.A00;
            r5.A00 |= 512;
            r5.A05 = j / 1000;
        }
        if (!TextUtils.isEmpty(((AnonymousClass0M3) this).A05)) {
            byte[] decode = Base64.decode(((AnonymousClass0M3) this).A05, 0);
            AnonymousClass071 A003 = AnonymousClass071.A00(decode, 0, decode.length);
            A0B.A02();
            C76493ed r13 = (C76493ed) A0B.A00;
            r13.A00 |= 4;
            r13.A06 = A003;
        }
        if (!TextUtils.isEmpty(((AnonymousClass0M3) this).A06)) {
            byte[] decode2 = Base64.decode(((AnonymousClass0M3) this).A06, 0);
            AnonymousClass071 A004 = AnonymousClass071.A00(decode2, 0, decode2.length);
            A0B.A02();
            C76493ed r14 = (C76493ed) A0B.A00;
            r14.A00 |= 2;
            r14.A07 = A004;
        }
        int i = r6.A06;
        if (i > 0 && r6.A08 > 0) {
            A0B.A02();
            C76493ed r15 = (C76493ed) A0B.A00;
            r15.A00 |= 32;
            r15.A02 = i;
            int i2 = r6.A08;
            A0B.A02();
            C76493ed r16 = (C76493ed) A0B.A00;
            r16.A00 |= 64;
            r16.A03 = i2;
        }
        C007103l r52 = r12.A02;
        byte[] bArr2 = r12.A05;
        if (AnonymousClass0ZG.A0M(this, r52, bArr2)) {
            C75423cu A022 = AnonymousClass0ZG.A02(r12.A00, this, r12.A03, r52, bArr2);
            A0B.A02();
            C76493ed r17 = (C76493ed) A0B.A00;
            if (A022 != null) {
                r17.A0B = A022;
                r17.A00 |= 16384;
            } else {
                throw null;
            }
        }
        String str = ((AnonymousClass0M3) this).A09;
        if (str != null) {
            A0B.A02();
            C76493ed r18 = (C76493ed) A0B.A00;
            r18.A00 |= 1;
            r18.A0E = str;
        }
        String str2 = ((AnonymousClass0M3) this).A07;
        if (str2 != null) {
            A0B.A02();
            C76493ed r19 = (C76493ed) A0B.A00;
            r19.A00 |= 16;
            r19.A0D = str2;
        }
        if (!TextUtils.isEmpty(r6.A0G)) {
            String str3 = r6.A0G;
            A0B.A02();
            C76493ed r110 = (C76493ed) A0B.A00;
            if (str3 != null) {
                r110.A00 |= 128;
                r110.A0C = str3;
            } else {
                throw null;
            }
        }
        long j2 = ((AnonymousClass0M3) this).A01;
        if (j2 > 0) {
            A0B.A02();
            C76493ed r53 = (C76493ed) A0B.A00;
            r53.A00 |= 256;
            r53.A04 = j2;
        }
        int i3 = r6.A04;
        if (i3 > 0) {
            A0B.A02();
            C76493ed r111 = (C76493ed) A0B.A00;
            r111.A00 |= 1024;
            r111.A01 = i3;
        }
        byte[] bArr3 = r6.A0R;
        if (bArr3 != null) {
            AnonymousClass071 A005 = AnonymousClass071.A00(bArr3, 0, bArr3.length);
            A0B.A02();
            C76493ed r112 = (C76493ed) A0B.A00;
            r112.A00 |= 2048;
            r112.A08 = A005;
        }
        boolean z = this.A00;
        A0B.A02();
        C76493ed r113 = (C76493ed) A0B.A00;
        r113.A00 |= 4096;
        r113.A0F = z;
        r4.A02();
        C02840Dr r2 = (C02840Dr) r4.A00;
        if (r2 != null) {
            r2.A0V = (C76493ed) A0B.A01();
            r2.A00 |= 2097152;
            return;
        }
        throw null;
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r8) {
        return new AnonymousClass0ZE(this, r8, this.A0E, ((AnonymousClass0M3) this).A02, true);
    }
}
