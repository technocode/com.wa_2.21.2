package X;

import android.app.Application;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.DirectReplyService;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.0FJ  reason: invalid class name */
public class AnonymousClass0FJ extends RunnableEmptyBase implements Runnable {
    public final int A00;
    public final Context A01;
    public final AnonymousClass0C2 A02;
    public final AnonymousClass009 A03;
    public final AnonymousClass088 A04;
    public final AnonymousClass02M A05;
    public final AnonymousClass01I A06;
    public final AnonymousClass0XY A07;
    public final AnonymousClass0IY A08;
    public final C000300f A09;
    public final C03170Fb A0A;
    public final AnonymousClass0HI A0B;
    public final AnonymousClass1PG A0C;
    public final C27331Pi A0D;
    public final AnonymousClass1Pw A0E;
    public final AnonymousClass0HJ A0F;
    public final AnonymousClass01A A0G;
    public final C014308b A0H;
    public final AnonymousClass0L2 A0I;
    public final AnonymousClass03P A0J;
    public final AnonymousClass03C A0K;
    public final AnonymousClass00D A0L;
    public final AnonymousClass01X A0M;
    public final C006903j A0N;
    public final AnonymousClass01Q A0O;
    public final AnonymousClass01K A0P;
    public final AnonymousClass01T A0Q;
    public final AnonymousClass095 A0R;
    public final AnonymousClass0BW A0S;
    public final C04270Js A0T;
    public final AnonymousClass02N A0U;
    public final AnonymousClass0FE A0V;
    public final AnonymousClass0BS A0W;
    public final C29031Wt A0X;
    public final AbstractC007503q A0Y;
    public final C014708f A0Z;
    public final AnonymousClass0BB A0a;
    public final C02570Cp A0b;
    public final WebpUtils A0c;
    public final C04260Jr A0d;
    public final C09210cT A0e = C09210cT.A00();
    public final AnonymousClass0Fh A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;

    public AnonymousClass0FJ(Application application, AnonymousClass02M r3, AnonymousClass01I r4, C03170Fb r5, AnonymousClass009 r6, WebpUtils webpUtils, C006903j r8, AnonymousClass088 r9, AnonymousClass095 r10, C000300f r11, AnonymousClass0L2 r12, AnonymousClass0Fh r13, C27331Pi r14, AnonymousClass1Pw r15, AnonymousClass0HJ r16, AnonymousClass01A r17, AnonymousClass03P r18, C014308b r19, AnonymousClass01X r20, C29031Wt r21, C02570Cp r22, C04260Jr r23, AnonymousClass01K r24, AnonymousClass0BB r25, AnonymousClass0BS r26, AnonymousClass0HI r27, C04270Js r28, AnonymousClass0FE r29, AnonymousClass0BW r30, AnonymousClass00D r31, AnonymousClass01Q r32, AnonymousClass03C r33, AnonymousClass0IY r34, AnonymousClass01T r35, AnonymousClass0XY r36, C014708f r37, AnonymousClass0C2 r38, AnonymousClass1PG r39, AbstractC007503q r40, boolean z, boolean z2, boolean z3, AnonymousClass02N r44, int i, boolean z4) {
        this.A01 = application;
        this.A05 = r3;
        this.A06 = r4;
        this.A0A = r5;
        this.A03 = r6;
        this.A0c = webpUtils;
        this.A0N = r8;
        this.A04 = r9;
        this.A0R = r10;
        this.A09 = r11;
        this.A0I = r12;
        this.A0f = r13;
        this.A0D = r14;
        this.A0E = r15;
        this.A0F = r16;
        this.A0G = r17;
        this.A0J = r18;
        this.A0H = r19;
        this.A0M = r20;
        this.A0X = r21;
        this.A0b = r22;
        this.A0d = r23;
        this.A0P = r24;
        this.A0a = r25;
        this.A0W = r26;
        this.A0B = r27;
        this.A0T = r28;
        this.A0V = r29;
        this.A0S = r30;
        this.A0L = r31;
        this.A0O = r32;
        this.A0K = r33;
        this.A08 = r34;
        this.A0Q = r35;
        this.A07 = r36;
        this.A0Z = r37;
        this.A02 = r38;
        this.A0C = r39;
        this.A0Y = r40;
        this.A0j = z;
        this.A0i = z2;
        this.A0h = z3;
        this.A0U = r44;
        this.A00 = i;
        this.A0g = z4;
        this.A0k = r15.A07();
    }

