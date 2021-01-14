package X;

import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0I2  reason: invalid class name */
public class AnonymousClass0I2 {
    public static final Object A00 = new Object();
    public static final byte[] A01 = {0, 2};

    public static File A00(Context context) {
        return new File(context.getFilesDir(), "backup_token");
    }

    public static void A01(Context context, AnonymousClass00T r3, AnonymousClass00D r4) {
        r3.ANF(new RunnableEBaseShape3S0200000_I0_2(context, r4, 49));
    }

    public static boolean A02(Context context, AnonymousClass00S r8, C000300f r9, AnonymousClass00D r10) {
        if (!A03(r9)) {
            return false;
        }
        if (!A00(context).exists() || r8.A05() - r10.A00.getLong("backup_token_file_timestamp", -1) > TimeUnit.DAYS.toMillis((long) r9.A06(AbstractC000400g.A3e))) {
            return true;
        }
        return false;
    }

    public static boolean A03(C000300f r2) {
        if (r2.A0D(AbstractC000400g.A0M)) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            return true;
        } else if (Build.VERSION.SDK_INT < 28) {
            return false;
        } else {
            return true;
        }
    }

    public static byte[] A04(Context context, C000300f r11, String str) {
        byte[] A0F;
        int length;
        if (!A03(r11)) {
            return null;
        }
        File A002 = A00(context);
        if (!A002.exists()) {
            return null;
        }
        synchronized (A00) {
            A0F = C007603r.A0F(A002);
        }
        if (!(A0F == null || (length = A0F.length) == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass04k.A0I);
            sb.append(str.substring(Math.max(str.length() - 4, 0)));
            String obj = sb.toString();
            byte[] bArr = A01;
            try {
                int length2 = bArr.length;
                int i = length2 + 4 + 16 + 20;
                if (length >= i) {
                    byte[] bArr2 = new byte[length2];
                    System.arraycopy(A0F, 0, bArr2, 0, length2);
                    int i2 = length2 + 0;
                    if (Arrays.equals(bArr2, bArr)) {
                        byte[] bArr3 = new byte[4];
                        System.arraycopy(A0F, i2, bArr3, 0, 4);
                        int i3 = i2 + 4;
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(A0F, i3, bArr4, 0, 16);
                        int i4 = i3 + 16;
                        SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(C007603r.A05(obj.getBytes(), bArr3, 16, 128).getEncoded(), "AES").getEncoded(), "AES/OFB/NoPadding");
                        Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
                        instance.init(2, secretKeySpec, new IvParameterSpec(bArr4));
                        return instance.doFinal(A0F, i4, length - i4);
                    }
                    throw new C29041Wu();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("size mismatch expected length:");
                sb2.append(i);
                sb2.append(", actual length:");
                sb2.append(length);
                throw new InvalidParameterException(sb2.toString());
            } catch (Exception e) {
                Log.e("BackupTokenUtils/decrypt/unable to decrypt", e);
            }
        }
        return null;
    }
}
