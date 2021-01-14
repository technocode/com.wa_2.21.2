package com.whatsapp.contentprovider;

import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00S;
import X.AnonymousClass01A;
import X.AnonymousClass01K;
import X.AnonymousClass01Q;
import X.AnonymousClass01X;
import X.AnonymousClass088;
import X.AnonymousClass0BV;
import X.AnonymousClass0BW;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass1VB;
import X.C000300f;
import X.C007703s;
import X.C014308b;
import X.C04360Kb;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.util.StatResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

public class MediaProvider extends ContentProvider {
    public static UriMatcher A0A;
    public static final String A0B = AnonymousClass008.A0L("vnd.android.cursor.dir/vnd.", "com.whatsapp", ".provider.media.buckets");
    public static final String A0C = AnonymousClass008.A0L("vnd.android.cursor.dir/vnd.", "com.whatsapp", ".provider.media.items");
    public static final String[] A0D = {"_display_name", "_size"};
    public AnonymousClass088 A00;
    public AnonymousClass01A A01;
    public C014308b A02;
    public AnonymousClass00S A03;
    public AnonymousClass01X A04;
    public AnonymousClass01Q A05;
    public AnonymousClass01K A06;
    public AnonymousClass0BV A07;
    public AnonymousClass0BW A08;
    public C007703s A09;

