package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.0Gr  reason: invalid class name and case insensitive filesystem */
public class C03550Gr {
    public static volatile C03550Gr A02;
    public final C03560Gs A00;
    public final AnonymousClass00S A01;

    public C03550Gr(AnonymousClass00G r3, AnonymousClass00S r4, AnonymousClass04q r5) {
        this.A00 = new C03560Gs(r3.A00, r5);
        this.A01 = r4;
    }

    public static C03550Gr A00() {
        if (A02 == null) {
            synchronized (C03550Gr.class) {
                if (A02 == null) {
                    A02 = new C03550Gr(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass04q.A00());
                }
            }
        }
        return A02;
    }

    public void A01(Locale locale, String str) {
        AnonymousClass0BK A012 = this.A00.A01();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(this.A01.A05() / 1000));
        if (A012.A00("packs", contentValues, "lg = ? AND lc = ? AND namespace = ?", new String[]{locale.getLanguage(), locale.getCountry(), str}, "touchLanguagePack/UPDATE_PACKS") > 0) {
            StringBuilder sb = new StringBuilder("language-pack-store/touch-language-pack updated timestamp for ");
            sb.append(locale);
            sb.append(" ns=");
            sb.append(str);
            Log.i(sb.toString());
        }
    }

    public void A02(Locale locale, String str, String str2, byte[] bArr) {
        long A05 = this.A01.A05() / 1000;
        AnonymousClass0BK A012 = this.A00.A01();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("lg", locale.getLanguage());
        contentValues.put("lc", locale.getCountry());
        contentValues.put("hash", str);
        contentValues.put("namespace", str2);
        contentValues.put("timestamp", Long.valueOf(A05));
        contentValues.put("data", bArr);
        A012.A05("packs", contentValues, "saveLanguagePack/REPLACE_PACKS");
        StringBuilder sb = new StringBuilder("language-pack-store/save-language-pack saved pack ");
        sb.append(AbstractC002201f.A05(locale));
        sb.append(" (");
        sb.append(str);
        sb.append(") ns=");
        AnonymousClass008.A1U(sb, str2);
    }
}
