package X;

import android.text.TextUtils;
import android.text.format.Time;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1RA  reason: invalid class name */
public final class AnonymousClass1RA {
    public String A00;
    public String A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass009 A04;
    public final AnonymousClass1RF A05;
    public final String A06;
    public final JSONObject A07;

    public AnonymousClass1RA(AnonymousClass009 r1, AnonymousClass1RF r2, String str, String str2, long j, long j2, String str3, JSONObject jSONObject) {
        this.A04 = r1;
        this.A05 = r2;
        this.A06 = str;
        this.A01 = str2;
        this.A03 = j;
        this.A02 = j2;
        this.A00 = str3;
        this.A07 = jSONObject;
    }

    public static AnonymousClass1RA A00(AnonymousClass009 r16, AnonymousClass1RF r17, String str, InputStream inputStream) {
        try {
            String A0J = C006803i.A0J(inputStream);
            if (TextUtils.isEmpty(A0J)) {
                Log.e("gdrive-api-v2/backup/empty input");
                return null;
            }
            JSONObject jSONObject = new JSONObject(A0J);
            String A012 = A01(jSONObject, "name");
            String A013 = A01(jSONObject, "updateTime");
            if (TextUtils.isEmpty(A013)) {
                Log.e("gdrive-api-v2/backup/no updateTime provided. malformed stream?");
                return null;
            }
            Time time = new Time();
            time.parse3339(A013);
            long millis = time.toMillis(true);
            long optLong = jSONObject.optLong("sizeBytes", -1);
            String A014 = A01(jSONObject, "activeTransactionId");
            String A015 = A01(jSONObject, "metadata");
            JSONObject jSONObject2 = !TextUtils.isEmpty(A015) ? new JSONObject(A015) : null;
            if (A012 != null && millis > 0) {
                return new AnonymousClass1RA(r16, r17, str, A012, millis, optLong, A014, jSONObject2);
            }
            return null;
        } catch (JSONException e) {
            Log.e("gdrive-api-v2/backup/unable to read stream", e);
            return null;
        } catch (IOException e2) {
            Log.e("gdrive-api-v2/backup/unable to read stream", e2);
        }
    }

    public static String A01(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException e) {
            Log.e("gdrive-api-v2/backup/get-string unexpected exception", e);
            return null;
        }
    }

    public long A02() {
        JSONObject jSONObject = this.A07;
        if (jSONObject == null) {
            return -1;
        }
        return jSONObject.optLong("chatdbSize", -1);
    }

    public synchronized String A03() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Backup{jidUser='");
        AnonymousClass008.A1W(A0S, this.A06, '\'', ", name='");
        AnonymousClass008.A1W(A0S, this.A01, '\'', ", updateTime=");
        A0S.append(this.A03);
        A0S.append(", sizeBytes=");
        A0S.append(this.A02);
        A0S.append(", activeTransactionId='");
        A0S.append(A03());
        A0S.append('\'');
        A0S.append(", clientMetadata=");
        A0S.append(this.A07);
        A0S.append('}');
        return A0S.toString();
    }
}
