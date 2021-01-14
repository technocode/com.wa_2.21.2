package com.whatsapp.registration.directmigration;

import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass01I;
import X.AnonymousClass02J;
import X.AnonymousClass02R;
import X.AnonymousClass03R;
import X.AnonymousClass03S;
import X.AnonymousClass088;
import X.AnonymousClass0BB;
import X.AnonymousClass0BZ;
import X.AnonymousClass0GV;
import X.AnonymousClass1Y4;
import X.C000300f;
import X.C014508d;
import X.C02200Ba;
import X.C02290Bk;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MigrationContentProvider extends ContentProvider {
    public static UriMatcher A0A;
    public static final List A0B;
    public AnonymousClass088 A00;
    public AnonymousClass01I A01;
    public C000300f A02;
    public AnonymousClass03R A03;
    public AnonymousClass03S A04;
    public AnonymousClass00D A05;
    public C02290Bk A06;
    public AnonymousClass0BB A07;
    public AnonymousClass02J A08;
    public AnonymousClass0BZ A09;

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        ArrayList arrayList = new ArrayList(Arrays.asList(new AnonymousClass02R("push_name", 2), new AnonymousClass02R("interface_gdrive_backup_frequency", 2), new AnonymousClass02R("interface_gdrive_backup_network_setting", 2), new AnonymousClass02R("gdrive_include_videos_in_backup", 1)));
        arrayList.addAll(AnonymousClass00D.A01());
        A0B = Collections.unmodifiableList(arrayList);
    }

    public static synchronized UriMatcher A00() {
        UriMatcher uriMatcher;
        synchronized (MigrationContentProvider.class) {
            if (A0A == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0A = uriMatcher2;
                uriMatcher2.addURI("com.whatsapp.provider.MigrationContentProvider", "msg_store", 1);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "wallpaper", 2);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "chat_setting_store", 3);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "sticker_store", 4);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "share_preferences", 5);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "status_ranking_store", 6);
                A0A.addURI("com.whatsapp.provider.MigrationContentProvider", "media", 7);
            }
            uriMatcher = A0A;
        }
        return uriMatcher;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r5.number.equals(r1) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r0 != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        if (r11 == 268435456) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(android.net.Uri r10, int r11) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationContentProvider.A01(android.net.Uri, int):int");
    }

    public final File A02(String str) {
        if (TextUtils.isEmpty(str) || !this.A04.A06()) {
            return null;
        }
        File file = new File(new File(this.A03.A02, "Media"), str);
        try {
            if (this.A00.A0K(file) && file.exists()) {
                return file;
            }
            return null;
        } catch (IOException unused) {
        }
    }

    public final void A03(File file, MatrixCursor matrixCursor, int i) {
        if (i != 0) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || (r4 = listFiles.length) == 0) {
                StringBuilder sb = new StringBuilder("MigrationContentProvider/fillMediaCursor/skipping folder ");
                sb.append(file);
                Log.i(sb.toString());
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A03(file2, matrixCursor, i - 1);
                } else {
                    matrixCursor.addRow(new String[]{file2.getAbsolutePath().replace(new File(this.A03.A02, "Media").getAbsolutePath(), "")});
                }
            }
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        File A022;
        if (A01(uri, -1) == 0 && A00().match(uri) == 7 && (A022 = A02(uri.getQueryParameter("path"))) != null && A022.delete()) {
            return 1;
        }
        return 0;
    }

    public String getType(Uri uri) {
        if (A01(uri, -1) != 0) {
            return null;
        }
        if (1 == A00().match(uri)) {
            try {
                Log.i("MigrationContentProvider/getType");
                File A0B2 = this.A06.A0B();
                if (A0B2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MigrationContentProvider/getType/msgstore-file-name = ");
                    sb.append(A0B2.getName());
                    Log.i(sb.toString());
                    return A0B2.getName();
                }
            } catch (Exception e) {
                Log.i("MigrationContentProvider/getType/exception = ", e);
            }
            return null;
        }
        throw new UnsupportedOperationException(AnonymousClass008.A0J("This operation is not supported ", uri));
    }

    public boolean onCreate() {
        AnonymousClass01I A002 = AnonymousClass01I.A00();
        AnonymousClass088 A003 = AnonymousClass088.A00();
        C000300f A004 = C000300f.A00();
        AnonymousClass03R A005 = AnonymousClass03R.A00();
        AnonymousClass0BZ A006 = AnonymousClass0BZ.A00();
        AnonymousClass02J A022 = AnonymousClass02J.A02();
        AnonymousClass0BB A007 = AnonymousClass0BB.A00();
        C02290Bk A023 = C02290Bk.A02();
        AnonymousClass00D A008 = AnonymousClass00D.A00();
        AnonymousClass03S A009 = AnonymousClass03S.A00();
        this.A01 = A002;
        this.A00 = A003;
        this.A02 = A004;
        this.A03 = A005;
        this.A09 = A006;
        this.A08 = A022;
        this.A07 = A007;
        this.A06 = A023;
        this.A05 = A008;
        this.A04 = A009;
        return true;
    }

    /* JADX INFO: finally extract failed */
    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        String obj;
        File A032;
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0K("Invalid mode: ", str));
        }
        int A012 = A01(uri, i);
        boolean z = false;
        int i2 = 0;
        if (A012 != 0) {
            switch (A012) {
                case 1:
                    i2 = 8;
                    break;
                case 2:
                    i2 = 9;
                    break;
                case 3:
                    i2 = 10;
                    break;
                case 4:
                    i2 = 11;
                    break;
                case 5:
                    i2 = 12;
                    break;
                case 6:
                    i2 = 13;
                    break;
                case 7:
                    break;
                default:
                    throw new IllegalArgumentException("cannot convert granted to InitializationState");
            }
            throw new FileNotFoundException(String.valueOf(i2));
        }
        StringBuilder A0S = AnonymousClass008.A0S("MigrationContentProvider/openFile/");
        A0S.append(uri.getPath());
        Log.i(A0S.toString());
        int match = A00().match(uri);
        File file = null;
        if (match == 1) {
            C02290Bk r3 = this.A06;
            AnonymousClass0GV r1 = r3.A0T;
            synchronized (r1) {
                r1.A00 = true;
            }
            C014508d r0 = r3.A0L;
            r0.A05();
            if (r0.A08.exists()) {
                Log.i("messageStoreBackup/getFileForMigration/backup-db");
                int A072 = r3.A07(null);
                StringBuilder A0S2 = AnonymousClass008.A0S("messageStoreBackup/finish-backup-db-successful? = ");
                if (A072 == 0) {
                    z = true;
                }
                AnonymousClass008.A1a(A0S2, z);
                if (A072 == 0) {
                    try {
                        File A0B2 = r3.A0B();
                        StringBuilder sb = new StringBuilder();
                        sb.append("messageStoreBackup/getFileForMigration/latest-backup-file");
                        sb.append(A0B2);
                        Log.i(sb.toString());
                        if (A0B2 != null) {
                            return ParcelFileDescriptor.open(A0B2, i);
                        }
                        return null;
                    } catch (IOException e) {
                        Log.e("messageStoreBackup/getFileForMigration/exception = ", e);
                        StringBuilder A0S3 = AnonymousClass008.A0S("messageStoreBackup/failed-to-get-backup-file");
                        A0S3.append(e.toString());
                        throw new FileNotFoundException(A0S3.toString());
                    }
                } else {
                    StringBuilder A0T = AnonymousClass008.A0T("messageStoreBackup/getFileForMigration/backup-failed/backup-result = ", A072, " log = ");
                    AnonymousClass0GV r12 = r3.A0T;
                    synchronized (r12) {
                        obj = r12.A01.toString();
                    }
                    A0T.append(obj);
                    throw new FileNotFoundException(A0T.toString());
                }
            } else {
                throw new FileNotFoundException("14");
            }
        } else if (match == 2) {
            AnonymousClass02J r13 = this.A08;
            if (!(r13 instanceof C02200Ba)) {
                A032 = AnonymousClass02J.A03(r13.A03.A00);
            } else {
                A032 = AnonymousClass02J.A03(((AnonymousClass02J) ((C02200Ba) r13).A05).A03.A00);
            }
            if (A032 != null) {
                return ParcelFileDescriptor.open(A032, i);
            }
            return null;
        } else if (match == 3) {
            AnonymousClass0BB r32 = this.A07;
            ReentrantReadWriteLock.WriteLock writeLock = r32.A0A().A05.writeLock();
            writeLock.lock();
            try {
                File databasePath = r32.A0A.A00.getDatabasePath("chatsettings.db");
                if (databasePath.exists()) {
                    r32.A0A().close();
                    writeLock.unlock();
                    file = databasePath;
                } else {
                    writeLock.unlock();
                }
                if (file != null) {
                    return ParcelFileDescriptor.open(file, i);
                }
                return null;
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        } else if (match == 4) {
            File A082 = this.A09.A08(AnonymousClass1Y4.UNENCRYPTED);
            if (A082 != null) {
                return ParcelFileDescriptor.open(A082, i);
            }
            return null;
        } else if (match == 6) {
            Log.w("MigrationContentProvider/openFile/st-rank not supported");
            return null;
        } else if (match == 7) {
            File A022 = A02(uri.getQueryParameter("path"));
            if (A022 != null) {
                return ParcelFileDescriptor.open(A022, i);
            }
            return null;
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0J("Unknown URI ", uri));
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        int A012 = A01(uri, -1);
        if (A012 != 0) {
            AnonymousClass008.A0w("MigrationContentProvider/query denied ", A012);
            return null;
        }
        int match = A00().match(uri);
        if (match == 5) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"key", "value", "valueType"});
            for (AnonymousClass02R r0 : A0B) {
                MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
                Object obj = r0.A00;
                newRow.add(obj);
                Object obj2 = r0.A01;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    if (obj != null) {
                        String str4 = (String) obj;
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (intValue == 2) {
                                    newRow.add(this.A05.A00.getString(str4, ""));
                                } else if (intValue != 1) {
                                    if (intValue != 2) {
                                        throw new IllegalArgumentException("unexpected type");
                                    }
                                }
                                str3 = "string";
                            } else {
                                newRow.add(Integer.valueOf(this.A05.A00.getBoolean(str4, false) ? 1 : 0));
                            }
                            str3 = "boolean";
                        } else {
                            newRow.add(Integer.valueOf(this.A05.A00.getInt(str4, 0)));
                            str3 = "int";
                        }
                        newRow.add(str3);
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            return matrixCursor;
        } else if (match == 7) {
            File file = new File(this.A03.A02, "Media");
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"path"});
            if (this.A04.A06() && file.exists()) {
                A03(file, matrixCursor2, 4);
            }
            return matrixCursor2;
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0J("Unknown URI ", uri));
        }
    }
}
