package X;

import android.content.Context;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.GeneralSecurityException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.03r  reason: invalid class name and case insensitive filesystem */
public class C007603r {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static String A03;
    public static final AbstractC02190Az A04 = new C02180Ay(C449122d.A00, null);
    public static final byte[] A05 = {0, 2};

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00() {
        /*
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 0
            java.lang.String r1 = "/proc/sys/kernel/osrelease"
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x001f }
            r0.<init>(r1)     // Catch:{ all -> 0x001f }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x001f }
            r2.<init>(r0)     // Catch:{ all -> 0x001f }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x001d }
            r4.append(r0)     // Catch:{ all -> 0x001d }
            r2.close()     // Catch:{ IOException -> 0x0027 }
            goto L_0x002c
        L_0x001d:
            r0 = move-exception
            goto L_0x0021
        L_0x001f:
            r0 = move-exception
            r2 = r3
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            r2.close()
        L_0x0026:
            throw r0
        L_0x0027:
            java.lang.String r0 = "Unknown release"
            r4.append(r0)
        L_0x002c:
            java.lang.String r1 = "/proc/sys/kernel/version"
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x004a }
            r0.<init>(r1)     // Catch:{ all -> 0x004a }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x004a }
            r1.<init>(r0)     // Catch:{ all -> 0x004a }
            r0 = 32
            r4.append(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0048 }
            r4.append(r0)     // Catch:{ all -> 0x0048 }
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0057
        L_0x0048:
            r0 = move-exception
            goto L_0x004c
        L_0x004a:
            r0 = move-exception
            r1 = r2
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            throw r0
        L_0x0052:
            java.lang.String r0 = " unknown version"
            r4.append(r0)
        L_0x0057:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007603r.A00():java.lang.String");
    }

    public static String A01(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return A04(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String A02(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            return A04(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String A03(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            int i3 = i + 1;
            cArr2[i] = cArr[i2 >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    public static String A04(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Character.forDigit((b >>> 4) & 15, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public static SecretKey A05(byte[] bArr, byte[] bArr2, int i, int i2) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i3] = (char) bArr[i3];
        }
        try {
            try {
                return SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1And8BIT").generateSecret(new PBEKeySpec(cArr, bArr2, i, i2));
            } catch (InvalidKeySpecException e) {
                throw new AssertionError(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0021, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(byte[] r3, java.io.File r4) {
        /*
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r4)
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x001b }
            r1.<init>(r2)     // Catch:{ all -> 0x001b }
            r1.writeObject(r3)     // Catch:{ all -> 0x0014 }
            r1.close()
            r2.close()
            return
        L_0x0014:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001a }
        L_0x001a:
            throw r0
        L_0x001b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0021 }
        L_0x0021:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007603r.A06(byte[], java.io.File):void");
    }

    public static boolean A07() {
        String str = A03;
        if (str == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = Build.VERSION.RELEASE;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = Build.DISPLAY;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = Build.MODEL;
            if (str5 == null) {
                str5 = "";
            }
            String A002 = A00();
            StringBuilder sb = new StringBuilder("manufacturer ");
            sb.append(str2);
            Log.d(sb.toString());
            StringBuilder sb2 = new StringBuilder("release ");
            sb2.append(str3);
            Log.d(sb2.toString());
            StringBuilder sb3 = new StringBuilder("display ");
            sb3.append(str4);
            Log.d(sb3.toString());
            StringBuilder sb4 = new StringBuilder("model ");
            sb4.append(str5);
            Log.d(sb4.toString());
            AnonymousClass008.A1S(new StringBuilder("kernel_version "), A002);
            str = "cyanogen";
            if (!A002.toLowerCase(Locale.US).contains(str)) {
                str = (str2.toLowerCase(Locale.US).contains("debug") || str3.toLowerCase(Locale.US).contains("debug") || str4.toLowerCase(Locale.US).contains("debug") || str5.toLowerCase(Locale.US).contains("debug") || A002.toLowerCase(Locale.US).contains("debug")) ? "debug" : str4.startsWith("Darky") ? "darky" : str2.startsWith("XDAndroid") ? "xdandroid" : str3.startsWith("FroydVillain") ? "froydvillain" : (str3.startsWith("VillainROM") || str4.startsWith("VillainROM")) ? "villainrom" : str3.startsWith("WildPuzzle") ? "wildpuzzle" : str4.startsWith("MIUI") ? "miui" : str4.startsWith("ITFUNZ") ? "itfunz" : str4.startsWith("DebusROM") ? "debus" : str4.startsWith("FreeX10") ? "freex10" : str4.startsWith("Perception Build") ? "perception" : str4.startsWith("Bionix") ? "bionix" : str4.startsWith("Lite'ning Rom") ? "litening" : str4.startsWith("GINGERVillain") ? "gingervillian" : str4.startsWith("GingerReal") ? "gingerreal" : str4.startsWith("R.U.R.1920") ? "rur1920" : str5.startsWith("MoDaCo") ? "modaco" : str4.startsWith("CriskeloROM") ? "criskelorom" : str4.startsWith("LeeDrOiD") ? "leedroid" : str4.startsWith("Dexter's FolioMod") ? "foliomod" : str4.startsWith("Andro-ID") ? "andro-id" : str4.startsWith("FroyoPlus") ? "froyoplus" : str4.startsWith("PilotxRom") ? "pilotx" : str4.startsWith("Achotjan") ? "achotjan" : A002.contains("FuguMod") ? "fugu" : A002.contains("fakeShmoo") ? "fakeshmoo" : A002.contains("LorDmodNCTeam") ? "lordmod" : A002.contains("-RCMIX") ? "rcmix" : str4.contains("DamianGTO") ? "damiangto" : "";
            }
            AnonymousClass008.A18("app/custom-rom ", str);
            A03 = str;
        }
        return str.length() != 0;
    }

    public static boolean A08() {
        return ((Boolean) A04.get()).booleanValue();
    }

    public static boolean A09(Context context, byte[] bArr, String str) {
        new String(bArr);
        File file = new File(context.getFilesDir(), "rc2");
        String A0O = AnonymousClass008.A0O(new StringBuilder(), AnonymousClass04k.A0I, str);
        byte[] bArr2 = A05;
        try {
            byte[] A0C = A0C(4);
            byte[] A0C2 = A0C(16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(A05(A0O.getBytes(), A0C, 16, 128).getEncoded(), "AES").getEncoded(), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(A0C2));
            byte[] doFinal = instance.doFinal(bArr);
            byte[] bArr3 = new byte[(bArr2.length + A0C.length + A0C2.length + doFinal.length)];
            byte[][] bArr4 = {bArr2, A0C, A0C2, doFinal};
            int i = 0;
            int i2 = 0;
            do {
                byte[] bArr5 = bArr4[i];
                System.arraycopy(bArr5, 0, bArr3, i2, bArr5.length);
                i2 += bArr5.length;
                i++;
            } while (i < 4);
            A06(bArr3, file);
            return Arrays.equals(bArr3, A0F(file));
        } catch (Exception e) {
            StringBuilder A0S = AnonymousClass008.A0S("unable to write ");
            A0S.append(file.toString());
            Log.e(A0S.toString(), e);
            return false;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x003f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b8, code lost:
        if (r10.A0F() == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        new java.io.FileInputStream(r2).close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x012e */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0A(X.AnonymousClass03P r10) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007603r.A0A(X.03P):boolean");
    }

