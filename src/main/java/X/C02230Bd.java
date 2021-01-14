package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.0Bd  reason: invalid class name and case insensitive filesystem */
public class C02230Bd {
    public static int A00 = -1;
    public static String A01;
    public static final BitmapFactory.Options A02;
    public static final DecimalFormat A03 = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.US));

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A02 = options;
        options.inDither = true;
        options.inInputShareable = true;
        options.inPurgeable = true;
    }

    public static byte A05(String str) {
        if (str == null) {
            return -1;
        }
        if (str.startsWith("audio")) {
            return 2;
        }
        if (str.startsWith("video")) {
            return 3;
        }
        if (str.startsWith("image")) {
            return 1;
        }
        if (str.startsWith("text/x-vcard") || str.startsWith("text/vcard")) {
            return 4;
        }
        return str.startsWith("text") ? (byte) 0 : 9;
    }

    public static int A06(ContentResolver contentResolver, Uri uri) {
        File A0B = C006803i.A0B(uri);
        int i = 0;
        if (A0B != null) {
            i = A09(A0B.getPath());
        } else if ("content".equals(uri.getScheme())) {
            String[] strArr = {"_data", "orientation"};
            Uri build = uri.buildUpon().query(null).build();
            if (contentResolver != null) {
                try {
                    Cursor query = contentResolver.query(build, strArr, null, null, null);
                    if (query != null) {
                        try {
                            if (!query.moveToFirst()) {
                                Log.e("sample_rotate_image/cursor_is_empty");
                            } else if (query.getColumnCount() == 2) {
                                String string = query.getString(0);
                                if (string != null) {
                                    i = A09(string);
                                } else {
                                    int i2 = query.getInt(1);
                                    if (i2 == 90) {
                                        i = 6;
                                    } else if (i2 == 180) {
                                        i = 3;
                                    } else if (i2 == 270) {
                                        i = 8;
                                    }
                                }
                            } else {
                                Log.e("sample_rotate_image/no_orientation_info");
                            }
                        } finally {
                            query.close();
                        }
                    }
                } catch (Exception e) {
                    Log.w("sample_rotate_image/query_orientation_info", e);
                }
            } else {
                Log.w("media-file-utils/get-exiff-orientation cr=null");
            }
        }
        AnonymousClass008.A0v("sample_rotate_image/orientation ", i);
        return i;
    }

    public static int A07(AnonymousClass088 r7, String str, AnonymousClass1XO r9, int i, int i2) {
        File A0A = r7.A0A(r9.A00, i, i2);
        int i3 = 0;
        int i4 = -1;
        if (A0A.exists()) {
            File[] listFiles = A0A.listFiles();
            if (listFiles != null) {
                String A0Q = AnonymousClass008.A0Q(new StringBuilder(), r9.A01, "-", str, "-WA");
                int length = listFiles.length;
                while (i3 < length) {
                    String name = listFiles[i3].getName();
                    if (name.startsWith(A0Q) && name.length() > 19) {
                        try {
                            int parseInt = Integer.parseInt(name.substring(15, 19));
                            if (parseInt > i4) {
                                i4 = parseInt;
                            }
                        } catch (NumberFormatException e) {
                            StringBuilder sb = new StringBuilder("mediafileutils/findlargestfileindex/nfe:");
                            sb.append(name);
                            Log.i(sb.toString(), e);
                        }
                    }
                    i3++;
                }
                i3 = length;
            } else {
                StringBuilder sb2 = new StringBuilder("mediafileutils/findlargestfileindex/no files for mmsType:");
                sb2.append(r9);
                Log.i(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder("mediafileutils/findlargestfileindex mmsType:");
        sb3.append(r9);
        sb3.append(" fileIndex:");
        sb3.append(i4);
        sb3.append(" total:");
        AnonymousClass008.A1L(sb3, i3);
        return i4;
    }

    public static int A08(File file) {
        long A0A = A0A(file);
        int i = (int) (A0A / 1000);
        if (i != 0 || A0A == 0) {
            return i;
        }
        return 1;
    }

    public static int A09(String str) {
        C15320nr r2 = new C15320nr(str);
        C15290no A032 = r2.A03("Orientation");
        if (A032 == null) {
            return 1;
        }
        try {
            return A032.A06(r2.A09);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A0A(java.io.File r5) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02230Bd.A0A(java.io.File):long");
    }

    public static Bitmap A0B(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 21) {
            return bitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, A02);
    }

    public static Bitmap A0C(Bitmap bitmap, int i, float f) {
        Rect rect;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f2 = (float) i;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
        int width = (bitmap.getWidth() - bitmap.getHeight()) >> 1;
        if (width > 0) {
            rect = new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight());
        } else {
            rect = new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width);
        }
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        if (f >= 0.0f) {
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        return createBitmap;
    }

    public static Bitmap A0D(Bitmap bitmap, Matrix matrix, int i, int i2) {
        Bitmap bitmap2 = bitmap;
        if (matrix != null) {
            Log.i("sample_rotate_image/rotate");
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmap2 != createBitmap) {
                    bitmap2.recycle();
                }
                bitmap2 = createBitmap;
            } catch (OutOfMemoryError e) {
                Log.e("sample_rotate_image/rotate/out-of-memory");
                bitmap2.recycle();
                throw e;
            }
        }
        if (i2 <= 0 || (bitmap2.getWidth() <= i2 && bitmap2.getHeight() <= i2)) {
            return bitmap2;
        }
        StringBuilder A0S = AnonymousClass008.A0S("sample_rotate_image/scale/");
        A0S.append(bitmap2.getWidth());
        A0S.append(" | ");
        A0S.append(bitmap2.getHeight());
        Log.i(A0S.toString());
        float f = (float) i;
        float max = Math.max(((float) bitmap2.getWidth()) / f, ((float) bitmap2.getHeight()) / f);
        Rect rect = new Rect(0, 0, (int) (((float) bitmap2.getWidth()) / max), (int) (((float) bitmap2.getHeight()) / max));
        rect.right = Math.max(rect.right, 1);
        rect.bottom = Math.max(rect.bottom, 1);
        Rect rect2 = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        Bitmap.Config config = bitmap2.getConfig();
        try {
            int width = rect.width();
            int height = rect.height();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap2);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            canvas.drawBitmap(bitmap2, rect2, rect, paint);
            bitmap2.recycle();
            return createBitmap2;
        } catch (OutOfMemoryError e2) {
            Log.e("sample_rotate_image/scale/out-of-memory");
            bitmap2.recycle();
            throw e2;
        }
    }

    public static Matrix A0E(int i) {
        switch (i) {
            case 2:
                Matrix matrix = new Matrix();
                matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix;
            case 3:
                Matrix matrix2 = new Matrix();
                matrix2.setRotate(180.0f);
                return matrix2;
            case 4:
                Matrix matrix3 = new Matrix();
                matrix3.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix3;
            case 5:
                Matrix matrix4 = new Matrix();
                matrix4.setValues(new float[]{0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix4;
            case 6:
                Matrix matrix5 = new Matrix();
                matrix5.setRotate(90.0f);
                return matrix5;
            case 7:
                Matrix matrix6 = new Matrix();
                matrix6.setValues(new float[]{0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
                return matrix6;
            case 8:
                Matrix matrix7 = new Matrix();
                matrix7.setRotate(270.0f);
                return matrix7;
            default:
                return null;
        }
    }

    public static Matrix A0F(ContentResolver contentResolver, Uri uri) {
        int parseInt;
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            throw new FileNotFoundException(AnonymousClass008.A0J("No file ", uri));
        }
        Matrix A0E = A0E(A06(contentResolver, uri));
        if (uri.getQueryParameter("flip-h") != null) {
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            if (A0E == null) {
                A0E = matrix;
            } else {
                A0E.postConcat(matrix);
            }
        }
        if (uri.getQueryParameter("flip-v") != null) {
            Matrix matrix2 = new Matrix();
            matrix2.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            if (A0E == null) {
                A0E = matrix2;
            } else {
                A0E.postConcat(matrix2);
            }
        }
        String queryParameter = uri.getQueryParameter("rotation");
        if (!(queryParameter == null || (parseInt = Integer.parseInt(queryParameter)) == 0)) {
            if (A0E == null) {
                A0E = new Matrix();
            }
            A0E.postRotate((float) parseInt);
        }
        return A0E;
    }

    public static Pair A0G(File file) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (file.exists()) {
            try {
                i = A09(file.getAbsolutePath());
            } catch (IOException e) {
                Log.e("failure retrieving exif, io exception", e);
            }
            if (i != 6 || i == 8) {
                return new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
            }
            return new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        }
        i = 0;
        if (i != 6) {
        }
        return new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A0H(java.io.File r7) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02230Bd.A0H(java.io.File):android.util.Pair");
    }

    public static File A0I(Context context, AnonymousClass088 r3, AnonymousClass022 r4, File file, AnonymousClass1XO r6, int i) {
        StringBuilder A0S = AnonymousClass008.A0S(".");
        A0S.append(C006803i.A0K(file.getAbsolutePath()));
        return A0J(r3, r4, A0S.toString(), r6, i, 3);
    }

    public static File A0J(AnonymousClass088 r9, AnonymousClass022 r10, String str, AnonymousClass1XO r12, int i, int i2) {
        String obj;
        File file = null;
        for (int i3 = 0; i3 < 100; i3++) {
            StringBuilder sb = new StringBuilder();
            synchronized (C02230Bd.class) {
                A0S(r10, r9);
                SharedPreferences.Editor edit = r10.A01(AnonymousClass020.A02).edit();
                String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
                if (!format.equals(A01)) {
                    A00 = 0;
                    A01 = format;
                    edit.putString("file_date", format);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r12.A01);
                sb2.append("-");
                sb2.append(A01);
                sb2.append("-WA");
                sb2.append(A03.format((long) A00));
                obj = sb2.toString();
                int i4 = A00 + 1;
                A00 = i4;
                edit.putInt("file_index", i4);
                edit.apply();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("mediafileutils/readablefilename/");
                sb3.append(obj);
                Log.i(sb3.toString());
            }
            sb.append(obj);
            sb.append(str);
            String obj2 = sb.toString();
            byte b = r12.A00;
            if (r9 != null) {
                file = new File(r9.A0A(b, i, i2), obj2);
                if (!file.exists()) {
                    break;
                }
            } else {
                throw null;
            }
        }
        return file;
    }

    public static File A0K(AnonymousClass088 r2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".doodle");
        return AnonymousClass089.A01(r2.A07(), sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00be, code lost:
        if (r12 == X.AnonymousClass1XO.A0J) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A0L(boolean r9, boolean r10, boolean r11, X.AnonymousClass1XO r12, int r13, int r14, java.lang.String r15, java.lang.String r16, X.AnonymousClass00G r17, X.AnonymousClass088 r18, X.AnonymousClass022 r19) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02230Bd.A0L(boolean, boolean, boolean, X.1XO, int, int, java.lang.String, java.lang.String, X.00G, X.088, X.022):java.io.File");
    }

    public static FileInputStream A0M(AnonymousClass009 r7, File file) {
        for (int i = 0; i < 2; i++) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (i <= 0) {
                    return fileInputStream;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("mediafileutils/openFile/opened at attempt ");
                sb.append(i);
                Log.d(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mediafileutils/openFile/opened at attempt ");
                sb2.append(i);
                r7.A04(sb2.toString(), null, true);
                return fileInputStream;
            } catch (FileNotFoundException e) {
                if (!e.getMessage().contains("Permission denied")) {
                    throw e;
                } else if (i == 1) {
                    r7.A04("mediafileutils/openFile/not opened after 2 attempts", null, true);
                    throw e;
                }
            }
        }
        throw new AssertionError("Unreachable code");
    }

    public static String A0N() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String A0O(ContentResolver contentResolver, Uri uri) {
        if (contentResolver == null) {
            Log.w("media-file-utils/get-media-mime cr=null");
        } else {
            String type = contentResolver.getType(uri);
            if (type != null) {
                return type;
            }
        }
        return A0Q(A0P(uri));
    }

    public static String A0P(Uri uri) {
        int lastIndexOf;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || (lastIndexOf = lastPathSegment.lastIndexOf(46)) == -1) {
            return "";
        }
        return lastPathSegment.substring(lastIndexOf + 1);
    }

    public static String A0Q(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case 96323:
                if (lowerCase.equals("aac")) {
                    return "audio/aac";
                }
                break;
            case 96710:
                if (lowerCase.equals("amr")) {
                    return "audio/amr";
                }
                break;
            case 98822:
                if (lowerCase.equals("csv")) {
                    return "text/csv";
                }
                break;
            case 99640:
                if (lowerCase.equals("doc")) {
                    return "application/msword";
                }
                break;
            case 106458:
                if (lowerCase.equals("m4a")) {
                    return "audio/mp4";
                }
                break;
            case 108272:
                if (lowerCase.equals("mp3")) {
                    return "audio/mpeg";
                }
                break;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    return "video/mp4";
                }
                break;
            case 110834:
                if (lowerCase.equals("pdf")) {
                    return "application/pdf";
                }
                break;
            case 111220:
                if (lowerCase.equals("ppt")) {
                    return "application/vnd.ms-powerpoint";
                }
                break;
            case 113252:
                if (lowerCase.equals("rtf")) {
                    return "application/rtf";
                }
                break;
            case 115312:
                if (lowerCase.equals("txt")) {
                    return "text/plain";
                }
                break;
            case 117484:
                if (lowerCase.equals("wav")) {
                    return "audio/x-wav";
                }
                break;
            case 117835:
                if (lowerCase.equals("wma")) {
                    return "audio/x-ms-wma";
                }
                break;
            case 118783:
                if (lowerCase.equals("xls")) {
                    return "application/vnd.ms-excel";
                }
                break;
            case 3088960:
                if (lowerCase.equals("docx")) {
                    return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
                }
                break;
            case 3418175:
                if (lowerCase.equals("opus")) {
                    return "audio/ogg; codecs=opus";
                }
                break;
            case 3447940:
                if (lowerCase.equals("pptx")) {
                    return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
                }
                break;
            case 3682393:
                if (lowerCase.equals("xlsx")) {
                    return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
                }
                break;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.toLowerCase(Locale.US));
        return mimeTypeFromExtension == null ? "application/octet-stream" : mimeTypeFromExtension;
    }

    public static void A0R(Context context, Uri uri) {
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE").setData(uri));
    }

    public static synchronized void A0S(AnonymousClass022 r13, AnonymousClass088 r14) {
        synchronized (C02230Bd.class) {
            if (A00 < 0) {
                SharedPreferences A012 = r13.A01(AnonymousClass020.A02);
                A00 = A012.getInt("file_index", -1);
                String string = A012.getString("file_date", null);
                A01 = string;
                if (A00 < 0 || TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
                    A01 = format;
                    long currentTimeMillis = System.currentTimeMillis();
                    A00 = -1;
                    AnonymousClass1XO r2 = AnonymousClass1XO.A05;
                    int max = Math.max(-1, A07(r14, format, r2, 0, 1));
                    A00 = max;
                    int max2 = Math.max(max, A07(r14, A01, r2, 0, 2));
                    A00 = max2;
                    int max3 = Math.max(max2, A07(r14, A01, r2, 0, 3));
                    A00 = max3;
                    String str = A01;
                    AnonymousClass1XO r22 = AnonymousClass1XO.A0D;
                    int max4 = Math.max(max3, A07(r14, str, r22, 1, 1));
                    A00 = max4;
                    int max5 = Math.max(max4, A07(r14, A01, r22, 1, 2));
                    A00 = max5;
                    int max6 = Math.max(max5, A07(r14, A01, r22, 1, 3));
                    A00 = max6;
                    String str2 = A01;
                    AnonymousClass1XO r23 = AnonymousClass1XO.A0N;
                    int max7 = Math.max(max6, A07(r14, str2, r23, 0, 1));
                    A00 = max7;
                    int max8 = Math.max(max7, A07(r14, A01, r23, 0, 2));
                    A00 = max8;
                    int max9 = Math.max(max8, A07(r14, A01, r23, 0, 3));
                    A00 = max9;
                    String str3 = A01;
                    AnonymousClass1XO r24 = AnonymousClass1XO.A0A;
                    int max10 = Math.max(max9, A07(r14, str3, r24, 0, 1));
                    A00 = max10;
                    int max11 = Math.max(max10, A07(r14, A01, r24, 0, 2));
                    A00 = max11;
                    int max12 = Math.max(max11, A07(r14, A01, r24, 0, 3));
                    A00 = max12;
                    String str4 = A01;
                    AnonymousClass1XO r25 = AnonymousClass1XO.A07;
                    int max13 = Math.max(max12, A07(r14, str4, r25, 0, 1));
                    A00 = max13;
                    int max14 = Math.max(max13, A07(r14, A01, r25, 0, 2));
                    A00 = max14;
                    int max15 = Math.max(max14, A07(r14, A01, r25, 0, 3));
                    A00 = max15;
                    A00 = max15 + 1;
                    SharedPreferences.Editor edit = A012.edit();
                    edit.putInt("file_index", A00);
                    edit.putString("file_date", A01);
                    edit.apply();
                    StringBuilder sb = new StringBuilder();
                    sb.append("mediafileutils/initfilecounter file_index:");
                    sb.append(A00);
                    sb.append(" | file_date:");
                    sb.append(A01);
                    sb.append(" |  time:");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    Log.i(sb.toString());
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mediafileutils/initfilecounter file_index:");
                sb2.append(A00);
                sb2.append(" | file_date:");
                sb2.append(A01);
                Log.i(sb2.toString());
            }
        }
    }

    public static void A0T(File file, AnonymousClass0M4 r2) {
        Pair A0G = A0G(file);
        r2.A08 = ((Number) A0G.first).intValue();
        r2.A06 = ((Number) A0G.second).intValue();
    }

    public static boolean A0U(AnonymousClass00C r3, File file, File file2) {
        File A06 = r3.A06(file);
        if (file2.renameTo(A06)) {
            if (file.renameTo(file2)) {
                if (A06.delete()) {
                    return true;
                }
                StringBuilder A0S = AnonymousClass008.A0S("failed to delete ");
                A0S.append(A06.getAbsolutePath());
                Log.e(A0S.toString());
                return true;
            } else if (!A06.renameTo(file2)) {
                if (!file.delete()) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("failed to delete ");
                    A0S2.append(file.getAbsolutePath());
                    Log.e(A0S2.toString());
                }
                if (!A06.delete()) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("failed to delete ");
                    A0S3.append(A06.getAbsolutePath());
                    Log.e(A0S3.toString());
                }
                Log.e("restore input file failed");
                return false;
            } else if (file.delete()) {
                return false;
            } else {
                StringBuilder A0S4 = AnonymousClass008.A0S("failed to delete ");
                A0S4.append(file.getAbsolutePath());
                Log.e(A0S4.toString());
                return false;
            }
        } else if (A06.delete()) {
            return false;
        } else {
            StringBuilder A0S5 = AnonymousClass008.A0S("failed to delete ");
            A0S5.append(A06.getAbsolutePath());
            Log.e(A0S5.toString());
            return false;
        }
    }
}
