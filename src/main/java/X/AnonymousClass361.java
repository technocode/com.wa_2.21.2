package X;

import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.361  reason: invalid class name */
public class AnonymousClass361 {
    public static final byte[] A04 = "endobj".getBytes();
    public static final byte[] A05 = "%FDF-".getBytes();
    public static final byte[] A06 = " obj".getBytes();
    public static final byte[] A07 = "%PDF-".getBytes();
    public static final byte[] A08 = "stream".getBytes();
    public static final String[] A09 = {"/RichMedia", "/JS", "/JavaScript", "/AA", "/Launch", "/RichMediaInstance"};
    public int A00;
    public C667935y A01 = new C667935y();
    public File A02;
    public boolean A03;

    public static boolean A02(int i) {
        return i == 47 || i == 60 || i == 62 || i == 91 || i == 93 || i == 40 || i == 41 || i == -1;
    }

    public static boolean A03(int i) {
        return i == 0 || i == 9 || i == 10 || i == 12 || i == 13 || i == 32;
    }

    public AnonymousClass361(File file) {
        this.A02 = file;
    }

    public static int A00(InputStream inputStream) {
        int read = inputStream.read();
        while (A03(read)) {
            read = inputStream.read();
        }
        return read;
    }

    public static void A01(InputStream inputStream) {
        int A002 = A00(inputStream);
        if (A002 != -1) {
            while (true) {
                if (A002 == 40) {
                    while (true) {
                        int read = inputStream.read();
                        if (read != 92) {
                            if (read == 41 || read == -1) {
                                break;
                            }
                        } else {
                            inputStream.read();
                        }
                    }
                } else if (A002 == 60) {
                    do {
                    } while (inputStream.read() != 62);
                } else if (A002 == 91) {
                    A01(inputStream);
                } else if (A002 == 93 || A002 == -1) {
                    return;
                }
                A002 = inputStream.read();
            }
        }
    }

    public Map A04(InputStream inputStream) {
        HashMap hashMap = new HashMap();
        int A002 = A00(inputStream);
        while (true) {
            if (A03(A002)) {
                A002 = A00(inputStream);
            }
            if (A002 != -1 && (A002 != 62 || inputStream.read() != 62)) {
                StringBuilder sb = new StringBuilder();
                do {
                    sb.append((char) A002);
                    A002 = inputStream.read();
                    if (A02(A002)) {
                        break;
                    }
                } while (!A03(A002));
                if (A03(A002)) {
                    A002 = A00(inputStream);
                }
                if (A002 == -1) {
                    break;
                }
                Object obj = null;
                if (A002 == 40) {
                    while (true) {
                        int read = inputStream.read();
                        if (read == 92) {
                            inputStream.read();
                        } else if (read == 41 || read == -1) {
                            A002 = inputStream.read();
                        }
                    }
                    A002 = inputStream.read();
                } else if (A002 == 60) {
                    A002 = inputStream.read();
                    if (A002 == 60) {
                        obj = A04(inputStream);
                        A002 = inputStream.read();
                    }
                } else if (A002 != 91) {
                    StringBuilder sb2 = new StringBuilder();
                    if (A002 == 47) {
                        sb2.append((char) A002);
                        A002 = inputStream.read();
                    }
                    while (true) {
                        if (A02(A002) && !A03(A002)) {
                            break;
                        }
                        sb2.append((char) A002);
                        A002 = inputStream.read();
                    }
                    obj = sb2.toString().trim();
                } else {
                    A01(inputStream);
                    A002 = inputStream.read();
                }
                hashMap.put(sb.toString().trim(), obj);
            } else {
                break;
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        throw new X.AnonymousClass360();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05() {
        /*
            r6 = this;
            r0 = 0
            r6.A00 = r0
            r6.A03 = r0
            java.io.File r1 = r6.A02
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream
            r4.<init>(r0)
            X.35y r0 = r6.A01     // Catch:{ all -> 0x0055 }
            byte[] r1 = r0.A01     // Catch:{ all -> 0x0055 }
            r0 = 0
            java.util.Arrays.fill(r1, r0)     // Catch:{ all -> 0x0055 }
            r5 = 0
        L_0x001a:
            int r0 = r4.read()     // Catch:{ all -> 0x0055 }
            if (r0 < 0) goto L_0x004f
            X.35y r3 = r6.A01     // Catch:{ all -> 0x0055 }
            byte r1 = (byte) r0     // Catch:{ all -> 0x0055 }
            byte[] r0 = r3.A01     // Catch:{ all -> 0x0055 }
            int r2 = r3.A00     // Catch:{ all -> 0x0055 }
            r0[r2] = r1     // Catch:{ all -> 0x0055 }
            r1 = 1
            int r2 = r2 + r1
            r3.A00 = r2     // Catch:{ all -> 0x0055 }
            int r0 = r0.length     // Catch:{ all -> 0x0055 }
            int r2 = r2 % r0
            r3.A00 = r2     // Catch:{ all -> 0x0055 }
            byte[] r0 = X.AnonymousClass361.A07     // Catch:{ all -> 0x0055 }
            boolean r0 = r3.A00(r0)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0048
            byte[] r0 = X.AnonymousClass361.A05     // Catch:{ all -> 0x0055 }
            boolean r0 = r3.A00(r0)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0048
            int r5 = r5 + 1
            r0 = 1024(0x400, float:1.435E-42)
            if (r5 >= r0) goto L_0x004f
            goto L_0x001a
        L_0x0048:
            r6.A06(r4, r1)     // Catch:{ all -> 0x0055 }
            r4.close()
            return
        L_0x004f:
            X.360 r0 = new X.360
            r0.<init>()
            throw r0
        L_0x0055:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass361.A05():void");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x00a7 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: java.lang.StringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0000 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.io.InputStream r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass361.A06(java.io.InputStream, boolean):void");
    }

    public final void A07(String str) {
        if (!TextUtils.isEmpty(str) && str.charAt(0) == '/' && str.indexOf(35) >= 0) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt != '#' || i > length - 3) {
                    sb.append(charAt);
                } else {
                    try {
                        sb.append((char) Integer.parseInt(str.substring(i + 1, i + 3), 16));
                        i += 2;
                    } catch (NumberFormatException unused) {
                        sb.append(charAt);
                    }
                }
                i++;
            }
            str = sb.toString();
        }
        for (String str2 : A09) {
            if (str2.equals(str)) {
                this.A03 = true;
                AnonymousClass008.A18("pdfparser/checkname pdf contains suspicious name ", str);
            }
        }
    }

    public final void A08(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                A07((String) entry.getKey());
                Object value = entry.getValue();
                if (value instanceof String) {
                    A07((String) value);
                } else if (value instanceof Map) {
                    A08((Map) value);
                }
            }
        }
    }

    public final boolean A09(InputStream inputStream, byte[] bArr) {
        Arrays.fill(this.A01.A01, (byte) 0);
        int read = inputStream.read();
        while (read >= 0) {
            C667935y r3 = this.A01;
            byte b = (byte) read;
            byte[] bArr2 = r3.A01;
            int i = r3.A00;
            bArr2[i] = b;
            int i2 = i + 1;
            r3.A00 = i2;
            r3.A00 = i2 % bArr2.length;
            if (r3.A00(bArr)) {
                return true;
            }
            read = inputStream.read();
        }
        return false;
    }
}
