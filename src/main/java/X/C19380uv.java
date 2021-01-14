package X;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.0uv  reason: invalid class name and case insensitive filesystem */
public final class C19380uv implements Closeable {
    public static final OutputStream A0E = new C19310uo();
    public static final Charset A0F = Charset.forName("US-ASCII");
    public static final Pattern A0G = Pattern.compile("[a-z0-9_-]{1,120}");
    public int A00;
    public long A01;
    public long A02 = 0;
    public long A03 = 0;
    public Writer A04;
    public final int A05;
    public final int A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0A;
    public final LinkedHashMap A0B = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0C = new CallableC19300un(this);
    public final ThreadPoolExecutor A0D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    static {
        Charset.forName("UTF-8");
    }

    public C19380uv(File file, long j) {
        this.A07 = file;
        this.A05 = 2;
        this.A08 = new File(file, "journal");
        this.A0A = new File(file, "journal.tmp");
        this.A09 = new File(file, "journal.bkp");
        this.A06 = 1;
        this.A01 = j;
    }

    public static void A00(C19380uv r11, C19330uq r12, boolean z) {
        synchronized (r11) {
            C19340ur r5 = r12.A02;
            if (r5.A01 == r12) {
                if (z && !r5.A02) {
                    for (int i = 0; i < r11.A06; i++) {
                        if (!r12.A03[i]) {
                            A00(r12.A04, r12, false);
                            StringBuilder sb = new StringBuilder();
                            sb.append("Newly created entry didn't create value for index ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                        } else if (!r5.A01(i).exists()) {
                            A00(r12.A04, r12, false);
                            return;
                        }
                    }
                }
                for (int i2 = 0; i2 < r11.A06; i2++) {
                    File A012 = r5.A01(i2);
                    if (!z) {
                        A03(A012);
                    } else if (A012.exists()) {
                        File A002 = r5.A00(i2);
                        A012.renameTo(A002);
                        long[] jArr = r5.A04;
                        long j = jArr[i2];
                        long length = A002.length();
                        jArr[i2] = length;
                        r11.A03 = (r11.A03 - j) + length;
                    }
                }
                r11.A00++;
                r5.A01 = null;
                if (r5.A02 || z) {
                    r5.A02 = true;
                    Writer writer = r11.A04;
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
                        long j3 = r11.A02;
                        r11.A02 = 1 + j3;
                        r5.A00 = j3;
                    }
                } else {
                    LinkedHashMap linkedHashMap = r11.A0B;
                    String str = r5.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = r11.A04;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("REMOVE ");
                    sb4.append(str);
                    sb4.append('\n');
                    writer2.write(sb4.toString());
                }
                r11.A04.flush();
                if (r11.A03 > r11.A01 || r11.A08()) {
                    r11.A0D.submit(r11.A0C);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void A01(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A02(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A02(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }

    public static void A03(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static final void A04(String str) {
        if (!A0G.matcher(str).matches()) {
            throw new IllegalArgumentException(AnonymousClass008.A0L("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final void A05() {
        while (this.A03 > this.A01) {
            A07((String) ((Map.Entry) this.A0B.entrySet().iterator().next()).getKey());
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void A06() {
        Writer writer = this.A04;
        if (writer != null) {
            writer.close();
        }
        File file = this.A0A;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Charset charset = A0F;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, charset));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.A05));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.A06));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C19340ur r2 : this.A0B.values()) {
                if (r2.A01 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(r2.A03);
                    sb.append('\n');
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(r2.A03);
                    StringBuilder sb3 = new StringBuilder();
                    long[] jArr = r2.A04;
                    for (long j : jArr) {
                        sb3.append(' ');
                        sb3.append(j);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    bufferedWriter.write(sb2.toString());
                }
            }
            bufferedWriter.close();
            File file2 = this.A08;
            if (file2.exists()) {
                File file3 = this.A09;
                A03(file3);
                if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            if (file.renameTo(file2)) {
                this.A09.delete();
                this.A04 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), charset));
            } else {
                throw new IOException();
            }
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public synchronized void A07(String str) {
        if (this.A04 != null) {
            A04(str);
            LinkedHashMap linkedHashMap = this.A0B;
            C19340ur r7 = (C19340ur) linkedHashMap.get(str);
            if (r7 != null) {
                if (r7.A01 == null) {
                    for (int i = 0; i < this.A06; i++) {
                        File A002 = r7.A00(i);
                        if (!A002.exists() || A002.delete()) {
                            long j = this.A03;
                            long[] jArr = r7.A04;
                            this.A03 = j - jArr[i];
                            jArr[i] = 0;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("failed to delete ");
                            sb.append(A002);
                            throw new IOException(sb.toString());
                        }
                    }
                    this.A00++;
                    Writer writer = this.A04;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("REMOVE ");
                    sb2.append(str);
                    sb2.append('\n');
                    writer.append((CharSequence) sb2.toString());
                    linkedHashMap.remove(str);
                    if (A08()) {
                        this.A0D.submit(this.A0C);
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean A08() {
        int i = this.A00;
        return i >= 2000 && i >= this.A0B.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.A04 != null) {
            Iterator it = new ArrayList(this.A0B.values()).iterator();
            while (it.hasNext()) {
                C19330uq r2 = ((C19340ur) it.next()).A01;
                if (r2 != null) {
                    A00(r2.A04, r2, false);
                }
            }
            A05();
            this.A04.close();
            this.A04 = null;
        }
    }
}
