package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.2FF  reason: invalid class name */
public class AnonymousClass2FF {
    public AnonymousClass0QZ A00;
    public String A01;
    public String A02;
    public byte[] A03;
    public byte[] A04;

    public AnonymousClass2FF(String str, byte[] bArr, String str2, AnonymousClass0QZ r4, byte[] bArr2) {
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = str2;
        this.A00 = r4;
        this.A04 = bArr2;
    }

    public static AnonymousClass2FF A00(String str) {
        byte[] bArr;
        AnonymousClass0QZ r11;
        String[] split = str.split(",");
        int length = split.length;
        String str2 = null;
        if (length < 3) {
            Log.e("qrData/processQR/error/invalid_code parts");
            return null;
        }
        boolean z = false;
        if (length >= 4) {
            z = true;
        }
        if (z) {
            try {
                r11 = new AnonymousClass0QZ(C001801b.A08(C05360Of.A08(new byte[]{5}, Base64.decode(split[2], 0))));
                bArr = Base64.decode(split[3], 0);
            } catch (AnonymousClass1UK unused) {
                Log.e("qrData/processQR/error/invalid identity key");
                return null;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("qrData/processQR/error/");
                sb.append(e);
                Log.e(sb.toString());
                return null;
            }
        } else {
            r11 = null;
            bArr = null;
        }
        String str3 = split[0];
        byte[] decode = Base64.decode(split[1], 0);
        if (!z) {
            str2 = split[2];
        }
        return new AnonymousClass2FF(str3, decode, str2, r11, bArr);
    }
}