    public static byte[] A0B() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(160, SecureRandom.getInstance("SHA1PRNG"));
            return instance.generateKey().getEncoded();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] A0C(int i) {
        try {
            byte[] bArr = new byte[i];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return bArr;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r4 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A0D(android.content.Context r5) {
        /*
            java.lang.String r0 = r5.getPackageCodePath()     // Catch:{ Exception -> 0x0043 }
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x0043 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r0 = r5.getEntry(r0)     // Catch:{ all -> 0x003c }
            java.io.InputStream r4 = r5.getInputStream(r0)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x0033 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0033 }
        L_0x001d:
            int r1 = r4.read(r2)     // Catch:{ all -> 0x0033 }
            if (r1 <= 0) goto L_0x0028
            r0 = 0
            r3.update(r2, r0, r1)     // Catch:{ all -> 0x0033 }
            goto L_0x001d
        L_0x0028:
            byte[] r0 = r3.digest()     // Catch:{ all -> 0x0033 }
            r4.close()
            r5.close()
            return r0
        L_0x0033:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            if (r4 == 0) goto L_0x003b
            r4.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = "app/md5/bytes/error "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r1 = "null"
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0052 }
            return r0
        L_0x0052:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007603r.A0D(android.content.Context):byte[]");
    }

    public static byte[] A0E(Context context, String str) {
        try {
            File file = new File(context.getFilesDir(), "rc2");
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass04k.A0I);
            sb.append(str);
            String obj = sb.toString();
            byte[] bArr = A05;
            byte[] A0F = A0F(file);
            if (A0F == null) {
                return null;
            }
            try {
                int length = A0F.length;
                int length2 = bArr.length;
                if (length >= length2 + 4 + 16 + 20) {
                    byte[] bArr2 = new byte[length2];
                    System.arraycopy(A0F, 0, bArr2, 0, length2);
                    int i = length2 + 0;
                    if (Arrays.equals(bArr2, bArr)) {
                        byte[] bArr3 = new byte[4];
                        System.arraycopy(A0F, i, bArr3, 0, 4);
                        int i2 = i + 4;
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(A0F, i2, bArr4, 0, 16);
                        int i3 = i2 + 16;
                        SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(A05(obj.getBytes(), bArr3, 16, 128).getEncoded(), "AES").getEncoded(), "AES/OFB/NoPadding");
                        Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
                        instance.init(2, secretKeySpec, new IvParameterSpec(bArr4));
                        return instance.doFinal(A0F, i3, length - i3);
                    }
                    throw new C29041Wu();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file.toString());
                sb2.append(" size mismatch");
                throw new InvalidParameterException(sb2.toString());
            } catch (Exception e) {
                file.delete();
                if (e instanceof C29041Wu) {
                    throw e;
                }
                throw new RuntimeException(e);
            }
        } catch (C29041Wu e2) {
            Log.w("recovery token header mismatch", e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A0F(java.io.File r5) {
        /*
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x003b
            long r3 = r5.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0035 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0035 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002e }
            r1.<init>(r2)     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.readObject()     // Catch:{ all -> 0x0027 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0027 }
            r1.close()
            r2.close()
            return r0
        L_0x0027:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0
        L_0x002e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            throw r0
        L_0x0035:
            r1 = move-exception
            java.lang.String r0 = "get byte array"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x003b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007603r.A0F(java.io.File):byte[]");
    }

    public static byte[] A0G(byte[] bArr, byte[]... bArr2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(new SecretKeySpec(bArr, "HmacSHA1"));
            for (byte[] bArr3 : bArr2) {
                instance.update(bArr3);
            }
            return instance.doFinal();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
