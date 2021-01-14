package X;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Dk  reason: invalid class name */
public final class AnonymousClass2Dk implements Closeable {
    public int A00;
    public long A01 = 0;
    public long A02 = 0;
    public Writer A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final LinkedHashMap A0A = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0B = new AnonymousClass2Df(this);
    public final ExecutorService A0C = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    static {
        Charset.forName("UTF-8");
    }

    public AnonymousClass2Dk(File file, long j) {
        this.A07 = file;
        this.A04 = 1;
        this.A08 = new File(file, "journal");
        this.A09 = new File(file, "journal.tmp");
        this.A05 = 1;
        this.A06 = j;
    }

    /* JADX INFO: finally extract failed */
    public static AnonymousClass2Dk A00(File file, long j) {
        String A012;
        if (j > 0) {
            AnonymousClass2Dk r15 = new AnonymousClass2Dk(file, j);
            File file2 = r15.A08;
            if (file2.exists()) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 8192);
                    try {
                        String A013 = A01(bufferedInputStream);
                        String A014 = A01(bufferedInputStream);
                        String A015 = A01(bufferedInputStream);
                        String A016 = A01(bufferedInputStream);
                        String A017 = A01(bufferedInputStream);
                        if ("libcore.io.DiskLruCache".equals(A013) && "1".equals(A014)) {
                            String num = Integer.toString(1);
                            if (num.equals(A015) && num.equals(A016) && "".equals(A017)) {
                                while (true) {
                                    try {
                                        A012 = A01(bufferedInputStream);
                                        String[] split = A012.split(" ");
                                        int length = split.length;
                                        if (length >= 2) {
                                            String str = split[1];
                                            if (!split[0].equals("REMOVE") || length != 2) {
                                                LinkedHashMap linkedHashMap = r15.A0A;
                                                AnonymousClass2Di r8 = (AnonymousClass2Di) linkedHashMap.get(str);
                                                if (r8 == null) {
                                                    r8 = new AnonymousClass2Di(r15, str);
                                                    linkedHashMap.put(str, r8);
                                                }
                                                String str2 = split[0];
                                                if (str2.equals("CLEAN") && length == 3) {
                                                    r8.A02 = true;
                                                    r8.A01 = null;
                                                    int min = Math.min(1, 1);
                                                    Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), 1);
                                                    System.arraycopy(split, 2, objArr, 0, min);
                                                    String[] strArr = (String[]) objArr;
                                                    int length2 = strArr.length;
                                                    if (length2 != r8.A05.A05) {
                                                        StringBuilder A0S = AnonymousClass008.A0S("unexpected journal line: ");
                                                        A0S.append(Arrays.toString(strArr));
                                                        throw new IOException(A0S.toString());
                                                    }
                                                    for (int i = 0; i < length2; i++) {
                                                        try {
                                                            r8.A04[i] = Long.parseLong(strArr[i]);
                                                        } catch (NumberFormatException unused) {
                                                            StringBuilder A0S2 = AnonymousClass008.A0S("unexpected journal line: ");
                                                            A0S2.append(Arrays.toString(strArr));
                                                            throw new IOException(A0S2.toString());
                                                        }
                                                    }
                                                } else if (str2.equals("DIRTY") && length == 2) {
                                                    r8.A01 = new C46562Dh(r15, r8);
                                                } else if (!str2.equals("READ") || length != 2) {
                                                }
                                            } else {
                                                r15.A0A.remove(str);
                                            }
                                        } else {
                                            throw new IOException(AnonymousClass008.A0K("unexpected journal line: ", A012));
                                        }
                                    } catch (EOFException unused2) {
                                        A03(bufferedInputStream);
                                        A05(r15.A09);
                                        Iterator it = r15.A0A.values().iterator();
                                        while (it.hasNext()) {
                                            AnonymousClass2Di r4 = (AnonymousClass2Di) it.next();
                                            if (r4.A01 == null) {
                                                r15.A02 += r4.A04[0];
                                            } else {
                                                r4.A01 = null;
                                                A05(r4.A00(0));
                                                A05(r4.A01(0));
                                                it.remove();
                                            }
                                        }
                                        r15.A03 = new BufferedWriter(new FileWriter(file2, true), 8192);
                                        return r15;
                                    }
                                }
                                throw new IOException(AnonymousClass008.A0K("unexpected journal line: ", A012));
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("unexpected journal header: [");
                        sb.append(A013);
                        sb.append(", ");
                        sb.append(A014);
                        sb.append(", ");
                        sb.append(A016);
                        sb.append(", ");
                        sb.append(A017);
                        sb.append("]");
                        throw new IOException(sb.toString());
                    } catch (Throwable th) {
                        A03(bufferedInputStream);
                        throw th;
                    }
                } catch (IOException unused3) {
                    r15.close();
                    A04(r15.A07);
                }
            }
            file.mkdirs();
            AnonymousClass2Dk r0 = new AnonymousClass2Dk(file, j);
            r0.A0A();
            return r0;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static String A01(InputStream inputStream) {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read == 10) {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == '\r') {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            } else {
                sb.append((char) read);
            }
        }
    }

    public static void A02(AnonymousClass2Dk r11, C46562Dh r12, boolean z) {
        synchronized (r11) {
            AnonymousClass2Di r5 = r12.A01;
            if (r5.A01 == r12) {
                if (z && !r5.A02) {
                    for (int i = 0; i < r11.A05; i++) {
                        if (!r5.A01(i).exists()) {
                            A02(r12.A02, r12, false);
                            StringBuilder sb = new StringBuilder();
                            sb.append("edit didn't create file ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
                for (int i2 = 0; i2 < r11.A05; i2++) {
                    File A012 = r5.A01(i2);
                    if (!z) {
                        A05(A012);
                    } else if (A012.exists()) {
                        File A002 = r5.A00(i2);
                        A012.renameTo(A002);
                        long[] jArr = r5.A04;
                        long j = jArr[i2];
                        long length = A002.length();
                        jArr[i2] = length;
                        r11.A02 = (r11.A02 - j) + length;
                    }
                }
                r11.A00++;
                r5.A01 = null;
                if (r5.A02 || z) {
                    r5.A02 = true;
                    Writer writer = r11.A03;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(r5.A03);
                    StringBuilder sb3 = new StringBuilder();
                    long[] jArr2 = r5.A04;
                    for (long j2 : jArr2) {
                        sb3.append(' ');
                        sb3.append(j2);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    writer.write(sb2.toString());
                    if (z) {
                        long j3 = r11.A01;
                        r11.A01 = 1 + j3;
                        r5.A00 = j3;
                    }
                } else {
                    LinkedHashMap linkedHashMap = r11.A0A;
                    String str = r5.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = r11.A03;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("REMOVE ");
                    sb4.append(str);
                    sb4.append('\n');
                    writer2.write(sb4.toString());
                }
                if (r11.A02 > r11.A06 || r11.A0C()) {
                    r11.A0C.submit(r11.A0B);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public static void A03(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A04(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A04(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a directory: ");
        sb2.append(file);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void A05(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static final void A06(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException(AnonymousClass008.A0L("keys must not contain spaces or newlines: \"", str, "\""));
        }
    }

    public C46562Dh A07(String str) {
        synchronized (this) {
            if (this.A03 != null) {
                A06(str);
                LinkedHashMap linkedHashMap = this.A0A;
                AnonymousClass2Di r1 = (AnonymousClass2Di) linkedHashMap.get(str);
                if (r1 == null) {
                    r1 = new AnonymousClass2Di(this, str);
                    linkedHashMap.put(str, r1);
                } else if (r1.A01 != null) {
                    return null;
                }
                C46562Dh r3 = new C46562Dh(this, r1);
                r1.A01 = r3;
                Writer writer = this.A03;
                StringBuilder sb = new StringBuilder();
                sb.append("DIRTY ");
                sb.append(str);
                sb.append('\n');
                writer.write(sb.toString());
                this.A03.flush();
                return r3;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized AnonymousClass2Dj A08(String str) {
        if (this.A03 != null) {
            A06(str);
            AnonymousClass2Di r6 = (AnonymousClass2Di) this.A0A.get(str);
            if (r6 == null) {
                return null;
            }
            if (!r6.A02) {
                return null;
            }
            int i = this.A05;
            InputStream[] inputStreamArr = new InputStream[i];
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    inputStreamArr[i2] = new FileInputStream(r6.A00(i2));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
            this.A00++;
            this.A03.append((CharSequence) "READ").append(' ').append((CharSequence) str).append('\n');
            if (A0C()) {
                this.A0C.submit(this.A0B);
            }
            return new AnonymousClass2Dj(this, inputStreamArr);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final void A09() {
        while (this.A02 > this.A06) {
            A0B((String) ((Map.Entry) this.A0A.entrySet().iterator().next()).getKey());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cf, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0A() {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Dk.A0A():void");
    }

    public synchronized void A0B(String str) {
        if (this.A03 != null) {
            A06(str);
            LinkedHashMap linkedHashMap = this.A0A;
            AnonymousClass2Di r7 = (AnonymousClass2Di) linkedHashMap.get(str);
            if (r7 != null) {
                if (r7.A01 == null) {
                    for (int i = 0; i < this.A05; i++) {
                        File A002 = r7.A00(i);
                        if (A002.delete()) {
                            long j = this.A02;
                            long[] jArr = r7.A04;
                            this.A02 = j - jArr[i];
                            jArr[i] = 0;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("failed to delete ");
                            sb.append(A002);
                            throw new IOException(sb.toString());
                        }
                    }
                    this.A00++;
                    this.A03.append((CharSequence) "REMOVE").append(' ').append((CharSequence) str).append('\n');
                    linkedHashMap.remove(str);
                    if (A0C()) {
                        this.A0C.submit(this.A0B);
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean A0C() {
        int i = this.A00;
        return i >= 2000 && i >= this.A0A.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.A03 != null) {
            Iterator it = new ArrayList(this.A0A.values()).iterator();
            while (it.hasNext()) {
                C46562Dh r2 = ((AnonymousClass2Di) it.next()).A01;
                if (r2 != null) {
                    A02(r2.A02, r2, false);
                }
            }
            A09();
            this.A03.close();
            this.A03 = null;
        }
    }
}
