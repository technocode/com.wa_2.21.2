package X;

import android.content.ContentValues;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Gt  reason: invalid class name and case insensitive filesystem */
public class C03570Gt {
    public static volatile C03570Gt A0T;
    public C664334g A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass088 A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass0B3 A04;
    public final C000300f A05;
    public final AnonymousClass08D A06;
    public final AnonymousClass00C A07;
    public final AnonymousClass00G A08;
    public final C002701k A09;
    public final C02660Cy A0A;
    public final AnonymousClass0H3 A0B;
    public final AnonymousClass0EN A0C;
    public final C02360Br A0D;
    public final AnonymousClass0H2 A0E;
    public final AnonymousClass0HC A0F;
    public final C03620Gz A0G;
    public final AnonymousClass0H0 A0H;
    public final AnonymousClass0HA A0I;
    public final AnonymousClass0HD A0J;
    public final AnonymousClass0H4 A0K;
    public final WebpUtils A0L;
    public final AnonymousClass0H1 A0M;
    public final C03580Gu A0N;
    public final AnonymousClass0BZ A0O;
    public final AnonymousClass0H9 A0P;
    public final AnonymousClass0HB A0Q;
    public final AnonymousClass00T A0R;
    public final byte[] A0S;

    public C03570Gt(AnonymousClass00G r5, AnonymousClass08D r6, C002701k r7, AnonymousClass02M r8, AnonymousClass009 r9, AnonymousClass00T r10, WebpUtils webpUtils, AnonymousClass088 r12, C000300f r13, C02360Br r14, C03580Gu r15, AnonymousClass0BZ r16, C03620Gz r17, AnonymousClass00C r18, AnonymousClass0EN r19, C02660Cy r20, AnonymousClass00D r21, AnonymousClass0H1 r22, AnonymousClass0H2 r23, AnonymousClass0H3 r24, AnonymousClass0H4 r25, AnonymousClass0H0 r26, AnonymousClass0HA r27, AnonymousClass0HB r28, AnonymousClass0B3 r29, AnonymousClass0HC r30, AnonymousClass0HD r31, AnonymousClass0H9 r32) {
        this.A08 = r5;
        this.A06 = r6;
        this.A09 = r7;
        this.A03 = r8;
        this.A01 = r9;
        this.A0R = r10;
        this.A0L = webpUtils;
        this.A02 = r12;
        this.A05 = r13;
        this.A0D = r14;
        this.A0N = r15;
        this.A07 = r18;
        this.A0G = r17;
        this.A0C = r19;
        this.A0A = r20;
        this.A0M = r22;
        this.A0B = r24;
        this.A0K = r25;
        this.A0H = r26;
        this.A0Q = r28;
        this.A04 = r29;
        this.A0J = r31;
        this.A0O = r16;
        this.A0I = r27;
        this.A0F = r30;
        this.A0E = r23;
        this.A0P = r32;
        String string = r21.A00.getString("sticker_hash_salt", null);
        if (string == null) {
            byte[] A0C2 = C007603r.A0C(32);
            this.A0S = A0C2;
            AnonymousClass008.A0m(r21, "sticker_hash_salt", Base64.encodeToString(A0C2, 2));
            return;
        }
        this.A0S = Base64.decode(string, 0);
    }

