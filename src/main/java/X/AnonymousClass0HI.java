package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.0HI  reason: invalid class name */
public class AnonymousClass0HI {
    public static volatile AnonymousClass0HI A0F;
    public final AnonymousClass0GG A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass0HJ A03;
    public final AnonymousClass01A A04;
    public final C014308b A05;
    public final AnonymousClass0HK A06;
    public final AnonymousClass00G A07;
    public final AnonymousClass03S A08;
    public final AnonymousClass01X A09;
    public final C006903j A0A;
    public final AnonymousClass0AQ A0B;
    public final C02120As A0C;
    public final AnonymousClass01T A0D;
    public final AnonymousClass00T A0E;

    public AnonymousClass0HI(AnonymousClass00G r1, AnonymousClass02M r2, AnonymousClass009 r3, AnonymousClass00T r4, C006903j r5, AnonymousClass0HJ r6, AnonymousClass01A r7, C014308b r8, AnonymousClass01X r9, AnonymousClass0GG r10, AnonymousClass03S r11, C02120As r12, AnonymousClass01T r13, AnonymousClass0HK r14, AnonymousClass0AQ r15) {
        this.A07 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A0E = r4;
        this.A0A = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A09 = r9;
        this.A00 = r10;
        this.A08 = r11;
        this.A0C = r12;
        this.A0D = r13;
        this.A06 = r14;
        this.A0B = r15;
    }

    public static AnonymousClass0HI A00() {
        if (A0F == null) {
            synchronized (AnonymousClass0HI.class) {
                if (A0F == null) {
                    A0F = new AnonymousClass0HI(AnonymousClass00G.A01, AnonymousClass02M.A00(), AnonymousClass009.A00(), C002101e.A00(), C006903j.A00(), AnonymousClass0HJ.A02(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass0GG.A00(), AnonymousClass03S.A00(), C02120As.A00(), AnonymousClass01T.A00(), AnonymousClass0HK.A00(), AnonymousClass0AQ.A00());
                }
            }
        }
        return A0F;
    }

    public final C14670mg A01(C007003k r11, boolean z, boolean z2) {
        Intent intent;
        Application application = this.A07.A00;
        String A1m = C002001d.A1m(this.A05.A08(r11, false));
        if (z2) {
            intent = new Intent(application, Conversation.class);
            intent.setAction("android.intent.action.MAIN");
        } else {
            intent = new Intent();
            intent.setAction("com.whatsapp.Conversation");
        }
        intent.addFlags(335544320);
        Jid jid = r11.A09;
        if (jid != null) {
            intent.putExtra("jid", jid.getRawString());
            intent.putExtra("displayname", A1m);
            int dimensionPixelSize = application.getResources().getDimensionPixelSize(R.dimen.shortcut_image_size);
            Bitmap bitmap = null;
            if (z && (bitmap = this.A06.A02(r11, dimensionPixelSize, application.getResources().getDimension(R.dimen.small_avatar_radius), false)) == null) {
                AnonymousClass0HJ r9 = this.A03;
                bitmap = r9.A00.A00(r9.A01.A00, r9.A03(r11));
                if (!(bitmap.getWidth() == dimensionPixelSize && bitmap.getHeight() == dimensionPixelSize)) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true);
                }
            }
            Jid jid2 = r11.A09;
            if (jid2 != null) {
                String rawString = jid2.getRawString();
                C14670mg r1 = new C14670mg();
                r1.A02 = application;
                r1.A07 = rawString;
                r1.A0B = new Intent[]{intent};
                r1.A05 = A1m;
                if (bitmap != null) {
                    if (bitmap != null) {
                        IconCompat iconCompat = new IconCompat(1);
                        iconCompat.A06 = bitmap;
                        r1.A03 = iconCompat;
                    } else {
                        throw new IllegalArgumentException("Bitmap must not be null.");
                    }
                }
                if (!TextUtils.isEmpty(A1m)) {
                    Intent[] intentArr = r1.A0B;
                    if (intentArr != null && intentArr.length != 0) {
                        return r1;
                    }
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            throw null;
        }
        throw null;
    }

    public String A02(Context context, C007003k r8) {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.i("WaShortcutsHelper/publishAndGetReplacedShortcutId");
        return AnonymousClass0PW.A06(context, r8, this.A03, this.A04, this.A05, this.A06);
    }

    public void A03() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            Log.i("WaShortcutsHelper/deletealldynamicshortcuts");
            AnonymousClass0PW.A09(this.A07.A00);
        }
        if (i >= 30) {
            Log.i("WaShortcutsHelper/deleteallcachedshortcuts");
            AnonymousClass0PW.A0A(this.A07.A00);
        }
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0E.ANF(new RunnableEBaseShape1S0100000_I0_1(this, 43));
        }
    }

    public void A05(Context context, String str, C007003k r11) {
        if (Build.VERSION.SDK_INT >= 30) {
            StringBuilder A0S = AnonymousClass008.A0S("WaShortcutsHelper/restoreShortcut shortcutIdToRestore=");
            A0S.append(AnonymousClass1VY.A0E(str, AnonymousClass02N.class));
            A0S.append(" contactToBeReplaced=");
            A0S.append(r11);
            Log.i(A0S.toString());
            AnonymousClass0PW.A0K(context, str, r11, this.A03, this.A04, this.A05, this.A06);
        }
    }

    public void A06(C007003k r5) {
        Application application = this.A07.A00;
        C14670mg A012 = A01(r5, true, false);
        if (C14690mi.A07(application)) {
            C14690mi.A04(application, A012);
            if (Build.VERSION.SDK_INT < 26) {
                this.A02.A06(R.string.conversation_shortcut_added, 1);
                return;
            }
            return;
        }
        Intent A002 = C14690mi.A00(application, A012);
        A002.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        application.sendBroadcast(A002);
        this.A02.A06(R.string.conversation_shortcut_added, 1);
    }

    public void A07(C007003k r4) {
        Application application = this.A07.A00;
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass0PW.A0F(application, r4);
            return;
        }
        Intent A002 = C14690mi.A00(application, A01(r4, false, false));
        A002.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        application.sendBroadcast(A002);
    }

    public void A08(AnonymousClass02N r3) {
        if (Build.VERSION.SDK_INT >= 30) {
            Log.i("WaShortcutsHelper/removeShortcutFromCache");
            AnonymousClass0PW.A0H(this.A07.A00, r3);
        }
    }
}