    public static int A00(Context context, int i, int i2) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            Log.e("WindowManager was null");
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        int i3 = point.x * point.y;
        int i4 = 1;
        if (i3 != 0) {
            for (int i5 = i * i2; i5 > i3; i5 >>= 2) {
                i4 <<= 1;
            }
        }
        return i4;
    }

    public final Bitmap A01(C007003k r5) {
        Context context = this.A01;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(17104902);
        Bitmap A022 = this.A0I.A02(r5, dimensionPixelSize, dimensionPixelSize2);
        if (A022 != null) {
            return A022;
        }
        AnonymousClass0HJ r3 = this.A0F;
        return r3.A04(r5, Math.min(dimensionPixelSize, dimensionPixelSize2), r3.A01.A00.getResources().getDimension(R.dimen.small_avatar_radius));
    }

    public final AnonymousClass02R A02(Context context, C007003k r8) {
        AnonymousClass1PG r1 = this.A0C;
        if (!r1.A02 || !r1.A00.A0D(AbstractC000400g.A1H)) {
            return new AnonymousClass02R(2, new Intent("com.whatsapp.intent.action.OPEN", ContentUris.withAppendedId(AnonymousClass0YL.A00, r8.A01()), context, Conversation.class).addFlags(335544320).putExtra("fromNotification", true));
        }
        return new AnonymousClass02R(5, new Intent("com.whatsapp.intent.action.CHATS", ContentUris.withAppendedId(AnonymousClass0YL.A00, r8.A01()), context, HomeActivity.class));
    }

    public final CharSequence A03(int i, int i2, AbstractC007503q r15, C007003k r16) {
        if (i2 != 1) {
            AnonymousClass01X r8 = this.A0M;
            return r8.A0A(R.plurals.notification_new_message_from_multiple_contacts_2, (long) i2, r8.A0A(R.plurals.notification_new_message_from_multiple_contacts_1, (long) i, Integer.valueOf(i)), Integer.valueOf(i2));
        } else if (i == 1 && this.A0k) {
            return this.A0W.A0D(r15, r16, false, false);
        } else {
            return this.A0M.A0A(R.plurals.notification_new_message, (long) i, Integer.valueOf(i));
        }
    }

    public final String A04(AbstractC007503q r7) {
        AnonymousClass01A r1;
        C007003k A0A2;
        ContentResolver A062 = this.A0J.A06();
        if (A062 == null) {
            Log.w("messagenotification cr=null");
            return null;
        }
        AnonymousClass02N A072 = r7.A07();
        AnonymousClass02N r2 = r7.A0n.A00;
        if (!AnonymousClass1VY.A0Y(r2) || A072 == null) {
            r1 = this.A0G;
            if (r2 != null) {
                A0A2 = r1.A0A(r2);
            } else {
                throw null;
            }
        } else {
            r1 = this.A0G;
            A0A2 = r1.A0A(A072);
        }
        Uri A042 = r1.A04(A0A2, A062);
        if (A042 != null) {
            return A042.toString();
        }
        return null;
    }

    public final void A05(AnonymousClass03E r5, C007003k r6) {
        Context context = this.A01;
        Intent A052 = HomeActivity.A05(context);
        A052.putExtra("show_mute", true);
        A052.putExtra("mute_jid", AnonymousClass1VY.A0D(r6.A09));
        r5.A0N.add(new C14550mT(R.drawable.ic_notif_mute, this.A0M.A06(R.string.mute_status), PendingIntent.getActivity(context, 4, A052, 134217728)));
    }

    public final void A06(AnonymousClass03E r5, C007003k r6, int i) {
        if (DirectReplyService.A01()) {
            r5.A0N.add(DirectReplyService.A00(this.A01, this.A0M, r6, DirectReplyService.A0A, i));
            return;
        }
        Context context = this.A01;
        Intent intent = new Intent(context, PopupNotification.class);
        intent.putExtra("popup_notification_extra_quick_reply_jid", AnonymousClass1VY.A0D(r6.A09));
        intent.putExtra("popup_notification_extra_dismiss_notification", true);
        r5.A05(R.drawable.ic_action_reply, this.A0M.A06(R.string.notification_quick_reply), PendingIntent.getActivity(context, 0, intent, 134217728));
    }

    public final void A07(AnonymousClass03E r26, C007003k r27, AbstractC007503q r28, boolean z, boolean z2, boolean z3, boolean z4) {
        Bitmap bitmap;
        Bitmap bitmap2;
        CharSequence charSequence;
        Context context = this.A01;
        AnonymousClass095 r10 = this.A0R;
        C014308b r0 = this.A0H;
        AnonymousClass01X r15 = this.A0M;
        AnonymousClass01K r02 = this.A0P;
        AnonymousClass0BS r03 = this.A0W;
        if (!z3 || !z2) {
            bitmap = null;
        } else {
            bitmap = this.A0I.A02(r27, 400, 400);
        }
        C30001aY r1 = new C30001aY();
        if (z && (r28 instanceof AnonymousClass0MI) && ((AnonymousClass0M3) r28).A02 != null) {
            C30001aY r4 = new C30001aY();
            r4.A05 = 4 | r4.A05;
            AnonymousClass03E r2 = new AnonymousClass03E(context, null);
            r4.A00(r2);
            r1.A0D.add(r2.A01());
        }
        if (z3) {
            C28511Up A052 = r02.A05((AnonymousClass02N) r27.A02(AnonymousClass02N.class), 1, 20, -1);
            Cursor cursor = A052.A00;
            CharSequence charSequence2 = "";
            if (cursor != null) {
                try {
                    if (cursor.moveToLast()) {
                        if (r10.A08((AnonymousClass02N) r27.A02(AnonymousClass02N.class), A052.A01)) {
                            charSequence = TextUtils.concat(charSequence2, "…");
                        } else {
                            charSequence = charSequence2;
                        }
                        do {
                            Cursor cursor2 = A052.A00;
                            Jid A022 = r27.A02(AnonymousClass02N.class);
                            if (A022 != null) {
                                AbstractC007503q A032 = r02.A0J.A03(cursor2, (AnonymousClass02N) A022);
                                CharSequence A0D2 = A032 != null ? r03.A0D(A032, r27, false, true) : charSequence2;
                                if (A0D2 != charSequence2) {
                                    if (charSequence != charSequence2) {
                                        charSequence = TextUtils.concat(charSequence, "\n\n");
                                    }
                                    charSequence = TextUtils.concat(charSequence, A0D2);
                                }
                            } else {
                                throw null;
                            }
                        } while (A052.A00.moveToPrevious());
                        charSequence2 = charSequence;
                    }
                } finally {
                    A052.A00.close();
                }
            }
            AnonymousClass03E r9 = new AnonymousClass03E(context, null);
            C03800Hr r3 = new C03800Hr();
            r3.A07(charSequence2);
            r9.A08(r3);
            C30001aY r7 = new C30001aY();
            r7.A05 = 8 | r7.A05;
            r7.A00(r9);
            r1.A0D.add(r9.A01());
        }
        if (z4) {
            C14630mc r92 = new C14630mc("android_wear_voice_input", r15.A0D(R.string.reply_to_label, r0.A08(r27, false)), r15.A0N(AndroidWear.A09), new Bundle(), new HashSet());
            C14540mS r32 = new C14540mS(R.drawable.ic_full_reply, r92.A01, PendingIntent.getService(context, 0, new Intent("com.whatsapp.intent.action.REPLY", ContentUris.withAppendedId(AnonymousClass0YL.A00, r27.A01()), context, AndroidWear.class), 134217728));
            ArrayList arrayList = r32.A01;
            if (arrayList == null) {
                arrayList = new ArrayList();
                r32.A01 = arrayList;
            }
            arrayList.add(r92);
            r1.A0C.add(r32.A00());
        }
        r1.A0C.add(AndroidWear.A00(context, r27, r15));
        if (bitmap != null) {
            r1.A09 = bitmap;
        }
        r1.A00(r26);
        if (Build.VERSION.SDK_INT >= 24 && (bitmap2 = r1.A09) != null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("wa-notification-manager wearable extender background builder=");
            A0S2.append(r26.hashCode());
            A0S2.append(" ref=");
            A0S2.append(bitmap2.hashCode());
            A0S2.append(" c=");
            A0S2.append(bitmap2.getByteCount());
            A0S2.append(" w=");
            A0S2.append(bitmap2.getWidth());
            A0S2.append(" h=");
            A0S2.append(bitmap2.getHeight());
            Log.d(A0S2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x016a, code lost:
        if (r8.A0m == 45) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0180, code lost:
        if (A0A((X.AnonymousClass02N) r7.A02(X.AnonymousClass02N.class), r4, r8.A0C) == false) goto L_0x0182;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.util.ArrayList r38, boolean r39, boolean r40, int r41, int r42, java.lang.StringBuilder r43, boolean r44, int r45, boolean r46) {
        /*
        // Method dump skipped, instructions count: 1367
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FJ.A08(java.util.ArrayList, boolean, boolean, int, int, java.lang.StringBuilder, boolean, int, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09(X.AnonymousClass03E r21, X.C007003k r22, X.AbstractC007503q r23, boolean r24, boolean r25, java.lang.StringBuilder r26) {
        /*
        // Method dump skipped, instructions count: 458
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FJ.A09(X.03E, X.03k, X.03q, boolean, boolean, java.lang.StringBuilder):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if ((r2 + 86400000) >= r7) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(X.AnonymousClass02N r11, int r12, long r13) {
        /*
            r10 = this;
            r9 = 0
            r0 = 50
            if (r12 > r0) goto L_0x0006
            return r9
        L_0x0006:
            X.00D r0 = r10.A0L
            android.content.SharedPreferences r3 = r0.A00
            java.lang.String r2 = "last_read_conversation_time"
            r0 = 0
            long r7 = r3.getLong(r2, r0)
            X.03j r2 = r10.A0N
            java.util.concurrent.ConcurrentHashMap r2 = r2.A0A()
            java.lang.Object r2 = r2.get(r11)
            X.0bL r2 = (X.C08560bL) r2
            if (r2 != 0) goto L_0x0040
            r2 = 0
        L_0x0022:
            long r13 = r13 - r2
            r5 = 300000(0x493e0, double:1.482197E-318)
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L_0x002c
            r5 = 1
        L_0x002c:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0039
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r5 != 0) goto L_0x003e
            if (r0 == 0) goto L_0x003f
        L_0x003e:
            r9 = 1
        L_0x003f:
            return r9
        L_0x0040:
            long r2 = r2.A0L
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FJ.A0A(X.02N, int, long):boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0FJ.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0FJ r5 = (AnonymousClass0FJ) obj;
        AbstractC007503q r2 = this.A0Y;
        AbstractC007503q r0 = r5.A0Y;
        if ((r2 == r0 || (r2 != null && r0 != null && r0.A0n.equals(r2.A0n))) && this.A0h == r5.A0h && this.A0i == r5.A0i && this.A0j == r5.A0j && C006803i.A0q(this.A0U, r5.A0U) && this.A00 == r5.A00 && this.A0g == r5.A0g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AbstractC007503q r0 = this.A0Y;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i2 = ((((((hashCode * 31) + (this.A0j ? 1 : 0)) * 31) + (this.A0i ? 1 : 0)) * 31) + (this.A0h ? 1 : 0)) * 31;
        AnonymousClass02N r02 = this.A0U;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return ((((i2 + i) * 31) + this.A00) * 31) + (this.A0g ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x036e, code lost:
        if (r8 == null) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007f, code lost:
        if (r0.A0H == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0639, code lost:
        if (r1.contains(r0.A03) == false) goto L_0x063b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0647, code lost:
        if (r0.A07() != null) goto L_0x0649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06aa, code lost:
        if (r32 != false) goto L_0x06ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06b4, code lost:
        if (r0 == 0) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06e2, code lost:
        if (r15 == false) goto L_0x06e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0a18, code lost:
        if (A0A((X.AnonymousClass02N) r8.A02(X.AnonymousClass02N.class), r49.A0N.A01(r0), r9.A0C) == false) goto L_0x0a1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e5, code lost:
        if (r1 != null) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ea, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f1, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x062d  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0642  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0930  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x093d  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0a01  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0a1d  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0a23  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0a35  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0a49  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0a98  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab9  */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0b14  */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0b28  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0bfa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0c06  */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x0ca1  */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0ca3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 3304
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FJ.run():void");
    }
}