    public static C03570Gt A00() {
        if (A0T == null) {
            synchronized (C03570Gt.class) {
                if (A0T == null) {
                    AnonymousClass00G r6 = AnonymousClass00G.A01;
                    AnonymousClass08D A002 = AnonymousClass08D.A00();
                    C002701k A003 = C002701k.A00();
                    AnonymousClass02M A004 = AnonymousClass02M.A00();
                    AnonymousClass009 A005 = AnonymousClass009.A00();
                    AnonymousClass00T A006 = C002101e.A00();
                    WebpUtils A007 = WebpUtils.A00();
                    AnonymousClass088 A008 = AnonymousClass088.A00();
                    C000300f A009 = C000300f.A00();
                    C02360Br A0010 = C02360Br.A00();
                    C03580Gu A0011 = C03580Gu.A00();
                    AnonymousClass0BZ A0012 = AnonymousClass0BZ.A00();
                    C03620Gz A0013 = C03620Gz.A00();
                    AnonymousClass00C A0014 = AnonymousClass00C.A00();
                    AnonymousClass0EN A0015 = AnonymousClass0EN.A00();
                    C02660Cy A0016 = C02660Cy.A00();
                    AnonymousClass00D A0017 = AnonymousClass00D.A00();
                    AnonymousClass0H1 A0018 = AnonymousClass0H1.A00();
                    if (AnonymousClass0H2.A02 == null) {
                        synchronized (AnonymousClass0H2.class) {
                            if (AnonymousClass0H2.A02 == null) {
                                AnonymousClass0H2.A02 = new AnonymousClass0H2(AnonymousClass0CL.A00(), C02660Cy.A00());
                            }
                        }
                    }
                    AnonymousClass0H2 r24 = AnonymousClass0H2.A02;
                    AnonymousClass0H3 A0019 = AnonymousClass0H3.A00();
                    AnonymousClass0H4 A0020 = AnonymousClass0H4.A00();
                    AnonymousClass0H0 A0021 = AnonymousClass0H0.A00();
                    AnonymousClass0HA A0022 = AnonymousClass0HA.A00();
                    if (AnonymousClass0HB.A02 == null) {
                        synchronized (AnonymousClass0HB.class) {
                            if (AnonymousClass0HB.A02 == null) {
                                AnonymousClass0HB.A02 = new AnonymousClass0HB(AnonymousClass0BZ.A00());
                            }
                        }
                    }
                    A0T = new C03570Gt(r6, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, r24, A0019, A0020, A0021, A0022, AnonymousClass0HB.A02, AnonymousClass0B3.A00(), AnonymousClass0HC.A00(), AnonymousClass0HD.A00(), AnonymousClass0H9.A00());
                }
            }
        }
        return A0T;
    }

    public static final void A01(AnonymousClass0H3 r2, AnonymousClass33N r3) {
        for (C29241Xq r0 : r3.A04) {
            r2.A02(r0.A0A);
        }
        r2.A02(r3.A0D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A02(X.C29241Xq r10) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03570Gt.A02(X.1Xq):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r3 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass33N A03(java.lang.String r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03570Gt.A03(java.lang.String, boolean):X.33N");
    }

    public C664334g A04() {
        C664334g r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00G r7 = this.A08;
        File file = new File(r7.A00.getCacheDir(), "stickers_preview_images");
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder A0S2 = AnonymousClass008.A0S("StickerRepository/getPreviewImageLoader/could not create diskcache directory:");
            A0S2.append(file.getAbsolutePath());
            Log.w(A0S2.toString());
        }
        C664234e r6 = new C664234e(this.A03, this.A0A, file);
        r6.A01 = Integer.MAX_VALUE;
        r6.A02 = Math.min(4194304L, file.getFreeSpace() / 16);
        r6.A04 = C004302a.A03(r7.A00, R.drawable.sticker_store_error);
        r6.A03 = C004302a.A03(r7.A00, R.drawable.sticker_store_error);
        r6.A05 = true;
        C664334g A002 = r6.A00();
        this.A00 = A002;
        return A002;
    }

    public File A05(C29241Xq r6) {
        Pair A022;
        Object obj;
        Object obj2;
        String str = r6.A0A;
        if (str != null) {
            AnonymousClass0B3 r4 = this.A04;
            File A023 = r4.A02(str);
            if (!(A023 != null || (A022 = A02(r6)) == null || (obj = A022.first) == null || (obj2 = A022.second) == null)) {
                try {
                    File A072 = A07((File) obj, (String) obj2);
                    r4.A02((String) A022.second);
                    return A072;
                } catch (IOException unused) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("StickerRepository/incrementReferenceCountOnThirdPartySticker unable to move ");
                    A0S2.append(((File) A022.first).getAbsolutePath());
                    A0S2.append(" to internal storage");
                    Log.e(A0S2.toString());
                }
            }
            return A023;
        }
        throw null;
    }

