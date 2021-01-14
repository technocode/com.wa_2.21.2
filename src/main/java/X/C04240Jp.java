package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Jp  reason: invalid class name and case insensitive filesystem */
public class C04240Jp implements AbstractC03430Gf {
    public static volatile C04240Jp A03;
    public final AnonymousClass0BZ A00;
    public final ReentrantReadWriteLock.ReadLock A01;
    public volatile List A02;

    public C04240Jp(AnonymousClass0BZ r2) {
        this.A00 = r2;
        this.A01 = r2.A07().A04.readLock();
    }

    public void A00(C29241Xq r10) {
        if (r10.A0A == null) {
            Log.e("RecentStickerDBStorage/updateSticker/sticker filehash is null, could not be updated");
            return;
        }
        ReentrantReadWriteLock.ReadLock readLock = this.A01;
        readLock.lock();
        try {
            String[] strArr = {r10.A0A};
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", r10.A0D);
            contentValues.put("enc_hash", r10.A06);
            contentValues.put("direct_path", r10.A05);
            contentValues.put("mimetype", r10.A09);
            contentValues.put("media_key", r10.A08);
            contentValues.put("file_size", Integer.valueOf(r10.A00));
            contentValues.put("width", Integer.valueOf(r10.A03));
            contentValues.put("height", Integer.valueOf(r10.A02));
            this.A00.A07().A03().A00("recent_stickers", contentValues, "plaintext_hash = ?", strArr, "updateSticker/UPDATE_RECENT_STICKERS");
        } finally {
            readLock.unlock();
        }
    }

    @Override // X.AbstractC03430Gf
    public AnonymousClass2QD A3H(Object obj, float f) {
        return new C71893Qs(f, (AnonymousClass33A) obj);
    }

    @Override // X.AbstractC03430Gf
    public /* bridge */ /* synthetic */ Object A6b(String str) {
        for (C71893Qs r0 : this.A02) {
            AnonymousClass33A r2 = r0.A01;
            if (str.equals(r2.A01)) {
                return r2;
            }
        }
        C29241Xq r1 = new C29241Xq();
        r1.A0A = str;
        return new AnonymousClass33A(str, null, r1);
    }

    @Override // X.AbstractC03430Gf
    public String A70(Object obj) {
        return ((AnonymousClass33A) obj).A01;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d8, code lost:
        if (r10 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00dd, code lost:
        throw r0;
     */
    @Override // X.AbstractC03430Gf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List AAW() {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04240Jp.AAW():java.util.List");
    }

    /* JADX INFO: finally extract failed */
    @Override // X.AbstractC03430Gf
    public void AM3(List list) {
        AnonymousClass00E.A00();
        this.A02 = new ArrayList(list);
        List<C71893Qs> list2 = this.A02;
        ReentrantReadWriteLock.ReadLock readLock = this.A01;
        readLock.lock();
        try {
            readLock.lock();
            try {
                AnonymousClass0BZ r5 = this.A00;
                r5.A07().A03().A0C("DELETE FROM recent_stickers", "CLEAR_RECENT_STICKER_TABLE");
                readLock.unlock();
                for (C71893Qs r6 : list2) {
                    ContentValues contentValues = new ContentValues();
                    AnonymousClass33A r2 = r6.A01;
                    contentValues.put("plaintext_hash", r2.A01);
                    contentValues.put("entry_weight", Float.valueOf(r6.A9r()));
                    contentValues.put("hash_of_image_part", r2.A02);
                    C29241Xq r22 = r2.A00;
                    contentValues.put("url", r22.A0D);
                    contentValues.put("enc_hash", r22.A06);
                    contentValues.put("direct_path", r22.A05);
                    contentValues.put("mimetype", r22.A09);
                    contentValues.put("media_key", r22.A08);
                    contentValues.put("file_size", Integer.valueOf(r22.A00));
                    contentValues.put("width", Integer.valueOf(r22.A03));
                    contentValues.put("height", Integer.valueOf(r22.A02));
                    r5.A07().A03().A04("recent_stickers", contentValues, "saveWeightedStickerIdentifierToDB/REPLACE_RECENT_STICKERS");
                }
                readLock.unlock();
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }
}
