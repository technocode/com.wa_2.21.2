package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0FN  reason: invalid class name */
public class AnonymousClass0FN {
    public static volatile AnonymousClass0FN A01;
    public final SharedPreferences A00;

    public AnonymousClass0FN(AnonymousClass022 r2) {
        this.A00 = r2.A01("media_daily_usage_preferences_v1");
    }

    public static String A00(long j, int i, int i2, int i3, boolean z) {
        if (!(i == 2 || i == 3 || i == 5)) {
            i = 1;
        }
        return String.format(Locale.US, "%d_%d_%d_%d_%b", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z));
    }

    public C49922Ss A01(long j, int i, int i2, int i3, boolean z) {
        int i4 = i;
        String string = this.A00.getString(A00(j, i4, i2, i3, z), null);
        if (string == null || string.isEmpty()) {
            if (!(i == 2 || i == 3 || i == 5)) {
                i4 = 1;
            }
            return new C49922Ss(j, i4, i2, i3, z);
        }
        C49922Ss A002 = C49922Ss.A00(string);
        if (A002 != null) {
            return A002;
        }
        if (!(i == 2 || i == 3 || i == 5)) {
            i4 = 1;
        }
        return new C49922Ss(j, i4, i2, i3, z);
    }

    public void A02(long j, int i, int i2, int i3, boolean z, C49922Ss r13) {
        String A002 = A00(j, i, i2, i3, z);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bytesSent", r13.A01);
            jSONObject.put("bytesReceived", r13.A00);
            jSONObject.put("countMessageSent", r13.A05);
            jSONObject.put("countMessageReceived", r13.A04);
            jSONObject.put("countUploaded", r13.A07);
            jSONObject.put("countDownloaded", r13.A02);
            jSONObject.put("countForward", r13.A03);
            jSONObject.put("countShared", r13.A06);
            jSONObject.put("countViewed", r13.A08);
            jSONObject.put("transferDate", r13.A0C);
            jSONObject.put("mediaType", r13.A0A);
            jSONObject.put("transferRadio", r13.A0B);
            jSONObject.put("mediaTransferOrigin", r13.A09);
            jSONObject.put("isAutoDownload", r13.A0D);
            this.A00.edit().putString(A002, jSONObject.toString()).apply();
        } catch (JSONException e) {
            StringBuilder A0S = AnonymousClass008.A0S("MediaDailyUsageSharedPreferences/setWamMediaDailyUsage/");
            A0S.append(e.getMessage());
            Log.d(A0S.toString());
        }
    }
}