    public static int A00(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0K("Invalid mode: ", str));
    }

    public static synchronized UriMatcher A01() {
        UriMatcher uriMatcher;
        synchronized (MediaProvider.class) {
            if (A0A == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0A = uriMatcher2;
                uriMatcher2.addURI("com.whatsapp.provider.media", "buckets", 1);
                A0A.addURI("com.whatsapp.provider.media", "items", 2);
                A0A.addURI("com.whatsapp.provider.media", "item/*", 3);
                A0A.addURI("com.whatsapp.provider.media", "gdpr_report", 4);
                A0A.addURI("com.whatsapp.provider.media", "export_chat/*/*", 5);
            }
            uriMatcher = A0A;
        }
        return uriMatcher;
    }

    public static Uri A02(AnonymousClass009 r8, AnonymousClass0BW r9, AnonymousClass0M3 r10) {
        String name;
        if (Build.VERSION.SDK_INT < 21) {
            AnonymousClass0M4 r0 = r10.A02;
            if (r0 != null) {
                return Uri.fromFile(r0.A0F);
            }
            throw null;
        }
        AnonymousClass0M4 r02 = r10.A02;
        if (r02 != null) {
            File file = r02.A0F;
            if (file != null) {
                String obj = UUID.randomUUID().toString();
                if (r10.A0m != 9 || TextUtils.isEmpty(r10.A0w())) {
                    name = file.getName();
                } else {
                    name = r10.A0w();
                }
                String absolutePath = file.getAbsolutePath();
                String A012 = C04360Kb.A01(r8, r10);
                AnonymousClass1VB A0A2 = r9.A01.A02().A0A("INSERT INTO shared_media_ids (item_uuid, file_name, mime_type, display_name, expiration_timestamp) VALUES (?, ?, ?, ?, ?)", "INSERT_SHARED_MEDIA");
                A0A2.A07(1, obj);
                A0A2.A07(2, absolutePath);
                A0A2.A07(3, A012);
                if (name == null) {
                    A0A2.A04(4);
                } else {
                    A0A2.A07(4, name);
                }
                if (r9.A00 != null) {
                    A0A2.A07(5, String.valueOf(System.currentTimeMillis() + 3600000));
                    A0A2.A01();
                    return new Uri.Builder().scheme("content").authority("com.whatsapp.provider.media").appendPath("item").appendEncodedPath(obj).build();
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A03(android.net.Uri r6) {
        /*
            r5 = this;
            X.0BW r2 = r5.A08
            java.lang.String r1 = r6.getLastPathSegment()
            X.0BX r0 = r2.A01
            X.0BK r4 = r0.A01()
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            r3[r0] = r1
            X.021 r0 = r2.A00
            r2 = 0
            if (r0 == 0) goto L_0x0055
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1
            r3[r0] = r1
            java.lang.String r1 = "SELECT file_name FROM shared_media_ids WHERE item_uuid =?AND expiration_timestamp >?"
            java.lang.String r0 = "SharedMediaIdsStore/getSharedFileByUUID"
            android.database.Cursor r1 = r4.A07(r1, r3, r0)
            if (r1 == 0) goto L_0x0047
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "file_name"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0040 }
            r1.close()
            goto L_0x004d
        L_0x0040:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()
        L_0x004c:
            r0 = r2
        L_0x004d:
            if (r0 == 0) goto L_0x0054
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
        L_0x0054:
            return r2
        L_0x0055:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contentprovider.MediaProvider.A03(android.net.Uri):java.io.File");
    }

    public final void A04(Uri uri, File file) {
        if (!file.exists()) {
            throw new FileNotFoundException(AnonymousClass008.A0J("File not found for uri: ", uri));
        } else if (file.lastModified() < this.A03.A05() - 3600000) {
            file.delete();
            throw new FileNotFoundException(AnonymousClass008.A0J("File expired for uri: ", uri));
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r1 != null) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r7) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contentprovider.MediaProvider.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public boolean onCreate() {
        Log.d("MediaProvider/onCreate");
        this.A03 = AnonymousClass00S.A00();
        this.A00 = AnonymousClass088.A00();
        C000300f.A00();
        this.A01 = AnonymousClass01A.A00();
        this.A02 = C014308b.A00();
        this.A04 = AnonymousClass01X.A00();
        this.A06 = AnonymousClass01K.A00();
        this.A07 = AnonymousClass0BV.A00();
        this.A08 = AnonymousClass0BW.A00();
        this.A05 = AnonymousClass01Q.A00();
        this.A09 = C007703s.A00();
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int match = A01().match(uri);
        if (match == 3) {
            int A002 = A00(str);
            File A032 = A03(uri);
            if (A032 != null) {
                try {
                    C007703s r4 = this.A09;
                    String canonicalPath = A032.getCanonicalPath();
                    StatResult A012 = C007703s.A01(canonicalPath);
                    StringBuilder sb = new StringBuilder("canonicalFilePath=");
                    sb.append(canonicalPath);
                    r4.A05(A012, sb.toString());
                    ParcelFileDescriptor open = ParcelFileDescriptor.open(A032, A002);
                    try {
                        this.A09.A04(open);
                        return open;
                    } catch (IOException e) {
                        StringBuilder sb2 = new StringBuilder("mediaprovider/ parcel file descriptor is not external for uri: ");
                        sb2.append(uri);
                        Log.e(sb2.toString(), e);
                        throw new FileNotFoundException();
                    }
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder("mediaprovider/ file is not external for uri: ");
                    sb3.append(uri);
                    Log.e(sb3.toString(), e2);
                    throw new FileNotFoundException();
                }
            } else {
                StringBuilder sb4 = new StringBuilder("mediaprovider/openMessageFile no file found for uri: ");
                sb4.append(uri);
                Log.e(sb4.toString());
                throw new FileNotFoundException();
            }
        } else if (match == 4) {
            String queryParameter = uri.getQueryParameter("id");
            if (queryParameter != null) {
                File A0E = this.A00.A0E(queryParameter);
                A04(uri, A0E);
                return ParcelFileDescriptor.open(A0E, A00(str));
            }
            throw new FileNotFoundException(AnonymousClass008.A0J("File not found for uri: ", uri));
        } else if (match == 5) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                File A0D2 = this.A00.A0D(lastPathSegment);
                A04(uri, A0D2);
                return ParcelFileDescriptor.open(A0D2, A00(str));
            }
            throw new FileNotFoundException(AnonymousClass008.A0J("File not found for uri: ", uri));
        } else {
            throw new FileNotFoundException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0215, code lost:
        if (r1 != null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0223, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0227, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r20, java.lang.String[] r21, java.lang.String r22, java.lang.String[] r23, java.lang.String r24) {
        /*
        // Method dump skipped, instructions count: 770
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contentprovider.MediaProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
