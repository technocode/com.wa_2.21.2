package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1qf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38921qf implements AbstractC03150Ez {
    public final /* synthetic */ AnonymousClass0XK A00;
    public final /* synthetic */ C56862jJ A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ byte[] A07;

    public /* synthetic */ C38921qf(AnonymousClass0XK r1, C56862jJ r2, String str, byte[] bArr, String str2, String str3, boolean z, File file) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = str;
        this.A07 = bArr;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = z;
        this.A02 = file;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        AnonymousClass0XK r1 = this.A00;
        C56862jJ r6 = this.A01;
        String str = this.A03;
        byte[] bArr = this.A07;
        String str2 = this.A04;
        String str3 = this.A05;
        boolean z = this.A06;
        File file = this.A02;
        Number number = (Number) obj;
        C50152Tp r0 = (C50152Tp) r6.A0G.A00();
        AnonymousClass1WE r5 = (AnonymousClass1WE) r6.A07.A00();
        if (r5 != null && !r5.A02.get()) {
            C006803i.A0m(r5.A01);
        }
        r6.A03();
        int intValue9 = number.intValue();
        if (intValue9 != 0 || r0 == null) {
            StringBuilder A0S = AnonymousClass008.A0S("RecvWebMessageListener/uploadMedia/failed to upload, error:");
            A0S.append(C002001d.A1N(intValue9));
            Log.e(A0S.toString());
            r1.A12.A01(str3, C70563Ln.A04(502), 43);
        } else {
            AnonymousClass0H3 r8 = r1.A0u;
            C50142To r4 = r0.A02;
            String A052 = r4.A05();
            String A062 = r4.A06();
            String A032 = r4.A03();
            String A042 = r4.A04();
            long j = r0.A01.A02.A02;
            int i = (int) j;
            if (r4.A02() == null) {
                intValue = 0;
            } else {
                intValue = r4.A02().intValue();
            }
            if (r4.A01() == null) {
                intValue2 = 0;
            } else {
                intValue2 = r4.A01().intValue();
            }
            C49932St r7 = new C49932St(str, A052, bArr, str2, A062, A032, A042, i, intValue, intValue2);
            synchronized (r8) {
                String str4 = r7.A07;
                if (str4 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("WebUploadMediaKeyStore/insert/");
                    sb.append(r7);
                    Log.d(sb.toString());
                    r8.A00.A07(str4, r7);
                    try {
                        AnonymousClass0BK A022 = r8.A01.A02();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("media_id", str4);
                        contentValues.put("file_hash", r7.A06);
                        contentValues.put("media_key", r7.A00);
                        contentValues.put("mime_type", r7.A08);
                        contentValues.put("upload_url", r7.A09);
                        contentValues.put("direct_path", r7.A04);
                        contentValues.put("enc_file_hash", r7.A05);
                        contentValues.put("file_size", Integer.valueOf(r7.A01));
                        contentValues.put("height", Integer.valueOf(r7.A02));
                        contentValues.put("width", Integer.valueOf(r7.A03));
                        A022.A0B("web_upload_media_data_store", contentValues, "insert/INSERT_WEB_UPLOAD_MEDIA_DATA_STORE");
                    } catch (SQLiteDatabaseCorruptException e) {
                        Log.e("WebUploadMediaKeyStore/insert", e);
                    }
                } else {
                    throw null;
                }
            }
            if (r4.A05() != null) {
                C04230Jo r72 = r1.A1C;
                boolean z2 = false;
                if (r72.A0B(r4.A05()) != null) {
                    z2 = true;
                }
                if (z2) {
                    String A053 = r4.A05();
                    String A063 = r4.A06();
                    String A043 = r4.A04();
                    String A033 = r4.A03();
                    String encodeToString = Base64.encodeToString(bArr, 0);
                    if (r4.A02() == null) {
                        intValue7 = 0;
                    } else {
                        intValue7 = r4.A02().intValue();
                    }
                    if (r4.A01() == null) {
                        intValue8 = 0;
                    } else {
                        intValue8 = r4.A01().intValue();
                    }
                    r72.A0F(A053, A063, A043, A033, str2, encodeToString, i, intValue7, intValue8);
                }
            }
            if (r4.A05() != null) {
                C03580Gu r9 = r1.A1E;
                if (r9.A02(r4.A05())) {
                    String A054 = r4.A05();
                    String A064 = r4.A06();
                    String A044 = r4.A04();
                    String A034 = r4.A03();
                    String encodeToString2 = Base64.encodeToString(bArr, 0);
                    if (r4.A02() == null) {
                        intValue5 = 0;
                    } else {
                        intValue5 = r4.A02().intValue();
                    }
                    if (r4.A01() == null) {
                        intValue6 = 0;
                    } else {
                        intValue6 = r4.A01().intValue();
                    }
                    C03600Gw r12 = r9.A02;
                    if (r12 != null) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("url", A064);
                        contentValues2.put("enc_hash", A044);
                        contentValues2.put("direct_path", A034);
                        contentValues2.put("mimetype", str2);
                        contentValues2.put("media_key", encodeToString2);
                        contentValues2.put("file_size", Integer.valueOf(i));
                        contentValues2.put("width", Integer.valueOf(intValue5));
                        contentValues2.put("height", Integer.valueOf(intValue6));
                        ReentrantReadWriteLock.ReadLock readLock = r12.A01;
                        readLock.lock();
                        try {
                            r12.A00.A03().A00("starred_stickers", contentValues2, "plaintext_hash = ?", new String[]{A054}, "updateStickerAttrsByFileHash/UPDATE_STARRED_STICKERS");
                        } finally {
                            readLock.unlock();
                        }
                    } else {
                        throw null;
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("RecvWebMessageListener/uploadMedia/mediaUploadResponse: ");
            sb2.append(r0);
            Log.d(sb2.toString());
            if (r4 == null) {
                throw null;
            } else if (r4.A00() != null) {
                String A065 = r4.A06();
                byte[] bArr2 = r4.A00().A01;
                String A055 = r4.A05();
                String A035 = r4.A03();
                String A045 = r4.A04();
                if (r4.A02() == null) {
                    intValue3 = 0;
                } else {
                    intValue3 = r4.A02().intValue();
                }
                if (r4.A01() == null) {
                    intValue4 = 0;
                } else {
                    intValue4 = r4.A01().intValue();
                }
                C70563Ln r122 = new C70563Ln(200, A065, bArr2, A055, A035, A045, str2, intValue3, intValue4, j);
                StringBuilder sb3 = new StringBuilder("RecvWebMessageListener/uploadMedia/send web response:");
                sb3.append(r122);
                Log.d(sb3.toString());
                r1.A12.A01(str3, r122, 43);
            } else {
                throw null;
            }
        }
        if (z) {
            C006803i.A0m(file);
        }
    }
}
