package X;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0ZA  reason: invalid class name */
public class AnonymousClass0ZA extends AnonymousClass0M3 implements AbstractC02870Du, AbstractC02880Dv {
    public int A00;
    public int A01;
    public int A02;
    public UserJid A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final transient AnonymousClass009 A08;

    public AnonymousClass0ZA(AnonymousClass009 r2, C007303n r3, long j) {
        super(r3, j, (byte) 44);
        this.A08 = r2;
    }

    public AnonymousClass0ZA(AnonymousClass009 r4, C007303n r5, long j, C76333eN r8, boolean z) {
        super(r5, j, (byte) 44);
        this.A08 = r4;
        ((AnonymousClass0M3) this).A02 = new AnonymousClass0M4();
        this.A05 = r8.A07;
        this.A06 = r8.A08;
        this.A00 = r8.A01;
        this.A04 = r8.A06;
        this.A01 = AnonymousClass3JW.A01.value;
        this.A02 = AnonymousClass3JX.A01.value;
        try {
            this.A03 = UserJid.get(r8.A09);
        } catch (AnonymousClass02Y unused) {
            StringBuilder A0S = AnonymousClass008.A0S("FMessageOrder/FMessageOrder invalid seller jid <");
            A0S.append(r8.A09);
            A0S.append(">");
            Log.w(A0S.toString());
        }
        this.A07 = r8.A0A;
        AnonymousClass071 r0 = r8.A04;
        if (r0 != null) {
            byte[] A012 = r0.A01();
            if (A012.length > 0) {
                ((AbstractC007503q) this).A01 = 1;
                C05440On A0B = A0B();
                if (A0B != null) {
                    A0B.A04(A012, z);
                }
            }
        }
    }

    public AnonymousClass0ZA(AnonymousClass009 r10, AnonymousClass0ZA r11, C007303n r12, long j, AnonymousClass0M4 r15) {
        super(r11, r12, j, r15, true, r11.A0m);
        this.A08 = r10;
        this.A05 = r11.A05;
        this.A06 = r11.A06;
        this.A00 = r11.A00;
        this.A01 = r11.A01;
        this.A02 = r11.A02;
        this.A04 = r11.A04;
        this.A03 = r11.A03;
        this.A07 = r11.A07;
    }

    public String A11(Context context, AnonymousClass01X r9) {
        int i = this.A00;
        String A0A = r9.A0A(R.plurals.total_items, (long) i, Integer.valueOf(i));
        if (TextUtils.isEmpty(this.A04)) {
            return A0A;
        }
        return context.getString(R.string.message_preview_order, A0A, this.A04);
    }

    public void A12(Cursor cursor, boolean z, C015308l r6) {
        this.A05 = cursor.getString(cursor.getColumnIndexOrThrow("order_id"));
        this.A06 = cursor.getString(cursor.getColumnIndexOrThrow("order_title"));
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("item_count"));
        this.A04 = cursor.getString(cursor.getColumnIndexOrThrow("message"));
        this.A01 = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
        this.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("surface"));
        this.A03 = (UserJid) r6.A07(UserJid.class, cursor.getLong(cursor.getColumnIndexOrThrow("seller_jid")));
        this.A07 = cursor.getString(cursor.getColumnIndexOrThrow("token"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("thumbnail"));
        if (blob.length > 0) {
            ((AbstractC007503q) this).A01 = 1;
            C05440On A0B = A0B();
            if (A0B != null) {
                A0B.A04(blob, z);
            }
        }
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r8) {
        C04970Mo r4 = r8.A01;
        C76333eN r0 = ((C02840Dr) r4.A00).A0O;
        if (r0 == null) {
            r0 = C76333eN.A0B;
        }
        AbstractC04160Jh A0B = r0.AQb();
        String str = this.A05;
        if (str != null) {
            A0B.A02();
            C76333eN r1 = (C76333eN) A0B.A00;
            r1.A00 |= 1;
            r1.A07 = str;
        }
        String str2 = this.A06;
        if (str2 != null) {
            A0B.A02();
            C76333eN r12 = (C76333eN) A0B.A00;
            r12.A00 |= 64;
            r12.A08 = str2;
        }
        int i = this.A00;
        A0B.A02();
        C76333eN r13 = (C76333eN) A0B.A00;
        r13.A00 |= 4;
        r13.A01 = i;
        String str3 = this.A04;
        if (str3 != null) {
            A0B.A02();
            C76333eN r14 = (C76333eN) A0B.A00;
            r14.A00 |= 32;
            r14.A06 = str3;
        }
        int i2 = this.A01;
        if (i2 != 1) {
            this.A08.A04(AnonymousClass008.A0N(AnonymousClass008.A0S("FMessageOrder/setOrderStatus: Unexpected type ("), i2, ")"), null, true);
        } else {
            AnonymousClass3JW r2 = AnonymousClass3JW.A01;
            A0B.A02();
            C76333eN r15 = (C76333eN) A0B.A00;
            r15.A00 |= 8;
            r15.A02 = r2.value;
        }
        int i3 = this.A02;
        if (i3 != 1) {
            this.A08.A04(AnonymousClass008.A0N(AnonymousClass008.A0S("FMessageOrder/setOrderSurface: Unexpected type ("), i3, ")"), null, true);
        } else {
            AnonymousClass3JX r22 = AnonymousClass3JX.A01;
            A0B.A02();
            C76333eN r16 = (C76333eN) A0B.A00;
            r16.A00 |= 16;
            r16.A03 = r22.value;
        }
        UserJid userJid = this.A03;
        if (userJid != null) {
            String rawString = userJid.getRawString();
            A0B.A02();
            C76333eN r17 = (C76333eN) A0B.A00;
            if (rawString != null) {
                r17.A00 |= 128;
                r17.A09 = rawString;
            } else {
                throw null;
            }
        }
        String str4 = this.A07;
        if (str4 != null) {
            A0B.A02();
            C76333eN r18 = (C76333eN) A0B.A00;
            r18.A00 |= 256;
            r18.A0A = str4;
        }
        C05440On A0B2 = A0B();
        if (!(A0B2 == null || A0B2.A08() == null)) {
            byte[] A082 = A0B2.A08();
            AnonymousClass071 A002 = AnonymousClass071.A00(A082, 0, A082.length);
            A0B.A02();
            C76333eN r19 = (C76333eN) A0B.A00;
            r19.A00 |= 2;
            r19.A04 = A002;
        }
        C007103l r5 = r8.A02;
        byte[] bArr = r8.A05;
        if (AnonymousClass0ZG.A0M(this, r5, bArr)) {
            C75423cu A022 = AnonymousClass0ZG.A02(r8.A00, this, r8.A03, r5, bArr);
            A0B.A02();
            C76333eN r110 = (C76333eN) A0B.A00;
            if (A022 != null) {
                r110.A05 = A022;
                r110.A00 |= 512;
            } else {
                throw null;
            }
        }
        r4.A02();
        C02840Dr r23 = (C02840Dr) r4.A00;
        if (r23 != null) {
            r23.A0O = (C76333eN) A0B.A01();
            r23.A00 |= 536870912;
            return;
        }
        throw null;
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r8) {
        return new AnonymousClass0ZA(this.A08, this, r8, this.A0E, ((AnonymousClass0M3) this).A02);
    }
}
