package X;

import android.content.pm.Signature;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.01u  reason: invalid class name and case insensitive filesystem */
public class C003701u {
    public static AnonymousClass1YD A00;
    public static AnonymousClass1YD A01;
    public static Pattern A02;
    public static Pattern A03;

    public static CharSequence A00(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        Pattern pattern = A03;
        if (pattern == null) {
            pattern = Pattern.compile("[\\u1680\\u2000-\\u200a\\u205f\\u3000]+\\u0020");
            A03 = pattern;
        }
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.find()) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int i = 0;
        int i2 = 0;
        while (matcher.find(i)) {
            i = matcher.end();
            int start = matcher.start();
            spannableStringBuilder.replace(start - i2, i - i2, (CharSequence) " ");
            i2 += (i - start) - 1;
        }
        return spannableStringBuilder;
    }

    public static String A01(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()), 11);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String A02(AnonymousClass01X r3, String str, String str2) {
        String str3;
        String A04 = r3.A04();
        if ("ar".equals(A04) || "fa".equals(A04) || "ur".equals(A04)) {
            str3 = " — ";
        } else {
            str3 = " • ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A0E(str));
        sb.append(str3);
        sb.append(r3.A0E(str2));
        return sb.toString();
    }

    public static String A03(CharSequence charSequence) {
        String normalize = Normalizer.normalize(charSequence, Normalizer.Form.NFKD);
        Pattern pattern = A02;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            A02 = pattern;
        }
        return pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US).replace((char) 305, 'i');
    }

    public static String A04(CharSequence charSequence) {
        AnonymousClass1YD r2 = A00;
        if (r2 == null) {
            r2 = new AnonymousClass1YD(new String[]{"ı", "i", "ة", "ه", "ـ", "", "ى", "ي", "ٱ", "ا", "ڤ", "ف", "ک", "ك", "ں", "ن", "ھ", "ه", "ۃ", "ۂ", "ی", "ي", "ے", "ي", "ە", "ه", "۰", "٠", "۱", "١", "۲", "٢", "۳", "٣", "۴", "٤", "۵", "٥", "۶", "٦", "۷", "٧", "۸", "٨", "۹", "٩", "ࢻ", "ف", "ࢼ", "ق", "ࢽ", "ن", "‌", ""});
            A00 = r2;
        }
        AnonymousClass1YD r0 = A01;
        if (r0 == null) {
            r0 = new AnonymousClass1YD(new String[]{"ٵ", "ٴا", "ٶ", "ٴو", "ٷ", "ٴۇ", "ٸ", "ٴى", "अॆ", "ऄ", "अा", "आ", "र्इ", "ई", "उु", "ऊ", "एॅ", "ऍ", "एॆ", "ऎ", "एे", "ऐ", "अॉ", "ऑ", "आॅ", "ऑ", "अॊ", "ऒ", "आॆ", "ऒ", "अो", "ओ", "आे", "ओ", "अौ", "औ", "आै", "औ", "अॅ", "ॲ", "अऺ", "ॳ", "अऻ", "ॴ", "आऺ", "ॴ", "अॏ", "ॵ", "अॖ", "ॶ", "अॗ", "ॷ", "অা", "আ", "ঋৃ", "ৠ", "ঌৢ", "ৡ", "ਅਾ", "ਆ", "ੲਿ", "ਇ", "ੲੀ", "ਈ", "ੳੁ", "ਉ", "ੳੂ", "ਊ", "ੲੇ", "ਏ", "ਅੈ", "ਐ", "ੳੋ", "ਓ", "ਅੌ", "ਔ", "અા", "આ", "અૅ", "ઍ", "અે", "એ", "અૈ", "ઐ", "અૉ", "ઑ", "અો", "ઓ", "અાૅ", "ઓ", "અૌ", "ઔ", "અાૈ", "ઔ", "ૅા", "ૉ", "ଅା", "ଆ", "ଏୗ", "ଐ", "ଓୗ", "ଔ", "ஸ்ரீ", "ஶ்ரீ", "ఒౕ", "ఓ", "ఒౌ", "ఔ", "ిౕ", "ీ", "ెౕ", "ే", "ొౕ", "ో", "ಉಾ", "ಊ", "ಒೌ", "ಔ", "ಋಾ", "ೠ", "ഇൗ", "ഈ", "ഉൗ", "ഊ", "എെ", "ഐ", "ഒാ", "ഓ", "ഒൗ", "ഔ", "ണ്‍", "ൺ", "ന്‍", "ൻ", "ര്‍", "ർ", "ല്‍", "ൽ", "ള്‍", "ൾ", "අා", "ආ", "අැ", "ඇ", "අෑ", "ඈ", "උෟ", "ඌ", "ඍෘ", "ඎ", "ඏෟ", "ඐ", "එ්", "ඒ", "එෙ", "ඓ", "ඔෟ", "ඖ"});
            A01 = r0;
        }
        String normalize = Normalizer.normalize(r0.A00(charSequence), Normalizer.Form.NFKD);
        Pattern pattern = A02;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            A02 = pattern;
        }
        return r2.A00(pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US)).toString();
    }

    public static String A05(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String A06(String str, int i) {
        int length;
        if (1 != 0) {
            return (str == null || (length = str.length()) <= i) ? str : str.substring(length - i);
        }
        throw new IllegalArgumentException();
    }

    public static String A07(String str, int i) {
        return (str == null || str.codePointCount(0, str.length()) <= i) ? str : str.substring(0, str.offsetByCodePoints(0, i));
    }

    public static String A08(String str, int i) {
        if (str == null) {
            return "";
        }
        String A07 = A07(str, i);
        if (str == A07) {
            return str;
        }
        return AnonymousClass008.A0K(A07, "…");
    }

    public static String A09(Throwable th) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
            i++;
            if (i == 15) {
                break;
            }
        }
        return sb.toString();
    }

    public static String A0A(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b >> 4) & 15, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public static List A0B(byte[] bArr) {
        try {
            return new ArrayList((Collection) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject());
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            Log.e("ContactUtil/getContactsFromBytes/error getting contacts from data", e);
            return new ArrayList();
        }
    }

    public static void A0C() {
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                StringBuilder sb = new StringBuilder("\n");
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                sb.append("name=");
                sb.append(key.getName());
                sb.append(" state=");
                sb.append(key.getState());
                sb.append(" tid=");
                sb.append(key.getId());
                sb.append('\n');
                sb.append("### begin stack trace 2.21.2.4(267728432)\n");
                for (StackTraceElement stackTraceElement : value) {
                    sb.append("    at ");
                    sb.append(stackTraceElement.toString());
                    sb.append('\n');
                }
                sb.append("### end stack trace");
                sb.append('\n');
                Log.log(3, sb.toString());
            }
        } catch (Throwable th) {
            Log.e("ThreadUtils/logAllStackTraces exception", th);
        }
    }

    public static boolean A0D() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean A0E(CharSequence charSequence) {
        int length;
        if (!(charSequence == null || (length = charSequence.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                if (!(charAt == 8203 || Character.isWhitespace(charAt))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A0F(CharSequence charSequence, CharSequence charSequence2) {
        return (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2)) || TextUtils.equals(charSequence, charSequence2);
    }
}
