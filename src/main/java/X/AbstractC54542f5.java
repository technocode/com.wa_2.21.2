package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.2f5  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC54542f5 extends AnonymousClass0JW {
    public CharSequence A00;
    public String A01;
    public final /* synthetic */ AbstractC49282Pv A02;

    public AbstractC54542f5(AbstractC49282Pv r1, CharSequence charSequence, String str) {
        this.A02 = r1;
        this.A00 = charSequence;
        this.A01 = str;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        String obj;
        String A0D;
        String str;
        AnonymousClass02R A022;
        Object obj2;
        int i;
        String A04;
        AbstractC49282Pv r4 = this.A02;
        C48692Ni r7 = r4.A04;
        InputMethodManager A0H = r7.A02.A0H();
        if (A0H != null) {
            InputMethodSubtype currentInputMethodSubtype = A0H.getCurrentInputMethodSubtype();
            Locale locale = null;
            if (currentInputMethodSubtype != null && currentInputMethodSubtype.getMode().equals("keyboard")) {
                InputMethodSubtype inputMethodSubtype = r7.A00;
                if (!(inputMethodSubtype == null || inputMethodSubtype == currentInputMethodSubtype || inputMethodSubtype.equals(currentInputMethodSubtype))) {
                    Log.d("KeyboardLanguageExtractor/input method changed, recreate subtype set.");
                    r7.A00();
                }
                r7.A00 = currentInputMethodSubtype;
                if (r7.A01 == null) {
                    r7.A00();
                }
                Set set = r7.A01;
                if (set != null && set.contains(currentInputMethodSubtype)) {
                    String locale2 = currentInputMethodSubtype.getLocale();
                    if (!TextUtils.isEmpty(locale2)) {
                        if (Pattern.matches("[a-z]{2}_[A-Z]{2}", locale2)) {
                            locale = Build.VERSION.SDK_INT >= 21 ? Locale.forLanguageTag(locale2.replace("_", "-")) : new Locale(locale2.substring(0, 2), locale2.substring(3, 5));
                        } else if (Pattern.matches("[a-z]{2}", locale2)) {
                            locale = new Locale(locale2);
                        } else {
                            AnonymousClass008.A17("keyboardLanguageExtractor/error/cannot parse locale ", locale2);
                        }
                    }
                }
            }
            CharSequence charSequence = this.A00;
            String str2 = this.A01;
            if (!(this instanceof C59932oW)) {
                String[] strArr = new String[8];
                strArr[0] = "api_key";
                strArr[1] = AnonymousClass04k.A0D;
                strArr[2] = "q";
                strArr[3] = charSequence.toString();
                strArr[4] = "lang";
                C54642fG r2 = ((C59922oV) this).A00.A00;
                if (r2 != null) {
                    if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
                        A04 = r2.A03.A04();
                    } else if (!locale.getLanguage().equalsIgnoreCase("zh") || TextUtils.isEmpty(locale.getCountry())) {
                        A04 = locale.getLanguage();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(locale.getLanguage());
                        sb.append("-");
                        sb.append(locale.getCountry());
                        A04 = sb.toString();
                    }
                    strArr[5] = A04;
                    strArr[6] = "rating";
                    strArr[7] = "pg-13";
                    A0D = AnonymousClass0JJ.A0D("https://api.giphy.com/v1/gifs/search", strArr);
                    if (!TextUtils.isEmpty(str2)) {
                        A0D = AnonymousClass0JJ.A0D(A0D, "offset", str2);
                    }
                } else {
                    throw null;
                }
            } else {
                String[] strArr2 = new String[6];
                strArr2[0] = "key";
                strArr2[1] = AnonymousClass04k.A0K;
                strArr2[2] = "tag";
                strArr2[3] = charSequence.toString();
                strArr2[4] = "locale";
                C54672fJ r0 = ((C59932oW) this).A00.A00;
                if (r0 != null) {
                    if (locale == null) {
                        StringBuilder sb2 = new StringBuilder();
                        AnonymousClass01X r22 = r0.A03;
                        sb2.append(r22.A04());
                        sb2.append("_");
                        sb2.append(r22.A03());
                        obj = sb2.toString();
                    } else if (TextUtils.isEmpty(locale.getCountry())) {
                        obj = locale.getLanguage();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(locale.getLanguage());
                        sb3.append("_");
                        sb3.append(locale.getCountry());
                        obj = sb3.toString();
                    }
                    strArr2[5] = obj;
                    A0D = AnonymousClass0JJ.A0D("https://wa.tenor.co/v1/search", strArr2);
                    if (!TextUtils.isEmpty(str2)) {
                        A0D = AnonymousClass0JJ.A0D(A0D, "pos", str2);
                    }
                } else {
                    throw null;
                }
            }
            if (!(this instanceof C59932oW)) {
                C54632fF r02 = ((C59922oV) this).A00;
                C54642fG r72 = r02.A00;
                boolean z = r02.A02;
                C44381zx r23 = new C44381zx();
                r23.A08 = "Giphy";
                int i2 = 3;
                if (z) {
                    i2 = 2;
                }
                r23.A00 = Integer.valueOf(i2);
                A022 = C54642fG.A01(r72, A0D, r23);
            } else {
                C54662fI r03 = ((C59932oW) this).A00;
                C54672fJ r73 = r03.A00;
                boolean z2 = r03.A02;
                C44381zx r24 = new C44381zx();
                if (r73 == null) {
                    str = "Giphy";
                } else {
                    str = "Tenor";
                }
                r24.A08 = str;
                int i3 = 3;
                if (z2) {
                    i3 = 2;
                }
                r24.A00 = Integer.valueOf(i3);
                A022 = C54672fJ.A02(r73, A0D, r24);
            }
            if (A022 != null && ((obj2 = A022.A01) == null || ((List) obj2).isEmpty())) {
                AnonymousClass200 r25 = new AnonymousClass200();
                if (!(r4 instanceof C54672fJ)) {
                    i = 0;
                } else {
                    i = 1;
                }
                r25.A00 = Integer.valueOf(i);
                if (locale != null) {
                    r25.A01 = locale.getLanguage();
                }
                r25.A02 = r4.A03.A04();
                r4.A05.A09(r25, 1);
                AnonymousClass00Y.A01(r25, "");
            }
            return A022;
        }
        throw null;
    }
}
