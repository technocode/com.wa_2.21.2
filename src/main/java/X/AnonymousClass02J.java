package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.io.File;

/* renamed from: X.02J  reason: invalid class name */
public abstract class AnonymousClass02J {
    public static volatile AnonymousClass02J A06;
    public static volatile AnonymousClass02J A07;
    public boolean A00;
    public final C000300f A01;
    public final AnonymousClass03R A02;
    public final AnonymousClass00G A03;
    public final C002701k A04;
    public final AnonymousClass0BB A05;

    public AnonymousClass02J(AnonymousClass00G r1, C002701k r2, AnonymousClass03R r3, C000300f r4, AnonymousClass0BB r5) {
        this.A03 = r1;
        this.A04 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A05 = r5;
    }

    public static Point A00(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
            if (context.getResources().getConfiguration().orientation == 2) {
                int i = point.y;
                point.y = point.x;
                point.x = i;
            }
            int i2 = point.y;
            int dimension = (int) context.getResources().getDimension(R.dimen.abc_action_bar_default_height_material);
            if (C002301g.A0K != null) {
                point.y = i2 - (C002301g.A00(context) + dimension);
                return point;
            }
            throw null;
        }
        throw null;
    }

    public static AnonymousClass02K A01(Point point, boolean z, C002701k r10) {
        int i = point.x;
        int i2 = point.y;
        Long valueOf = Long.valueOf(Runtime.getRuntime().maxMemory() / 32);
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (r10.A0E(211)) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inDither = z;
        return new AnonymousClass02K(i, i2, valueOf, false, options);
    }

    public static AnonymousClass02J A02() {
        C000300f A002 = C000300f.A00();
        C002701k.A00();
        if (A002.A0D(AbstractC000400g.A2e)) {
            if (A07 == null) {
                synchronized (AnonymousClass02J.class) {
                    if (C02200Ba.A09 == null) {
                        synchronized (C02200Ba.class) {
                            C02200Ba.A09 = new C02200Ba(AnonymousClass00S.A00(), C002701k.A00(), AnonymousClass02M.A00(), AnonymousClass00G.A01, AnonymousClass03R.A00(), C000300f.A00(), C002101e.A00(), C02220Bc.A00(), AnonymousClass00C.A00(), C02260Bh.A04(), AnonymousClass03S.A00(), AnonymousClass0BB.A00(), new C02210Bb());
                        }
                    }
                    A07 = C02200Ba.A09;
                }
            }
            return A07;
        }
        if (A06 == null) {
            synchronized (AnonymousClass02J.class) {
                A06 = C02260Bh.A04();
            }
        }
        return A06;
    }

    public static File A03(Context context) {
        return new File(context.getFilesDir(), "wallpaper.jpg");
    }

    public Uri A04() {
        if (this instanceof C02200Ba) {
            return ((C02200Ba) this).A05.A04();
        }
        C02260Bh r4 = (C02260Bh) this;
        AnonymousClass01I r0 = r4.A05;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userJid.getRawString());
            sb2.append(System.currentTimeMillis());
            sb.append(C007603r.A01(sb2.toString()));
            sb.append(".jpg");
            String obj = sb.toString();
            File file = r4.A03.A04().A0N;
            AnonymousClass089.A03(file, false);
            return Uri.fromFile(new File(file, obj));
        }
        throw null;
    }

    public AnonymousClass31V A05(AnonymousClass02N r4, Context context) {
        if (!(this instanceof C02200Ba)) {
            return ((C02260Bh) this).A0A(context, false);
        }
        C02200Ba r2 = (C02200Ba) this;
        AnonymousClass02R A0A = r2.A0A(r4, context);
        Object obj = A0A.A00;
        if (obj != null) {
            AnonymousClass0BH r1 = (AnonymousClass0BH) obj;
            Object obj2 = A0A.A01;
            if (obj2 != null) {
                return r2.A0B(r1, context, ((Boolean) obj2).booleanValue());
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass31V A06(X.AnonymousClass02N r8, android.content.Context r9, android.net.Uri r10, boolean r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02J.A06(X.02N, android.content.Context, android.net.Uri, boolean, int, int):X.31V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r3 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r4 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0171, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0172, code lost:
        if (r3 != null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0177, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017b, code lost:
        if (r6 != null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0180, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.content.Context r10) {
        /*
        // Method dump skipped, instructions count: 394
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02J.A07(android.content.Context):void");
    }

    public boolean A08() {
        if (!(this instanceof C02200Ba)) {
            C02260Bh r0 = (C02260Bh) this;
            return r0.A08.A03("wallpaper", A03(((AnonymousClass02J) r0).A03.A00)) == 19;
        }
        C02200Ba r1 = (C02200Ba) this;
        boolean A08 = r1.A05.A08();
        r1.A0E();
        return A08;
    }

    public Drawable A09(AnonymousClass31V r2) {
        if (r2 == null) {
            return null;
        }
        return r2.A00;
    }
}
