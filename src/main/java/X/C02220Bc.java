package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.search.verification.client.R;
import com.whatsapp.AudioPickerActivity;
import com.whatsapp.gallerypicker.GalleryPicker;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0Bc  reason: invalid class name and case insensitive filesystem */
public class C02220Bc extends C02230Bd {
    public static final byte[] A0B = {-1, -39};
    public static volatile C02220Bc A0C;
    public final AnonymousClass009 A00;
    public final AnonymousClass088 A01;
    public final AnonymousClass02M A02;
    public final C000300f A03;
    public final AnonymousClass00C A04;
    public final AnonymousClass03P A05;
    public final AnonymousClass00G A06;
    public final AnonymousClass01X A07;
    public final C02240Be A08;
    public final C007703s A09;
    public final AnonymousClass00T A0A;

    public C02220Bc(AnonymousClass00G r3, AnonymousClass02M r4, AnonymousClass009 r5, AnonymousClass00T r6, AnonymousClass088 r7, C000300f r8, AnonymousClass03P r9, AnonymousClass01X r10, C02240Be r11, AnonymousClass00C r12, C007703s r13) {
        this.A06 = r3;
        this.A02 = r4;
        this.A00 = r5;
        this.A0A = r6;
        this.A01 = r7;
        this.A03 = r8;
        this.A05 = r9;
        this.A07 = r10;
        this.A08 = r11;
        this.A04 = r12;
        this.A09 = r13;
        r13.A00.add("com.whatsapp.provider.MigrationContentProvider");
    }

    public static C02220Bc A00() {
        if (A0C == null) {
            synchronized (C02220Bc.class) {
                if (A0C == null) {
                    A0C = new C02220Bc(AnonymousClass00G.A01, AnonymousClass02M.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass088.A00(), C000300f.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00(), C02240Be.A00(), AnonymousClass00C.A00(), C007703s.A00());
                }
            }
        }
        return A0C;
    }

    public static String A01(String str) {
        if (str == null) {
            return "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c = 0;
                    break;
                }
                break;
            case -1248334925:
                if (str.equals("application/pdf")) {
                    c = 2;
                    break;
                }
                break;
            case -1248332507:
                if (str.equals("application/rtf")) {
                    c = 11;
                    break;
                }
                break;
            case -1073633483:
                if (str.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                    c = 5;
                    break;
                }
                break;
            case -1071817359:
                if (str.equals("application/vnd.ms-powerpoint")) {
                    c = '\b';
                    break;
                }
                break;
            case -1050893613:
                if (str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                    c = 3;
                    break;
                }
                break;
            case -1004747228:
                if (str.equals("text/csv")) {
                    c = '\f';
                    break;
                }
                break;
            case -1004732798:
                if (str.equals("text/rtf")) {
                    c = '\n';
                    break;
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c = 1;
                    break;
                }
                break;
            case -366307023:
                if (str.equals("application/vnd.ms-excel")) {
                    c = 7;
                    break;
                }
                break;
            case 817335912:
                if (str.equals("text/plain")) {
                    c = '\t';
                    break;
                }
                break;
            case 904647503:
                if (str.equals("application/msword")) {
                    c = 6;
                    break;
                }
                break;
            case 1993842850:
                if (str.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "jpg";
            case 1:
                return "png";
            case 2:
                return "pdf";
            case 3:
                return "docx";
            case 4:
                return "xlsx";
            case 5:
                return "pptx";
            case 6:
                return "doc";
            case 7:
                return "xls";
            case '\b':
                return "ppt";
            case '\t':
                return "txt";
            case '\n':
            case 11:
                return "rtf";
            case '\f':
                return "csv";
            default:
                String A0A2 = C02510Ch.A0A(str, false);
                if (!TextUtils.isEmpty(A0A2)) {
                    return A0A2;
                }
                String A0B2 = C02510Ch.A0B(str, false);
                if (!TextUtils.isEmpty(A0B2)) {
                    return A0B2;
                }
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                if (extensionFromMimeType != null) {
                    return extensionFromMimeType;
                }
                return "";
        }
    }

