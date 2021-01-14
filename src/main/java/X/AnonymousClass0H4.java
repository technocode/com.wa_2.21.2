package X;

import android.net.Uri;
import android.util.Pair;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0H4  reason: invalid class name */
public class AnonymousClass0H4 {
    public static volatile AnonymousClass0H4 A07;
    public final AnonymousClass02M A00;
    public final AnonymousClass00G A01;
    public final AnonymousClass0H7 A02;
    public final C03620Gz A03;
    public final AnonymousClass0H5 A04;
    public final AnonymousClass0H8 A05;
    public final AnonymousClass0H9 A06;

    public AnonymousClass0H4(AnonymousClass00G r1, AnonymousClass02M r2, C03620Gz r3, AnonymousClass0H5 r4, AnonymousClass0H7 r5, AnonymousClass0H8 r6, AnonymousClass0H9 r7) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A05 = r6;
        this.A06 = r7;
    }

    public static AnonymousClass0H4 A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0H4.class) {
                if (A07 == null) {
                    AnonymousClass00G r7 = AnonymousClass00G.A01;
                    AnonymousClass02M A002 = AnonymousClass02M.A00();
                    C000300f.A00();
                    C03620Gz A003 = C03620Gz.A00();
                    if (AnonymousClass0H5.A04 == null) {
                        synchronized (AnonymousClass0H5.class) {
                            if (AnonymousClass0H5.A04 == null) {
                                AnonymousClass0H5.A04 = new AnonymousClass0H5(AnonymousClass088.A00(), new AnonymousClass0H6(r7.A00), WebpUtils.A00());
                            }
                        }
                    }
                    AnonymousClass0H5 r16 = AnonymousClass0H5.A04;
                    if (AnonymousClass0H7.A07 == null) {
                        synchronized (AnonymousClass0H7.class) {
                            if (AnonymousClass0H7.A07 == null) {
                                AnonymousClass0H7.A07 = new AnonymousClass0H7(r7, C002701k.A00(), AnonymousClass009.A00(), WebpUtils.A00(), C000300f.A00(), AnonymousClass00C.A00(), AnonymousClass0AX.A00());
                            }
                        }
                    }
                    AnonymousClass0H7 r17 = AnonymousClass0H7.A07;
                    if (AnonymousClass0H8.A01 == null) {
                        synchronized (AnonymousClass0H8.class) {
                            if (AnonymousClass0H8.A01 == null) {
                                AnonymousClass0H8.A01 = new AnonymousClass0H8(AnonymousClass0B3.A00());
                            }
                        }
                    }
                    A07 = new AnonymousClass0H4(r7, A002, A003, r16, r17, AnonymousClass0H8.A01, AnonymousClass0H9.A00());
                }
            }
        }
        return A07;
    }

    public AnonymousClass33N A01(String str, String str2) {
        AnonymousClass33N r0;
        boolean z;
        List list;
        C29251Xr A002;
        String str3;
        StringBuilder sb = new StringBuilder("ThirdPartyStickerManager/fetchPack/ ");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        Log.i(sb.toString());
        AnonymousClass0H9 r4 = this.A06;
        if (!r4.A03(str, str2)) {
            Log.i("ThirdPartyStickerManager/fetchPack/not using sticker cache");
            return this.A02.A04(str, str2);
        }
        AnonymousClass33N r3 = null;
        try {
            AnonymousClass0H7 r1 = this.A02;
            r3 = r1.A05(str, str2);
            if (r3 != null && r3.A0L) {
                Log.i("ThirdPartyStickerManager/fetchPack/avoid caching is true");
                return r1.A04(str, str2);
            }
        } catch (Exception e) {
            Log.e("ThirdPartyStickerManager/fetchPack/could not fetch pack metadata", e);
        }
        AbstractList abstractList = (AbstractList) r4.A01("authority=? AND sticker_pack_id=?", new String[]{str, str2});
        if (abstractList.isEmpty()) {
            r0 = null;
        } else {
            r0 = (AnonymousClass33N) abstractList.get(0);
        }
        if (r3 == null || !(r0 == null || (str3 = r0.A02) == null || !str3.equals(r3.A0E))) {
            z = false;
            r3 = r0;
        } else {
            z = true;
            r4.A02(str, str2, r3);
            Log.i("ThirdPartyStickerManager/fetchPack/repopulate sticker pack db");
            AnonymousClass0H8 r12 = this.A05;
            r12.A02(r3.A0D);
            r12.A01(AnonymousClass0H7.A03(this.A01.A00, r3), r3);
        }
        AnonymousClass0H5 r7 = this.A04;
        synchronized (r7) {
            File A003 = r7.A00(str, str2);
            if (!A003.exists()) {
                list = Collections.emptyList();
            } else {
                File[] listFiles = A003.listFiles();
                Arrays.sort(listFiles, AnonymousClass0H5.A03);
                int length = listFiles.length;
                ArrayList arrayList = new ArrayList(length);
                String A012 = AnonymousClass0H7.A01(str, str2);
                for (File file : listFiles) {
                    String name = file.getName();
                    String A0L = C006803i.A0L(name.substring(3));
                    C29241Xq r2 = new C29241Xq();
                    r2.A0A = Uri.decode(A0L);
                    r2.A07 = new File(A003, name).getAbsolutePath();
                    r2.A01 = 2;
                    r2.A09 = "image/webp";
                    r2.A03 = 512;
                    r2.A02 = 512;
                    r2.A0C = A012;
                    WebpUtils webpUtils = r7.A02;
                    String absolutePath = file.getAbsolutePath();
                    if (webpUtils != null) {
                        byte[] fetchWebpMetadata = WebpUtils.fetchWebpMetadata(absolutePath);
                        if (!(fetchWebpMetadata == null || (A002 = C29251Xr.A00(fetchWebpMetadata)) == null)) {
                            r2.A04 = A002;
                        }
                        arrayList.add(r2);
                    } else {
                        throw null;
                    }
                }
                arrayList.size();
                list = Collections.unmodifiableList(arrayList);
            }
        }
        if (list.isEmpty() || z) {
            list = this.A02.A04(str, str2).A04;
            r7.A01(str, str2, list);
            Log.i("ThirdPartyStickerManager/fetchPack/repopulating sticker cache");
        }
        if (r3 != null) {
            r3.A04 = list;
            if (z) {
                this.A00.A02.post(new RunnableEBaseShape4S0200000_I0_3(this, r3, 11));
            }
            return r3;
        }
        throw null;
    }

    public File A02(String str) {
        Pair A002 = AnonymousClass0H7.A00(str);
        if (A002 == null) {
            return null;
        }
        if (!this.A06.A03((String) A002.first, (String) A002.second)) {
            return null;
        }
        AnonymousClass0H8 r3 = this.A05;
        File A003 = r3.A00(str);
        if (A003 == null || !A003.exists()) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("ThirdPartyStickerManager/fetching from provider:");
                sb.append(A002.toString());
                Log.d(sb.toString());
                AnonymousClass33N A042 = this.A02.A04((String) A002.first, (String) A002.second);
                return r3.A01(AnonymousClass0H7.A03(this.A01.A00, A042), A042);
            } catch (Exception e) {
                Log.e("ThirdPartyStickerManager/getTrayIcon/error fetching pack", e);
                return null;
            }
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("ThirdPartyStickerManager/got tray icon from cache:");
            A0S.append(A003.toString());
            Log.d(A0S.toString());
            return A003;
        }
    }
}
