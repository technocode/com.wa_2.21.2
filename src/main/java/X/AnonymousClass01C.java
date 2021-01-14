package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: X.01C  reason: invalid class name */
public abstract class AnonymousClass01C {
    public final AnonymousClass08H A00;

    public AnonymousClass01C(AnonymousClass08H r3) {
        this.A00 = r3;
        r3.A06.A00(new AnonymousClass08O(this));
    }

    public static C04600Kz A02() {
        C04600Kz r0 = new C04600Kz(true);
        r0.A03();
        return r0;
    }

    public static String A03(String str, String str2) {
        StringBuilder A0S = AnonymousClass008.A0S(str);
        A0S.append(str2.toUpperCase(Locale.ROOT));
        return A0S.toString();
    }

    public long A04(String str, ContentValues contentValues) {
        return this.A00.A05().A03(str, contentValues, A03("ContactProvider/insertOrReplace/INSERT_", str));
    }

    public long A05(String str, ContentValues contentValues, String str2, String[] strArr) {
        return (long) this.A00.A05().A00(str, contentValues, str2, strArr, A03("ContactProvider/delete/UPDATE_", str));
    }

    public long A06(String str, String str2, String[] strArr) {
        return (long) this.A00.A05().A01(str, str2, strArr, A03("ContactProvider/delete/DELETE_", str));
    }

    public Cursor A07(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        return this.A00.A04().A08(str, strArr, str2, strArr2, str3, AnonymousClass008.A0K("ContactProvider/query/QUERY_", str4));
    }

    public void A08(String str, ContentValues contentValues) {
        this.A00.A05().A05(str, contentValues, A03("ContactProvider/insertOrReplace/REPLACE_", str));
    }
}
