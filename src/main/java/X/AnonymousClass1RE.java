package X;

import android.os.Build;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1RE  reason: invalid class name */
public final class AnonymousClass1RE {
    public static final Pair A0E = Pair.create(null, null);
    public static final Pattern A0F = Pattern.compile("bytes=0-(\\d*)");
    public static final boolean A0G;
    public final AnonymousClass009 A00;
    public final AnonymousClass0JJ A01;
    public final AnonymousClass1R0 A02;
    public final AbstractC03860Ib A03;
    public final C41591vJ A04;
    public final AnonymousClass1RA A05;
    public final AnonymousClass1RF A06;
    public final C003301q A07;
    public final AnonymousClass03R A08;
    public final AnonymousClass03S A09;
    public final AnonymousClass00T A0A;
    public final File A0B;
    public final String A0C;
    public final String A0D;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 20) {
            z = true;
        }
        A0G = z;
    }

    public AnonymousClass1RE(AnonymousClass009 r2, AnonymousClass03R r3, AnonymousClass0JJ r4, AnonymousClass1R0 r5, AnonymousClass03S r6, AnonymousClass1RA r7, File file, String str, C41591vJ r10, AbstractC03860Ib r11, AnonymousClass1RF r12, C003301q r13, AnonymousClass00T r14) {
        this.A00 = r2;
        this.A08 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A09 = r6;
        this.A05 = r7;
        this.A0B = file;
        this.A0D = str;
        this.A04 = r10;
        this.A03 = r11;
        this.A06 = r12;
        this.A0C = r12.A0B;
        this.A07 = r13;
        this.A0A = r14;
    }

    public static AnonymousClass1RH A00(String str, long j, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.e("gdrive-api-v2/upload-file/unexpected-response/file-uploaded-but-no-entity-in-response");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("name", null);
            String optString2 = jSONObject.optString("mimeType", "application/binary");
            String optString3 = jSONObject.optString("md5Hash", null);
            String optString4 = jSONObject.optString("sizeBytes", null);
            String optString5 = jSONObject.optString("updateTime", null);
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString5)) {
                Log.e("gdrive-api-v2/upload-file/some attributes are missing");
                return null;
            }
            String A042 = C007603r.A04(Base64.decode(optString3, 2));
            long A043 = C006803i.A04(optString4, j);
            Time time = new Time();
            time.parse3339(optString5);
            AnonymousClass1RH r3 = new AnonymousClass1RH(str2, optString, optString2, A042, A043, time.toMillis(true));
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-api-v2/upload-file ");
            sb.append(str2);
            sb.append(" uploaded successfully.");
            Log.d(sb.toString());
            return r3;
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("gdrive-api-v2/upload-file/malformed-json-response/");
            sb2.append(str);
            Log.e(sb2.toString(), e);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x048f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0493, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04fa, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x051e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0520, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0521, code lost:
        r9 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x021e, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x021f, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0228, code lost:
        r1 = new java.lang.RunnableEBaseShape6S0200000_I1_1(r41, r4, 28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x023b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01e2 A[Catch:{ all -> 0x0203 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1RH A01(java.lang.String r42, long r43) {
        /*
        // Method dump skipped, instructions count: 1330
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RE.A01(java.lang.String, long):X.1RH");
    }
}
