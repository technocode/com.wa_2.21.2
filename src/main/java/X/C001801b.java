package X;

import android.app.Notification;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.facebook.soloader.SysUtil$LollipopSysdeps;
import com.google.android.search.verification.client.R;
import com.whatsapp.MediaData;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.01b  reason: invalid class name and case insensitive filesystem */
public class C001801b {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static volatile DateFormat A03;
    public static volatile DateFormat A04;
    public static volatile DateFormat[] A05;

    public static String A0M() {
        return null;
    }

    public static String A0N() {
        return null;
    }

    public static String A0O() {
        return null;
    }

    public static String A0P() {
        return null;
    }

    public static String A0Q() {
        return null;
    }

    public static String A0R() {
        return null;
    }

    public static String A0S() {
        return null;
    }

    public static String A0T() {
        return null;
    }

    public static String A0U() {
        return null;
    }

    public static ArrayList A1E(int i, HashMap hashMap, ArrayList arrayList, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(str);
        return arrayList2;
    }

    public static boolean A1i(int i) {
        return i == -2 || i == -1 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 9 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17 || i == 20 || i == 21 || i == 27 || i == 29 || i == 30 || i == 31 || i == 32 || i == 33 || i == 51 || i == 52 || i == 53 || i == 54 || i == 56;
    }

    public static boolean A1j(int i) {
        return i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 34 || i == 35 || i == 36 || i == 46 || i == 47 || i == 48 || i == 49 || i == 50 || i == 55;
    }

    public static boolean A1k(int i) {
        return i == 37 || i == 39 || i == 40 || i == 41 || i == 42 || i == 43 || i == 44 || i == 45;
    }

    public static int A00(AnonymousClass03B r3) {
        if (r3.A04()) {
            return 120;
        }
        return (int) ((System.currentTimeMillis() - 1610555627000L) / 86400000);
    }

