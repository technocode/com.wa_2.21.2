package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Z6  reason: invalid class name */
public final class AnonymousClass0Z6 {
    public static final Pattern A02 = Pattern.compile("(@\\d+)");
    public static final boolean A03 = Character.isDefined((char) 8296);
    public static final boolean A04 = Character.isDefined((char) 8297);
    public static volatile AnonymousClass0Z6 A05;
    public final AnonymousClass01A A00;
    public final C014308b A01;

    public AnonymousClass0Z6(AnonymousClass01A r1, C014308b r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass0Z6 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0Z6.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0Z6(AnonymousClass01A.A00(), C014308b.A00());
                }
            }
        }
        return A05;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Z6] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public CharSequence A01(Context context, CharSequence charSequence, List list) {
        if (list != null && !list.isEmpty()) {
            if (charSequence instanceof SpannableStringBuilder) {
                charSequence = (SpannableStringBuilder) charSequence;
            } else {
                charSequence = new SpannableStringBuilder(charSequence);
            }
            A03(context, charSequence, list, false);
        }
        return charSequence;
    }

    public String A02(C007003k r4) {
        String str;
        String A002;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (A03) {
            str = "⁨";
        } else {
            str = str2;
        }
        sb.append(str);
        if (r4.A0A()) {
            A002 = C014308b.A02(r4, false);
        } else if (!TextUtils.isEmpty(r4.A0F)) {
            A002 = r4.A0F;
        } else if (!TextUtils.isEmpty(r4.A0O)) {
            A002 = r4.A0O;
        } else {
            A002 = C12420i4.A00(r4);
        }
        sb.append(A002);
        if (A04) {
            str2 = "⁩";
        }
        sb.append(str2);
        return sb.toString();
    }

    public void A03(Context context, SpannableStringBuilder spannableStringBuilder, List list, boolean z) {
        C38771qQ r0;
        if (z) {
            r0 = new C38771qQ(context, R.color.link_color, false);
        } else {
            r0 = null;
        }
        A04(spannableStringBuilder, list, r0);
    }

    public void A04(SpannableStringBuilder spannableStringBuilder, List list, AbstractC26691Ma r11) {
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(spannableStringBuilder)) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserJid userJid = (UserJid) it.next();
                if (userJid != null) {
                    C007003k A0A = this.A00.A0A(userJid);
                    StringBuilder A0S = AnonymousClass008.A0S("@");
                    A0S.append(A02(A0A));
                    hashMap.put(C006803i.A0H(userJid), new AnonymousClass02R(A0S.toString(), A0A));
                }
            }
            Matcher matcher = A02.matcher(spannableStringBuilder);
            int i = 0;
            while (matcher.find()) {
                String group = matcher.group();
                if (hashMap.keySet().contains(group)) {
                    int start = matcher.start() + i;
                    Object obj = hashMap.get(group);
                    if (obj != null) {
                        AnonymousClass02R r3 = (AnonymousClass02R) obj;
                        String str = (String) r3.A00;
                        int length = group.length();
                        spannableStringBuilder.replace(start, length + start, (CharSequence) str);
                        int length2 = str.length();
                        i += length2 - length;
                        if (r11 != null) {
                            r11.AJK(spannableStringBuilder, start, length2 + start, (C007003k) r3.A01);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }
}
