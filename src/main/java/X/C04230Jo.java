package X;

import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Jo  reason: invalid class name and case insensitive filesystem */
public class C04230Jo extends C03410Gc {
    public static volatile C04230Jo A0B;
    public final AnonymousClass088 A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass0B3 A02;
    public final AnonymousClass0BV A03;
    public final C02360Br A04;
    public final C03610Gy A05 = new C03610Gy();
    public final C03620Gz A06;
    public final C03570Gt A07;
    public final WebpUtils A08;
    public final C04240Jp A09;
    public final AnonymousClass02H A0A;

    public C04230Jo(AnonymousClass02M r3, AnonymousClass00T r4, WebpUtils webpUtils, AnonymousClass088 r6, C02360Br r7, C03620Gz r8, C03570Gt r9, AnonymousClass0BV r10, C04240Jp r11, AnonymousClass0B3 r12) {
        super(r11, 32);
        this.A01 = r3;
        this.A08 = webpUtils;
        this.A00 = r6;
        this.A04 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A03 = r10;
        this.A09 = r11;
        this.A02 = r12;
        this.A0A = new AnonymousClass02H(r4, false);
    }

    public static C04230Jo A00() {
        if (A0B == null) {
            synchronized (C04230Jo.class) {
                if (A0B == null) {
                    AnonymousClass02M A002 = AnonymousClass02M.A00();
                    AnonymousClass00T A003 = C002101e.A00();
                    WebpUtils A004 = WebpUtils.A00();
                    AnonymousClass088 A005 = AnonymousClass088.A00();
                    C02360Br A006 = C02360Br.A00();
                    C03620Gz A007 = C03620Gz.A00();
                    C03570Gt A008 = C03570Gt.A00();
                    AnonymousClass0BV A009 = AnonymousClass0BV.A00();
                    if (C04240Jp.A03 == null) {
                        synchronized (C04240Jp.class) {
                            if (C04240Jp.A03 == null) {
                                C04240Jp.A03 = new C04240Jp(AnonymousClass0BZ.A00());
                            }
                        }
                    }
                    A0B = new C04230Jo(A002, A003, A004, A005, A006, A007, A008, A009, C04240Jp.A03, AnonymousClass0B3.A00());
                }
            }
        }
        return A0B;
    }

    @Override // X.C03410Gc
    public void A08(int i) {
        AnonymousClass00E.A00();
        AnonymousClass33A r3 = (AnonymousClass33A) A01(i);
        StringBuilder A0S = AnonymousClass008.A0S("RecentStickers/removeEntry/removing entry: ");
        A0S.append(r3.toString());
        Log.i(A0S.toString());
        AnonymousClass0B3 r0 = this.A02;
        String str = r3.A01;
        r0.A08(str);
        this.A05.A02(str, r3.A02);
        super.A08(i);
    }

    @Override // X.C03410Gc
    public /* bridge */ /* synthetic */ void A09(AnonymousClass2QD r4) {
        C71893Qs r42 = (C71893Qs) r4;
        AnonymousClass00E.A00();
        StringBuilder sb = new StringBuilder("RecentStickers/addEntry/adding entry:");
        sb.append(r42.toString());
        Log.i(sb.toString());
        C03610Gy r2 = this.A05;
        AnonymousClass33A r0 = r42.A01;
        r2.A01(r0.A01, r0.A02);
        super.A09(r42);
    }

    public C29241Xq A0B(String str) {
        Iterator it = ((AbstractCollection) A0C()).iterator();
        while (it.hasNext()) {
            C29241Xq r1 = (C29241Xq) it.next();
            if (str.equals(r1.A0A)) {
                return r1;
            }
        }
        return null;
    }

