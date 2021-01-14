package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.28s  reason: invalid class name and case insensitive filesystem */
public final class C462328s extends AnonymousClass25Z {
    public static final Pattern A05 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final boolean A04;

    public C462328s(List list) {
        String A07;
        if (list == null || list.isEmpty()) {
            this.A04 = false;
            return;
        }
        this.A04 = true;
        String str = new String((byte[]) list.get(0), Charset.forName("UTF-8"));
        C002001d.A39(str.startsWith("Format: "));
        A02(str);
        C233815n r2 = new C233815n((byte[]) list.get(1));
        do {
            A07 = r2.A07();
            if (A07 == null) {
                return;
            }
        } while (!A07.startsWith("[Events]"));
    }

    public static long A00(String str) {
        Matcher matcher = A05.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        long parseLong = Long.parseLong(matcher.group(1)) * 60 * 60 * SearchActionVerificationClientService.MS_TO_NS;
        long parseLong2 = Long.parseLong(matcher.group(3)) * SearchActionVerificationClientService.MS_TO_NS;
        return (Long.parseLong(matcher.group(4)) * 10000) + parseLong2 + (Long.parseLong(matcher.group(2)) * 60 * SearchActionVerificationClientService.MS_TO_NS) + parseLong;
    }

    public final void A02(String str) {
        String[] split = TextUtils.split(str.substring(8), ",");
        int length = split.length;
        this.A01 = length;
        this.A02 = -1;
        int i = -1;
        this.A00 = -1;
        int i2 = -1;
        this.A03 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            String trim = split[i4].trim();
            if (trim != null) {
                trim = trim.toLowerCase(Locale.US);
            }
            int hashCode = trim.hashCode();
            if (hashCode != 100571) {
                if (hashCode != 3556653) {
                    if (hashCode == 109757538 && trim.equals("start")) {
                        this.A02 = i4;
                        i = i4;
                    }
                } else if (trim.equals("text")) {
                    this.A03 = i4;
                    i3 = i4;
                }
            } else if (trim.equals("end")) {
                this.A00 = i4;
                i2 = i4;
            }
        }
        if (i == -1 || i2 == -1 || i3 == -1) {
            this.A01 = 0;
        }
    }
}
