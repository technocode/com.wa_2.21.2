package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;

/* renamed from: X.2u1  reason: invalid class name and case insensitive filesystem */
public class C61962u1 {
    public final AnonymousClass00S A00;
    public final C03340Fu A01;

    public C61962u1(AnonymousClass00S r1, C03340Fu r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] A00(String str, Boolean bool, Object obj, long j, String str2, byte[] bArr, Object... objArr) {
        String str3;
        if (bool == null) {
            str3 = null;
        } else {
            str3 = bool.booleanValue() ? "PIN" : "BIO";
        }
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = str;
        objArr2[1] = str3;
        objArr2[2] = obj;
        objArr2[3] = Long.valueOf(j);
        objArr2[4] = str2;
        objArr2[5] = bArr;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr2[i2] == null) {
                strArr[i2] = "";
            } else if (objArr2[i2] instanceof String) {
                strArr[i2] = objArr2[i2];
            } else if ((objArr2[i2] instanceof Long) || (objArr2[i2] instanceof Integer)) {
                strArr[i2] = String.valueOf(objArr2[i2]);
            } else if (objArr2[i2] instanceof byte[]) {
                strArr[i2] = Base64.encodeToString((byte[]) objArr2[i2], 2);
            } else {
                throw new IllegalArgumentException(C018809u.A01("PinActions", "getPinNode: should only accept long, int, byte[], and String args"));
            }
        }
        try {
            return TextUtils.join("|", strArr).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("constructPayload: UTF-8 not supported: ");
            sb.append(e);
            Log.e(C018809u.A01("PinActions", sb.toString()));
            throw new Error(e);
        }
    }
}
