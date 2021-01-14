package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2eJ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC54072eJ implements AbstractC48892Oe {
    public Cursor A00;
    public boolean A01 = false;
    public final int A02;
    public final ContentResolver A03;
    public final Uri A04;
    public final AnonymousClass08V A05 = new AnonymousClass08V(512);
    public final AnonymousClass00G A06;
    public final AnonymousClass0XO A07;
    public final C007703s A08;
    public final String A09;

    public AbstractC54072eJ(AnonymousClass00G r13, AnonymousClass0XO r14, C007703s r15, Uri uri, int i, String str) {
        String str2;
        Cursor query;
        String str3;
        String[] strArr;
        String str4;
        String[] strArr2;
        String str5;
        this.A06 = r13;
        this.A07 = r14;
        this.A08 = r15;
        this.A03 = r13.A00.getContentResolver();
        this.A02 = i;
        this.A04 = uri;
        this.A09 = str;
        if (this instanceof C59812oK) {
            ContentResolver contentResolver = this.A03;
            Uri uri2 = this.A04;
            String[] strArr3 = C59812oK.A00;
            String str6 = this.A09;
            if (str6 != null) {
                str2 = AnonymousClass008.A0O(AnonymousClass008.A0S("bucket_id = '"), str6, "'");
            } else {
                str2 = null;
            }
            query = MediaStore.Images.Media.query(contentResolver, uri2, strArr3, str2, null, A02());
        } else if (this instanceof C59762oF) {
            ContentResolver contentResolver2 = this.A03;
            Uri uri3 = this.A04;
            String[] strArr4 = C59762oF.A01;
            String str7 = this.A09;
            if (str7 == null) {
                str3 = "(mime_type in (?, ?))";
            } else {
                str3 = "(mime_type in (?, ?)) AND bucket_id = ?";
            }
            String[] strArr5 = C59762oF.A00;
            if (str7 != null) {
                int length = strArr5.length;
                strArr = new String[(length + 1)];
                System.arraycopy(strArr5, 0, strArr, 0, length);
                strArr[length] = str7;
            } else {
                strArr = strArr5;
            }
            query = MediaStore.Images.Media.query(contentResolver2, uri3, strArr4, str3, strArr, A02());
        } else if (this instanceof C59742oD) {
            ContentResolver contentResolver3 = this.A03;
            Uri uri4 = this.A04;
            String[] strArr6 = C59742oD.A01;
            String str8 = this.A09;
            if (str8 == null) {
                str4 = "(mime_type in (?))";
            } else {
                str4 = "(mime_type in (?)) AND bucket_id = ?";
            }
            String[] strArr7 = C59742oD.A00;
            if (str8 != null) {
                int length2 = strArr7.length;
                strArr2 = new String[(length2 + 1)];
                System.arraycopy(strArr7, 0, strArr2, 0, length2);
                strArr2[length2] = str8;
            } else {
                strArr2 = strArr7;
            }
            query = MediaStore.Images.Media.query(contentResolver3, uri4, strArr6, str4, strArr2, A02());
        } else if (!(this instanceof C59722oB)) {
            query = this.A03.query(this.A04, C47942Kh.A05, null, null, A02());
        } else {
            ContentResolver contentResolver4 = this.A03;
            Uri uri5 = this.A04;
            String[] strArr8 = C59722oB.A00;
            String str9 = this.A09;
            if (str9 == null) {
                str5 = "media_type in (1, 3)";
            } else {
                str5 = "media_type in (1, 3) and bucket_id=?";
            }
            query = contentResolver4.query(uri5, strArr8, str5, str9 == null ? null : new String[]{str9}, A02());
        }
        this.A00 = query;
        if (query == null) {
            Log.w("medialist/createCursor returns null");
        }
        this.A05.A06(0);
    }

    public final Cursor A00() {
        synchronized (this) {
            Cursor cursor = this.A00;
            if (cursor == null) {
                return null;
            }
            if (this.A01) {
                cursor.requery();
                this.A01 = false;
            }
            return this.A00;
        }
    }

    public Uri A01(long j) {
        try {
            Uri uri = this.A04;
            if (ContentUris.parseId(uri) != j) {
                Log.e("medialist/id mismatch");
            }
            return uri;
        } catch (NumberFormatException unused) {
            return ContentUris.withAppendedId(this.A04, j);
        }
    }

    public String A02() {
        String str;
        if (this.A02 == 1) {
            str = " ASC";
        } else {
            str = " DESC";
        }
        return AnonymousClass008.A0M("case ifnull(datetaken,0) when 0 then date_modified*1000 else datetaken end", str, ", _id", str);
    }

    @Override // X.AbstractC48892Oe
    public AbstractC48882Od A7I(int i) {
        boolean z;
        AnonymousClass08V r9 = this.A05;
        Integer valueOf = Integer.valueOf(i);
        AbstractC48882Od r10 = (AbstractC48882Od) r9.A03(valueOf);
        if (r10 != null) {
            return r10;
        }
        Cursor A002 = A00();
        AbstractC48882Od r102 = null;
        if (A002 == null) {
            return null;
        }
        synchronized (this) {
            if (A002.moveToPosition(i)) {
                if (this instanceof C59812oK) {
                    long j = A002.getLong(0);
                    String string = A002.getString(1);
                    long j2 = A002.getLong(2);
                    if (j2 == 0) {
                        j2 = A002.getLong(6) * 1000;
                    }
                    String string2 = A002.getString(5);
                    long j3 = A002.getLong(7);
                    if (string == null || !GifHelper.A02(new File(string))) {
                        r102 = new C59802oJ(this.A06, this.A07, this.A08, j, A002.getPosition(), A01(j), string, string2, j2, j3);
                    } else {
                        AnonymousClass00G r3 = this.A06;
                        A002.getPosition();
                        r102 = new C59732oC(r3, j, A01(j), string, string2, j2, j3);
                    }
                } else if (this instanceof C59762oF) {
                    long j4 = A002.getLong(0);
                    String string3 = A002.getString(1);
                    long j5 = A002.getLong(2);
                    if (j5 == 0) {
                        j5 = A002.getLong(7) * 1000;
                    }
                    r102 = new C59752oE(this.A06, this.A08, j4, A002.getPosition(), A01(j4), string3, A002.getString(6), j5, A002.getInt(4), A002.getLong(8));
                } else if (this instanceof C59742oD) {
                    long j6 = A002.getLong(0);
                    String string4 = A002.getString(1);
                    long j7 = A002.getLong(2);
                    if (j7 == 0) {
                        j7 = A002.getLong(7) * 1000;
                    }
                    r102 = new C59752oE(this.A06, this.A08, j6, A002.getPosition(), A01(j6), string4, A002.getString(6), j7, A002.getInt(4), A002.getLong(8));
                } else if (!(this instanceof C59722oB)) {
                    String string5 = A002.getString(1);
                    if (string5 != null) {
                        long j8 = A002.getLong(2);
                        short s = A002.getShort(5);
                        File file = new File(string5);
                        if (s == 1) {
                            r102 = new C59642o3(file, j8);
                        } else if (s == 3) {
                            r102 = new C59672o6(file, j8, A002.getLong(6));
                        } else if (s == 13) {
                            r102 = new C59632o2(file, j8, A002.getLong(6));
                        }
                    }
                } else {
                    long j9 = A002.getLong(0);
                    String string6 = A002.getString(1);
                    long j10 = A002.getLong(5);
                    if (j10 == 0) {
                        j10 = A002.getLong(4) * 1000;
                    }
                    String string7 = A002.getString(2);
                    int i2 = A002.getInt(3);
                    long j11 = A002.getLong(7);
                    File file2 = string6 != null ? new File(string6) : null;
                    if (i2 != 3) {
                        if ("image/gif".equals(string7) && file2 != null) {
                            try {
                                C04900Mh.A03(file2);
                                z = true;
                            } catch (IOException unused) {
                                z = false;
                            }
                            if (z) {
                                try {
                                    if (!(!C04900Mh.A03(file2).A02)) {
                                        AnonymousClass00G r4 = this.A06;
                                        A002.getPosition();
                                        r102 = new C59732oC(r4, j9, A01(j9), string6, string7, j10, j11);
                                    }
                                } catch (IOException e) {
                                    Log.e("LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/IOException", e);
                                } catch (OutOfMemoryError e2) {
                                    Log.e("LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/OutOfMemory", e2);
                                }
                            }
                        }
                        r102 = new C59752oE(this.A06, this.A08, j9, A002.getPosition(), A01(j9), string6, string7, j10, A002.getInt(6), j11);
                    } else if (file2 == null || !GifHelper.A02(file2)) {
                        r102 = new C59802oJ(this.A06, this.A07, this.A08, j9, A002.getPosition(), A01(j9), string6, string7, j10, j11);
                    } else {
                        AnonymousClass00G r42 = this.A06;
                        A002.getPosition();
                        r102 = new C59732oC(r42, j9, A01(j9), string6, string7, j10, j11);
                    }
                }
                if (r102 != null) {
                    r9.A07(valueOf, r102);
                }
            }
        }
        return r102;
    }

    @Override // X.AbstractC48892Oe
    public void AMq() {
        Cursor cursor;
        if ((this instanceof C59652o4) && (cursor = this.A00) != null) {
            cursor.deactivate();
            this.A01 = true;
        }
    }

    @Override // X.AbstractC48892Oe
    public void close() {
        try {
            Cursor cursor = this.A00;
            if (cursor != null) {
                cursor.deactivate();
                this.A01 = true;
            }
        } catch (IllegalStateException e) {
            Log.e("medialist/exception while deactivating cursor", e);
        }
        Cursor cursor2 = this.A00;
        if (cursor2 != null) {
            cursor2.close();
            this.A00 = null;
        }
    }

    @Override // X.AbstractC48892Oe
    public int getCount() {
        int count;
        Cursor A002 = A00();
        if (A002 == null) {
            return 0;
        }
        synchronized (this) {
            count = A002.getCount();
        }
        return count;
    }

    @Override // X.AbstractC48892Oe
    public boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // X.AbstractC48892Oe
    public void registerContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof C59652o4) && (cursor = this.A00) != null) {
            cursor.registerContentObserver(contentObserver);
        }
    }

    @Override // X.AbstractC48892Oe
    public void unregisterContentObserver(ContentObserver contentObserver) {
        Cursor cursor;
        if ((this instanceof C59652o4) && (cursor = this.A00) != null) {
            cursor.unregisterContentObserver(contentObserver);
        }
    }
}
