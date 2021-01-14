package X;

import android.util.Base64;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.3B6  reason: invalid class name */
public class AnonymousClass3B6 {
    public final String A00;
    public final AnonymousClass3B7 A01;

    public AnonymousClass3B6(AnonymousClass3B7 r8) {
        String str;
        this.A01 = r8;
        StringBuilder sb = new StringBuilder();
        String[] split = new String(Base64.decode("MS03LTItNA==", -1)).split("-");
        for (String str2 : split) {
            Properties properties = this.A01.A03;
            if (properties != null) {
                str = properties.getProperty(str2);
            } else {
                str = null;
            }
            sb.append(str);
        }
        this.A00 = new String(Base64.decode(sb.toString(), -1));
    }

    public String A00(JSONObject jSONObject) {
        String str = this.A00;
        if (str == null || str.isEmpty()) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\[([^\\]]*)\\]").matcher(str);
        StringBuffer stringBuffer = new StringBuffer((int) SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        while (matcher.find()) {
            String group = matcher.group();
            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(jSONObject.optString(group.substring(1, group.length() - 1))));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