    public static long A01(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        A1X(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    public static long A02(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        A1X(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static Bundle A03(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        synchronized (C14570mV.A02) {
            if (C14570mV.A01) {
                return null;
            }
            try {
                Field field = C14570mV.A00;
                if (field == null) {
                    field = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(field.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        C14570mV.A01 = true;
                        return null;
                    }
                    field.setAccessible(true);
                    C14570mV.A00 = field;
                }
                Bundle bundle = (Bundle) field.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    C14570mV.A00.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                C14570mV.A01 = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                C14570mV.A01 = true;
                return null;
            }
        }
    }

    public static C004101y A04(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C004101y r4 = new C004101y();
                    r4.A01 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    r4.A00 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return r4;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder A0S = AnonymousClass008.A0S("File too short to be a zip file: ");
        A0S.append(randomAccessFile.length());
        throw new ZipException(A0S.toString());
    }

    public static C05350Oe A05(AnonymousClass0PU r5, AnonymousClass0PU r6) {
        HashSet hashSet = new HashSet();
        Iterator it = r5.A02().iterator();
        while (true) {
            C28351Tz r1 = (C28351Tz) it;
            if (!r1.hasNext()) {
                return new C05350Oe(hashSet, null);
            }
            Object next = r1.next();
            Map map = r6.A00;
            if (!map.containsKey(next) || map.get(next) != r5.A00.get(next)) {
                hashSet.add(next);
            }
        }
    }

    public static C05350Oe A06(AnonymousClass0PU r5, AnonymousClass0PU r6) {
        HashSet hashSet = new HashSet();
        Iterator it = r6.A02().iterator();
        while (true) {
            C28351Tz r1 = (C28351Tz) it;
            if (!r1.hasNext()) {
                return new C05350Oe(hashSet, null);
            }
            Object next = r1.next();
            Map map = r5.A00;
            if (!map.containsKey(next) || map.get(next) != r6.A00.get(next)) {
                hashSet.add(next);
            }
        }
    }

    public static AnonymousClass1UC A07() {
        C11600gc A022 = C11580gY.A00().A02();
        return new AnonymousClass1UC(new C05770Qa(A022.A01, (byte) 5), new AnonymousClass1UD(A022.A00, (byte) 5));
    }

    public static C05770Qa A08(byte[] bArr) {
        if (bArr.length > 0) {
            int i = bArr[0] & 255;
            if (i == 5) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 1, bArr2, 0, 32);
                return new C05770Qa(bArr2, (byte) 5);
            }
            throw new AnonymousClass1UK(AnonymousClass008.A0F("Bad key type: ", i));
        }
        throw new AnonymousClass1UK("Invalid byte array");
    }

    public static AnonymousClass1UJ A09() {
        AnonymousClass1UC A07 = A07();
        return new AnonymousClass1UJ(new AnonymousClass0QZ(A07.A01), A07.A00);
    }

    public static AnonymousClass0E6 A0A(DeviceJid deviceJid) {
        AnonymousClass00E.A04(deviceJid, "Provided jid must not be null");
        String str = deviceJid.user;
        AnonymousClass00E.A04(str, "User part of provided jid must not be null");
        return new AnonymousClass0E6(str, deviceJid.device);
    }

    public static AnonymousClass1UQ A0B(AnonymousClass1UJ r5, int i, long j) {
        AnonymousClass1UC A07 = A07();
        return new AnonymousClass1UQ(i, j, A07, A1t(r5.A00, A07.A01.A00()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015d, code lost:
        if (r6 == 3) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0059, code lost:
        if (r9 > 20) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C007003k A0C(android.database.Cursor r15) {
        /*
        // Method dump skipped, instructions count: 473
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001801b.A0C(android.database.Cursor):X.03k");
    }

    public static AnonymousClass0BK A0D(SQLiteDatabase sQLiteDatabase, AnonymousClass04q r2) {
        com.whatsapp.util.Log.i("DatabaseUtils/initDatabase/injected sql log writer/using modified LoggableSQLiteDatabase");
        return new AnonymousClass0BK(sQLiteDatabase, r2);
    }

    public static AnonymousClass1VN A0E(String str, String str2, ContentValues contentValues, String str3, String[] strArr, int i, long j, long j2) {
        return new C43811yz(str, str2, contentValues, str3, strArr, i, j, j2);
    }

    public static AnonymousClass1VN A0F(String str, String str2, String[] strArr, long j, long j2) {
        return new C43821z0(str, str2, strArr, j, j2);
    }

    public static DeviceJid A0G(AnonymousClass0E6 r2) {
        try {
            return DeviceJid.getFromUserJidAndDeviceId(UserJid.getFromIdentifier(r2.A01), r2.A00);
        } catch (AnonymousClass02Y unused) {
            StringBuilder sb = new StringBuilder("Invalid signal protocol address: ");
            sb.append(r2);
            com.whatsapp.util.Log.e(sb.toString());
            return null;
        }
    }

    public static AnonymousClass1XN A0H(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        arrayList.add(new AnonymousClass1XM(jSONObject2.optString("id"), jSONObject2.optString("displayText"), jSONObject2.optBoolean("selected")));
                    }
                }
                return new AnonymousClass1XN(jSONObject.optString("content"), jSONObject.optString("footer"), arrayList);
            } catch (JSONException e) {
                com.whatsapp.util.Log.w("ButtonsConverter/parseJSON/deserialization error", e);
                return null;
            }
        } else {
            throw null;
        }
    }

    public static AnonymousClass1XQ A0I(AnonymousClass1UQ r4) {
        AnonymousClass2BD r1 = r4.A00;
        return new AnonymousClass1XQ(C05360Of.A05(r1.A01), r4.A00().A01.A01, r1.A05.A01());
    }

    public static AnonymousClass1XT A0J(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("description");
            String optString3 = jSONObject.optString("buttonText");
            JSONArray optJSONArray = jSONObject.optJSONArray("sections");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("items");
                    String optString4 = jSONObject2.optString("title");
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                            arrayList2.add(new AnonymousClass1XR(jSONObject3.optString("id"), jSONObject3.optString("title"), jSONObject3.optString("description")));
                        }
                    }
                    arrayList.add(new AnonymousClass1XS(optString4, arrayList2));
                }
            }
            return new AnonymousClass1XT(optString, optString2, optString3, arrayList, jSONObject.optInt("selectListType"));
        } catch (JSONException e) {
            com.whatsapp.util.Log.w("SelectListConverter/parseJSON/deserialization error", e);
            return null;
        }
    }

    public static File A0K(Context context) {
        File file = new File(context.getCacheDir(), "minidumps");
        if (file.exists() && file.isDirectory()) {
            return file;
        }
        if (file.exists()) {
            file.delete();
        }
        if (file.mkdirs()) {
            return file;
        }
        StringBuilder sb = new StringBuilder("Breakpad init failed to create crash directory: ");
        sb.append(file);
        throw new RuntimeException(sb.toString());
    }

    public static Object A0L(Object obj, AnonymousClass03R r4) {
        AnonymousClass0M4 r1;
        File file;
        MediaData mediaData;
        File file2;
        if ((obj instanceof MediaData) && (file2 = (mediaData = (MediaData) obj).file) != null && file2.isAbsolute()) {
            MediaData mediaData2 = new MediaData(mediaData);
            mediaData2.autodownloadRetryEnabled = mediaData.autodownloadRetryEnabled;
            mediaData2.progress = mediaData.progress;
            mediaData2.A00 = mediaData.A00;
            mediaData2.transcoded = mediaData.transcoded;
            mediaData2.trimFrom = mediaData.trimFrom;
            mediaData2.trimTo = mediaData.trimTo;
            mediaData2.hasStreamingSidecar = mediaData.hasStreamingSidecar;
            mediaData2.file = new File(r4.A02.toURI().relativize(mediaData2.file.toURI()).getPath());
            return mediaData2;
        } else if (!(obj instanceof AnonymousClass0M4) || (file = (r1 = (AnonymousClass0M4) obj).A0F) == null || !file.isAbsolute()) {
            return obj;
        } else {
            MediaData A012 = r1.A01();
            A012.file = new File(r4.A02.toURI().relativize(A012.file.toURI()).getPath());
            return A012;
        }
    }

    public static String A0V(Context context) {
        return context.getString(R.string.app_name);
    }

    public static String A0W(Cursor cursor) {
        try {
            return cursor.getString(0);
        } catch (SQLiteDatabaseCorruptException e) {
            com.whatsapp.util.Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading jids", e);
            throw e;
        } catch (SQLiteException e2) {
            if (e2.getMessage() == null || !e2.getMessage().contains("Unable to convert BLOB to string")) {
                com.whatsapp.util.Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading jids", e2);
                throw e2;
            }
            byte[] blob = cursor.getBlob(0);
            if (blob == null) {
                return null;
            }
            try {
                String str = new String(blob, "UTF-8");
                StringBuilder sb = new StringBuilder();
                sb.append("DatabaseUtils/tryGetStringOrGetBlob/converting from blob; rawJids=");
                sb.append(str);
                com.whatsapp.util.Log.i(sb.toString());
                return str;
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
    }

    public static String A0X(AnonymousClass0CO r1, String str, String str2) {
        try {
            return r1.A02(Integer.parseInt(str), str2);
        } catch (IOException e) {
            com.whatsapp.util.Log.e("phonenumberutils/trim/error", e);
            return str2;
        }
    }

    public static String A0Y(AnonymousClass01X r2) {
        return A19(r2.A0I(), r2.A05(270));
    }

    public static String A0Z(AnonymousClass01X r2) {
        return A19(r2.A0I(), r2.A05(294));
    }

    public static String A0a(AnonymousClass01X r1, long j) {
        return A1B(r1).format(new Date(j));
    }

    public static String A0b(AnonymousClass01X r3, long j) {
        String A052;
        DateFormat dateFormat = r3.A03;
        if (dateFormat == null) {
            Locale A0I = r3.A0I();
            if (Build.VERSION.SDK_INT >= 18) {
                A052 = android.text.format.DateFormat.getBestDateTimePattern(A0I, "MMMd");
            } else {
                A052 = r3.A05(170);
            }
            dateFormat = new SimpleDateFormat(A052, A0I);
            r3.A03 = dateFormat;
        }
        return ((DateFormat) dateFormat.clone()).format(new Date(j));
    }

    public static String A0c(AnonymousClass01X r1, long j) {
        return A1C(r1).format(new Date(j));
    }

    public static String A0d(AnonymousClass01X r1, long j) {
        return A1D(r1, 0).format(new Date(j));
    }

    public static String A0e(AnonymousClass01X r2, long j) {
        if (A03 == null) {
            A03 = DateFormat.getDateInstance(3, r2.A0I());
        }
        return ((DateFormat) A03.clone()).format(new Date(j));
    }

    public static String A0f(AnonymousClass01X r1, long j, int i) {
        return A1D(r1, i).format(new Date(j));
    }

    public static String A0g(AnonymousClass1XT r14) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("title", r14.A03);
            jSONObject2.put("description", r14.A02);
            jSONObject2.put("buttonText", r14.A01);
            jSONObject2.put("selectListType", r14.A00);
            JSONArray jSONArray = new JSONArray();
            for (AnonymousClass1XS r1 : r14.A04) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("title", r1.A00);
                JSONArray jSONArray2 = new JSONArray();
                for (AnonymousClass1XR r3 : r1.A01) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("id", r3.A01);
                    jSONObject4.put("title", r3.A02);
                    jSONObject4.put("description", r3.A00);
                    jSONArray2.put(jSONObject4);
                }
                jSONObject3.put("items", jSONArray2);
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put("sections", jSONArray);
            jSONObject = jSONObject2;
        } catch (JSONException e) {
            com.whatsapp.util.Log.w("SelectListConverter/toJSONObject/serialization error", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    public static String A0h(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0i(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0j(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0k(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0l(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0m(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0n(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0o(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0p(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0q(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0r(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0s(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0t(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0u(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0v(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0w(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0x(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0y(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A0z(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A10(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A11(Integer num) {
        if (num == null) {
            return null;
        }
        return num.toString();
    }

    public static String A12(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(str.replaceAll("\\D", ""));
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static String A13(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\D", "");
    }

    public static String A14(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("select") || lowerCase.startsWith("delete")) {
            return A16(lowerCase, " from ", " ");
        }
        if (lowerCase.startsWith("insert")) {
            return A16(lowerCase, " into ", "(");
        }
        if (lowerCase.startsWith("update")) {
            return A16(lowerCase, "update ", " ");
        }
        return null;
    }

    public static String A15(String str, ContentValues contentValues, String str2, boolean z) {
        int i;
        String str3;
        StringBuilder sb = new StringBuilder("INSERT");
        sb.append(str2);
        sb.append(" INTO ");
        sb.append(str);
        sb.append('(');
        int i2 = 0;
        if (contentValues != null) {
            i = contentValues.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            Object[] objArr = new Object[i];
            Iterator it = new TreeSet(contentValues.keySet()).iterator();
            int i3 = 0;
            while (true) {
                str3 = ", ";
                if (!it.hasNext()) {
                    break;
                }
                String str4 = (String) it.next();
                if (i3 <= 0) {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(str4);
                int i4 = i3 + 1;
                objArr[i3] = z ? contentValues.get(str4) : "?";
                i3 = i4;
            }
            sb.append(')');
            sb.append(" VALUES (");
            loop1:
            while (true) {
                String str5 = objArr[i2];
                while (true) {
                    sb.append(str5);
                    i2++;
                    if (i2 >= i) {
                        break loop1;
                    } else if (i2 > 0) {
                        StringBuilder A0S = AnonymousClass008.A0S(str3);
                        A0S.append(objArr[i2]);
                        str5 = A0S.toString();
                    }
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static String A16(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        int length = str2.length() + indexOf;
        int indexOf2 = str.indexOf(str3, length);
        if (indexOf2 == -1) {
            return str.substring(length).trim();
        }
        return str.substring(length, indexOf2).trim();
    }

    public static String A17(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (strArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        for (String str2 : strArr) {
            if (str2 == null) {
                str2 = "NULL";
            } else {
                boolean z = true;
                try {
                    if (str2.contains(".")) {
                        Double.parseDouble(str2);
                    } else {
                        Long.parseLong(str2);
                    }
                } catch (Exception unused) {
                    z = false;
                }
                if (!z) {
                    str2 = AnonymousClass008.A0L("'", str2, "'");
                }
            }
            int indexOf = sb.indexOf("?", i);
            if (indexOf == -1) {
                break;
            }
            sb.delete(indexOf, indexOf + 1);
            sb.insert(indexOf, str2);
            i = indexOf + str2.length();
        }
        return sb.toString();
    }

    public static String A18(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jid) it.next()).getRawString());
        }
        Collections.sort(arrayList);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA256");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                instance.update(((String) it2.next()).getBytes());
            }
            byte[] digest = instance.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder sb = new StringBuilder("2:");
            sb.append(Base64.encodeToString(bArr, 2));
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r3 == 105) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A19(java.util.Locale r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001801b.A19(java.util.Locale, java.lang.String):java.lang.String");
    }

    public static DateFormat A1A(AnonymousClass01X r1) {
        return A1D(r1, 0);
    }

    public static DateFormat A1B(AnonymousClass01X r5) {
        SimpleDateFormat simpleDateFormat;
        DateFormat dateFormat = r5.A02;
        SimpleDateFormat simpleDateFormat2 = dateFormat;
        if (dateFormat == null) {
            Locale A0I = r5.A0I();
            String A052 = r5.A05(173);
            if (A052.contains("MMMM")) {
                String[] A012 = AbstractC12580iK.A01(r5, 0);
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A052, A0I);
                DateFormatSymbols dateFormatSymbols = simpleDateFormat3.getDateFormatSymbols();
                dateFormatSymbols.setMonths(A012);
                simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols);
                simpleDateFormat = simpleDateFormat3;
            } else if (A052.contains("LLLL")) {
                String replace = A052.replace("LLLL", "MMMM");
                String[] A002 = AbstractC12580iK.A00(r5);
                SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(replace, A0I);
                DateFormatSymbols dateFormatSymbols2 = simpleDateFormat4.getDateFormatSymbols();
                dateFormatSymbols2.setMonths(A002);
                simpleDateFormat4.setDateFormatSymbols(dateFormatSymbols2);
                simpleDateFormat = simpleDateFormat4;
            } else {
                simpleDateFormat = new SimpleDateFormat(A052, A0I);
            }
            r5.A02 = simpleDateFormat;
            simpleDateFormat2 = simpleDateFormat;
        }
        return (DateFormat) simpleDateFormat2.clone();
    }

    public static DateFormat A1C(AnonymousClass01X r2) {
        if (A04 == null) {
            A04 = DateFormat.getDateInstance(2, r2.A0I());
        }
        return (DateFormat) A04.clone();
    }

    public static DateFormat A1D(AnonymousClass01X r7, int i) {
        if (A05 == null) {
            Locale A0I = r7.A0I();
            String A052 = r7.A05(169);
            String[] A012 = AbstractC12580iK.A01(r7, 0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(A052, A0I);
            DateFormatSymbols dateFormatSymbols = simpleDateFormat.getDateFormatSymbols();
            dateFormatSymbols.setMonths(A012);
            simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
            String[] A013 = AbstractC12580iK.A01(r7, 1);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(A052, A0I);
            DateFormatSymbols dateFormatSymbols2 = simpleDateFormat2.getDateFormatSymbols();
            dateFormatSymbols2.setMonths(A013);
            simpleDateFormat2.setDateFormatSymbols(dateFormatSymbols2);
            String[] A014 = AbstractC12580iK.A01(r7, 2);
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A052, A0I);
            DateFormatSymbols dateFormatSymbols3 = simpleDateFormat3.getDateFormatSymbols();
            dateFormatSymbols3.setMonths(A014);
            simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols3);
            A05 = new SimpleDateFormat[]{simpleDateFormat, simpleDateFormat2, simpleDateFormat3};
        }
        return (DateFormat) A05[i].clone();
    }

    public static List A1F(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(A0G((AnonymousClass0E6) it.next()));
        }
        return arrayList;
    }

    public static List A1G(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(A0A((DeviceJid) it.next()));
        }
        return arrayList;
    }

    public static Map A1H() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        hashMap.put(7, arrayList2);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("EG");
        hashMap.put(43, A1E(41, hashMap, A1E(40, hashMap, A1E(39, hashMap, A1E(36, hashMap, A1E(34, hashMap, A1E(33, hashMap, A1E(32, hashMap, A1E(31, hashMap, A1E(30, hashMap, A1E(27, hashMap, A1E(20, hashMap, arrayList3, "ZA"), "GR"), "NL"), "BE"), "FR"), "ES"), "HU"), "IT"), "RO"), "CH"), "AT"));
        ArrayList arrayList4 = new ArrayList(4);
        arrayList4.add("GB");
        arrayList4.add("GG");
        arrayList4.add("IM");
        arrayList4.add("JE");
        hashMap.put(44, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("DK");
        hashMap.put(46, A1E(45, hashMap, arrayList5, "SE"));
        ArrayList arrayList6 = new ArrayList(2);
        arrayList6.add("NO");
        arrayList6.add("SJ");
        hashMap.put(60, A1E(58, hashMap, A1E(57, hashMap, A1E(56, hashMap, A1E(55, hashMap, A1E(54, hashMap, A1E(53, hashMap, A1E(52, hashMap, A1E(51, hashMap, A1E(49, hashMap, A1E(48, hashMap, A1E(47, hashMap, arrayList6, "PL"), "DE"), "PE"), "MX"), "CU"), "AR"), "BR"), "CL"), "CO"), "VE"), "MY"));
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add("AU");
        arrayList7.add("CC");
        arrayList7.add("CX");
        hashMap.put(61, arrayList7);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ID");
        hashMap.put(62, arrayList8);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("PH");
        hashMap.put(63, arrayList9);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("NZ");
        hashMap.put(64, arrayList10);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("SG");
        hashMap.put(65, arrayList11);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TH");
        hashMap.put(66, arrayList12);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("JP");
        hashMap.put(81, arrayList13);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add("KR");
        hashMap.put(82, arrayList14);
        ArrayList arrayList15 = new ArrayList(1);
        arrayList15.add("VN");
        hashMap.put(84, arrayList15);
        ArrayList arrayList16 = new ArrayList(1);
        arrayList16.add("CN");
        hashMap.put(86, arrayList16);
        ArrayList arrayList17 = new ArrayList(1);
        arrayList17.add("TR");
        hashMap.put(90, arrayList17);
        ArrayList arrayList18 = new ArrayList(1);
        arrayList18.add("IN");
        hashMap.put(91, arrayList18);
        ArrayList arrayList19 = new ArrayList(1);
        arrayList19.add("PK");
        hashMap.put(92, arrayList19);
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add("AF");
        hashMap.put(93, arrayList20);
        ArrayList arrayList21 = new ArrayList(1);
        arrayList21.add("LK");
        hashMap.put(94, arrayList21);
        ArrayList arrayList22 = new ArrayList(1);
        arrayList22.add("MM");
        hashMap.put(95, arrayList22);
        ArrayList arrayList23 = new ArrayList(1);
        arrayList23.add("IR");
        hashMap.put(98, arrayList23);
        ArrayList arrayList24 = new ArrayList(1);
        arrayList24.add("SS");
        hashMap.put(211, arrayList24);
        ArrayList arrayList25 = new ArrayList(2);
        arrayList25.add("MA");
        arrayList25.add("EH");
        hashMap.put(212, arrayList25);
        ArrayList arrayList26 = new ArrayList(1);
        arrayList26.add("DZ");
        hashMap.put(261, A1E(260, hashMap, A1E(258, hashMap, A1E(257, hashMap, A1E(256, hashMap, A1E(255, hashMap, A1E(254, hashMap, A1E(253, hashMap, A1E(252, hashMap, A1E(251, hashMap, A1E(250, hashMap, A1E(249, hashMap, A1E(248, hashMap, A1E(247, hashMap, A1E(246, hashMap, A1E(245, hashMap, A1E(244, hashMap, A1E(243, hashMap, A1E(242, hashMap, A1E(241, hashMap, A1E(240, hashMap, A1E(239, hashMap, A1E(238, hashMap, A1E(237, hashMap, A1E(236, hashMap, A1E(235, hashMap, A1E(234, hashMap, A1E(233, hashMap, A1E(232, hashMap, A1E(231, hashMap, A1E(230, hashMap, A1E(229, hashMap, A1E(228, hashMap, A1E(227, hashMap, A1E(226, hashMap, A1E(225, hashMap, A1E(224, hashMap, A1E(223, hashMap, A1E(222, hashMap, A1E(221, hashMap, A1E(220, hashMap, A1E(218, hashMap, A1E(216, hashMap, A1E(213, hashMap, arrayList26, "TN"), "LY"), "GM"), "SN"), "MR"), "ML"), "GN"), "CI"), "BF"), "NE"), "TG"), "BJ"), "MU"), "LR"), "SL"), "GH"), "NG"), "TD"), "CF"), "CM"), "CV"), "ST"), "GQ"), "GA"), "CG"), "CD"), "AO"), "GW"), "IO"), "AC"), "SC"), "SD"), "RW"), "ET"), "SO"), "DJ"), "KE"), "TZ"), "UG"), "BI"), "MZ"), "ZM"), "MG"));
        ArrayList arrayList27 = new ArrayList(2);
        arrayList27.add("RE");
        arrayList27.add("YT");
        hashMap.put(357, A1E(356, hashMap, A1E(355, hashMap, A1E(354, hashMap, A1E(353, hashMap, A1E(352, hashMap, A1E(351, hashMap, A1E(350, hashMap, A1E(299, hashMap, A1E(298, hashMap, A1E(297, hashMap, A1E(291, hashMap, A1E(290, hashMap, A1E(269, hashMap, A1E(268, hashMap, A1E(267, hashMap, A1E(266, hashMap, A1E(265, hashMap, A1E(264, hashMap, A1E(263, hashMap, A1E(262, hashMap, arrayList27, "ZW"), "NA"), "MW"), "LS"), "BW"), "SZ"), "KM"), "SH"), "ER"), "AW"), "FO"), "GL"), "GI"), "PT"), "LU"), "IE"), "IS"), "AL"), "MT"), "CY"));
        ArrayList arrayList28 = new ArrayList(2);
        arrayList28.add("FI");
        arrayList28.add("AX");
        hashMap.put(509, A1E(508, hashMap, A1E(507, hashMap, A1E(506, hashMap, A1E(505, hashMap, A1E(504, hashMap, A1E(503, hashMap, A1E(502, hashMap, A1E(501, hashMap, A1E(500, hashMap, A1E(423, hashMap, A1E(421, hashMap, A1E(420, hashMap, A1E(389, hashMap, A1E(387, hashMap, A1E(386, hashMap, A1E(385, hashMap, A1E(382, hashMap, A1E(381, hashMap, A1E(380, hashMap, A1E(379, hashMap, A1E(378, hashMap, A1E(377, hashMap, A1E(376, hashMap, A1E(375, hashMap, A1E(374, hashMap, A1E(373, hashMap, A1E(372, hashMap, A1E(371, hashMap, A1E(370, hashMap, A1E(359, hashMap, A1E(358, hashMap, arrayList28, "BG"), "LT"), "LV"), "EE"), "MD"), "AM"), "BY"), "AD"), "MC"), "SM"), "VA"), "UA"), "RS"), "ME"), "HR"), "SI"), "BA"), "MK"), "CZ"), "SK"), "LI"), "FK"), "BZ"), "GT"), "SV"), "HN"), "NI"), "CR"), "PA"), "PM"), "HT"));
        ArrayList arrayList29 = new ArrayList(3);
        arrayList29.add("GP");
        arrayList29.add("BL");
        arrayList29.add("MF");
        hashMap.put(590, arrayList29);
        ArrayList arrayList30 = new ArrayList(1);
        arrayList30.add("BO");
        hashMap.put(591, arrayList30);
        ArrayList arrayList31 = new ArrayList(1);
        arrayList31.add("GY");
        hashMap.put(592, arrayList31);
        ArrayList arrayList32 = new ArrayList(1);
        arrayList32.add("EC");
        hashMap.put(593, arrayList32);
        ArrayList arrayList33 = new ArrayList(1);
        arrayList33.add("GF");
        hashMap.put(594, arrayList33);
        ArrayList arrayList34 = new ArrayList(1);
        arrayList34.add("PY");
        hashMap.put(595, arrayList34);
        ArrayList arrayList35 = new ArrayList(1);
        arrayList35.add("MQ");
        hashMap.put(596, arrayList35);
        ArrayList arrayList36 = new ArrayList(1);
        arrayList36.add("SR");
        hashMap.put(597, arrayList36);
        ArrayList arrayList37 = new ArrayList(1);
        arrayList37.add("UY");
        hashMap.put(598, arrayList37);
        ArrayList arrayList38 = new ArrayList(2);
        arrayList38.add("CW");
        arrayList38.add("BQ");
        hashMap.put(599, arrayList38);
        ArrayList arrayList39 = new ArrayList(1);
        arrayList39.add("TL");
        hashMap.put(998, A1E(996, hashMap, A1E(995, hashMap, A1E(994, hashMap, A1E(993, hashMap, A1E(992, hashMap, A1E(979, hashMap, A1E(977, hashMap, A1E(976, hashMap, A1E(975, hashMap, A1E(974, hashMap, A1E(973, hashMap, A1E(972, hashMap, A1E(971, hashMap, A1E(970, hashMap, A1E(968, hashMap, A1E(967, hashMap, A1E(966, hashMap, A1E(965, hashMap, A1E(964, hashMap, A1E(963, hashMap, A1E(962, hashMap, A1E(961, hashMap, A1E(960, hashMap, A1E(888, hashMap, A1E(886, hashMap, A1E(883, hashMap, A1E(882, hashMap, A1E(881, hashMap, A1E(880, hashMap, A1E(878, hashMap, A1E(870, hashMap, A1E(856, hashMap, A1E(855, hashMap, A1E(853, hashMap, A1E(852, hashMap, A1E(850, hashMap, A1E(808, hashMap, A1E(800, hashMap, A1E(692, hashMap, A1E(691, hashMap, A1E(690, hashMap, A1E(689, hashMap, A1E(688, hashMap, A1E(687, hashMap, A1E(686, hashMap, A1E(685, hashMap, A1E(683, hashMap, A1E(682, hashMap, A1E(681, hashMap, A1E(680, hashMap, A1E(679, hashMap, A1E(678, hashMap, A1E(677, hashMap, A1E(676, hashMap, A1E(675, hashMap, A1E(674, hashMap, A1E(673, hashMap, A1E(672, hashMap, A1E(670, hashMap, arrayList39, "NF"), "BN"), "NR"), "PG"), "TO"), "SB"), "VU"), "FJ"), "PW"), "WF"), "CK"), "NU"), "WS"), "KI"), "NC"), "TV"), "PF"), "TK"), "FM"), "MH"), "001"), "001"), "KP"), "HK"), "MO"), "KH"), "LA"), "001"), "001"), "BD"), "001"), "001"), "001"), "TW"), "001"), "MV"), "LB"), "JO"), "SY"), "IQ"), "KW"), "SA"), "YE"), "OM"), "PS"), "AE"), "IL"), "BH"), "QA"), "BT"), "MN"), "NP"), "001"), "TJ"), "TM"), "AZ"), "GE"), "KG"), "UZ"));
        return hashMap;
    }

    public static Map A1I(AnonymousClass009 r9, Map map, Map map2, List list, int i) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            DeviceJid deviceJid = (DeviceJid) entry.getKey();
            Number number = (Number) entry.getValue();
            if (deviceJid.isPrimary() || list.contains(Integer.valueOf(number.intValue()))) {
                hashMap.put(deviceJid, number);
            } else {
                StringBuilder sb = new StringBuilder("key index is not found in valid indexes, jid=");
                sb.append(deviceJid);
                sb.append("; index=");
                sb.append(number);
                r9.A04("adv-data-error", sb.toString(), true);
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            Number number2 = (Number) entry2.getValue();
            long longValue = number2.longValue();
            if (longValue > ((long) i)) {
                hashMap.put(key, number2);
            } else if (map2.containsKey(key) && ((Number) map2.get(key)).longValue() < longValue && list.contains(Integer.valueOf(number2.intValue()))) {
                StringBuilder sb2 = new StringBuilder("DevicesUtil/filterDeviceWithKeyIndexList/larger index exists in current map, jid=");
                sb2.append(key);
                sb2.append("; index=");
                sb2.append(number2);
                com.whatsapp.util.Log.i(sb2.toString());
                hashMap.put(key, number2);
            }
        }
        return hashMap;
    }

    public static void A1J() {
        A03 = null;
        A04 = null;
        A05 = null;
    }

    public static void A1K(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void A1L(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static void A1M(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    A1M(file2);
                }
            } else {
                return;
            }
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sb = new StringBuilder("could not delete: ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1N(java.io.File r3) {
        /*
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x002c
            java.io.File[] r2 = r3.listFiles()
            if (r2 == 0) goto L_0x0018
            r1 = 0
        L_0x000d:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x0051
            r0 = r2[r1]
            A1N(r0)
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0018:
            java.lang.String r1 = "cannot list directory "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x002c:
            java.lang.String r1 = r3.getPath()
            java.lang.String r0 = "_lock"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            r1.<init>(r3, r0)
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ all -> 0x004a }
            r0.sync()     // Catch:{ all -> 0x004a }
            r1.close()
            return
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001801b.A1N(java.io.File):void");
    }

    public static void A1O(Exception exc) {
        Log.e("Sysconf", "Unable to read _SC_CLK_TCK by reflection", exc);
    }

    public static void A1P(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Null value passed to getSnapshot!");
        }
    }

    public static void A1Q(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void A1R(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void A1S(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void A1T(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void A1U(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void A1V(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A1W(StringBuilder sb, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str);
            sb.append(str2);
        }
    }

    public static void A1X(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new AnonymousClass11S("ELF file truncated");
    }

    public static void A1Y(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A1Z(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A1a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A1b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void A1c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void A1d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static boolean A1e() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public static boolean A1f() {
        return Build.VERSION.SDK_INT >= 20;
    }

    public static boolean A1g() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean A1h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1.getPackageManager().hasSystemFeature("android.hardware.type.watch") == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1l(android.content.Context r1) {
        /*
            java.lang.Boolean r0 = X.C001801b.A00
            if (r0 != 0) goto L_0x001e
            boolean r0 = A1f()
            if (r0 == 0) goto L_0x0017
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "android.hardware.type.watch"
            boolean r1 = r1.hasSystemFeature(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C001801b.A00 = r0
        L_0x001e:
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001801b.A1l(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r4.getPackageManager().hasSystemFeature("cn.google") == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1m(android.content.Context r4) {
        /*
            boolean r0 = A1l(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0039
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            r2 = 1
            if (r1 < r0) goto L_0x0038
            java.lang.Boolean r0 = X.C001801b.A01
            if (r0 != 0) goto L_0x002c
            boolean r0 = A1g()
            if (r0 == 0) goto L_0x0025
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r0 = "cn.google"
            boolean r1 = r1.hasSystemFeature(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C001801b.A01 = r0
        L_0x002c:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0039
            boolean r0 = A1h()
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            return r2
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001801b.A1m(android.content.Context):boolean");
    }

    public static boolean A1n(AnonymousClass05W r7, AnonymousClass05W r8) {
        if (r7 == r8) {
            return true;
        }
        int i = r7.A00;
        if (i != r8.A00) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = r7.A02;
            int i3 = i2 << 1;
            Object obj = objArr[i3];
            Object obj2 = objArr[i3 + 1];
            Object obj3 = r8.get(obj);
            if (obj2 == null) {
                if (obj3 != null || !r8.containsKey(obj)) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A1o(C05770Qa r2, byte[] bArr, byte[] bArr2) {
        if (r2.A00 == 5) {
            return C11580gY.A00().A03(r2.A01, bArr, bArr2);
        }
        throw new AssertionError("PublicKey type is invalid");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r1.delete() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005a, code lost:
        if (r3.delete() != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0068, code lost:
        if (r2.delete() != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1p(java.io.File r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001801b.A1p(java.io.File, java.lang.String):boolean");
    }

    public static boolean A1q(String str, String str2, String str3, String str4) {
        int hashCode = str4.hashCode();
        if (hashCode != 1693) {
            if (hashCode != 49686) {
                if (hashCode != 1695) {
                    if (hashCode == 1696 && str4.equals("55")) {
                        return A1s(str, str2, str3, str4, "9", 4);
                    }
                } else if (str4.equals("54")) {
                    return A1s(str, str2, str3, str4, "9", 2);
                }
            } else if (str4.equals("237")) {
                return A1s(str, str2, str3, str4, "6", 3);
            }
        } else if (str4.equals("52")) {
            return A1s(str, str2, str3, str4, "1", 2);
        }
        return false;
    }

    public static boolean A1r(String str, String str2, String str3, String str4, int i) {
        if (str.length() < i) {
            return false;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.insert(i, str4);
        String obj = sb.toString();
        if (obj.equals(str2) || obj.equals(str3)) {
            return true;
        }
        return false;
    }

    public static boolean A1s(String str, String str2, String str3, String str4, String str5, int i) {
        String A0K = AnonymousClass008.A0K(str4, str2);
        boolean A1r = A1r(str, str2, A0K, str5, i);
        boolean A1r2 = A1r(str3, str2, A0K, str5, i);
        int length = i - str4.length();
        return A1r || A1r2 || A1r(str2, str, str3, str5, length) || A1r(A0K, str, str3, str5, i) || A1r(str, str2, A0K, str5, length) || A1r(str3, str2, A0K, str5, length);
    }

    public static byte[] A1t(AnonymousClass1UD r4, byte[] bArr) {
        if (r4.A00 == 5) {
            C11580gY A002 = C11580gY.A00();
            byte[] bArr2 = r4.A01;
            if (bArr2 == null || bArr2.length != 32) {
                throw new IllegalArgumentException("Invalid private key length!");
            }
            AbstractC11590ga r1 = A002.A00;
            return r1.calculateSignature(r1.A8f(64), bArr2, bArr);
        }
        throw new AssertionError("PrivateKey type is invalid");
    }

    public static byte[] A1u(C05770Qa r3, AnonymousClass1UD r4) {
        if (r4.A00 == 5) {
            return C11580gY.A00().A04(r3.A01, r4.A01);
        }
        throw new AssertionError("PublicKey or PrivateKey type is invalid");
    }

    public static String[] A1v() {
        if (Build.VERSION.SDK_INT >= 21) {
            return SysUtil$LollipopSysdeps.getSupportedAbis();
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    public static String[] A1w(FileChannel fileChannel) {
        long A012;
        int i;
        long j;
        long j2;
        long A013;
        long A014;
        long j3;
        long A015;
        long A016;
        long A017;
        long A018;
        long A019;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (A02(fileChannel, allocate, 0) == 1179403647) {
            A1X(fileChannel, allocate, 1, 4);
            boolean z = true;
            if (((short) (allocate.get() & 255)) != 1) {
                z = false;
            }
            A1X(fileChannel, allocate, 1, 5);
            if (((short) (allocate.get() & 255)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                A012 = A02(fileChannel, allocate, 28);
                i = 2;
                A1X(fileChannel, allocate, 2, 44);
                j = (long) (allocate.getShort() & 65535);
                j2 = 42;
            } else {
                A012 = A01(fileChannel, allocate, 32);
                i = 2;
                A1X(fileChannel, allocate, 2, 56);
                j = (long) (allocate.getShort() & 65535);
                j2 = 54;
            }
            A1X(fileChannel, allocate, i, j2);
            int i2 = allocate.getShort() & 65535;
            if (j == 65535) {
                if (z) {
                    j = A02(fileChannel, allocate, A02(fileChannel, allocate, 32) + 28);
                } else {
                    j = A02(fileChannel, allocate, A01(fileChannel, allocate, 40) + 44);
                }
            }
            long j4 = A012;
            long j5 = 0;
            while (true) {
                if (j5 >= j) {
                    break;
                } else if (A02(fileChannel, allocate, j4 + 0) == 2) {
                    if (z) {
                        A013 = A02(fileChannel, allocate, j4 + 4);
                    } else {
                        A013 = A01(fileChannel, allocate, j4 + 8);
                    }
                    if (A013 != 0) {
                        long j6 = A013;
                        long j7 = 0;
                        int i3 = 0;
                        do {
                            if (z) {
                                A014 = A02(fileChannel, allocate, j6 + 0);
                            } else {
                                A014 = A01(fileChannel, allocate, j6 + 0);
                            }
                            if (A014 == 1) {
                                if (i3 != Integer.MAX_VALUE) {
                                    i3++;
                                } else {
                                    throw new AnonymousClass11S("malformed DT_NEEDED section");
                                }
                            } else if (A014 == 5) {
                                j7 = z ? A02(fileChannel, allocate, j6 + 4) : A01(fileChannel, allocate, j6 + 8);
                            }
                            if (z) {
                                j3 = 8;
                            } else {
                                j3 = 16;
                            }
                            j6 += j3;
                        } while (A014 != 0);
                        if (j7 != 0) {
                            int i4 = 0;
                            while (true) {
                                if (((long) i4) >= j) {
                                    break;
                                }
                                if (A02(fileChannel, allocate, A012 + 0) == 1) {
                                    if (z) {
                                        A015 = A02(fileChannel, allocate, A012 + 8);
                                        A016 = A02(fileChannel, allocate, A012 + 20);
                                    } else {
                                        A015 = A01(fileChannel, allocate, A012 + 16);
                                        A016 = A01(fileChannel, allocate, A012 + 40);
                                    }
                                    if (A015 <= j7 && j7 < A016 + A015) {
                                        if (z) {
                                            A017 = A02(fileChannel, allocate, A012 + 4);
                                        } else {
                                            A017 = A01(fileChannel, allocate, A012 + 8);
                                        }
                                        long j8 = A017 + (j7 - A015);
                                        if (j8 != 0) {
                                            String[] strArr = new String[i3];
                                            int i5 = 0;
                                            do {
                                                long j9 = A013 + 0;
                                                if (z) {
                                                    A018 = A02(fileChannel, allocate, j9);
                                                } else {
                                                    A018 = A01(fileChannel, allocate, j9);
                                                }
                                                if (A018 == 1) {
                                                    if (z) {
                                                        A019 = A02(fileChannel, allocate, A013 + 4);
                                                    } else {
                                                        A019 = A01(fileChannel, allocate, A013 + 8);
                                                    }
                                                    long j10 = A019 + j8;
                                                    StringBuilder sb = new StringBuilder();
                                                    while (true) {
                                                        long j11 = j10 + 1;
                                                        A1X(fileChannel, allocate, 1, j10);
                                                        short s = (short) (allocate.get() & 255);
                                                        if (s == 0) {
                                                            break;
                                                        }
                                                        sb.append((char) s);
                                                        j10 = j11;
                                                    }
                                                    strArr[i5] = sb.toString();
                                                    if (i5 != Integer.MAX_VALUE) {
                                                        i5++;
                                                    } else {
                                                        throw new AnonymousClass11S("malformed DT_NEEDED section");
                                                    }
                                                }
                                                A013 += z ? 8 : 16;
                                            } while (A018 != 0);
                                            if (i5 == i3) {
                                                return strArr;
                                            }
                                            throw new AnonymousClass11S("malformed DT_NEEDED section");
                                        }
                                    }
                                }
                                A012 += (long) i2;
                                i4++;
                            }
                            throw new AnonymousClass11S("did not find file offset of DT_STRTAB table");
                        }
                        throw new AnonymousClass11S("Dynamic section string-table not found");
                    }
                } else {
                    j4 += (long) i2;
                    j5++;
                }
            }
            throw new AnonymousClass11S("ELF file does not contain dynamic linking information");
        }
        throw new AnonymousClass11S("file is not ELF");
    }
}
