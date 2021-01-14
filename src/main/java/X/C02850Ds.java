package X;

import android.database.Cursor;
import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.0Ds  reason: invalid class name and case insensitive filesystem */
public class C02850Ds extends AbstractC02860Dt implements AbstractC02870Du, AbstractC02880Dv {
    public int A00;
    public long A01;
    public C02900Dx A02;
    public String A03;

    public C02850Ds(C007303n r2, long j) {
        super(r2, j, (byte) 16);
    }

    public C02850Ds(C007303n r4, long j, C02890Dw r7, boolean z) {
        super(r4, j, (byte) 16);
        ((AbstractC007503q) this).A01 = 1;
        ((AbstractC02860Dt) this).A00 = r7.A00;
        ((AbstractC02860Dt) this).A01 = r7.A01;
        if ((r7.A04 & 256) == 256) {
            A0B().A04(r7.A08.A01(), z);
        }
        if ((r7.A04 & 32) == 32) {
            this.A03 = r7.A0A;
        }
        this.A01 = r7.A07;
    }

    public C02850Ds(C007303n r3, long j, Location location, String str, int i, List list) {
        super(r3, j, (byte) 16);
        if (location != null) {
            ((AbstractC02860Dt) this).A00 = location.getLatitude();
            ((AbstractC02860Dt) this).A01 = location.getLongitude();
        }
        ((AbstractC007503q) this).A01 = 1;
        A0T(1);
        this.A00 = i;
        this.A03 = str;
        A0n(list);
    }

    public C02850Ds(C02850Ds r3, C007303n r4, long j) {
        super(r3, r4, j);
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A02 = r3.A02;
    }

    @Override // X.AbstractC02860Dt
    public void A0v(Cursor cursor, AnonymousClass01I r11) {
        UserJid A08;
        super.A0v(cursor, r11);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("live_location_share_duration"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("live_location_sequence_number"));
        double d = cursor.getDouble(cursor.getColumnIndexOrThrow("live_location_final_latitude"));
        double d2 = cursor.getDouble(cursor.getColumnIndexOrThrow("live_location_final_longitude"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("live_location_final_timestamp"));
        if (d != 0.0d || d2 != 0.0d || j != 0) {
            if (this.A0n.A02) {
                r11.A04();
                A08 = r11.A03;
            } else {
                A08 = A08();
            }
            if (A08 != null) {
                C02900Dx r0 = new C02900Dx(A08);
                r0.A00 = d;
                r0.A01 = d2;
                r0.A05 = j;
                this.A02 = r0;
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r8) {
        C05440On A0B = A0B();
        C04970Mo r5 = r8.A01;
        C02890Dw r0 = ((C02840Dr) r5.A00).A0M;
        if (r0 == null) {
            r0 = C02890Dw.A0B;
        }
        C76293eJ r4 = (C76293eJ) r0.AQb();
        double d = ((AbstractC02860Dt) this).A00;
        r4.A02();
        C02890Dw r3 = (C02890Dw) r4.A00;
        r3.A04 |= 1;
        r3.A00 = d;
        double d2 = ((AbstractC02860Dt) this).A01;
        r4.A02();
        C02890Dw r32 = (C02890Dw) r4.A00;
        r32.A04 |= 2;
        r32.A01 = d2;
        boolean z = r8.A03;
        if (!z && A0B.A08() != null) {
            byte[] A08 = A0B.A08();
            AnonymousClass071 A002 = AnonymousClass071.A00(A08, 0, A08.length);
            r4.A02();
            C02890Dw r1 = (C02890Dw) r4.A00;
            r1.A04 |= 256;
            r1.A08 = A002;
        }
        C007103l r2 = r8.A02;
        byte[] bArr = r8.A05;
        if (AnonymousClass0ZG.A0M(this, r2, bArr)) {
            C75423cu A022 = AnonymousClass0ZG.A02(r8.A00, this, z, r2, bArr);
            r4.A02();
            C02890Dw r12 = (C02890Dw) r4.A00;
            if (A022 != null) {
                r12.A09 = A022;
                r12.A04 |= 512;
            } else {
                throw null;
            }
        }
        if (!TextUtils.isEmpty(this.A03)) {
            String str = this.A03;
            r4.A02();
            C02890Dw r13 = (C02890Dw) r4.A00;
            if (str != null) {
                r13.A04 |= 32;
                r13.A0A = str;
            } else {
                throw null;
            }
        }
        long j = this.A01;
        r4.A02();
        C02890Dw r14 = (C02890Dw) r4.A00;
        r14.A04 |= 64;
        r14.A07 = j;
        r5.A07(r4);
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r4) {
        return new C02850Ds(this, r4, this.A0E);
    }
}
