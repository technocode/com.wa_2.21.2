package X;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.008  reason: invalid class name */
public class AnonymousClass008 {
    public static int A00(String str, int i) {
        return String.valueOf(str).length() + i;
    }

    public static Bundle A01(String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    public static AlphaAnimation A02(float f, float f2, long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        return alphaAnimation;
    }

    public static AnonymousClass0MD A03(AnonymousClass01X r2, int i, AnonymousClass0MB r4) {
        r4.A05(r2.A06(i), null);
        return r4.A00();
    }

    public static Boolean A04(AnonymousClass06K r0) {
        return Boolean.valueOf(r0.ALz().A2L());
    }

    public static Long A05(Long l) {
        return Long.valueOf(l.longValue() + 1);
    }

    public static Long A06(Long l, long j) {
        return Long.valueOf(j - l.longValue());
    }

    public static String A08(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String A09(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String A0B(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static String A0C(AnonymousClass037 r2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(r2);
        sb.append(str);
        return sb.toString();
    }

    public static String A0D(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.A0F());
        return sb.toString();
    }

    public static String A0E(AnonymousClass01X r0, int i, StringBuilder sb) {
        sb.append(r0.A06(i));
        return sb.toString();
    }

    public static String A0F(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A0G(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0H(String str, int i, String str2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    public static String A0I(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String A0J(String str, Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(uri);
        return sb.toString();
    }

    public static String A0K(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0L(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String A0M(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String A0N(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String A0O(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0P(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String A0Q(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String A0R(XmlPullParser xmlPullParser, StringBuilder sb) {
        sb.append(xmlPullParser.getName());
        return sb.toString();
    }

    public static StringBuilder A0S(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder A0T(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0U(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder A0V(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0W(String str, AnonymousClass02N r2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(r2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0X(String str, UserJid userJid, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(userJid);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0Y(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A0Z(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder A0a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void A0b(SharedPreferences.Editor editor, String str, String str2, String str3, String str4) {
        editor.remove(str);
        editor.remove(str2);
        editor.remove(str3);
        editor.remove(str4);
    }

    public static void A0c(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.execSQL(str);
        sQLiteDatabase.execSQL(str2);
        sQLiteDatabase.execSQL(str3);
        sQLiteDatabase.execSQL(str4);
    }

    public static void A0f(C28021Sn r2, String str, HashMap hashMap, C28031So r5) {
        r5.A00(new RunnableEBaseShape0S1200000_I0(r2, hashMap, str, 8));
    }

    public static void A0h(AnonymousClass00S r1, long j, C015508n r4, String str) {
        r4.A01(str, r1.A04() - j);
    }

    public static void A0i(AnonymousClass00S r1, long j, StringBuilder sb) {
        sb.append(r1.A05() - j);
        Log.d(sb.toString());
    }

    public static void A0o(AnonymousClass01X r0, int i, StringBuilder sb, String str) {
        sb.append(r0.A06(i));
        sb.append(str);
    }

    public static void A0q(C02010Ah r0, String str, String str2) {
        r0.A01().edit().putString(str, str2).apply();
    }

    public static void A0r(C04600Kz r1, StringBuilder sb) {
        sb.append(r1.A00());
        Log.d(sb.toString());
    }

    public static void A0s(C04600Kz r1, StringBuilder sb) {
        sb.append(r1.A01());
        Log.i(sb.toString());
    }

    public static void A0t(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        Log.d(sb.toString());
    }

    public static void A0u(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        Log.e(sb.toString());
    }

    public static void A0v(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A0w(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        Log.w(sb.toString());
    }

    public static void A0x(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        android.util.Log.w(str2, sb.toString());
    }

    public static void A0y(String str, int i, String str2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        Log.i(sb.toString());
    }

    public static void A0z(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        Log.d(sb.toString());
    }

    public static void A10(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A11(String str, AnonymousClass02N r2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(r2);
        Log.d(sb.toString());
    }

    public static void A12(String str, AnonymousClass02N r2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(r2);
        Log.i(sb.toString());
    }

    public static void A13(String str, AnonymousClass02N r2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(r2);
        Log.w(sb.toString());
    }

    public static void A14(String str, UserJid userJid) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(userJid);
        Log.i(sb.toString());
    }

    public static void A15(String str, UserJid userJid, ArrayList arrayList) {
        arrayList.add(new AnonymousClass0OS(str, userJid));
    }

    public static void A16(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Log.d(sb.toString());
    }

    public static void A17(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString());
    }

    public static void A18(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Log.i(sb.toString());
    }

    public static void A19(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        Log.w(sb.toString());
    }

    public static void A1A(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        android.util.Log.e("ParametersHelper", sb.toString());
    }

    public static void A1B(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        android.util.Log.w(str3, sb.toString());
    }

    public static void A1C(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        Log.w(sb.toString());
    }

    public static void A1E(String str, String str2, ArrayList arrayList) {
        arrayList.add(new AnonymousClass0M5(str, (AnonymousClass0OS[]) null, str2));
    }

    public static void A1F(String str, String str2, ArrayList arrayList) {
        arrayList.add(new AnonymousClass0OS(str, str2, null, (byte) 0));
    }

    public static void A1G(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z);
        Log.d(sb.toString());
    }

    public static void A1H(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z);
        Log.i(sb.toString());
    }

    public static void A1I(String str, byte[] bArr, ArrayList arrayList) {
        arrayList.add(new AnonymousClass0M5(str, null, null, bArr));
    }

    public static void A1J(StringBuffer stringBuffer, String str, String str2) {
        stringBuffer.append(str);
        stringBuffer.append('\'');
        stringBuffer.append(str2);
    }

    public static void A1K(StringBuilder sb, int i) {
        sb.append(i);
        Log.d(sb.toString());
    }

    public static void A1L(StringBuilder sb, int i) {
        sb.append(i);
        Log.i(sb.toString());
    }

    public static void A1M(StringBuilder sb, int i) {
        sb.append(i);
        Log.w(sb.toString());
    }

    public static void A1N(StringBuilder sb, int i, C018809u r4) {
        sb.append(i);
        r4.A07(null, sb.toString(), null);
    }

    public static void A1O(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void A1P(StringBuilder sb, long j) {
        sb.append(j);
        Log.i(sb.toString());
    }

    public static void A1Q(StringBuilder sb, UserJid userJid) {
        sb.append(userJid);
        Log.i(sb.toString());
    }

    public static void A1R(StringBuilder sb, C007303n r1, boolean z) {
        sb.append(r1);
        AnonymousClass00E.A09(z, sb.toString());
    }

    public static void A1S(StringBuilder sb, String str) {
        sb.append(str);
        Log.d(sb.toString());
    }

    public static void A1T(StringBuilder sb, String str) {
        sb.append(str);
        Log.e(sb.toString());
    }

    public static void A1U(StringBuilder sb, String str) {
        sb.append(str);
        Log.i(sb.toString());
    }

    public static void A1V(StringBuilder sb, String str) {
        sb.append(str);
        Log.w(sb.toString());
    }

    public static void A1W(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }

    public static void A1X(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        Log.i(sb.toString());
    }

    public static void A1Y(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void A1Z(StringBuilder sb, boolean z) {
        sb.append(z);
        Log.d(sb.toString());
    }

    public static void A1a(StringBuilder sb, boolean z) {
        sb.append(z);
        Log.i(sb.toString());
    }

    public static void A1b(ArrayList arrayList, StringBuilder sb) {
        sb.append(arrayList.size());
        Log.i(sb.toString());
    }

    public static RuntimeException A07(String str, String str2) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return new RuntimeException(str2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e(sb.toString());
        }
    }

    public static String A0A(long j, AnonymousClass00S r4, AnonymousClass01X r5) {
        return C001801b.A0e(r5, r4.A06(j - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset())));
    }

    public static void A0d(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A07 = new C05710Pt();
    }

    public static void A0e(RestoreFromBackupActivity restoreFromBackupActivity, int i, int i2) {
        AnonymousClass0MW r0 = (AnonymousClass0MW) restoreFromBackupActivity.A0A();
        r0.A0L();
        View findViewById = r0.A08.findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(i2);
            return;
        }
        throw null;
    }

    public static void A0g(AnonymousClass0IB r0, String str, long j) {
        r0.A00.edit().putLong(str, j).apply();
    }

    public static void A0j(AnonymousClass00D r0, String str) {
        r0.A00.edit().remove(str).apply();
    }

    public static void A0k(AnonymousClass00D r0, String str, int i) {
        r0.A00.edit().putInt(str, i).apply();
    }

    public static void A0l(AnonymousClass00D r0, String str, long j) {
        r0.A00.edit().putLong(str, j).apply();
    }

    public static void A0m(AnonymousClass00D r0, String str, String str2) {
        r0.A00.edit().putString(str, str2).apply();
    }

    public static void A0n(AnonymousClass00D r0, String str, boolean z) {
        r0.A00.edit().putBoolean(str, z).apply();
    }

    public static void A0p(AnonymousClass01X r3, int i, Object[] objArr, StringBuilder sb) {
        sb.append(String.format(r3.A0I(), r3.A06(i), objArr));
        sb.append("\n");
    }

    public static void A1D(String str, String str2, ArrayList arrayList) {
        arrayList.add(new AnonymousClass0OS(str, str2, null, (byte) 0));
    }
}
