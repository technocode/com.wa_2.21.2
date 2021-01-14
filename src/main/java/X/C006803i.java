package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.core.content.FileProvider;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.03i  reason: invalid class name and case insensitive filesystem */
public class C006803i {
    public static int A00(AnonymousClass03S r1, TelephonyManager telephonyManager) {
        if (r1.A02("android.permission.READ_PHONE_STATE") != 0) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return telephonyManager.getNetworkType();
        }
        return telephonyManager.getDataNetworkType();
    }

    public static int A01(C006903j r1, AnonymousClass01A r2, AnonymousClass02N r3) {
        C007103l A07;
        if (AnonymousClass1VY.A0Y(r3)) {
            C007003k A09 = r2.A09(r3);
            if (A09 != null) {
                return A09.A00;
            }
            return 0;
        } else if (!AnonymousClass1VY.A0e(r3) || (A07 = r1.A07((UserJid) r3)) == null) {
            return 0;
        } else {
            return A07.expiration;
        }
    }

    public static int A02(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long A03(File file, AbstractC007203m r8) {
        if (!file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        long j = 0;
        while (linkedList.peek() != null) {
            Object poll = linkedList.poll();
            if (poll != null) {
                File[] listFiles = ((File) poll).listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.exists()) {
                            if (file2.isDirectory()) {
                                linkedList.add(file2);
                            } else {
                                j += (r8 == null || ((Boolean) r8.A2O(file2)).booleanValue()) ? file2.length() : 0;
                            }
                        }
                    }
                }
            } else {
                throw null;
            }
        }
        return j;
    }

    public static long A04(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static Intent A05(Intent intent, C007303n r5) {
        if (!intent.hasExtra("fMessageKeyJid") && !intent.hasExtra("fMessageKeyFromMe") && !intent.hasExtra("fMessageKeyId")) {
            return intent.putExtra("fMessageKeyId", r5.A01).putExtra("fMessageKeyFromMe", r5.A02).putExtra("fMessageKeyJid", AnonymousClass1VY.A0D(r5.A00));
        }
        throw new IllegalArgumentException("Intent already contains key.");
    }

    public static Uri A06(Context context, File file) {
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        return FileProvider.A00(context, "com.whatsapp.fileprovider").A9b(file);
    }

    public static C007103l A07(AbstractC007503q r7) {
        Long l = r7.A0Q;
        boolean z = false;
        if (r7.A02 > 0) {
            z = true;
        }
        long j = 0;
        if (!z && (l == null || l.longValue() <= 0)) {
            return null;
        }
        int i = r7.A02;
        if (l != null) {
            j = l.longValue();
        }
        return new C007103l(i, j);
    }

    public static C007303n A08(Intent intent) {
        if (!intent.hasExtra("fMessageKeyJid") || !intent.hasExtra("fMessageKeyFromMe") || !intent.hasExtra("fMessageKeyId")) {
            return null;
        }
        return new C007303n(AnonymousClass02N.A01(intent.getStringExtra("fMessageKeyJid")), intent.getBooleanExtra("fMessageKeyFromMe", false), intent.getStringExtra("fMessageKeyId"));
    }

    public static C007303n A09(Bundle bundle, String str) {
        String A0K = AnonymousClass008.A0K(str, "fMessageKeyJid");
        String A0K2 = AnonymousClass008.A0K(str, "fMessageKeyFromMe");
        String A0K3 = AnonymousClass008.A0K(str, "fMessageKeyId");
        if (!bundle.containsKey(A0K) || !bundle.containsKey(A0K2) || !bundle.containsKey(A0K3)) {
            return null;
        }
        return new C007303n(AnonymousClass02N.A01(bundle.getString(A0K)), bundle.getBoolean(A0K2, false), bundle.getString(A0K3));
    }

    public static File A0A(Context context, File file) {
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            name = "source";
        }
        return A0D(file, name, context.getFilesDir());
    }

    public static File A0B(Uri uri) {
        if (uri.getPath() == null) {
            return null;
        }
        if (uri.getScheme() == null || "file".equals(uri.getScheme())) {
            return new File(uri.getPath());
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0118, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0143, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0146, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014a, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A0C(X.AnonymousClass00C r12, java.io.File r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 417
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006803i.A0C(X.00C, java.io.File, int, int):java.io.File");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC, Splitter:B:48:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00aa A[SYNTHETIC, Splitter:B:53:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c4 A[SYNTHETIC, Splitter:B:58:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e9 A[SYNTHETIC, Splitter:B:71:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f3 A[SYNTHETIC, Splitter:B:76:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010c A[SYNTHETIC, Splitter:B:81:0x010c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A0D(java.io.File r15, java.lang.String r16, java.io.File r17) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006803i.A0D(java.io.File, java.lang.String, java.io.File):java.io.File");
    }

    public static String A0E() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr[0];
            }
        }
        return Build.CPU_ABI;
    }

    public static String A0F(AnonymousClass01X r6, int i) {
        if (i <= 0) {
            return "";
        }
        if (i >= 86400) {
            int i2 = i / 86400;
            return r6.A0A(R.plurals.tb_ephemeral_chat_expiration_in_days, (long) i2, Integer.valueOf(i2));
        } else if (i >= 3600) {
            int i3 = i / 3600;
            return r6.A0A(R.plurals.tb_ephemeral_chat_expiration_in_hours, (long) i3, Integer.valueOf(i3));
        } else if (i >= 60) {
            int i4 = i / 60;
            return r6.A0A(R.plurals.tb_ephemeral_chat_expiration_in_minutes, (long) i4, Integer.valueOf(i4));
        } else {
            return r6.A0A(R.plurals.tb_ephemeral_chat_expiration_in_seconds, (long) i, Integer.valueOf(i));
        }
    }

    public static String A0G(AnonymousClass01X r6, int i, boolean z) {
        if (i <= 0) {
            if (z) {
                return r6.A06(R.string.ephemeral_setting_off);
            }
            return r6.A06(R.string.ephemeral_setting_off_status);
        } else if (i != 604800) {
            int i2 = R.plurals.ephemeral_setting_in_seconds;
            if (i > 86400) {
                i /= 86400;
                i2 = R.plurals.ephemeral_setting_in_days;
            } else if (i >= 3600) {
                i /= 3600;
                i2 = R.plurals.ephemeral_setting_in_hours;
            } else if (i >= 60) {
                i /= 60;
                i2 = R.plurals.ephemeral_setting_in_minutes;
            }
            return r6.A0A(i2, (long) i, Integer.valueOf(i));
        } else if (z) {
            return r6.A06(R.string.ephemeral_setting_on);
        } else {
            return r6.A06(R.string.ephemeral_setting_on_status);
        }
    }

    public static String A0H(UserJid userJid) {
        StringBuilder A0S = AnonymousClass008.A0S("@");
        String str = userJid.user;
        if (str != null) {
            A0S.append(str);
            return A0S.toString();
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0I(java.io.File r11, long r12, java.security.MessageDigest r14) {
        /*
            boolean r0 = r11.exists()
            r3 = 0
            if (r0 != 0) goto L_0x0008
            return r3
        L_0x0008:
            long r1 = r11.length()
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0011
            return r3
        L_0x0011:
            r14.reset()
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r10]
            r7 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r11)
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0055 }
            r6.<init>(r3)     // Catch:{ all -> 0x0055 }
            r5 = 0
            r4 = 0
        L_0x0026:
            r0 = -1
            if (r4 == r0) goto L_0x003f
            int r4 = r6.read(r9, r5, r10)     // Catch:{ all -> 0x004e }
            if (r4 <= 0) goto L_0x0026
            long r1 = (long) r4     // Catch:{ all -> 0x004e }
            long r1 = r1 + r7
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x003a
            r14.update(r9, r5, r4)     // Catch:{ all -> 0x004e }
            r7 = r1
            goto L_0x0026
        L_0x003a:
            long r12 = r12 - r7
            int r0 = (int) r12     // Catch:{ all -> 0x004e }
            r14.update(r9, r5, r0)     // Catch:{ all -> 0x004e }
        L_0x003f:
            byte[] r0 = r14.digest()     // Catch:{ all -> 0x004e }
            java.lang.String r0 = X.C007603r.A04(r0)     // Catch:{ all -> 0x004e }
            r6.close()
            r3.close()
            return r0
        L_0x004e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0
        L_0x0055:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006803i.A0I(java.io.File, long, java.security.MessageDigest):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0J(java.io.InputStream r5) {
        /*
            if (r5 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            r0 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r0]
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r5)
            java.io.BufferedReader r3 = new java.io.BufferedReader
            r3.<init>(r0)
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x003a }
            r2.<init>()     // Catch:{ all -> 0x003a }
        L_0x0017:
            int r1 = r3.read(r4)     // Catch:{ all -> 0x003a }
            if (r1 >= 0) goto L_0x0025
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x003a }
            r3.close()
            return r0
        L_0x0025:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L_0x0034
            r0 = 0
            r2.write(r4, r0, r1)
            goto L_0x0017
        L_0x0034:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006803i.A0J(java.io.InputStream):java.lang.String");
    }

    public static String A0K(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (str.lastIndexOf(File.separator) > lastIndexOf || lastIndexOf < 0) ? "" : str.substring(lastIndexOf + 1);
    }

    public static String A0L(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf2 > lastIndexOf) {
            lastIndexOf = -1;
        }
        if (lastIndexOf2 < 0) {
            lastIndexOf2 = 0;
        }
        if (lastIndexOf >= 0) {
            return str.substring(lastIndexOf2, lastIndexOf);
        }
        return str.substring(lastIndexOf2);
    }

    public static String A0M(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jid) it.next()).getRawString());
        }
        return TextUtils.join(",", arrayList);
    }

    public static List A0N(Bundle bundle) {
        if (!bundle.containsKey("fMessageKeyJidArray") || !bundle.containsKey("fMessageKeyFromMeArray") || !bundle.containsKey("fMessageKeyIdArray")) {
            return null;
        }
        String[] stringArray = bundle.getStringArray("fMessageKeyIdArray");
        if (stringArray != null) {
            boolean[] booleanArray = bundle.getBooleanArray("fMessageKeyFromMeArray");
            if (booleanArray != null) {
                String[] stringArray2 = bundle.getStringArray("fMessageKeyJidArray");
                if (stringArray2 != null) {
                    int length = stringArray.length;
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        arrayList.add(new C007303n(AnonymousClass02N.A01(stringArray2[i]), booleanArray[i], stringArray[i]));
                    }
                    return arrayList;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static List A0O(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return AnonymousClass1VY.A0G(UserJid.class, Arrays.asList(str.split(",")));
    }

    public static ThreadPoolExecutor A0P(int i, int i2, TimeUnit timeUnit, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, (long) 1, timeUnit, new C05510Ow(), new ThreadFactoryC05520Ox(str));
        threadPoolExecutor.setRejectedExecutionHandler(RejectedExecutionHandlerC29281Xv.A00);
        return threadPoolExecutor;
    }

    public static JSONObject A0Q(InputStream inputStream) {
        String A0J = A0J(inputStream);
        if (A0J != null) {
            return new JSONObject(A0J);
        }
        return null;
    }

    public static void A0R(Activity activity, String str) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, null));
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public static void A0S(Intent intent) {
        String action = intent.getAction();
        if (action != null && action.startsWith("com.whatsapp.intent.action.") && !"gigaset".equalsIgnoreCase(Build.MANUFACTURER)) {
            intent.setPackage("com.whatsapp");
        }
    }

    public static void A0T(Bundle bundle, C007303n r5, String str) {
        String A0K = AnonymousClass008.A0K(str, "fMessageKeyJid");
        String A0K2 = AnonymousClass008.A0K(str, "fMessageKeyFromMe");
        String A0K3 = AnonymousClass008.A0K(str, "fMessageKeyId");
        if (bundle.containsKey(A0K3) || bundle.containsKey(A0K2) || bundle.containsKey(A0K3)) {
            throw new IllegalArgumentException("Bundle already contains key.");
        }
        bundle.putString(A0K3, r5.A01);
        bundle.putBoolean(A0K2, r5.A02);
        bundle.putString(A0K, AnonymousClass1VY.A0D(r5.A00));
    }

    public static void A0U(Bundle bundle, Collection collection) {
        if (bundle.containsKey("fMessageKeyJidArray") || bundle.containsKey("fMessageKeyFromMeArray") || bundle.containsKey("fMessageKeyIdArray")) {
            throw new IllegalArgumentException("Bundle already contains list of keys.");
        }
        String[] strArr = new String[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        String[] strArr2 = new String[collection.size()];
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C007303n r1 = (C007303n) it.next();
            strArr[i] = r1.A01;
            zArr[i] = r1.A02;
            strArr2[i] = AnonymousClass1VY.A0D(r1.A00);
            i++;
        }
        bundle.putStringArray("fMessageKeyIdArray", strArr);
        bundle.putBooleanArray("fMessageKeyFromMeArray", zArr);
        bundle.putStringArray("fMessageKeyJidArray", strArr2);
    }

    public static void A0V(AnonymousClass00C r24, File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            long j = 0;
            for (File file2 : listFiles) {
                j += file2.length();
            }
            if (j > 0) {
                ArrayList arrayList = new ArrayList(Arrays.asList(listFiles));
                Collections.sort(arrayList, C29301Xx.A00);
                long A02 = r24.A02();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file3 = (File) it.next();
                    long lastModified = file3.lastModified();
                    if (currentTimeMillis - lastModified >= 604800000 || j > 20000000 || (j > 2000000 && 50000000 > A02 && A02 > 0)) {
                        long length = file3.length();
                        StringBuilder A0S = AnonymousClass008.A0S("cleanup/");
                        A0S.append(file3.getName());
                        A0S.append(":");
                        A0S.append(currentTimeMillis);
                        A0S.append(" - ");
                        A0S.append(lastModified);
                        A0S.append(" fileLength=");
                        A0S.append(length);
                        A0S.append(" directoryLengthBeforeCleanup=");
                        A0S.append(j);
                        A0S.append(" storageAvailableBeforeCleanup=");
                        A0S.append(A02);
                        Log.i(A0S.toString());
                        if (!file3.delete()) {
                            StringBuilder A0S2 = AnonymousClass008.A0S("cleanup/failed to delete ");
                            A0S2.append(file3.getName());
                            Log.i(A0S2.toString());
                        } else {
                            j -= length;
                            A02 += length;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A0W(AnonymousClass03P r2, Window window, View view) {
        if (Build.MANUFACTURER.equals("OnePlus")) {
            String str = Build.MODEL;
            if ((str.equals("ONEPLUS A6000") || str.equals("ONEPLUS A6003")) && (window.getAttributes().flags & 1024) != 0 && r2.A0H.A00.getPackageManager().hasSystemFeature("com.oneplus.screen.cameranotch")) {
                view.setPadding(0, (int) TypedValue.applyDimension(5, 5.0f, view.getContext().getResources().getDisplayMetrics()), 0, 0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0X(X.C007703s r4, java.io.File r5, java.io.File r6) {
        /*
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r5)
            r4.A06(r3)     // Catch:{ all -> 0x003c }
            java.io.File r0 = r6.getParentFile()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0026
            boolean r2 = r0.mkdirs()     // Catch:{ all -> 0x003c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003c }
            r1.<init>()     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "fileutils/copymedia/parent/mk "
            r1.append(r0)     // Catch:{ all -> 0x003c }
            r1.append(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x003c }
            com.whatsapp.util.Log.d(r0)     // Catch:{ all -> 0x003c }
        L_0x0026:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x003c }
            r1.<init>(r6)     // Catch:{ all -> 0x003c }
            A0d(r3, r1)     // Catch:{ all -> 0x0035 }
            r1.close()
            r3.close()
            return
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006803i.A0X(X.03s, java.io.File, java.io.File):void");
    }

    public static void A0Y(C007703s r2, File file, File file2) {
        if (!file.renameTo(file2)) {
            StringBuilder sb = new StringBuilder("fileutils/moveFile/rename failed, copying and deleting: ");
            sb.append(file);
            sb.append(" -> ");
            sb.append(file2);
            Log.d(sb.toString());
            A0X(r2, file, file2);
            A0m(file);
        }
    }

    public static void A0Z(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }

    public static void A0a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A0a(file2);
                } else {
                    file2.getPath();
                    A0m(file2);
                }
            }
        }
        file.getPath();
        A0m(file);
    }

    public static void A0b(File file, long j) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (System.currentTimeMillis() - file2.lastModified() > j) {
                    StringBuilder A0S = AnonymousClass008.A0S("cleanup/");
                    A0S.append(file2.getName());
                    A0S.append(":");
                    A0S.append(System.currentTimeMillis());
                    A0S.append(" - ");
                    A0S.append(file2.lastModified());
                    Log.i(A0S.toString());
                    if (!file2.delete()) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("cleanup/failed to delete ");
                        A0S2.append(file2.getName());
                        Log.i(A0S2.toString());
                    }
                }
            }
        }
    }

    public static void A0c(File file, String str) {
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null && (r5 = listFiles.length) > 0) {
            for (File file2 : listFiles) {
                StringBuilder A0S = AnonymousClass008.A0S(str);
                A0S.append(file2.getName());
                A0S.append(" ");
                A0S.append(file2.length());
                A0S.append(" drw=");
                String str2 = "1";
                String str3 = "0";
                if (file2.isDirectory()) {
                    str3 = str2;
                }
                A0S.append(str3);
                String str4 = "0";
                if (file2.canRead()) {
                    str4 = str2;
                }
                A0S.append(str4);
                if (!file2.canWrite()) {
                    str2 = "0";
                }
                A0S.append(str2);
                Log.i(A0S.toString());
            }
        }
    }

    public static void A0d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0e(byte[] r2, java.io.File r3) {
        /*
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream
            r1.<init>(r0)
            r1.write(r2)     // Catch:{ all -> 0x0011 }
            r1.close()
            return
        L_0x0011:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0017 }
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006803i.A0e(byte[], java.io.File):void");
    }

    public static boolean A0f() {
        boolean startsWith;
        int i = Build.VERSION.SDK_INT;
        if ((i != 26 && i != 27) || !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
            return false;
        }
        String str = Build.MODEL;
        return str.startsWith("SM-G570") || (startsWith = str.startsWith("SM-J260")) || str.startsWith("SM-G935") || str.startsWith("SM-G930") || str.startsWith("SM-A520") || str.startsWith("SM-A720") || str.startsWith("SM-A260") || str.startsWith("SM-J400") || str.startsWith("SM-J600") || startsWith || str.startsWith("SM-G950");
    }

    public static boolean A0g() {
        String str = Build.MANUFACTURER;
        if (str.equalsIgnoreCase("vestel") && Build.MODEL.equalsIgnoreCase("vsp250s")) {
            return true;
        }
        if (!str.equalsIgnoreCase("asus")) {
            return false;
        }
        String str2 = Build.MODEL;
        return str2.equalsIgnoreCase("ASUS_Z00AD") || str2.equalsIgnoreCase("asus_x00ada") || str2.equalsIgnoreCase("asus_x00adc") || str2.equalsIgnoreCase("asus_t00j") || str2.equalsIgnoreCase("asus_x00ad") || str2.equalsIgnoreCase("asus_x014d") || str2.equalsIgnoreCase("asus_z008d") || str2.equalsIgnoreCase("asus_z00ldd") || str2.equalsIgnoreCase("zb500kl");
    }

    public static boolean A0h() {
        String str = Build.MANUFACTURER;
        if (str.equals("Huawei") && Build.MODEL.equals("Nexus 6P")) {
            return true;
        }
        if (str.equals("Google")) {
            String str2 = Build.MODEL;
            if (str2.equals("Pixel 2") || str2.equals("Pixel 2 XL")) {
                return true;
            }
        }
        return str.equals("Xiaomi") && Build.VERSION.SDK_INT == 27;
    }

    public static boolean A0i() {
        StringBuilder A0S = AnonymousClass008.A0S("AndroidHallOfShame/security-exception Build.MANUFACTURER:");
        A0S.append(Build.MANUFACTURER);
        A0S.append("Build.DEVICE:");
        A0S.append(Build.DEVICE);
        A0S.append(" SDK_INT:");
        AnonymousClass008.A1K(A0S, Build.VERSION.SDK_INT);
        return Build.VERSION.SDK_INT == 22 && Build.MANUFACTURER.equalsIgnoreCase("LAVA");
    }

    public static boolean A0j() {
        return Build.MANUFACTURER.equalsIgnoreCase("Essential Products") && Build.MODEL.equalsIgnoreCase("PH-1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0k(X.AnonymousClass00C r5, java.io.File r6, java.io.File r7, boolean r8) {
        /*
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003b }
            r4.<init>(r6)     // Catch:{ IOException -> 0x003b }
            if (r8 == 0) goto L_0x0010
            X.03T r0 = r5.A05     // Catch:{ all -> 0x0034 }
            X.03t r2 = new X.03t     // Catch:{ all -> 0x0034 }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x0034 }
            goto L_0x0017
        L_0x0010:
            X.03T r0 = r5.A04     // Catch:{ all -> 0x0034 }
            X.03t r2 = new X.03t     // Catch:{ all -> 0x0034 }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x0034 }
        L_0x0017:
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x002d }
        L_0x001b:
            int r0 = r4.read(r1)     // Catch:{ all -> 0x002d }
            if (r0 < 0) goto L_0x0025
            r2.write(r1, r3, r0)     // Catch:{ all -> 0x002d }
            goto L_0x001b
        L_0x0025:
            r0 = 1
            r2.close()
            r4.close()
            return r0
        L_0x002d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0
        L_0x0034:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        L_0x003b:
            r2 = move-exception
            java.lang.String r0 = "fileutils/copyfile/failed to copy "
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            if (r8 == 0) goto L_0x0051
            java.lang.String r0 = "external file"
        L_0x0046:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        L_0x0051:
            java.lang.String r0 = "internal file"
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006803i.A0k(X.00C, java.io.File, java.io.File, boolean):boolean");
    }

    public static boolean A0l(AnonymousClass03P r4, AnonymousClass03S r5, Uri uri, boolean z) {
        String scheme = uri.getScheme();
        boolean z2 = true;
        if ("settings".equals(uri.getAuthority()) || (!"file".equals(scheme) && !"content".equals(scheme))) {
            return true;
        }
        InputStream inputStream = null;
        try {
            ContentResolver A06 = r4.A06();
            if (A06 == null) {
                Log.w("file-utils/ringtone-available/false cr=null");
                z2 = false;
            } else {
                inputStream = A06.openInputStream(uri);
            }
            A0Z(inputStream);
            return z2;
        } catch (SQLiteException | FileNotFoundException | NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("file-utils/ringtone-available/false/file-not-found ");
            sb.append(uri.toString());
            Log.i(sb.toString(), e);
            return false;
        } catch (IllegalStateException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("file-utils/ringtone-available/false/illegal-state ");
            sb2.append(uri.toString());
            Log.i(sb2.toString(), e2);
            return false;
        } catch (SecurityException e3) {
            if (!uri.toString().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString()) || r5.A06()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("file-utils/ringtone-available/true/cannot-check ");
                sb3.append(uri.toString());
                Log.i(sb3.toString(), e3);
                return true;
            }
            Log.i("file-utils/ringtone-available/false/access-denied", e3);
            return z;
        }
    }

    public static boolean A0m(File file) {
        if (!file.exists() || file.delete()) {
            return true;
        }
        StringBuilder sb = new StringBuilder("file-utils/delete-file/failed ");
        sb.append(file);
        Log.w(sb.toString());
        return false;
    }

    public static boolean A0n(File file) {
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (!A0n(file2)) {
                            return false;
                        }
                    }
                }
            } catch (OutOfMemoryError e) {
                StringBuilder A0S = AnonymousClass008.A0S("trash/delete-recursive/out-of-memory ");
                A0S.append(file.getAbsolutePath());
                Log.e(A0S.toString(), e);
                return false;
            }
        }
        return file.delete();
    }

    public static boolean A0o(File file) {
        String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            if (file.isDirectory()) {
                StringBuilder sb = new StringBuilder("FileUtils/prepareEmptyDir/Directory already exists unexpectedly! Cleaning up. ");
                sb.append(absolutePath);
                Log.e(sb.toString());
                A0b(file, -1);
                return true;
            }
            AnonymousClass008.A17("FileUtils/prepareEmptyDir/Directory already exists unexpectedly and is a file! Wrong call.", absolutePath);
            return false;
        } else if (file.mkdirs()) {
            return true;
        } else {
            AnonymousClass008.A17("FileUtils/prepareEmptyDir/Could not make directory ", absolutePath);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0p(java.io.InputStream r5, java.io.File r6) {
        /*
            r4 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0026 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0026 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0026 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0026 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x001f }
        L_0x000f:
            int r1 = r5.read(r2)     // Catch:{ all -> 0x001f }
            r0 = -1
            if (r1 == r0) goto L_0x001a
            r3.write(r2, r4, r1)     // Catch:{ all -> 0x001f }
            goto L_0x000f
        L_0x001a:
            r3.close()
            r0 = 1
            return r0
        L_0x001f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0
        L_0x0026:
            r2 = move-exception
            java.lang.String r0 = "FileUtils/saveInputStreamToFile/could not save file to:"
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            java.lang.String r0 = r6.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006803i.A0p(java.io.InputStream, java.io.File):boolean");
    }

    public static boolean A0q(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean A0r(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            AnonymousClass00E.A08(false, "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier");
        }
        return str.contains("android.permission.UPDATE_APP_OPS_STATS");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A0s(java.io.InputStream r5) {
        /*
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r4]
            int r0 = r5.available()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r0)
        L_0x000d:
            r1 = 0
            int r0 = r5.read(r3, r1, r4)     // Catch:{ all -> 0x0023 }
            if (r0 >= 0) goto L_0x001f
            r2.flush()     // Catch:{ all -> 0x0023 }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x0023 }
            r2.close()
            return r0
        L_0x001f:
            r2.write(r3, r1, r0)
            goto L_0x000d
        L_0x0023:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006803i.A0s(java.io.InputStream):byte[]");
    }

    public static long[] A0t(File file) {
        long[] jArr = {0, 0};
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    jArr[0] = file2.length() + jArr[0];
                    jArr[1] = jArr[1] + 1;
                } else if (file2.isDirectory()) {
                    long[] A0t = A0t(file2);
                    jArr[0] = jArr[0] + A0t[0];
                    jArr[1] = jArr[1] + A0t[1];
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("mediafoldersize listedFiles is null for folder ");
            sb.append(file);
            Log.w(sb.toString());
        }
        return jArr;
    }
}
