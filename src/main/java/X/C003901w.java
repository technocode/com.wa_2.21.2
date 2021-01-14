package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: X.01w  reason: invalid class name and case insensitive filesystem */
public final class C003901w implements Closeable {
    public final long A00;
    public final File A01;
    public final File A02;
    public final RandomAccessFile A03;
    public final FileChannel A04;
    public final FileLock A05;

    public C003901w(File file, File file2) {
        StringBuilder A0S = AnonymousClass008.A0S("MultiDexExtractor(");
        A0S.append(file.getPath());
        A0S.append(", ");
        A0S.append(file2.getPath());
        A0S.append(")");
        Log.i("MultiDex", A0S.toString());
        this.A02 = file;
        this.A01 = file2;
        this.A00 = A00(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.A03 = randomAccessFile;
        try {
            this.A04 = randomAccessFile.getChannel();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Blocking on lock ");
                sb.append(file3.getPath());
                Log.i("MultiDex", sb.toString());
                this.A05 = this.A04.lock();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file3.getPath());
                sb2.append(" locked");
                Log.i("MultiDex", sb2.toString());
            } catch (IOException | Error | RuntimeException e) {
                A02(this.A04);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e2) {
            A02(this.A03);
            throw e2;
        }
    }

    /* JADX INFO: finally extract failed */
    public static long A00(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            C004101y A042 = C001801b.A04(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = A042.A01;
            randomAccessFile.seek(A042.A00);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j -= (long) read;
                if (j == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void A01(Context context, long j, long j2, List list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("timestamp");
        edit.putLong(sb.toString(), j);
        edit.putLong(AnonymousClass008.A0O(new StringBuilder(), "", "crc"), j2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append("dex.number");
        edit.putInt(sb2.toString(), list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            C15780oh r5 = (C15780oh) it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("");
            sb3.append("dex.crc.");
            sb3.append(i);
            edit.putLong(sb3.toString(), r5.crc);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("");
            sb4.append("dex.time.");
            sb4.append(i);
            edit.putLong(sb4.toString(), r5.lastModified());
            i++;
        }
        edit.commit();
    }

    public static void A02(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* JADX INFO: finally extract failed */
    public final List A03() {
        StringBuilder sb = new StringBuilder();
        File file = this.A02;
        sb.append(file.getName());
        sb.append(".classes");
        String obj = sb.toString();
        File file2 = this.A01;
        File[] listFiles = file2.listFiles(new C15770og(this));
        if (listFiles == null) {
            StringBuilder A0S = AnonymousClass008.A0S("Failed to list secondary dex dir content (");
            A0S.append(file2.getPath());
            A0S.append(").");
            Log.w("MultiDex", A0S.toString());
        } else {
            for (File file3 : listFiles) {
                StringBuilder A0S2 = AnonymousClass008.A0S("Trying to delete old file ");
                A0S2.append(file3.getPath());
                A0S2.append(" of size ");
                A0S2.append(file3.length());
                Log.i("MultiDex", A0S2.toString());
                if (!file3.delete()) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("Failed to delete old file ");
                    A0S3.append(file3.getPath());
                    Log.w("MultiDex", A0S3.toString());
                } else {
                    StringBuilder A0S4 = AnonymousClass008.A0S("Deleted old file ");
                    A0S4.append(file3.getPath());
                    Log.i("MultiDex", A0S4.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        int i = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(i);
                sb2.append(".zip");
                C15780oh r3 = new C15780oh(file2, sb2.toString());
                arrayList.add(r3);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Extraction is needed for file ");
                sb3.append(r3);
                Log.i("MultiDex", sb3.toString());
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    InputStream inputStream = zipFile.getInputStream(entry);
                    File createTempFile = File.createTempFile(AnonymousClass008.A0K("tmp-", obj), ".zip", r3.getParentFile());
                    StringBuilder A0S5 = AnonymousClass008.A0S("Extracting ");
                    A0S5.append(createTempFile.getPath());
                    Log.i("MultiDex", A0S5.toString());
                    try {
                        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                        try {
                            ZipEntry zipEntry = new ZipEntry("classes.dex");
                            zipEntry.setTime(entry.getTime());
                            zipOutputStream.putNextEntry(zipEntry);
                            byte[] bArr = new byte[16384];
                            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                                zipOutputStream.write(bArr, 0, read);
                            }
                            zipOutputStream.closeEntry();
                            zipOutputStream.close();
                            if (createTempFile.setReadOnly()) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Renaming to ");
                                sb4.append(r3.getPath());
                                Log.i("MultiDex", sb4.toString());
                                if (createTempFile.renameTo(r3)) {
                                    try {
                                        r3.crc = A00(r3);
                                        z = true;
                                    } catch (IOException e) {
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Failed to read crc from ");
                                        sb5.append(r3.getAbsolutePath());
                                        Log.w("MultiDex", sb5.toString(), e);
                                        z = false;
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("Extraction ");
                                    sb6.append(z ? "succeeded" : "failed");
                                    sb6.append(" '");
                                    sb6.append(r3.getAbsolutePath());
                                    sb6.append("': length ");
                                    sb6.append(r3.length());
                                    sb6.append(" - crc: ");
                                    sb6.append(r3.crc);
                                    Log.i("MultiDex", sb6.toString());
                                    if (!z) {
                                        r3.delete();
                                        if (r3.exists()) {
                                            StringBuilder sb7 = new StringBuilder();
                                            sb7.append("Failed to delete corrupted secondary dex '");
                                            sb7.append(r3.getPath());
                                            sb7.append("'");
                                            Log.w("MultiDex", sb7.toString());
                                        }
                                    }
                                } else {
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append("Failed to rename \"");
                                    sb8.append(createTempFile.getAbsolutePath());
                                    sb8.append("\" to \"");
                                    sb8.append(r3.getAbsolutePath());
                                    sb8.append("\"");
                                    throw new IOException(sb8.toString());
                                }
                            } else {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append("Failed to mark readonly \"");
                                sb9.append(createTempFile.getAbsolutePath());
                                sb9.append("\" (tmp of \"");
                                sb9.append(r3.getAbsolutePath());
                                sb9.append("\")");
                                throw new IOException(sb9.toString());
                            }
                        } catch (Throwable th) {
                            zipOutputStream.close();
                            throw th;
                        }
                    } finally {
                        A02(inputStream);
                        createTempFile.delete();
                    }
                }
                if (z) {
                    i++;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("classes");
                    sb10.append(i);
                    sb10.append(".dex");
                    entry = zipFile.getEntry(sb10.toString());
                } else {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("Could not create zip file ");
                    sb11.append(r3.getAbsolutePath());
                    sb11.append(" for secondary dex (");
                    sb11.append(i);
                    sb11.append(")");
                    throw new IOException(sb11.toString());
                }
            }
            try {
                zipFile.close();
                return arrayList;
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
                return arrayList;
            }
        } catch (Throwable th2) {
            try {
                zipFile.close();
                throw th2;
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x01d1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008d, code lost:
        if (r1 != 0) goto L_0x008f;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A04(android.content.Context r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 505
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003901w.A04(android.content.Context, boolean):java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A05.release();
        this.A04.close();
        this.A03.close();
    }
}
