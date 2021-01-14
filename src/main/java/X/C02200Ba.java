package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.0Ba  reason: invalid class name and case insensitive filesystem */
public class C02200Ba extends AnonymousClass02J {
    public static volatile C02200Ba A09;
    public final C02270Bi A00 = new C02270Bi(0);
    public final AnonymousClass02M A01;
    public final AnonymousClass00C A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass03S A04;
    public final C02260Bh A05;
    public final C02210Bb A06;
    public final C02220Bc A07;
    public final AnonymousClass00T A08;

    public C02200Ba(AnonymousClass00S r9, C002701k r10, AnonymousClass02M r11, AnonymousClass00G r12, AnonymousClass03R r13, C000300f r14, AnonymousClass00T r15, C02220Bc r16, AnonymousClass00C r17, C02260Bh r18, AnonymousClass03S r19, AnonymousClass0BB r20, C02210Bb r21) {
        super(r12, r10, r13, r14, r20);
        this.A03 = r9;
        this.A01 = r11;
        this.A07 = r16;
        this.A02 = r17;
        this.A08 = r15;
        this.A05 = r18;
        this.A04 = r19;
        this.A06 = r21;
    }

    public static final int A04(AnonymousClass0BH r3) {
        try {
            String str = r3.A02;
            if (str != null) {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
            AnonymousClass008.A1S(AnonymousClass008.A0S("wallpaperV2/colorIndex was not a number: "), r3.A02);
        }
        return 0;
    }

    @Override // X.AnonymousClass02J
    public Drawable A09(AnonymousClass31V r5) {
        Integer num;
        Drawable A092 = super.A09(r5);
        if (!(r5 == null || (num = r5.A01) == null || A092 == null)) {
            AnonymousClass1VY.A0J(super.A03.A00, A092, num.intValue());
        }
        return A092;
    }

    public final AnonymousClass02R A0A(AnonymousClass02N r8, Context context) {
        AnonymousClass0BG A082;
        AnonymousClass0BH r2;
        AnonymousClass0BG A083;
        AnonymousClass0BG A084;
        boolean A3E = C002001d.A3E(context);
        boolean z = true;
        boolean z2 = false;
        if (r8 == null) {
            z2 = true;
        }
        if (r8 == null) {
            AnonymousClass0BB r0 = super.A05;
            if (0 == 0) {
                A084 = r0.A05();
            } else {
                A084 = r0.A08(null);
            }
            if (A3E) {
                r2 = A084.A04;
            } else {
                r2 = A084.A05;
            }
            if (r2 == null) {
                r2 = A0C(context);
                A0F(null, r2, context);
            }
        } else {
            AnonymousClass0BB r1 = super.A05;
            if (r8 == null) {
                A082 = r1.A05();
            } else {
                A082 = r1.A08(r8);
            }
            if (A3E) {
                r2 = A082.A04;
            } else {
                r2 = A082.A05;
            }
            if (r2 == null) {
                if (0 == 0) {
                    A083 = r1.A05();
                } else {
                    A083 = r1.A08(null);
                }
                if (A3E) {
                    r2 = A083.A04;
                } else {
                    r2 = A083.A05;
                }
                if (r2 == null) {
                    r2 = A0C(context);
                    A0F(null, r2, context);
                }
            } else {
                z = z2;
            }
            z2 = z;
        }
        return new AnonymousClass02R(r2, Boolean.valueOf(z2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r2.equals("USER_PROVIDED") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r2.equals("DOWNLOADED") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r0 = android.net.Uri.parse(r8.A02).getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r0 == null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r0 = X.AnonymousClass1VY.A04(r7.A04, new java.io.File(r0), r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass31V A0B(X.AnonymousClass0BH r8, android.content.Context r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02200Ba.A0B(X.0BH, android.content.Context, boolean):X.31V");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r1.exists() == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        r2 = android.net.Uri.fromFile(r1).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r6.equals("COLOR_ONLY") != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r6.equals("COLOR_WITH_WA_OVERLAY") != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r0 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r5 = r9.getResources().getIntArray(com.google.android.search.verification.client.R.array.solid_color_wallpaper_colors)[r2];
        r4 = r9.getResources().getIntArray(com.google.android.search.verification.client.R.array.solid_color_wallpaperv2_colors);
        r3 = r4.length;
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r2 >= r3) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (r4[r2] == r5) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r1 = r1 + 1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        r2 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        r2 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r6.equals("USER_PROVIDED") != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r6.equals("DOWNLOADED") != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        r1 = X.AnonymousClass02J.A03(r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0BH A0C(android.content.Context r9) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02200Ba.A0C(android.content.Context):X.0BH");
    }

    public final AnonymousClass0BH A0D(AnonymousClass02N r6, Context context, BitmapDrawable bitmapDrawable) {
        AnonymousClass00S r2 = this.A03;
        String A012 = C007603r.A01(String.valueOf(r2.A01()));
        if (A012 == null) {
            A012 = String.valueOf(r2.A01());
        }
        File file = new File(context.getFilesDir(), "Wallpapers");
        file.mkdirs();
        File file2 = new File(file, A012);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmapDrawable.getBitmap().compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        }
        AnonymousClass0BH r0 = new AnonymousClass0BH("USER_PROVIDED", Uri.fromFile(file2).toString(), 25);
        A0F(r6, r0, context);
        return r0;
    }

    public final void A0E() {
        AnonymousClass0BB r3 = super.A05;
        AnonymousClass0BK A022 = r3.A0A().A02();
        A022.A0C("UPDATE settings SET wallpaper_light_type = NULL, wallpaper_light_value = NULL, wallpaper_dark_type = NULL, wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid != 'individual_chat_defaults'", "RESET_ALL_CUSTOM_WALLPAPERS");
        A022.A0C("UPDATE settings SET wallpaper_light_type = 'DEFAULT', wallpaper_light_value = NULL, wallpaper_dark_type = 'DEFAULT', wallpaper_dark_value = NULL, wallpaper_dark_opacity = NULL WHERE jid = 'individual_chat_defaults'", "RESET_GLOBAL_WALLPAPER_TO_DEFAULT");
        r3.A0O.clear();
        File file = new File(super.A03.A00.getFilesDir(), "Wallpapers");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r5 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if ("USER_PROVIDED".equalsIgnoreCase(r5.A01) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r1 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r1 = android.net.Uri.parse(r5.A02).getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r1 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        new java.io.File(r1).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.AnonymousClass02N r8, X.AnonymousClass0BH r9, android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02200Ba.A0F(X.02N, X.0BH, android.content.Context):void");
    }
}
