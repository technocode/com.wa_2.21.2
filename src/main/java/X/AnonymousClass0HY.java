package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0HY  reason: invalid class name */
public class AnonymousClass0HY {
    public static final byte[] A00 = {0, 1};
    public static final byte[] A01 = {0, 1};
    public static final byte[] A02 = {0, 2};

    public static int A00(File file, File file2) {
        int length;
        String name = file2.getName();
        int length2 = name.length() + 1;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles == null) {
            return 0;
        }
        int i = 0;
        for (File file3 : listFiles) {
            String name2 = file3.getName();
            if (name2.startsWith(name) && length2 < (length = name2.length())) {
                try {
                    int parseInt = Integer.parseInt(name2.substring(length2, length));
                    if (parseInt > i) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return i;
    }

    public static AnonymousClass1Q8 A01(InputStream inputStream) {
        int length = A00.length;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[(length + 1 + 32 + 16 + 16)];
        inputStream.read(bArr5);
        System.arraycopy(bArr5, 0, bArr, 0, length);
        int i = length + 0;
        if (Arrays.equals(bArr, A02) || Arrays.equals(bArr, A01)) {
            int i2 = i + 1;
            String valueOf = String.valueOf((int) bArr5[i]);
            byte[][] bArr6 = {bArr2, bArr3, bArr4};
            int i3 = 0;
            do {
                byte[] bArr7 = bArr6[i3];
                System.arraycopy(bArr5, i2, bArr7, 0, bArr7.length);
                i2 += bArr7.length;
                i3++;
            } while (i3 < 3);
            return new AnonymousClass1Q8(bArr, valueOf, bArr2, bArr3, bArr4);
        }
        throw new C29041Wu();
    }

    public static AnonymousClass1QE A02(Context context) {
        File file = new File(context.getFilesDir(), "key");
        if (!file.exists()) {
            Log.w("backupkey/getinfo/does-not-exist");
            return null;
        }
        byte[] A0F = C007603r.A0F(file);
        if (A0F == null) {
            return null;
        }
        int length = A0F.length;
        byte[] bArr = A00;
        int length2 = bArr.length;
        if (length >= length2 + 1 + 32 + 16 + 32 + 16 + 32) {
            byte[] bArr2 = new byte[length2];
            System.arraycopy(A0F, 0, bArr2, 0, length2);
            int i = length2 + 0;
            if (Arrays.equals(bArr2, bArr)) {
                int i2 = i + 1;
                String valueOf = String.valueOf((int) A0F[i]);
                byte[] bArr3 = new byte[32];
                System.arraycopy(A0F, i2, bArr3, 0, 32);
                int i3 = i2 + 32;
                byte[] bArr4 = new byte[16];
                System.arraycopy(A0F, i3, bArr4, 0, 16);
                int i4 = i3 + 16;
                byte[] bArr5 = new byte[32];
                System.arraycopy(A0F, i4, bArr5, 0, 32);
                byte[] A0C = C007603r.A0C(16);
                byte[] bArr6 = new byte[32];
                System.arraycopy(A0F, i4 + 32 + 16, bArr6, 0, 32);
                AnonymousClass1QE r6 = new AnonymousClass1QE(bArr2, valueOf, bArr3, bArr4, bArr5, A0C, bArr6);
                r6.toString();
                return r6;
            }
            throw new C29041Wu();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.toString());
        sb.append(" size mismatch");
        throw new InvalidParameterException(sb.toString());
    }

    public static String A03(File file, Date date, String str) {
        String A06 = A06(file.getName(), date);
        String A05 = A05(file.getName(), str);
        File[] listFiles = file.getParentFile().listFiles();
        File file2 = null;
        if (listFiles != null) {
            int i = 0;
            for (File file3 : listFiles) {
                String name = file3.getName();
                if (name.startsWith(A06) && name.endsWith(A05)) {
                    int length = A06.length() + 1;
                    int length2 = name.length();
                    int length3 = length2 - A05.length();
                    if (length3 < length2 && length < length3) {
                        try {
                            int parseInt = Integer.parseInt(name.substring(length, length3));
                            if (parseInt > i) {
                                file2 = file3;
                                i = parseInt;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        if (file2 != null) {
            return file2.getName();
        }
        return AnonymousClass008.A0L(A06, ".1", A05);
    }

    public static String A04(String str) {
        return A06(str, new Date()).substring(0, str.indexOf(46) + 1);
    }

    public static String A05(String str, String str2) {
        return AnonymousClass008.A0K(str.substring(str.indexOf(46)), str2);
    }

    public static String A06(String str, Date date) {
        StringBuilder A0Y = AnonymousClass008.A0Y(str.substring(0, str.indexOf(46)), "-");
        A0Y.append(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(date));
        return A0Y.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (r15.length() <= (r16.length() + r5.length())) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        r6.add(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A07(java.io.File r17, java.lang.String... r18) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HY.A07(java.io.File, java.lang.String[]):java.util.ArrayList");
    }

    public static void A08(Context context) {
        new File(context.getFilesDir(), "key").delete();
    }

    public static void A09(Context context, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        Arrays.toString(bArr);
        Arrays.toString(bArr2);
        File file = new File(context.getFilesDir(), "key");
        byte[] bArr5 = new byte[16];
        Arrays.toString(bArr5);
        byte[] bArr6 = {Byte.parseByte(str)};
        byte[] bArr7 = A00;
        byte[] bArr8 = new byte[(bArr7.length + 1 + bArr.length + bArr4.length + bArr3.length + 16 + bArr2.length)];
        byte[][] bArr9 = {bArr7, bArr6, bArr, bArr4, bArr3, bArr5, bArr2};
        int i = 0;
        int i2 = 0;
        do {
            byte[] bArr10 = bArr9[i];
            System.arraycopy(bArr10, 0, bArr8, i2, bArr10.length);
            i2 += bArr10.length;
            i++;
        } while (i < 7);
        Arrays.toString(bArr8);
        try {
            C007603r.A06(bArr8, file);
            byte[] A0F = C007603r.A0F(file);
            A02(context);
            Arrays.equals(bArr8, A0F);
        } catch (Exception e) {
            Log.e("backupkey/set/unable-to-write ", e);
        }
    }

    public static void A0A(AnonymousClass009 r3, byte[] bArr) {
        int length = bArr.length;
        if (length != 32) {
            StringBuilder A0S = AnonymousClass008.A0S("");
            A0S.append(length);
            r3.A04("crypto-iq-incorrect-account-hash-size", A0S.toString(), true);
        }
    }

    public static void A0B(AnonymousClass009 r3, byte[] bArr) {
        int length = bArr.length;
        if (length != 16) {
            StringBuilder A0S = AnonymousClass008.A0S("");
            A0S.append(length);
            r3.A04("crypto-iq-incorrect-account-salt-size", A0S.toString(), true);
        }
    }

    public static void A0C(File file) {
        if (file.exists()) {
            try {
                file.renameTo(new File(file.getParentFile(), A03(file, new Date(), "")));
            } catch (SecurityException unused) {
            }
        }
    }

    public static void A0D(OutputStream outputStream, AnonymousClass1Q8 r7) {
        int i = 0;
        byte[][] bArr = {A00, new byte[]{Byte.parseByte(r7.A00)}, r7.A04, r7.A02, r7.A01};
        do {
            byte[] bArr2 = bArr[i];
            Arrays.toString(bArr2);
            outputStream.write(bArr2);
            i++;
        } while (i < 5);
    }

    public static void A0E(FileChannel fileChannel, WritableByteChannel writableByteChannel) {
        for (long j = 0; j < fileChannel.size(); j += 131072) {
            fileChannel.transferTo(j, Math.min(131072L, fileChannel.size() - j), writableByteChannel);
        }
    }

    public static boolean A0F(Context context) {
        return !new File(context.getFilesDir(), "key").exists();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A0G(File file, int i, String str, boolean z, boolean z2) {
        String str2;
        int length;
        int length2;
        file.getAbsolutePath();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Date date = new Date();
        String pattern = simpleDateFormat.toPattern();
        String A05 = A05(file.getName(), str);
        String A04 = A04(file.getName());
        int i2 = 0;
        if (i < 0) {
            int indexOf = file.getName().indexOf(46);
            if (indexOf == -1) {
                return true;
            }
            str2 = file.getName().substring(0, indexOf);
        } else {
            str2 = null;
        }
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            int length3 = listFiles.length;
            int i3 = 0;
            while (i2 < length3) {
                File file2 = listFiles[i2];
                String name = file2.getName();
                if (i < 0) {
                    if (name.startsWith(str2)) {
                        if (file2.delete()) {
                        }
                    }
                    i2++;
                } else {
                    if (name.startsWith(A04) && name.endsWith(A05) && (length2 = pattern.length() + (length = A04.length())) <= name.length()) {
                        try {
                            long time = (date.getTime() - simpleDateFormat.parse(name.substring(length, length2)).getTime()) / TimeUnit.DAYS.toMillis(1);
                            if (z) {
                                time = Math.abs(time);
                            }
                            if (time > ((long) i) || z2) {
                                file2.getAbsolutePath();
                                if (file2.delete()) {
                                }
                            } else {
                                file2.getAbsolutePath();
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    i2++;
                }
                i3 = 1;
                i2++;
            }
            i2 = i3;
        }
        return 1 ^ i2;
    }

    public static byte[] A0H(byte[] bArr) {
        MessageDigest messageDigest;
        Arrays.toString(bArr);
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            Log.e("calculateahash/digester ", e);
            messageDigest = null;
        }
        if (messageDigest == null) {
            Log.e("calculateahash/digester is null");
            return null;
        }
        messageDigest.reset();
        messageDigest.update(bArr);
        return messageDigest.digest();
    }
}
