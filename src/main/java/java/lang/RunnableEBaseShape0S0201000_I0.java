package java.lang;

import X.AbstractC005602q;
import X.AbstractC007503q;
import X.AbstractC51572Zg;
import X.AnonymousClass008;
import X.AnonymousClass00X;
import X.AnonymousClass00Y;
import X.AnonymousClass01K;
import X.AnonymousClass02M;
import X.AnonymousClass03K;
import X.AnonymousClass0AB;
import X.AnonymousClass0AC;
import X.AnonymousClass0BD;
import X.AnonymousClass0FM;
import X.AnonymousClass0I8;
import X.AnonymousClass0L0;
import X.AnonymousClass0Q3;
import X.C002001d;
import X.C007303n;
import X.C04360Kb;
import X.C05600Pi;
import X.C15260nl;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.Conversation;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Collection;

public class RunnableEBaseShape0S0201000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape0S0201000_I0(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.A03 = i2;
        this.A01 = bottomSheetBehavior;
        if (2 - i2 != 0) {
            this.A02 = view;
            this.A00 = i;
            return;
        }
        this.A02 = view;
        this.A00 = i;
    }

    public RunnableEBaseShape0S0201000_I0(Object obj, int i, Object obj2, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }

    public void run() {
        int i;
        switch (this.A03) {
            case 0:
                String[] strArr = (String[]) this.A02;
                int length = strArr.length;
                int[] iArr = new int[length];
                Activity activity = (Activity) this.A01;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                }
                ((AbstractC005602q) activity).onRequestPermissionsResult(this.A00, strArr, iArr);
                return;
            case 1:
                ((View) this.A01).setLayoutParams(new FrameLayout.LayoutParams(this.A00, -1));
                ((Runnable) this.A02).run();
                return;
            case 2:
                ((BottomSheetBehavior) this.A01).A0E((View) this.A02, this.A00);
                return;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.A01;
                C15260nl r0 = bottomSheetBehavior.A0D;
                if (r0 == null || !r0.A0B()) {
                    bottomSheetBehavior.A0B(this.A00);
                    return;
                } else {
                    ((View) this.A02).postOnAnimation(this);
                    return;
                }
            case 4:
                Conversation conversation = (Conversation) this.A01;
                AbstractC007503q r5 = (AbstractC007503q) this.A02;
                int i3 = this.A00;
                C007303n r3 = r5.A0n;
                AbstractC51572Zg A0c = conversation.A0c(r3);
                if (A0c != null) {
                    if (i3 == 8) {
                        A0c.A0O();
                        return;
                    } else if (i3 == 12) {
                        A0c.A0L();
                        return;
                    } else if (i3 == 20) {
                        conversation.A0q.A0O.add(r3);
                        return;
                    } else {
                        A0c.A0Z(r5, true);
                        return;
                    }
                } else if (conversation.A0q.A0O.add(r3)) {
                    StringBuilder A0S = AnonymousClass008.A0S("conversation/refresh: no view for ");
                    A0S.append(r3.A01);
                    A0S.append(" ");
                    A0S.append(conversation.A0Y.getFirstVisiblePosition());
                    A0S.append("-");
                    A0S.append(conversation.A0Y.getLastVisiblePosition());
                    A0S.append(" (");
                    A0S.append(conversation.A0Y.getCount());
                    A0S.append(")");
                    Log.i(A0S.toString());
                    return;
                } else {
                    return;
                }
            case 5:
                Toast A012 = ((AnonymousClass02M) this.A01).A01((CharSequence) this.A02, this.A00);
                A012.setGravity(17, 0, 0);
                A012.show();
                return;
            case 6:
                DeviceJid deviceJid = (DeviceJid) this.A02;
                int i4 = this.A00;
                AnonymousClass0I8 r2 = ((AnonymousClass0L0) this.A01).A0R;
                boolean z = false;
                if (i4 == 406) {
                    z = true;
                }
                r2.A06(deviceJid, z);
                return;
            case 7:
                int i5 = this.A00;
                AbstractC007503q r52 = (AbstractC007503q) this.A02;
                AnonymousClass0FM r4 = ((C04360Kb) this.A01).A0r;
                if (i5 == 4) {
                    i = 3;
                } else if (i5 == 3) {
                    i = 2;
                } else {
                    i = 0;
                    if (i5 == 2) {
                        i = 1;
                    }
                }
                r4.A05(i, C002001d.A00(r52.A0m, r52.A04, false));
                return;
            case 8:
                int i6 = this.A00;
                Runnable runnable = (Runnable) this.A02;
                if (((AnonymousClass0BD) this.A01).A01.size() == i6 && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                AnonymousClass01K r1 = (AnonymousClass01K) this.A01;
                AbstractC007503q r42 = (AbstractC007503q) this.A02;
                int i7 = this.A00;
                if (r1.A0g(r42, i7)) {
                    Message.obtain(r1.A0b.A02, 2, i7, 0, r42).sendToTarget();
                    return;
                }
                return;
            case 10:
                AnonymousClass01K r9 = (AnonymousClass01K) this.A01;
                AbstractC007503q r8 = (AbstractC007503q) this.A02;
                int i8 = this.A00;
                C007303n r6 = r8.A0n;
                if (r6.A02 && !r8.A0v) {
                    r9.A06.A0A(r8, 4, r9.A0E.A04() - r8.A0x);
                }
                if (r9.A0e(r8, i8)) {
                    r9.A0O.A04(r6.A00);
                    return;
                }
                return;
            case 11:
                ((AnonymousClass01K) this.A01).A0m.A05((AbstractC007503q) this.A02, this.A00);
                return;
            case 12:
                ((AnonymousClass01K) this.A01).A0X((Collection) this.A02, this.A00);
                return;
            case 13:
                ((AnonymousClass0AB) this.A01).A02((AbstractC007503q) this.A02, this.A00);
                return;
            case 14:
                AnonymousClass00Y r53 = (AnonymousClass00Y) this.A01;
                int i9 = this.A00;
                AnonymousClass00X r12 = (AnonymousClass00X) ((AnonymousClass00X) this.A02).clone();
                if (r53.A0K && r53.A0G()) {
                    r53.A03.A04(r12, i9);
                    r53.A03.A01();
                    if (r53.A03.A00() > r53.A01.A02.A3X().A04.A05.remaining() && !r53.A01.A02.A3X().A04()) {
                        if (r53.A01.A02.A2U()) {
                            r53.A01.A02();
                            r53.A03.A01();
                        } else {
                            AnonymousClass03K r43 = r53.A0E;
                            Long l = r43.A0K;
                            if (l == null) {
                                r43.A0K = 0L;
                                l = 0L;
                            }
                            Long l2 = r43.A0L;
                            if (l2 == null) {
                                r43.A0L = 0L;
                                l2 = 0L;
                            }
                            r43.A0K = AnonymousClass008.A05(l);
                            r43.A0L = Long.valueOf(l2.longValue() + ((long) r53.A03.A00()));
                            r43.A07();
                            Log.w("wamruntime/recordPrivateStatsDroppedEvent: no space in buffer for more events ");
                            return;
                        }
                    }
                    if (r53.A03.A00() > r53.A01.A00()) {
                        Log.e("wamruntime/logPrivateStatsEventInternal: dropping event because it is larger than the buffer itself");
                        return;
                    }
                    C05600Pi r22 = r53.A01;
                    AnonymousClass0Q3 r02 = r53.A03;
                    r22.A03(r02.A00, r02.A01);
                    r53.A01.A01();
                    return;
                }
                return;
            case 15:
                AnonymousClass00Y r44 = (AnonymousClass00Y) this.A01;
                AnonymousClass00X r13 = (AnonymousClass00X) this.A02;
                int i10 = this.A00;
                int i11 = r13.channel;
                AnonymousClass00X r14 = (AnonymousClass00X) r13.clone();
                if (i11 != 1) {
                    r44.A0A(r14, i10, false);
                    return;
                } else if (r44.A0H()) {
                    r44.A04.A04(r14, i10);
                    r44.A04.A01();
                    r44.A05();
                    return;
                } else {
                    return;
                }
            case GlVideoRenderer.CAP_RENDER_I420:
                ((AnonymousClass0AC) this.A01).A06((AbstractC007503q) this.A02, this.A00);
                return;
            default:
                return;
        }
    }
}
