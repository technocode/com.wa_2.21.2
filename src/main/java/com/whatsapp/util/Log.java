package com.whatsapp.util;

import X.AnonymousClass008;
import X.AnonymousClass0HY;
import X.C003301q;
import X.C003601t;
import X.C003701u;
import X.C003801v;
import X.C004001x;
import X.C004201z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

public class Log {
    public static final CharsetEncoder DO_LOG_ENCODER = Charset.defaultCharset().newEncoder();
    public static final ByteBuffer DO_LOG_ENCODE_BUFFER = ByteBuffer.allocate(16384);
    public static final C003801v LOGGER_THREAD;
    public static final PrintStream ORIGINAL_SYSTEM_ERR = System.err;
    public static FileChannel channel;
    public static final Object compressFileLock = new Object();
    public static final C003601t connectivityType = new C003601t(C003301q.A02);
    public static int level = 5;
    public static final AtomicReference logDirRef = new AtomicReference();
    public static File logFile;
    public static final CountDownLatch logFileLatch = new CountDownLatch(1);
    public static File logTempFile;
    public static final Object tempFileLock = new Object();
    public static String timezone;
    public static final ReentrantLock writeFileLock = new ReentrantLock(true);

    static {
        C003801v r0 = new C003801v();
        r0.start();
        LOGGER_THREAD = r0;
    }

    public static void a(String str) {
        log("LL_A ", str);
    }

    public static void a(boolean z) {
        if (!z) {
            log("LL_A ", "Assertion Failed");
        }
    }

