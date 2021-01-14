package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: X.07d  reason: invalid class name and case insensitive filesystem */
public final class C012307d {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b0, code lost:
        if (r7 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        A07(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00be, code lost:
        X.C242319n.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C25001Eb A00(android.content.Context r11, X.C25001Eb r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012307d.A00(android.content.Context, X.1Eb, boolean):X.1Eb");
    }

    public static C25001Eb A01(SharedPreferences sharedPreferences) {
        long j;
        String string = sharedPreferences.getString(C012207c.A00("|P|"), null);
        String string2 = sharedPreferences.getString(C012207c.A00("|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair A05 = A05(string, string2);
        String string3 = sharedPreferences.getString(C012207c.A00("cre"), null);
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
            return new C25001Eb(A05, j);
        }
        j = 0;
        return new C25001Eb(A05, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r5 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        A07(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        X.C242319n.A00.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C25001Eb A02(java.io.File r10) {
        /*
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r10)
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch:{ all -> 0x0029 }
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 1
            r5.lock(r6, r8, r10)     // Catch:{ all -> 0x0020 }
            X.1Eb r1 = A03(r5)     // Catch:{ all -> 0x0020 }
            r0 = 0
            A07(r0, r5)
            r4.close()
            return r1
        L_0x0020:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            if (r5 == 0) goto L_0x0028
            A07(r1, r5)
        L_0x0028:
            throw r0
        L_0x0029:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002b }
        L_0x002b:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x0030 }
            throw r2
        L_0x0030:
            r1 = move-exception
            X.19m r0 = X.C242319n.A00
            r0.A00(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012307d.A02(java.io.File):X.1Eb");
    }

    public static C25001Eb A03(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new AnonymousClass1Ew();
        }
        try {
            return new C25001Eb(A05(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new AnonymousClass1Ew(e);
        }
    }

    public static File A04(Context context) {
        String obj;
        if (TextUtils.isEmpty("")) {
            obj = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString("".getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                obj = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        File A04 = C004302a.A04(context);
        if (A04 == null || !A04.isDirectory()) {
            Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            A04 = context.getFilesDir();
        }
        return new File(A04, obj);
    }

    public static KeyPair A05(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new AnonymousClass1Ew(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new AnonymousClass1Ew(e2);
        }
    }

    public static final void A06(Context context, C25001Eb r5) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (r5.equals(A01(sharedPreferences))) {
                return;
            }
        } catch (AnonymousClass1Ew unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String A00 = C012207c.A00("|P|");
        KeyPair keyPair = r5.A01;
        edit.putString(A00, Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        edit.putString(C012207c.A00("|K|"), Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        edit.putString(C012207c.A00("cre"), String.valueOf(r5.A00));
        edit.commit();
    }

    public static void A07(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C242319n.A00.A00(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    public final C25001Eb A08(Context context) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            C25001Eb r4 = new C25001Eb(instance.generateKeyPair(), System.currentTimeMillis());
            C25001Eb A00 = A00(context, r4, true);
            if (A00 == null || A00.equals(r4)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Generated new key");
                }
                A06(context, r4);
                return r4;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }
            return A00;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