    public File A06(C29241Xq r3, File file) {
        if (!new C75043c2(this.A0F, r3, file).A02().A02()) {
            file = null;
        } else if (file != null) {
            r3.A07 = file.getAbsolutePath();
            r3.A01 = 1;
            String absolutePath = file.getAbsolutePath();
            if (this.A0L != null) {
                r3.A04 = C29251Xr.A00(WebpUtils.fetchWebpMetadata(absolutePath));
                StringBuilder sb = new StringBuilder("StickerRepository/downloadSticker/downloaded sticker, file_hash:");
                sb.append(r3.A0A);
                sb.append(",media_key:");
                sb.append(r3.A08);
                sb.append(",file:");
                sb.append(file.getAbsolutePath());
                sb.append(", direct_path:");
                sb.append(r3.A05);
                Log.i(sb.toString());
                return file;
            }
            throw null;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("StickerRepository/downloadSticker/sticker file is null for: ");
        A0S2.append(r3.A0A);
        Log.e(A0S2.toString());
        return file;
    }

    public final File A07(File file, String str) {
        File A032 = this.A04.A03(str);
        try {
            C006803i.A0Y(this.A02.A04, file, A032);
            return A032;
        } catch (IOException e) {
            Log.e("StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file");
            C006803i.A0m(file);
            throw e;
        }
    }

    public final File A08(String str) {
        File A012 = this.A04.A01();
        if (A012.exists() || A012.mkdirs()) {
            return new File(A012, AnonymousClass008.A0K(str, ".png"));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A09(X.AnonymousClass33N r4) {
        /*
            r3 = this;
            java.lang.String r2 = r4.A0D
            java.io.File r1 = r3.A08(r2)
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            X.0H4 r0 = r3.A0K
            java.io.File r1 = r0.A02(r2)
        L_0x0014:
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x003e
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r1)
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x0037 }
            X.C002001d.A32(r2, r0)     // Catch:{ all -> 0x0037 }
            byte[] r1 = r0.digest()     // Catch:{ all -> 0x0037 }
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0037 }
            r2.close()
            return r0
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        L_0x003e:
            java.lang.String r1 = "StickerRepository/calculateThirdPartyTrayFileHash/cannot fetch third party tray"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03570Gt.A09(X.33N):java.lang.String");
    }

    public String A0A(List list) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass33N r6 = (AnonymousClass33N) it.next();
                String str = r6.A02;
                if (str != null) {
                    instance.update(str.getBytes());
                } else if (r6.A0N) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("StickerRepository/calculateImageDataHashForThirdParty, id: ");
                    String str2 = r6.A0D;
                    A0S2.append(str2);
                    Log.i(A0S2.toString());
                    String str3 = r6.A0E;
                    if (str3 == null) {
                        MessageDigest instance2 = MessageDigest.getInstance("MD5");
                        Iterator it2 = r6.A04.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String str4 = ((C29241Xq) it2.next()).A0A;
                            if (str4 == null) {
                                this.A01.A04("third party sticker plaintext hash is null", null, true);
                                instance2.update(str2.getBytes());
                                break;
                            }
                            instance2.update(str4.getBytes());
                        }
                        String A092 = A09(r6);
                        if (A092 != null) {
                            instance2.update(A092.getBytes());
                        }
                        str3 = C003701u.A05(Base64.encodeToString(instance2.digest(), 2));
                    }
                    instance.update(str3.getBytes());
                }
            }
            return C003701u.A05(Base64.encodeToString(instance.digest(), 2));
        } catch (IOException | NoSuchAlgorithmException e) {
            Log.e("app/xmpp/recv/handle_sticker_pack_query/could not get MD5 message digest", e);
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                String str5 = ((AnonymousClass33N) list.get(i)).A02;
                AnonymousClass33N r0 = (AnonymousClass33N) list.get(i);
                if (str5 != null) {
                    strArr[i] = r0.A02;
                } else {
                    strArr[i] = r0.A0D;
                }
            }
            return String.valueOf(Arrays.hashCode(strArr));
        }
    }

    public List A0B() {
        List A012 = this.A0P.A01(null, null);
        Set A002 = this.A0Q.A00();
        ArrayList arrayList = (ArrayList) A012;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass33N r3 = (AnonymousClass33N) it.next();
            AnonymousClass0BZ r0 = this.A0O;
            String str = r3.A0D;
            AnonymousClass00E.A00();
            r3.A00 = r0.A06().A00(str);
            r3.A07 = ((AbstractCollection) A002).contains(str);
        }
        AnonymousClass008.A1b(arrayList, AnonymousClass008.A0S("StickerRepository/getCachedWhiteListedStickerPacksSync/found total cached sticker pack count: "));
        return A012;
    }

    public List A0C() {
        AnonymousClass08D r6 = this.A06;
        List A072 = r6.A07();
        if (A072 != null) {
            return A072;
        }
        AnonymousClass0BZ r7 = this.A0O;
        AnonymousClass00E.A00();
        AnonymousClass33w A052 = r7.A05();
        Log.d("StickerPackDBTableHelper/getInstalledStickerPacks");
        List A002 = A052.A00("installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)", null, "", "getInstalledStickerPacks/QUERY");
        HashSet hashSet = new HashSet();
        Set A003 = this.A0Q.A00();
        ArrayList arrayList = (ArrayList) A002;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass33N r9 = (AnonymousClass33N) it.next();
            String str = r9.A0D;
            if (hashSet.contains(str)) {
                Log.e("StickerRepository/getInstalledFirstPartyStickerPacksSync duplicate sticker pack");
            } else {
                hashSet.add(str);
                AnonymousClass00E.A00();
                List A004 = r7.A04().A00(str);
                Iterator it2 = ((AbstractCollection) A004).iterator();
                while (it2.hasNext()) {
                    C29241Xq r8 = (C29241Xq) it2.next();
                    if (!TextUtils.isEmpty(r8.A07)) {
                        WebpUtils webpUtils = this.A0L;
                        String str2 = r8.A07;
                        if (webpUtils != null) {
                            r8.A04 = C29251Xr.A00(WebpUtils.fetchWebpMetadata(str2));
                        } else {
                            throw null;
                        }
                    }
                }
                r9.A04 = A004;
                r9.A07 = ((AbstractCollection) A003).contains(str);
                for (C29241Xq r0 : r9.A04) {
                    A0G(r0);
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AnonymousClass33N r2 = (AnonymousClass33N) it3.next();
            String str3 = r2.A0D;
            AnonymousClass00E.A00();
            r2.A00 = r7.A06().A00(str3);
        }
        Collections.sort(A002, new AnonymousClass33P(false));
        AnonymousClass008.A1b(arrayList, new StringBuilder("StickerRepository/getInstalledFirstPartyStickerPacksSync/found total sticker pack count: "));
        r6.A0A(A002);
        return A002;
    }

    public List A0D() {
        AnonymousClass0BZ r5 = this.A0O;
        AnonymousClass00E.A00();
        AnonymousClass33w A052 = r5.A05();
        Log.d("StickerPackDBTableHelper/getInstalledStickerPacks");
        List A002 = A052.A00("installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)", null, "", "getInstalledStickerPacks/QUERY");
        AbstractCollection abstractCollection = (AbstractCollection) A002;
        abstractCollection.addAll(A0B());
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            AnonymousClass33N r2 = (AnonymousClass33N) it.next();
            String str = r2.A0D;
            AnonymousClass00E.A00();
            r2.A00 = r5.A06().A00(str);
        }
        Collections.sort(A002, new AnonymousClass33P(false));
        return A002;
    }

    public List A0E() {
        C03580Gu r0 = this.A0N;
        if (r0 != null) {
            AnonymousClass00E.A00();
            List A002 = r0.A02.A00();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((AbstractCollection) A002).iterator();
            while (it.hasNext()) {
                C663133s r5 = (C663133s) it.next();
                AnonymousClass0B3 r02 = this.A04;
                String str = r5.A07;
                File A032 = r02.A03(str);
                if (A032.exists()) {
                    C29241Xq r2 = new C29241Xq();
                    r2.A07 = A032.getAbsolutePath();
                    r2.A01 = 1;
                    r2.A0A = str;
                    r2.A0D = r5.A0A;
                    r2.A06 = r5.A06;
                    r2.A05 = r5.A05;
                    String str2 = r5.A09;
                    if (str2 != null) {
                        r2.A09 = str2;
                    } else {
                        r2.A09 = "image/webp";
                    }
                    r2.A08 = r5.A08;
                    r2.A00 = r5.A01;
                    r2.A03 = r5.A03;
                    r2.A02 = r5.A02;
                    WebpUtils webpUtils = this.A0L;
                    String absolutePath = A032.getAbsolutePath();
                    if (webpUtils != null) {
                        r2.A04 = C29251Xr.A00(WebpUtils.fetchWebpMetadata(absolutePath));
                        A0G(r2);
                        arrayList.add(r2);
                    } else {
                        throw null;
                    }
                }
            }
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x00aa */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: android.util.Pair */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.33N] */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0166, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0167, code lost:
        if (r7 != null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016c, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0F(X.AnonymousClass3R0 r13) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03570Gt.A0F(X.3R0):java.util.List");
    }

    public final void A0G(C29241Xq r4) {
        String str;
        String str2 = r4.A0A;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(this.A0S);
            instance.update(str2.getBytes());
            str = Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException unused) {
            str = null;
        }
        r4.A0B = str;
    }

    public final void A0H(AnonymousClass33N r7) {
        AnonymousClass0HB r2 = this.A0Q;
        ReentrantReadWriteLock.ReadLock readLock = r2.A01;
        readLock.lock();
        try {
            r2.A00.A07().A03().A01("unseen_sticker_packs", "pack_id = ?", new String[]{r7.A0D}, "markPackAsSeen/DELETE_UNSEEN_STICKER_PACK");
        } finally {
            readLock.unlock();
        }
    }

    public void A0I(AnonymousClass33N r15, AnonymousClass3Q9 r16) {
        Log.d("StickerRepository/downloadStickersOfAStickerPackAsync/begin");
        String str = r15.A0D;
        AnonymousClass0H0 r11 = this.A0H;
        Map map = r11.A01;
        if (map.containsKey(str)) {
            Log.e("StickerRepository/downloadStickersOfAStickerPackAsync attempting to download same pack twice");
            return;
        }
        C03620Gz r9 = this.A0G;
        AnonymousClass3QS r8 = new AnonymousClass3QS(r9, this, r11, str, r16);
        map.put(str, 0);
        r11.A00.put(str, r8);
        AnonymousClass00E.A01();
        Iterator it = ((AbstractC003401r) r9).A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass33L r12 = (AnonymousClass33L) r1.next();
                if (r12 instanceof AnonymousClass3R9) {
                    C662733o r2 = ((AnonymousClass3R9) r12).A00;
                    r2.A0A.put(r15.A0D, r15);
                    List list = r2.A03;
                    if (list != null) {
                        r2.A04(list, null);
                    }
                } else if (r12 instanceof C71803Qj) {
                    StickerStoreTabFragment stickerStoreTabFragment = ((C71803Qj) r12).A00;
                    if (!(stickerStoreTabFragment instanceof StickerStoreMyTabFragment)) {
                        if ((stickerStoreTabFragment instanceof StickerStoreFeaturedTabFragment) && stickerStoreTabFragment.A06 != null) {
                            for (int i = 0; i < stickerStoreTabFragment.A06.size(); i++) {
                                AnonymousClass33N r22 = (AnonymousClass33N) stickerStoreTabFragment.A06.get(i);
                                if (r22.A0D.equals(r15.A0D)) {
                                    r22.A05 = true;
                                    C71823Ql r0 = stickerStoreTabFragment.A05;
                                    if (r0 != null) {
                                        r0.A02(i);
                                    }
                                }
                            }
                        }
                    } else if (stickerStoreTabFragment.A06 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= stickerStoreTabFragment.A06.size()) {
                                break;
                            }
                            AnonymousClass33N r23 = (AnonymousClass33N) stickerStoreTabFragment.A06.get(i2);
                            if (r23.A0D.equals(r15.A0D)) {
                                r23.A05 = true;
                                C71823Ql r02 = stickerStoreTabFragment.A05;
                                if (r02 != null) {
                                    r02.A02(i2);
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            } else {
                this.A0R.ANC(r8, r15);
                return;
            }
        }
    }

    public void A0J(AnonymousClass33N r4, AnonymousClass33Y r5) {
        Log.d("StickerRepository/getTrayIconInAStickerPackAsync/begin");
        this.A0R.ANC(new AnonymousClass3QV(this, r5), r4);
    }

    public void A0K(Collection collection) {
        Log.d("StickerRepository/starStickersAsync/begin");
        this.A0R.ANF(new RunnableEBaseShape4S0200000_I0_3(this, collection, 10));
    }

    public void A0L(Collection collection, boolean z) {
        boolean containsKey;
        String str;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C29241Xq r13 = (C29241Xq) it.next();
            String str2 = r13.A0A;
            if (str2 != null) {
                C03580Gu r3 = this.A0N;
                if (!r3.A02(str2)) {
                    AnonymousClass0B3 r11 = this.A04;
                    File A032 = r11.A03(str2);
                    boolean z2 = false;
                    if (!A032.exists()) {
                        if (!r13.A01()) {
                            A032 = r11.A03(str2);
                            String str3 = r13.A07;
                            if (str3 != null) {
                                try {
                                    AnonymousClass088 r0 = this.A02;
                                    C006803i.A0X(r0.A04, new File(str3), A032);
                                } catch (IOException unused) {
                                    Log.e("StickerRepository/starStickersSync failed to copy internal file");
                                }
                            } else {
                                continue;
                            }
                        } else if (r13.A07 != null) {
                            Pair A022 = A02(r13);
                            if (A022 != null) {
                                File file = (File) A022.first;
                                str2 = (String) A022.second;
                                if (!(file == null || str2 == null || r3.A02(str2))) {
                                    r13.A0A = str2;
                                    if (!r11.A03(str2).exists()) {
                                        try {
                                            A032 = A07(file, str2);
                                        } catch (IOException unused2) {
                                            continue;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        z2 = true;
                    }
                    if (A032.exists()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        AnonymousClass00E.A00();
                        r3.A01();
                        try {
                            String str4 = r13.A0A;
                            if (str4 != null) {
                                C03610Gy r2 = r3.A01;
                                synchronized (r2) {
                                    containsKey = r2.A00.containsKey(str4);
                                }
                                if (!containsKey) {
                                    AnonymousClass0Gx r5 = r3.A03;
                                    File A033 = r5.A00.A03(r13.A0A);
                                    if (A033.exists()) {
                                        String A023 = r5.A01.A02(A033.getAbsolutePath());
                                        if (A023 != null) {
                                            synchronized (r2) {
                                                str = (String) r2.A01.get(A023);
                                            }
                                            if (str != null && !r13.A0A.equals(str)) {
                                                Log.d("StarredStickers/starSticker/found a duplicate sticker that has same image hash but different file hash, keep the old one.");
                                            }
                                        }
                                        r2.A01(r13.A0A, A023);
                                        C03600Gw r8 = r3.A02;
                                        String str5 = r13.A0A;
                                        String str6 = r13.A0D;
                                        String str7 = r13.A06;
                                        String str8 = r13.A05;
                                        String str9 = r13.A09;
                                        String str10 = r13.A08;
                                        int i = r13.A00;
                                        int i2 = r13.A03;
                                        int i3 = r13.A02;
                                        if (str5 != null) {
                                            ContentValues contentValues = new ContentValues();
                                            contentValues.put("plaintext_hash", str5);
                                            contentValues.put("hash_of_image_part", A023);
                                            contentValues.put("timestamp", Long.valueOf(currentTimeMillis));
                                            contentValues.put("url", str6);
                                            contentValues.put("enc_hash", str7);
                                            contentValues.put("direct_path", str8);
                                            contentValues.put("mimetype", str9);
                                            contentValues.put("media_key", str10);
                                            contentValues.put("file_size", Integer.valueOf(i));
                                            contentValues.put("width", Integer.valueOf(i2));
                                            contentValues.put("height", Integer.valueOf(i3));
                                            ReentrantReadWriteLock.ReadLock readLock = r8.A01;
                                            readLock.lock();
                                            try {
                                                r8.A00.A03().A0B("starred_stickers", contentValues, "addStarredStickerHash/INSERT_STARRED_STICKER");
                                                if (z) {
                                                    r11.A02(str2);
                                                }
                                            } finally {
                                                readLock.unlock();
                                            }
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw new FileNotFoundException("StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker");
                                    }
                                }
                            }
                        } catch (FileNotFoundException e) {
                            Log.e("StarredStickers/starSticker/could not find sticker file corresponding to that sticker file", e);
                        }
                        if (z2) {
                            C006803i.A0m(A032);
                        } else if (!z) {
                            r11.A08(str2);
                        }
                    }
                    C02360Br r32 = this.A0D;
                    String A1u = C002001d.A1u(A0E());
                    C29141Xf A15 = C002001d.A15(r13, this.A0B, this.A06);
                    if (r32.A0D.A03()) {
                        r32.A0B.A09(Message.obtain(null, 0, 243, 0, new AnonymousClass22M(A1u, A15)));
                    }
                } else {
                    continue;
                }
            }
        }
        AnonymousClass02M r33 = this.A03;
        r33.A02.post(new RunnableEBaseShape4S0200000_I0_3(this, collection, 7));
    }

    public final void A0M(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29241Xq r2 = (C29241Xq) it.next();
            if (r2.A07 != null) {
                this.A04.A08(r2.A0A);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean A0N(String str, String str2) {
        try {
            A01(this.A0B, this.A0K.A01(str, str2));
        } catch (Exception e) {
            Log.e("StickerRepository/uninstallThirdPartyPack/fetch pack failed", e);
        }
        AnonymousClass0H4 r4 = this.A0K;
        r4.A05.A02(AnonymousClass0H7.A01(str, str2));
        StringBuilder sb = new StringBuilder("ThirdPartyStickerManager/removePack, removed authority: ");
        sb.append(str);
        sb.append(", identifier: ");
        sb.append(str2);
        Log.d(sb.toString());
        AnonymousClass0H5 r3 = r4.A04;
        synchronized (r3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ThirdPartyStickerStorage/removeStickersInPack/removed stickers from ");
            sb2.append(str);
            sb2.append("/");
            sb2.append(str2);
            Log.d(sb2.toString());
            File A002 = r3.A00(str, str2);
            if (A002.exists()) {
                File parentFile = A002.getParentFile();
                C006803i.A0a(A002);
                if (parentFile != null && parentFile.isDirectory() && parentFile.listFiles().length == 0) {
                    C006803i.A0m(parentFile);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("ThirdPartyStickerStorage/removeStickersInPack/removed directory:");
                    sb3.append(parentFile);
                    Log.d(sb3.toString());
                }
            }
        }
        AnonymousClass0H9 r1 = r4.A06;
        ReentrantReadWriteLock.ReadLock readLock = r1.A01;
        readLock.lock();
        try {
            boolean z = false;
            if (r1.A00.A07().A03().A01("third_party_whitelist_packs", "authority = ? AND sticker_pack_id = ?", new String[]{str, str2}, "deleteWhitelistedPack/DELETE_THIRD_PARTY_WHITELIST_PACKS") > 0) {
                z = true;
            }
            readLock.unlock();
            this.A0D.A0F(A0A(A0D()), AnonymousClass0H7.A01(str, str2));
            return z;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }
}