    public static String adorn(String str, StringBuilder sb) {
        StringBuilder sb2;
        Thread currentThread = Thread.currentThread();
        long id = currentThread.getId();
        String name = currentThread.getName();
        String A0O = AnonymousClass008.A0O(AnonymousClass008.A0S(str), (String) connectivityType.get(), " ");
        if (level < 5) {
            int length = name.length() + A0O.length() + 20 + 4;
            if (sb.length() > 16384) {
                sb2 = new StringBuilder(length + 16384 + 3);
                sb2.append(A0O);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append(sb.substring(0, 16384));
                sb2.append("...");
            } else {
                sb2 = new StringBuilder(sb.length() + length);
                sb2.append(A0O);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append((CharSequence) sb);
            }
            return sb2.toString();
        }
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        String str2 = "";
        String str3 = str2;
        int i = 5;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    str2 = stackTraceElement.getFileName();
                    str3 = String.valueOf(stackTraceElement.getLineNumber());
                    break;
                }
                str3 = String.valueOf(stackTraceElement.getLineNumber());
                str2 = "(null)";
            } else if (i == 5) {
                str2 = stackTraceElement.getFileName();
                str3 = "native";
            }
            i++;
        }
        StringBuilder sb3 = new StringBuilder(sb.length() + str3.length() + str2.length() + name.length() + A0O.length() + 1 + 20 + 1 + 1 + 1 + 1);
        sb3.append(A0O);
        sb3.append('[');
        sb3.append(id);
        sb3.append(':');
        sb3.append(name);
        sb3.append(']');
        sb3.append(str2);
        sb3.append(':');
        sb3.append(str3);
        sb3.append(' ');
        sb3.append((CharSequence) sb);
        return sb3.toString();
    }

    public static void blockingLog(int i, String str) {
        if (i <= level) {
            String adorn = adorn(getLogPrefix(i), new StringBuilder(str));
            logAdorned(adorn, true);
            if (level == 5) {
                logToLogcat(i, adorn);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r4.getAbsolutePath().equals(r5.getAbsolutePath()) == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0118, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0122, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0126, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0139, code lost:
        if (r4.getAbsolutePath().equals(r5.getAbsolutePath()) == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013b, code lost:
        r4.delete();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File compress() {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.compress():java.io.File");
    }

    public static void d(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", str));
        } else if (i >= 4) {
            log("LL_D ", str);
        }
    }

    public static void d(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", obj, getStackTraceString(th)));
        } else if (i >= 4) {
            log("LL_D ", obj, getStackTraceString(th));
        }
    }

    public static void d(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(4, log("LL_D ", getStackTraceString(th)));
        } else if (i >= 4) {
            log("LL_D ", getStackTraceString(th));
        }
    }

    public static void doLogToFile(String str) {
        StringBuilder sb = new StringBuilder();
        Calendar instance = Calendar.getInstance();
        sb.append(instance.get(1));
        sb.append('-');
        if (instance.get(2) < 9) {
            sb.append('0');
        }
        sb.append(instance.get(2) + 1);
        sb.append('-');
        if (instance.get(5) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(5));
        sb.append(' ');
        if (instance.get(11) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(11));
        sb.append(':');
        if (instance.get(12) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(12));
        sb.append(':');
        if (instance.get(13) < 10) {
            sb.append('0');
        }
        sb.append(instance.get(13));
        sb.append('.');
        if (instance.get(14) < 10) {
            sb.append("00");
        } else if (instance.get(14) < 100) {
            sb.append('0');
        }
        sb.append(instance.get(14));
        sb.append(' ');
        writeFileLock.lock();
        try {
            if (!initialize()) {
                writeFileLock.unlock();
                return;
            }
            FileChannel fileChannel = channel;
            if (fileChannel != null) {
                fileChannel.position(fileChannel.size());
                FileChannel fileChannel2 = channel;
                CharsetEncoder charsetEncoder = DO_LOG_ENCODER;
                ByteBuffer byteBuffer = DO_LOG_ENCODE_BUFFER;
                encodeAndWriteToChannel(fileChannel2, charsetEncoder, byteBuffer, sb);
                FileChannel fileChannel3 = channel;
                CharsetEncoder charsetEncoder2 = DO_LOG_ENCODER;
                ByteBuffer byteBuffer2 = DO_LOG_ENCODE_BUFFER;
                encodeAndWriteToChannel(fileChannel3, charsetEncoder2, byteBuffer, str);
                encodeAndWriteToChannel(channel, charsetEncoder2, byteBuffer2, "\n");
                writeFileLock.unlock();
                return;
            }
            throw null;
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IOException on ");
            sb2.append(str);
            android.util.Log.e("WhatsApp", sb2.toString(), e);
        } catch (Throwable th) {
            writeFileLock.unlock();
            throw th;
        }
    }

    public static void doLogToLogcat(int i, String str) {
        if (i == 0 || i == 5) {
            android.util.Log.v("WhatsApp", str);
        } else if (i == 4) {
            android.util.Log.d("WhatsApp", str);
        } else if (i == 3) {
            android.util.Log.i("WhatsApp", str);
        } else if (i == 2) {
            android.util.Log.w("WhatsApp", str);
        } else if (i == 1) {
            android.util.Log.e("WhatsApp", str);
        }
    }

    public static void e(String str) {
        if (level == 5) {
            logToLogcat(1, log("LL_E ", str));
        } else {
            log("LL_E ", str);
        }
    }

    public static void e(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(1, log("LL_E ", obj, stackTraceString));
        } else {
            log("LL_E ", obj, stackTraceString);
        }
    }

    public static void e(Throwable th) {
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(1, log("LL_E ", stackTraceString));
        } else {
            log("LL_E ", stackTraceString);
        }
    }

    public static void encodeAndWriteToChannel(FileChannel fileChannel, CharsetEncoder charsetEncoder, ByteBuffer byteBuffer, CharSequence charSequence) {
        CharBuffer wrap = CharBuffer.wrap(charSequence);
        charsetEncoder.reset();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        charsetEncoder.onMalformedInput(codingErrorAction);
        charsetEncoder.onUnmappableCharacter(codingErrorAction);
        byteBuffer.clear();
        CoderResult coderResult = CoderResult.OVERFLOW;
        while (coderResult.isOverflow()) {
            coderResult = charsetEncoder.encode(wrap, byteBuffer, true);
            byteBuffer.flip();
            if (coderResult.isError()) {
                coderResult.throwException();
            }
            fileChannel.write(byteBuffer);
            byteBuffer.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    public static void flush() {
        try {
            blockingLog(5, "log/flush/start");
            C003801v r3 = LOGGER_THREAD;
            if (Thread.currentThread() == r3) {
                int size = r3.A03.size();
                for (int i = 0; i < size; i++) {
                    r3.A00();
                }
            } else {
                FutureTask futureTask = new FutureTask(C003801v.A05, null);
                r3.A01(futureTask);
                while (!futureTask.isDone()) {
                    try {
                        futureTask.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            blockingLog(5, "log/flush/logs written");
            blockingLog(5, "log/flush/forcing to disk");
            writeFileLock.lock();
            try {
                FileChannel fileChannel = channel;
                if (fileChannel != null && fileChannel.isOpen()) {
                    channel.force(true);
                }
                writeFileLock.unlock();
                blockingLog(5, "log/flush/end");
            } catch (Throwable th) {
                writeFileLock.unlock();
                throw th;
            }
        } catch (IOException e) {
            String logPrefix = getLogPrefix(1);
            StringBuilder sb = new StringBuilder("log/flush/failed");
            sb.append("; exception=");
            sb.append(e);
            String obj = sb.toString();
            String stackTraceString = getStackTraceString(e);
            StringBuilder sb2 = new StringBuilder(stackTraceString.length() + obj.length() + 1);
            sb2.append(obj);
            sb2.append("\n");
            sb2.append(stackTraceString);
            String adorn = adorn(logPrefix, sb2);
            doLogToFile(adorn);
            if (level == 5) {
                logToLogcat(1, adorn);
            }
        }
    }

    public static ArrayList getLatestLogs(int i) {
        File file = logFile;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        String pattern = simpleDateFormat.toPattern();
        String A05 = AnonymousClass0HY.A05(file.getName(), ".gz");
        String A04 = AnonymousClass0HY.A04(file.getName());
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles);
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith(A04) && name.endsWith(A05)) {
                    int length = A04.length();
                    try {
                        if ((date.getTime() - simpleDateFormat.parse(name.substring(length, pattern.length() + length)).getTime()) / TimeUnit.DAYS.toMillis(1) < ((long) i)) {
                            arrayList.add(file2);
                        }
                    } catch (ParseException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    public static String getLogPrefix(int i) {
        if (i == 0) {
            return "LL_A ";
        }
        if (i == 1) {
            return "LL_E ";
        }
        if (i == 2) {
            return "LL_W ";
        }
        if (i == 3) {
            return "LL_I ";
        }
        if (i == 4) {
            return "LL_D ";
        }
        if (i == 5) {
            return "LL_V ";
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("Invalid log level ", i));
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("### begin stack trace 2.21.2.4(267728432)\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        sb.append("### end stack trace");
        return sb.toString();
    }

    public static void i(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(3, log("LL_I ", str));
        } else if (i >= 3) {
            log("LL_I ", str);
        }
    }

    public static void i(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(3, log("LL_I ", obj, getStackTraceString(th)));
        } else if (i >= 3) {
            log("LL_I ", obj, getStackTraceString(th));
        }
    }

    public static void i(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(3, log("LL_I ", getStackTraceString(th)));
        } else if (i >= 3) {
            log("LL_I ", getStackTraceString(th));
        }
    }

    public static boolean initialize() {
        FileChannel fileChannel = channel;
        if (fileChannel != null && fileChannel.isOpen()) {
            return true;
        }
        if (!C003701u.A0D() || logFileLatch.getCount() != 1) {
            try {
                logFileLatch.await();
                File file = (File) logDirRef.get();
                if (file == null) {
                    return false;
                }
                if (!file.exists() && !file.mkdirs()) {
                    return false;
                }
                channel = new FileOutputStream(logFile, true).getChannel();
                PrintStream printStream = System.err;
                PrintStream printStream2 = ORIGINAL_SYSTEM_ERR;
                boolean z = false;
                if (printStream != printStream2) {
                    z = true;
                }
                System.setErr(new PrintStream((OutputStream) new C004201z(new C004001x(printStream2), Channels.newOutputStream(channel)), true));
                if (z) {
                    printStream.close();
                } else {
                    printStream.flush();
                }
                Calendar instance = Calendar.getInstance();
                int i = (instance.get(16) + instance.get(15)) / 60000;
                int i2 = i / 60;
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                char c = '+';
                if (i2 < 0) {
                    c = '-';
                }
                objArr[0] = Character.valueOf(c);
                objArr[1] = Integer.valueOf(Math.abs(i2));
                objArr[2] = Integer.valueOf(Math.abs(i % 60));
                String format = String.format(locale, "%c%02d%02d", objArr);
                timezone = format;
                StringBuilder A0S = AnonymousClass008.A0S("==== logfile level=");
                A0S.append(level);
                A0S.append(" tz=");
                logAdorned(adorn("LL_I ", new StringBuilder(AnonymousClass008.A0O(A0S, format, " ===="))), true);
                FileChannel fileChannel2 = channel;
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    return false;
                }
                return true;
            } catch (InterruptedException unused) {
                return false;
            }
        } else {
            throw new AssertionError("If Log.initialize() is called on the main thread,  Log.setApplicationContext() must have been called beforehand.");
        }
    }

    public static String log(String str, String str2) {
        String adorn = adorn(str, new StringBuilder(str2));
        logAdorned(adorn, false);
        return adorn;
    }

    public static String log(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + 1);
        sb.append(str2);
        sb.append("\n");
        sb.append(str3);
        String adorn = adorn(str, sb);
        logAdorned(adorn, false);
        return adorn;
    }

    public static void log(int i, String str) {
        if (i <= level) {
            String log = log(getLogPrefix(i), str);
            if (level == 5) {
                logToLogcat(i, log);
            }
        }
    }

    public static String logAdorned(String str, boolean z) {
        Thread currentThread;
        C003801v r0;
        if (z || (currentThread = Thread.currentThread()) == (r0 = LOGGER_THREAD)) {
            doLogToFile(str);
            return str;
        } else if (currentThread == r0) {
            blockingLog(2, "postLog called on the logging thread. Next log will be out of order.");
            doLogToFile(str);
            return str;
        } else {
            r0.A01(str);
            return str;
        }
    }

    public static void logToLogcat(int i, String str) {
        int length = str.length();
        if (length <= 4000) {
            doLogToLogcat(i, str);
            return;
        }
        StringBuilder sb = new StringBuilder(4006);
        int i2 = 0;
        while (length - i2 > 4000) {
            if (i2 > 0) {
                sb.append("...");
            }
            sb.append(str.substring(i2, (4000 + i2) - 3));
            sb.append("...");
            doLogToLogcat(i, sb.toString());
            i2 += 3997;
            sb.setLength(0);
        }
        StringBuilder sb2 = new StringBuilder(4006);
        if (i2 > 0) {
            sb2.append("...");
        }
        sb2.append(str.substring(i2, length));
        doLogToLogcat(i, sb2.toString());
    }

    public static boolean rotate() {
        synchronized (tempFileLock) {
            writeFileLock.lock();
            try {
                boolean z = false;
                if (!initialize()) {
                    return false;
                }
                FileChannel fileChannel = channel;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                        channel = null;
                        File file = logFile;
                        File file2 = logTempFile;
                        if (file.exists()) {
                            int A00 = AnonymousClass0HY.A00(file, file2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(file2.getPath());
                            sb.append(".");
                            sb.append(A00 + 1);
                            try {
                                z = file.renameTo(new File(sb.toString()));
                            } catch (SecurityException unused) {
                            }
                        }
                        initialize();
                        writeFileLock.unlock();
                        return z;
                    } catch (IOException unused2) {
                        channel = null;
                        writeFileLock.unlock();
                        return false;
                    } catch (Throwable th) {
                        channel = null;
                        throw th;
                    }
                } else {
                    throw null;
                }
            } finally {
                writeFileLock.unlock();
            }
        }
    }

    public static void v(String str) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", str));
        }
    }

    public static void v(String str, Throwable th) {
        if (level >= 5) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("; exception=");
            sb.append(th);
            logToLogcat(5, log("LL_V ", sb.toString(), getStackTraceString(th)));
        }
    }

    public static void v(Throwable th) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", getStackTraceString(th)));
        }
    }

    public static void w(String str) {
        int i = level;
        if (i == 5) {
            logToLogcat(2, log("LL_W ", str));
        } else if (i >= 2) {
            log("LL_W ", str);
        }
    }

    public static void w(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; exception=");
        sb.append(th);
        String obj = sb.toString();
        int i = level;
        if (i == 5) {
            logToLogcat(2, log("LL_W ", obj, getStackTraceString(th)));
        } else if (i >= 2) {
            log("LL_W ", obj, getStackTraceString(th));
        }
    }

    public static void w(Throwable th) {
        int i = level;
        if (i == 5) {
            logToLogcat(2, log("LL_W ", getStackTraceString(th)));
        } else if (i >= 2) {
            log("LL_W ", getStackTraceString(th));
        }
    }
}