    public static void A02(AnonymousClass02M r5, AnonymousClass088 r6, AnonymousClass022 r7, int i, Activity activity, AnonymousClass02N r10) {
        Intent intent;
        if (i == 4) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (Build.VERSION.SDK_INT == 18 && Build.MODEL.contains("Nexus")) {
                intent.putExtra("output", Uri.fromFile(AnonymousClass35M.A00(activity, r6, r7, AnonymousClass1XO.A0N, ".mp4")));
            }
        } else if (i != 5) {
            switch (i) {
                case 21:
                    intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                    intent.setType("image/*");
                    break;
                case 22:
                    intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI, activity, GalleryPicker.class);
                    intent.putExtra("max_items", 30);
                    break;
                case 23:
                    intent = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", C006803i.A06(activity, AnonymousClass35M.A00(activity, r6, r7, AnonymousClass1XO.A0A, ".jpg")));
                    intent.setFlags(2);
                    break;
                default:
                    intent = null;
                    break;
            }
        } else {
            intent = new Intent(activity, AudioPickerActivity.class);
            intent.putExtra("jid", r10.getRawString());
        }
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.e("mediafileutils/start-activity ", e);
            r5.A06(R.string.activity_not_found, 0);
        }
    }

    public static void A03(AnonymousClass2PG r4, Uri.Builder builder) {
        Uri uri = r4.A0F;
        int i = 0;
        if (uri.getQueryParameter("rotation") != null) {
            i = Integer.parseInt(uri.getQueryParameter("rotation"));
        }
        if (r4.A00() != 0) {
            i = (r4.A00() + i) % 360;
        }
        if (i != 0) {
            builder.appendQueryParameter("rotation", Integer.toString(i));
        }
        if (uri.getQueryParameter("flip-h") != null) {
            builder.appendQueryParameter("flip-h", uri.getQueryParameter("flip-h"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.AnonymousClass009 r13, java.io.File r14, X.AnonymousClass0AH r15, X.AnonymousClass2KK r16, byte[] r17, java.lang.String r18, int r19, int r20, long r21, java.io.File r23, java.io.OutputStream r24, int r25) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02220Bc.A04(X.009, java.io.File, X.0AH, X.2KK, byte[], java.lang.String, int, int, long, java.io.File, java.io.OutputStream, int):boolean");
    }

    public byte A05(Uri uri) {
        ContentResolver A062 = this.A05.A06();
        String A0O = C02230Bd.A0O(A062, uri);
        try {
            if ("image/gif".equals(A0O)) {
                C007703s r0 = this.A09;
                try {
                    AbstractC04880Me.A00(A062, r0, uri);
                    return AbstractC04880Me.A00(A062, r0, uri).A02 ^ true ? (byte) 1 : 13;
                } catch (IOException unused) {
                }
            }
        } catch (IOException e) {
            Log.e("Media file cannot be read", e);
        }
        byte A052 = C02230Bd.A05(A0O);
        if (A052 == 0) {
            return 9;
        }
        return A052;
    }

    public Bitmap A06(Uri uri, int i, int i2) {
        Bitmap bitmap;
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            throw new FileNotFoundException(AnonymousClass008.A0J("No file ", uri));
        }
        StringBuilder sb = new StringBuilder("sample_rotate_image/from uri:");
        sb.append(uri);
        Log.i(sb.toString());
        Matrix A0F = C02230Bd.A0F(this.A05.A06(), uri);
        BitmapFactory.Options A082 = A08(uri, i);
        try {
            bitmap = C02230Bd.A0D(A07(uri, A082), A0F, i, i2);
        } catch (OutOfMemoryError e) {
            int i3 = A082.inSampleSize << 1;
            A082.inSampleSize = i3;
            StringBuilder A0S = AnonymousClass008.A0S("sample_rotate_image/oom ");
            A0S.append(i3);
            Log.i(A0S.toString(), e);
            bitmap = C02230Bd.A0D(A07(uri, A082), A0F, i, i2);
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("sample_rotate_image/mutable/");
        A0S2.append(bitmap.isMutable());
        Log.d(A0S2.toString());
        StringBuilder sb2 = new StringBuilder("sample_rotate_image/final_size:");
        sb2.append(bitmap.getWidth());
        sb2.append(" | ");
        sb2.append(bitmap.getHeight());
        Log.i(sb2.toString());
        return bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A07(android.net.Uri r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r3 = this;
            java.io.InputStream r2 = r3.A0B(r4)
            android.graphics.Bitmap r1 = X.C002001d.A0Y(r2, r5)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x001a
            int r0 = r1.getWidth()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x001a
            int r0 = r1.getHeight()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x001a
            r2.close()
            return r1
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sample_rotate_image/not_a_image:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            X.35k r0 = new X.35k
            r0.<init>()
            throw r0
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02220Bc.A07(android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.BitmapFactory.Options A08(android.net.Uri r8, int r9) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02220Bc.A08(android.net.Uri, int):android.graphics.BitmapFactory$Options");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0218, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x021a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x021f, code lost:
        r0 = new java.lang.StringBuilder("mediafileutils/getfilefrommediastore/file-not-found; uri=");
        r0.append(r27);
        com.whatsapp.util.Log.w(r0.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0235, code lost:
        throw new java.io.IOException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cb, code lost:
        if (r4 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d0, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x021a A[ExcHandler: SQLiteException | FileNotFoundException | NullPointerException (r2v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:47:0x0102] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A09(android.net.Uri r27) {
        /*
        // Method dump skipped, instructions count: 602
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02220Bc.A09(android.net.Uri):java.io.File");
    }

    public File A0A(String str, long j) {
        long A032 = this.A04.A03();
        if (j < 0 || A032 - j <= 104857600) {
            StringBuilder A0V = AnonymousClass008.A0V("mediafileutils/getsharedfileforsize/returning external file; size=", j, "; internalAvailable=");
            A0V.append(A032);
            Log.w(A0V.toString());
            return AnonymousClass089.A01(this.A01.A07(), str);
        }
        File file = this.A01.A04().A07;
        AnonymousClass089.A03(file, false);
        return AnonymousClass089.A01(file, str);
    }

    public InputStream A0B(Uri uri) {
        InputStream openInputStream;
        Uri build = uri.buildUpon().query(null).build();
        File A0B2 = C006803i.A0B(build);
        if (A0B2 != null) {
            openInputStream = new FileInputStream(A0B2);
        } else {
            ContentResolver A062 = this.A05.A06();
            if (A062 != null) {
                openInputStream = A062.openInputStream(build);
                if (openInputStream == null) {
                    throw new IOException(AnonymousClass008.A0J("Unable to open stream for uri=", build));
                }
            } else {
                throw new IOException("Could not get content resolver");
            }
        }
        if (openInputStream instanceof FileInputStream) {
            this.A09.A06((FileInputStream) openInputStream);
        }
        return openInputStream;
    }

    public void A0C(Uri uri, AbstractC004502c r11, AnonymousClass35j r12) {
        this.A0A.ANC(new AnonymousClass3SF(this.A02, this, this.A07, r11, uri, r12), new Void[0]);
    }

    public void A0D(File file) {
        if (file != null) {
            try {
                if (this.A01.A0L(file)) {
                    C006803i.A0m(file);
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("mediafileutils/unable to delete file ");
                sb.append(file);
                Log.e(sb.toString(), e);
            }
        }
    }
}