    public List A0C() {
        List<AnonymousClass33A> A022 = super.A02();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass33A r4 : A022) {
            C03610Gy r2 = this.A05;
            String str = r4.A01;
            r2.A01(str, r4.A02);
            C29241Xq r42 = r4.A00;
            if (r42.A0A == null) {
                r42.A0A = str;
            }
            r42.A09 = "image/webp";
            String str2 = r42.A0A;
            String str3 = null;
            if (str2 == null) {
                Log.e("RecentStickers/setRecentStickerFilePath/sticker param has null file hash");
            } else {
                File A032 = this.A02.A03(str2);
                r42.A07 = A032.getAbsolutePath();
                r42.A01 = 1;
                str3 = A032.getAbsolutePath();
            }
            if (str3 != null) {
                if (this.A08 != null) {
                    r42.A04 = C29251Xr.A00(WebpUtils.fetchWebpMetadata(str3));
                } else {
                    throw null;
                }
            }
            arrayList.add(r42.clone());
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012f, code lost:
        if (r2 != null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0134, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0D(boolean r18) {
        /*
        // Method dump skipped, instructions count: 387
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04230Jo.A0D(boolean):java.util.List");
    }

    public /* synthetic */ void A0E(C29241Xq r7, boolean z) {
        File file;
        C03610Gy r2;
        String A002;
        String str;
        String str2;
        if (r7.A07 != null) {
            if (r7.A01()) {
                StringBuilder A0S = AnonymousClass008.A0S("RecentStickers/add/adding third party sticker, sticker plaintext hash: ");
                A0S.append(r7.A0A);
                Log.d(A0S.toString());
                file = this.A07.A05(r7);
            } else {
                AnonymousClass00E.A00();
                String str3 = r7.A0A;
                file = null;
                if (str3 != null) {
                    AnonymousClass0B3 r3 = this.A02;
                    File A032 = r3.A03(str3);
                    if (A032.exists()) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("RecentStickers/addInternalReference/sticker file exist, increment reference counting:");
                        A0S2.append(A032.getAbsolutePath());
                        Log.d(A0S2.toString());
                        file = r3.A02(r7.A0A);
                    } else if (!A032.exists()) {
                        String absolutePath = A032.getAbsolutePath();
                        String str4 = r7.A07;
                        if (!absolutePath.equals(str4) && str4 != null) {
                            AnonymousClass00E.A00();
                            String str5 = r7.A07;
                            if (str5 != null) {
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("RecentStickers/copyFile/sticker file is being copied from: ");
                                    sb.append(str5);
                                    sb.append(" to:");
                                    sb.append(A032.getAbsolutePath());
                                    Log.d(sb.toString());
                                    C006803i.A0X(this.A00.A04, new File(r7.A07), A032);
                                    file = r3.A02(r7.A0A);
                                } catch (IOException unused) {
                                    StringBuilder A0S3 = AnonymousClass008.A0S("RecentStickers/copyFile/error copying file sticker");
                                    String str6 = r7.A0B;
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    A0S3.append(str6);
                                    Log.e(A0S3.toString());
                                }
                            }
                        }
                    }
                }
                StringBuilder A0S4 = AnonymousClass008.A0S("RecentStickers/add/adding internal reference for sticker, sticker plaintext hash: ");
                A0S4.append(r7.A0A);
                Log.d(A0S4.toString());
            }
            if (file != null) {
                r7.A07 = file.getAbsolutePath();
                r7.A01 = 1;
                String str7 = r7.A0A;
                if (!(str7 == null || ((A002 = (r2 = this.A05).A00(str7)) == null && ((str2 = r7.A07) == null || (A002 = this.A08.A02(str2)) == null)))) {
                    synchronized (r2) {
                        str = (String) r2.A01.get(A002);
                    }
                    if (str != null) {
                        String str8 = r7.A0A;
                        if (!str8.equals(str)) {
                            StringBuilder A0a = AnonymousClass008.A0a("RecentStickers/dedupeStickerFilesBasedOnImageHash/Removing old sticker from recents:", str, ", with the same image hash:", A002, ", with the new sticker:");
                            A0a.append(str8);
                            Log.i(A0a.toString());
                            A05(new AnonymousClass33A(str, A002, r7));
                        }
                    }
                    if (r7.A09 == null) {
                        r7.A09 = "image/webp";
                    }
                    super.A0A(new AnonymousClass33A(r7.A0A, A002, r7));
                }
            }
            if (z) {
                this.A01.A0E(new RunnableEBaseShape4S0100000_I0_4(this.A06, 26));
                return;
            }
            return;
        }
        throw null;
    }

    public void A0F(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        C29241Xq r3 = new C29241Xq();
        r3.A0A = str;
        if (str2 != null) {
            r3.A0D = str2;
        }
        if (str3 != null) {
            r3.A06 = str3;
        }
        if (str4 != null) {
            r3.A05 = str4;
        }
        if (str5 != null) {
            r3.A09 = str5;
        }
        if (str6 != null) {
            r3.A08 = str6;
        }
        r3.A00 = i;
        r3.A03 = i2;
        r3.A02 = i3;
        this.A09.A00(r3);
        for (AnonymousClass33A r1 : super.A02()) {
            if (str.equals(r1.A01)) {
                r1.A00(r3);
            }
        }
    }
}
