package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Dn  reason: invalid class name and case insensitive filesystem */
public class C02810Dn {
    public static volatile C02810Dn A03;
    public final AnonymousClass00G A00;
    public final AnonymousClass04q A01;
    public volatile AnonymousClass0E0 A02;

    public C02810Dn(AnonymousClass00G r1, AnonymousClass04q r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public AnonymousClass0E0 A00() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = new AnonymousClass0E0(this.A00.A00, this.A01);
                }
            }
        }
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        if (r7 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(boolean r18, long r19) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02810Dn.A01(boolean, long):java.util.List");
    }

    public void A02(C02900Dx r6) {
        AnonymousClass0BK A012 = A00().A01();
        ContentValues contentValues = new ContentValues();
        UserJid userJid = r6.A06;
        contentValues.put("jid", userJid.getRawString());
        contentValues.put("latitude", Double.valueOf(r6.A00));
        contentValues.put("longitude", Double.valueOf(r6.A01));
        contentValues.put("accuracy", Integer.valueOf(r6.A03));
        contentValues.put("speed", Float.valueOf(r6.A02));
        contentValues.put("bearing", Integer.valueOf(r6.A04));
        contentValues.put("location_ts", Long.valueOf(r6.A05));
        A012.A05("location_cache", contentValues, "saveUserLocation/REPLACE_LOCATION_CACHE");
        StringBuilder sb = new StringBuilder("LocationSharingStore/saveUserLocation/saved user location; jid=");
        sb.append(userJid);
        sb.append("; timestamp=");
        AnonymousClass008.A1P(sb, r6.A05);
    }

    public void A03(Collection collection) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0BK A012 = A00().A01();
        try {
            SQLiteDatabase sQLiteDatabase = A012.A00;
            sQLiteDatabase.beginTransaction();
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += A012.A01("location_cache", "jid = ?", new String[]{((UserJid) it.next()).getRawString()}, "deleteUserLocations/DELETE_LOCATION_CACHE");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            StringBuilder sb = new StringBuilder("LocationSharingStore/deleteUserLocations/deleted ");
            sb.append(i);
            sb.append(" location sharers | time: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(sb.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteUserLocations/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            A012.A00.endTransaction();
            throw th;
        }
    }

    public void A04(Collection collection, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0BK A012 = A00().A01();
        try {
            SQLiteDatabase sQLiteDatabase = A012.A00;
            sQLiteDatabase.beginTransaction();
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                C02910Dy r7 = (C02910Dy) it.next();
                Iterator it2 = r7.A03.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        UserJid userJid = (UserJid) it2.next();
                        ContentValues contentValues = new ContentValues();
                        C007303n r10 = r7.A02;
                        AnonymousClass02N r0 = r10.A00;
                        if (r0 != null) {
                            contentValues.put("remote_jid", r0.getRawString());
                            contentValues.put("from_me", Boolean.TRUE);
                            contentValues.put("remote_resource", userJid.getRawString());
                            contentValues.put("expires", Long.valueOf(Math.min(r7.A01, j)));
                            contentValues.put("message_id", r10.A01);
                            int i2 = 0;
                            if (A012.A05("location_sharer", contentValues, "updateSharingExpire/REPLACE_LOCATION_SHARER") >= 0) {
                                i2 = 1;
                            }
                            i += i2;
                        } else {
                            throw null;
                        }
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            StringBuilder sb = new StringBuilder("LocationSharingStore/updateSharingExpire/update ");
            sb.append(i);
            sb.append(" location sharers | time: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(sb.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/updateSharingExpire/save failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            A012.A00.endTransaction();
            throw th;
        }
    }

    public void A05(List list) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0BK A012 = A00().A01();
        try {
            SQLiteDatabase sQLiteDatabase = A012.A00;
            sQLiteDatabase.beginTransaction();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass0E2 r7 = (AnonymousClass0E2) it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("remote_jid", r7.A01.getRawString());
                UserJid userJid = r7.A02;
                String str = null;
                if (userJid != null) {
                    str = userJid.getRawString();
                }
                contentValues.put("remote_resource", str);
                C007303n r3 = r7.A03;
                contentValues.put("from_me", Boolean.valueOf(r3.A02));
                contentValues.put("expires", Long.valueOf(r7.A00));
                contentValues.put("message_id", r3.A01);
                A012.A05("location_sharer", contentValues, "saveLocationSharer/REPLACE_LOCATION_SHARER");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            StringBuilder sb = new StringBuilder("LocationSharingStore/saveLocationSharer/saved ");
            sb.append(list.size());
            sb.append(" location sharers | time: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(sb.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/saveLocationSharer/save failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            A012.A00.endTransaction();
            throw th;
        }
    }

    public void A06(List list, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0BK A012 = A00().A01();
        try {
            SQLiteDatabase sQLiteDatabase = A012.A00;
            sQLiteDatabase.beginTransaction();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("jid", ((UserJid) it.next()).getRawString());
                contentValues.put("sent_to_server", Boolean.valueOf(z));
                A012.A05("location_key_distribution", contentValues, "storeLocationReceiverHasKey/REPLACE_LOCATION_KEY_DISTRIBUTION");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            StringBuilder sb = new StringBuilder("LocationSharingStore/storeLocationReceiverHasKey/saved ");
            sb.append(list.size());
            sb.append(" location receiver has key: ");
            sb.append(z);
            sb.append(" | time: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(sb.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/storeLocationReceiverHasKey/save failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            A012.A00.endTransaction();
            throw th;
        }
    }

    public final void A07(boolean z, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0BK A012 = A00().A01();
        try {
            String[] strArr = new String[3];
            strArr[0] = Long.toString(j);
            strArr[1] = Long.toString(0);
            strArr[2] = z ? "1" : "0";
            StringBuilder A0T = AnonymousClass008.A0T("LocationSharingStore/deleteOldLocationSharers/deleted ", A012.A01("location_sharer", "expires < ? AND expires > ? AND from_me = ?", strArr, "deleteOldLocationSharers/DELETE_LOCATION_SHARER"), " location sharers | time: ");
            A0T.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(A0T.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteOldLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        }
    }

    public final void A08(boolean z, AnonymousClass02N r15, Collection collection) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0BK A012 = A00().A01();
        try {
            SQLiteDatabase sQLiteDatabase = A012.A00;
            sQLiteDatabase.beginTransaction();
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                String[] strArr = new String[3];
                strArr[0] = r15.getRawString();
                strArr[1] = ((UserJid) it.next()).getRawString();
                strArr[2] = z ? "1" : "0";
                i += A012.A01("location_sharer", "remote_jid = ? AND remote_resource = ? AND from_me = ?", strArr, "deleteLocationSharers/DELETE_LOCATION_SHARER");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            StringBuilder sb = new StringBuilder("LocationSharingStore/deleteLocationSharers/deleted ");
            sb.append(i);
            sb.append(" location sharers | time: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(sb.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            A012.A00.endTransaction();
            throw th;
        }
    }

    public final void A09(boolean z, Iterable iterable) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0BK A012 = A00().A01();
        try {
            SQLiteDatabase sQLiteDatabase = A012.A00;
            sQLiteDatabase.beginTransaction();
            Iterator it = iterable.iterator();
            int i = 0;
            while (it.hasNext()) {
                String[] strArr = new String[2];
                strArr[0] = ((AnonymousClass02N) it.next()).getRawString();
                strArr[1] = z ? "1" : "0";
                i += A012.A01("location_sharer", "remote_jid = ? AND from_me = ?", strArr, "deleteLocationSharers/DELETE_LOCATION_SHARER");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            StringBuilder sb = new StringBuilder("LocationSharingStore/deleteLocationSharers/deleted ");
            sb.append(i);
            sb.append(" location sharers | time: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            Log.i(sb.toString());
        } catch (Exception e) {
            Log.e("LocationSharingStore/deleteLocationSharers/delete failed", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            A012.A00.endTransaction();
            throw th;
        }
    }
}
