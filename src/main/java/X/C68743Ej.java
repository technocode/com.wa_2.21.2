package X;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.3Ej  reason: invalid class name and case insensitive filesystem */
public class C68743Ej {
    public AnonymousClass00G A00;
    public C02010Ah A01;
    public C018809u A02 = C018809u.A00("PaymentCommonDeviceIdManager", "infra", "COMMON");

    public C68743Ej(AnonymousClass00G r4, C02010Ah r5) {
        this.A00 = r4;
        this.A01 = r5;
    }

    public Pair A00(String str) {
        String str2;
        Application application = this.A00.A00;
        if (str == null) {
            str = "";
        }
        try {
            String charsString = application.getPackageManager().getPackageInfo(application.getPackageName(), 64).signatures[0].toCharsString();
            if (!TextUtils.isEmpty(charsString)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("-");
                sb.append(charsString);
                str = sb.toString();
            }
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        str2 = StandardCharsets.UTF_8.name();
                    } else {
                        str2 = "UTF-8";
                    }
                    return new Pair(str, instance.digest(str.getBytes(str2)));
                } catch (UnsupportedEncodingException unused) {
                    return new Pair(str, null);
                }
            } catch (NoSuchAlgorithmException unused2) {
                return new Pair(str, null);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            return new Pair(str, null);
        } catch (NullPointerException unused4) {
            return new Pair(str, null);
        }
    }

    public String A01() {
        this.A02.A03("PaymentDeviceId: getid_v2()");
        Application application = this.A00.A00;
        if (Build.VERSION.SDK_INT >= 26) {
            this.A02.A03("PaymentDeviceId: still fallback to v1");
            return Settings.Secure.getString(application.getContentResolver(), "android_id");
        }
        this.A02.A03("PaymentDeviceId: generate id for v2");
        String string = Settings.Secure.getString(application.getContentResolver(), "android_id");
        if (!(this instanceof AnonymousClass3Y8)) {
            Pair A002 = A00(string);
            String str = (String) A002.first;
            byte[] bArr = (byte[]) A002.second;
            if (bArr == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
            }
            return sb.toString();
        }
        Pair A003 = A00(string);
        String str2 = (String) A003.first;
        byte[] bArr2 = (byte[]) A003.second;
        if (bArr2 != null) {
            return Base64.encodeToString(C007603r.A05(bArr2, bArr2, 128, 128).getEncoded(), 11);
        }
        return str2;
    }
}
