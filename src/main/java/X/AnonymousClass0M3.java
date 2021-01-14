package X;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0M3  reason: invalid class name */
public abstract class AnonymousClass0M3 extends AbstractC007503q {
    public int A00;
    public long A01;
    public AnonymousClass0M4 A02;
    public C05450Op A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public AnonymousClass0M3(C007303n r1, long j, byte b) {
        super(r1, j, b);
    }

    public AnonymousClass0M3(AnonymousClass0M3 r10, C007303n r11, long j, AnonymousClass0M4 r14, boolean z, byte b) {
        super(r10, r11, j, z, b);
        this.A02 = r14;
        this.A04 = r10.A04;
        this.A00 = r10.A00;
        this.A05 = r10.A05;
        this.A06 = r10.A06;
        this.A07 = r10.A07;
        this.A08 = r10.A08;
        this.A01 = r10.A01;
        this.A09 = r10.A09;
        this.A0A = r10.A0A;
        C05450Op A0u = r10.A0u();
        if (A0u == null) {
            return;
        }
        if (A0u.A04()) {
            C05450Op A0u2 = A0u();
            if (A0u2 != null) {
                A0u2.A03(A0u.A05(), A0u.A06());
                return;
            }
            throw null;
        }
        StringBuilder A0S = AnonymousClass008.A0S("FMessageVideo/Cloned message should have sidecar, but original message doesn't have it: sidecar=");
        A0S.append(this.A03);
        Log.e(A0S.toString());
    }

    public C05450Op A0u() {
        C05450Op r1;
        synchronized (this.A0o) {
            r1 = this.A03;
            if (r1 == null && C05450Op.A00(AnonymousClass1XO.A02(this))) {
                r1 = new C05450Op(this);
                this.A03 = r1;
            }
        }
        return r1;
    }

    public String A0v() {
        if (this instanceof AnonymousClass2B4) {
            return ((AnonymousClass2B4) this).A00.A00;
        }
        if (this instanceof AnonymousClass2CF) {
            return ((AnonymousClass2CF) this).A00.A00;
        }
        if (!(this instanceof AnonymousClass2CE)) {
            return this.A04;
        }
        return ((AnonymousClass2CE) this).A00.A00;
    }

    public String A0w() {
        if (!(this instanceof AnonymousClass0M2)) {
            return this.A08;
        }
        String str = this.A08;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String A012 = C02220Bc.A01(this.A07);
        if (TextUtils.isEmpty(A012)) {
            return this.A04;
        }
        return AnonymousClass008.A0P(new StringBuilder(), this.A04, ".", A012);
    }

    public void A0x(Cursor cursor, AnonymousClass0M4 r4) {
        this.A02 = r4;
        A0e(cursor.getString(cursor.getColumnIndexOrThrow("multicast_id")));
        this.A07 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.A09 = cursor.getString(cursor.getColumnIndexOrThrow("message_url"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("file_length"));
        this.A08 = cursor.getString(cursor.getColumnIndexOrThrow("media_name"));
        this.A06 = cursor.getString(cursor.getColumnIndexOrThrow("file_hash"));
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("media_duration"));
        this.A05 = cursor.getString(cursor.getColumnIndexOrThrow("enc_file_hash"));
    }

    public void A0y(Cursor cursor, AnonymousClass0M4 r5) {
        this.A02 = r5;
        this.A07 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.A09 = cursor.getString(cursor.getColumnIndexOrThrow("message_url"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("file_length"));
        this.A08 = cursor.getString(cursor.getColumnIndexOrThrow("media_name"));
        this.A06 = cursor.getString(cursor.getColumnIndexOrThrow("file_hash"));
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("media_duration"));
        this.A05 = cursor.getString(cursor.getColumnIndexOrThrow("enc_file_hash"));
        C05440On A0B2 = A0B();
        if (A0B2 != null) {
            A0B2.A04(cursor.getBlob(cursor.getColumnIndexOrThrow("thumbnail")), true);
        }
    }

    public void A0z(String str) {
        C007303n r3 = this.A0n;
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("MessageUtil/isValidIncomingUrl/error empty media url received. message.key=");
            sb.append(r3);
            Log.w(sb.toString());
        } else {
            Uri parse = Uri.parse(str);
            if (!"https".equalsIgnoreCase(parse.getScheme())) {
                StringBuilder sb2 = new StringBuilder("MessageUtil/isValidIncomingUrl/error invalid scheme on received media url; url=");
                sb2.append(str);
                sb2.append("; message.key=");
                sb2.append(r3);
                Log.w(sb2.toString());
            } else if (TextUtils.isEmpty(parse.getHost()) || !parse.getHost().endsWith(".whatsapp.net")) {
                StringBuilder sb3 = new StringBuilder("MessageUtil/isValidIncomingUrl/error invalid host on received media url; url=");
                sb3.append(str);
                sb3.append("; message.key=");
                sb3.append(r3);
                Log.w(sb3.toString());
            } else {
                this.A09 = str;
                return;
            }
        }
        throw new C64122xf(15);
    }

    public boolean A10() {
        File file;
        AnonymousClass0M4 r0 = this.A02;
        return (r0 == null || (file = r0.A0F) == null || !file.canRead()) ? false : true;
    }
}
