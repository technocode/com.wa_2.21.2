package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0Ch  reason: invalid class name and case insensitive filesystem */
public class C02510Ch {
    public static int A01 = 1;
    public static int A02 = 2;
    public static int A03 = 0;
    public static final int A04 = A01((byte) 97, (byte) 118, (byte) 99, (byte) 49);
    public static final int A05 = A01((byte) 101, (byte) 99, (byte) 45, (byte) 51);
    public static final int A06 = A01((byte) 101, (byte) 115, (byte) 100, (byte) 115);
    public static final int A07 = A01((byte) 104, (byte) 100, (byte) 108, (byte) 114);
    public static final int A08 = A01((byte) 115, (byte) 111, (byte) 117, (byte) 110);
    public static final int A09 = A01((byte) 118, (byte) 105, (byte) 100, (byte) 101);
    public static final int A0A = A01((byte) 104, (byte) 118, (byte) 99, (byte) 49);
    public static final int A0B = A01((byte) 109, (byte) 100, (byte) 105, (byte) 97);
    public static final int A0C = A01((byte) 109, (byte) 105, (byte) 110, (byte) 102);
    public static final int A0D = A01((byte) 109, (byte) 111, (byte) 111, (byte) 118);
    public static final int A0E = A01((byte) 109, (byte) 112, (byte) 52, (byte) 97);
    public static final int A0F = A01((byte) 109, (byte) 112, (byte) 52, (byte) 118);
    public static final int A0G = A01((byte) 46, (byte) 109, (byte) 112, (byte) 51);
    public static final int A0H = A01((byte) 115, (byte) 50, (byte) 54, (byte) 51);
    public static final int A0I = A01((byte) 115, (byte) 97, (byte) 109, (byte) 114);
    public static final int A0J = A01((byte) 115, (byte) 97, (byte) 119, (byte) 98);
    public static final int A0K = A01((byte) 115, (byte) 116, (byte) 98, (byte) 108);
    public static final int A0L = A01((byte) 115, (byte) 116, (byte) 115, (byte) 100);
    public static final int A0M = A01((byte) 116, (byte) 107, (byte) 104, (byte) 100);
    public static final int A0N = A01((byte) 116, (byte) 114, (byte) 97, (byte) 107);
    public static final int A0O = A01((byte) 119, (byte) 97, (byte) 118, (byte) 101);
    public static final C02490Cf A0P = new C02490Cf(0, 0, true);
    public static final C02490Cf A0Q = new C02490Cf(0, 7, true);
    public static final C02500Cg A0R = new C02500Cg(0, 0, 0, true);
    public static final C02500Cg A0S = new C02500Cg(0, 5, 7, true);
    public static final byte[] A0T = {35, 33, 65, 77, 82, 10};
    public static final byte[] A0U = {35, 33, 65, 77, 82, 45, 87, 66, 10};
    public static final byte[] A0V = {79, 103, 103, 83};
    public static final byte[] A0W = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] A0X = {82, 73, 70, 70};
    public static final byte[] A0Y = {100, 97, 116, 97};
    public static final byte[] A0Z = {102, 109, 116, 32};
    public static final byte[] A0a = {73, 68, 51};
    public static final byte[] A0b = {102, 116, 121, 112};
    public static final byte[] A0c = {51, 103};
    public static final byte[] A0d = {113, 116, 32, 32};
    public static final byte[] A0e = {87, 65, 86, 69};
    public static final int[] A0f = {A01((byte) 97, (byte) 100, (byte) 116, (byte) 108), A01((byte) 99, (byte) 117, (byte) 101, (byte) 32), A01((byte) 100, (byte) 97, (byte) 116, (byte) 97), A01((byte) 102, (byte) 97, (byte) 99, (byte) 116), A01((byte) 102, (byte) 109, (byte) 116, (byte) 32), A01((byte) 105, (byte) 110, (byte) 115, (byte) 116), A01((byte) 108, (byte) 97, (byte) 98, (byte) 108), A01((byte) 108, (byte) 116, (byte) 120, (byte) 116), A01((byte) 110, (byte) 111, (byte) 116, (byte) 101), A01((byte) 112, (byte) 108, (byte) 115, (byte) 116), A01((byte) 115, (byte) 109, (byte) 112, (byte) 108)};
    public static volatile C02510Ch A0g;
    public final AnonymousClass009 A00;

    public static int A01(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static byte[] A0E(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public C02510Ch(AnonymousClass009 r1) {
        this.A00 = r1;
    }

    public static float A00(long j) {
        long j2 = j >> ((int) 16);
        float pow = (float) Math.pow(2.0d, (double) 16);
        return (((float) (j & (((long) pow) - 1))) / pow) + ((float) j2);
    }

    public static int A02(InputStream inputStream, C666935l r12) {
        try {
            int i = (int) (r12.A01 - r12.A02);
            byte[] bArr = new byte[i];
            if (A04(inputStream, bArr, 0, i) != i) {
                return 7;
            }
            byte b = bArr[4];
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Did not find esds description tag - found: ");
                sb.append((int) b);
                Log.i(sb.toString());
                return 7;
            }
            int[] A0G2 = A0G(bArr, 4, i);
            if (A0G2 == null) {
                Log.i("Did not find esds description details");
                return 7;
            }
            int i2 = A0G2[0] + 3;
            byte b2 = bArr[i2];
            int i3 = 1;
            int i4 = i2 + 1;
            if ((b2 & 128) == 128) {
                i4 += 2;
            }
            if ((b2 & 64) == 64) {
                i4 += bArr[i4] + 1;
            }
            if ((b2 & 32) == 32) {
                i4 += 2;
            }
            byte b3 = bArr[i4];
            if (b3 != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Did not find esds config description tag - found: ");
                sb2.append((int) b3);
                Log.i(sb2.toString());
                return 7;
            }
            int[] A0G3 = A0G(bArr, i4, i);
            if (A0G3 == null) {
                Log.i("Did not find esds config details");
                return 7;
            }
            int i5 = A0G3[0];
            byte b4 = bArr[i5 + 1];
            if (b4 != 64) {
                if (b4 != 107) {
                    switch (b4) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Did not find esds supported type - found: ");
                            sb3.append((int) b4);
                            Log.i(sb3.toString());
                            return 7;
                        case 105:
                            i3 = 2;
                            break;
                    }
                }
                i3 = 2;
            }
            byte b5 = bArr[i5 + 2];
            if (((b5 & 252) >> 2) == 5) {
                return i3;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Did not find stream type - found: ");
            sb4.append((int) b5);
            Log.i(sb4.toString());
            return 7;
        } catch (Exception e) {
            Log.i("Exception processing esds box: ", e);
            return 7;
        }
    }

    public static int A03(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 36;
        byte[] bArr2 = new byte[36];
        byte[] bArr3 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        if (A04(inputStream, bArr2, i, 36 - i) + i != 36) {
            Log.i("Insufficient data for WAV file header");
            return 0;
        }
        byte[] bArr4 = A0e;
        if (!A0D(bArr2, 8, bArr4)) {
            AnonymousClass008.A1U(AnonymousClass008.A0S("Not WAVE File type "), new String(bArr2, 8, bArr4.length));
            return 7;
        }
        byte[] bArr5 = A0Z;
        if (!A0D(bArr2, 12, bArr5)) {
            AnonymousClass008.A1U(AnonymousClass008.A0S("Not WAVE chunk format "), new String(bArr2, 12, bArr5.length));
            return 7;
        }
        int A012 = A01((byte) 0, (byte) 0, bArr2[21], bArr2[20]);
        if (80 == A012 || 85 == A012 || 5632 == A012 || 5648 == A012) {
            int A013 = A01(bArr2[19], bArr2[18], bArr2[17], bArr2[16]) + 16 + 4;
            while (true) {
                try {
                    A0C(inputStream, (long) (A013 - i2));
                    int A042 = A04(inputStream, bArr3, 0, 8);
                    int i3 = A013 + A042;
                    if (A042 != 8) {
                        Log.i("EOF reading WAVE chunk");
                        return 7;
                    }
                    if (!C002001d.A3h(A0f, A01(bArr3[0], bArr3[1], bArr3[2], bArr3[3]))) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("Unsupported WAVE chunk: ");
                        A0S2.append(new String(bArr3, 0, 4));
                        Log.i(A0S2.toString());
                        return 7;
                    } else if (A0D(bArr3, 0, A0Y)) {
                        byte[] bArr6 = new byte[2];
                        if (A04(inputStream, bArr6, 0, 2) != 2) {
                            Log.i("EOF reading WAVE data");
                            return 7;
                        } else if (bArr6[0] == -1 && ((byte) (bArr6[1] & 224)) == -32) {
                            Log.d("WAVE audio found aac/mp3");
                            return (bArr6[1] & 6) == 0 ? 1 : 2;
                        } else {
                            Log.i("Not ACC/MP3 WAVE data");
                            return 7;
                        }
                    } else {
                        i2 = i3;
                        A013 = A01(bArr3[7], bArr3[6], bArr3[5], bArr3[4]) + i3;
                    }
                } catch (IOException e) {
                    Log.i("Excepton reading next chunk ", e);
                    return 7;
                }
            }
        } else {
            AnonymousClass008.A0v("RIFF/WAV container carries stream which is not one of supported MPEG audio streams ", A012);
            return 7;
        }
    }

    public static int A04(InputStream inputStream, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length - i);
        int i3 = 0;
        while (i3 < min) {
            int read = inputStream.read(bArr, i + i3, min - i3);
            if (read == -1) {
                return i3;
            }
            i3 += read;
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03e3, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0394 A[Catch:{ all -> 0x03df }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0397 A[Catch:{ all -> 0x03df }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C02490Cf A05(X.AnonymousClass009 r27, java.io.File r28) {
        /*
        // Method dump skipped, instructions count: 996
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02510Ch.A05(X.009, java.io.File):X.0Cf");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04a0, code lost:
        com.whatsapp.util.Log.i("esds box not found");
        r20 = X.C02510Ch.A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04cb, code lost:
        com.whatsapp.util.Log.i("multiple hldr audio tracks found - not dolby");
        r20 = X.C02510Ch.A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04e2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C02500Cg A06(X.AnonymousClass009 r30, java.io.File r31, boolean r32) {
        /*
        // Method dump skipped, instructions count: 1251
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02510Ch.A06(X.009, java.io.File, boolean):X.0Cg");
    }

    public static C666935l A07(InputStream inputStream, long j, long j2, int[] iArr) {
        long j3;
        long j4 = j2;
        StringBuilder A0S2 = AnonymousClass008.A0S("Looking for ");
        A0S2.append(iArr.length);
        A0S2.append(" boxes including: ");
        AnonymousClass008.A1S(A0S2, new String(A0E(iArr[0])));
        long j5 = 0;
        if (j > 0) {
            if (j2 <= 0 || j <= j2) {
                A0C(inputStream, j);
                if (j2 == -1) {
                    j4 = -1;
                } else {
                    j4 = j2 - j;
                }
            } else {
                throw new IOException("Not enough bytes to skip");
            }
        }
        int i = 8;
        byte[] bArr = new byte[8];
        while (true) {
            if (j4 != -1 && j4 <= j5) {
                return null;
            }
            int A042 = A04(inputStream, bArr, 0, i);
            if (A042 >= i) {
                long j6 = (long) A042;
                if (j4 == -1) {
                    j3 = -1;
                } else {
                    j3 = j4 - j6;
                }
                for (int i2 = 4; i2 < i; i2++) {
                    byte b = bArr[i2];
                    if (b < 32) {
                        AnonymousClass008.A1L(AnonymousClass008.A0S("Found non character data in box type "), b);
                        return null;
                    }
                }
                int A012 = A01(bArr[0], bArr[1], bArr[2], bArr[3]);
                StringBuilder A0S3 = AnonymousClass008.A0S("Found box: ");
                A0S3.append(new String(bArr, 4, 4));
                A0S3.append(' ');
                AnonymousClass008.A1K(A0S3, A012);
                if (A012 == 0) {
                    A012 = -1;
                } else if (A012 == 1) {
                    byte[] bArr2 = new byte[i];
                    A042 += A04(inputStream, bArr2, 0, i);
                    if (A042 == 16) {
                        long j7 = (long) A042;
                        if (j3 == -1) {
                            j3 = -1;
                        } else {
                            j3 -= j7;
                        }
                        long A013 = (((long) A01(bArr2[0], bArr2[1], bArr2[2], bArr2[3])) << 32) | ((long) A01(bArr2[4], bArr2[5], bArr2[6], bArr2[7]));
                        if (A013 <= 2147483647L) {
                            A012 = (int) A013;
                        } else {
                            throw new IOException(AnonymousClass008.A0I("Length of box too long to be processed: ", A013));
                        }
                    } else {
                        throw new IOException("End of file looking for wide box length");
                    }
                }
                if (j3 <= 0 || j3 >= ((long) (A012 - A042))) {
                    int A014 = A01(bArr[4], bArr[5], bArr[6], bArr[7]);
                    if (C002001d.A3h(iArr, A014)) {
                        StringBuilder A0S4 = AnonymousClass008.A0S("Found matching box type: ");
                        A0S4.append(new String(A0E(A014)));
                        Log.d(A0S4.toString());
                        return new C666935l(A012, A014, A042);
                    }
                    StringBuilder A0S5 = AnonymousClass008.A0S("Did not find matching box type - found: ");
                    A0S5.append(new String(A0E(A014)));
                    Log.d(A0S5.toString());
                    long j8 = (long) (A012 - A042);
                    A0C(inputStream, j8);
                    j4 = j3 == -1 ? -1 : j3 - j8;
                    i = 8;
                    j5 = 0;
                } else {
                    StringBuilder sb = new StringBuilder("Length of box too long to be in current input: ");
                    sb.append(A012);
                    sb.append('>');
                    sb.append(j3);
                    throw new IOException(sb.toString());
                }
            } else {
                throw new IOException("End of file looking for box header");
            }
        }
    }

    public static C02510Ch A08() {
        if (A0g == null) {
            synchronized (C02510Ch.class) {
                if (A0g == null) {
                    A0g = new C02510Ch(AnonymousClass009.A00());
                }
            }
        }
        return A0g;
    }

    public static String A09(C02490Cf r3) {
        switch (r3.A00) {
            case 0:
            case 4:
            case 7:
            case 8:
                Log.w("unsupported audio type; returning null mime type");
                StringBuilder A0S2 = AnonymousClass008.A0S("Audio type not supported: ");
                A0S2.append(r3.A00);
                throw new C667135n(A0S2.toString());
            case 1:
                if (r3.A01 != 2) {
                    return "audio/aac";
                }
                return "audio/mp4";
            case 2:
                if (r3.A01 != 2) {
                    return "audio/mpeg";
                }
                return "audio/mp4";
            case 3:
                return "audio/amr";
            case 5:
                return "audio/ogg; codecs=opus";
            case 6:
            default:
                StringBuilder sb = new StringBuilder("invalid audio type returned; ");
                sb.append(r3);
                throw new AssertionError(sb.toString());
        }
    }

    public static String A0A(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            if (z) {
                Log.w("empty audio mime type");
            }
            return null;
        } else if ("audio/aac".equals(str)) {
            return "aac";
        } else {
            if ("audio/mp4".equals(str)) {
                return "m4a";
            }
            if ("audio/amr".equals(str)) {
                return "amr";
            }
            if ("audio/mpeg".equals(str)) {
                return "mp3";
            }
            if ("audio/ogg; codecs=opus".equals(str)) {
                return "opus";
            }
            if (z) {
                AnonymousClass008.A19("unrecognized audio mime type; mimeType=", str);
            }
            return null;
        }
    }

    public static String A0B(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            if (z) {
                Log.w("empty video mime type");
            }
            return null;
        } else if ("video/mp4".equals(str)) {
            return "mp4";
        } else {
            if ("video/3gpp".equals(str)) {
                return "3gp";
            }
            if (z) {
                AnonymousClass008.A19("unrecognized video mime type; mimeType=", str);
            }
            return null;
        }
    }

    public static void A0C(InputStream inputStream, long j) {
        byte[] bArr = new byte[1024];
        while (j > 0) {
            long j2 = (long) 1024;
            if (A04(inputStream, bArr, 0, (int) Math.min(j2, j)) != -1) {
                j -= j2;
            } else {
                throw new IOException(AnonymousClass008.A0I("Unexpected EOF skipping ", j));
            }
        }
    }

    public static boolean A0D(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr.length - i;
        int length2 = bArr2.length;
        if (length < length2) {
            return false;
        }
        for (int i2 = 0; i2 < length2; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] A0F(InputStream inputStream) {
        byte[] bArr = new byte[2];
        if (A04(inputStream, bArr, 0, 2) == 2) {
            int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            AnonymousClass008.A0v("mp4a box version: ", i);
            if (i == 0) {
                return new int[]{0, 18};
            } else if (i == 1) {
                return new int[]{1, 34};
            } else if (i == 2) {
                return new int[]{2, 54};
            } else {
                throw new IOException("Unexpected result getting mp4a version");
            }
        } else {
            throw new IOException("Unexpected eof getting mp4a version");
        }
    }

    public static int[] A0G(byte[] bArr, int i, int i2) {
        try {
            int min = Math.min(i2, i + 4);
            int i3 = i;
            int i4 = 0;
            do {
                i3++;
                i4 = (i4 << 7) + (bArr[i3] & Byte.MAX_VALUE);
                if (i >= min) {
                    break;
                }
            } while ((bArr[i3] & 128) == 128);
            if (i4 == 0) {
                return null;
            }
            return new int[]{i3, i4};
        } catch (Exception e) {
            Log.i("Exception processing esds box: ", e);
            return null;
        }
    }

    public boolean A0H(File file) {
        C02490Cf A052 = A05(this.A00, file);
        switch (A052.A00) {
            case 0:
            case 4:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 6:
            default:
                StringBuilder sb = new StringBuilder("invalid audio file type returned; ");
                sb.append(A052);
                throw new AssertionError(sb.toString());
        }
    }

    public boolean A0I(File file) {
        C02500Cg A062 = A06(this.A00, file, false);
        int i = A062.A01;
        if (i != 2 && i != 3) {
            return false;
        }
        int i2 = A062.A00;
        if (i2 != 3 && i2 != 4 && i2 != 2 && i2 != 1 && i2 != 0 && i2 != 8) {
            return false;
        }
        int i3 = A062.A02;
        return i3 == 2 || i3 == 1 || i3 == 3;
    }
}
