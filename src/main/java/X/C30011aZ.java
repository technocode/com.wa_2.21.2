package X;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1aZ  reason: invalid class name and case insensitive filesystem */
public class C30011aZ implements AbstractC14530mR {
    public int A00;
    public RemoteViews A01;
    public final Notification.Builder A02;
    public final Bundle A03 = new Bundle();
    public final AnonymousClass03E A04;
    public final List A05 = new ArrayList();

    public C30011aZ(AnonymousClass03E r15) {
        Notification.Builder builder;
        Notification.Action.Builder builder2;
        Bundle bundle;
        this.A04 = r15;
        int i = Build.VERSION.SDK_INT;
        Context context = r15.A0B;
        if (i >= 26) {
            builder = new Notification.Builder(context, r15.A0J);
            this.A02 = builder;
        } else {
            builder = new Notification.Builder(context);
            this.A02 = builder;
        }
        Notification notification = r15.A07;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(r15.A0H).setContentText(r15.A0G).setContentInfo(null).setContentIntent(r15.A09).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(r15.A0A, (notification.flags & 128) != 0).setLargeIcon(r15.A0C).setNumber(r15.A02).setProgress(r15.A05, r15.A04, r15.A0T);
        if (Build.VERSION.SDK_INT < 21) {
            this.A02.setSound(notification.sound, notification.audioStreamType);
        }
        this.A02.setSubText(null).setUsesChronometer(r15.A0V).setPriority(r15.A03);
        Iterator it = r15.A0N.iterator();
        while (it.hasNext()) {
            C14550mT r10 = (C14550mT) it.next();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 20) {
                if (i2 >= 23) {
                    IconCompat A002 = r10.A00();
                    builder2 = new Notification.Action.Builder(A002 == null ? null : A002.A07(), r10.A03, r10.A01);
                } else {
                    builder2 = new Notification.Action.Builder(r10.A00, r10.A03, r10.A01);
                }
                C14630mc[] r0 = r10.A09;
                if (r0 != null) {
                    for (RemoteInput remoteInput : C14630mc.A01(r0)) {
                        builder2.addRemoteInput(remoteInput);
                    }
                }
                Bundle bundle2 = r10.A07;
                if (bundle2 != null) {
                    bundle = new Bundle(bundle2);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", r10.A04);
                if (Build.VERSION.SDK_INT >= 24) {
                    builder2.setAllowGeneratedReplies(r10.A04);
                }
                int i3 = r10.A06;
                bundle.putInt("android.support.action.semanticAction", i3);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28) {
                    builder2.setSemanticAction(i3);
                }
                if (i4 >= 29) {
                    builder2.setContextual(false);
                }
                bundle.putBoolean("android.support.action.showsUserInterface", r10.A05);
                builder2.addExtras(bundle);
                this.A02.addAction(builder2.build());
            } else {
                List list = this.A05;
                this.A02.addAction(r10.A00, r10.A03, r10.A01);
                Bundle bundle3 = new Bundle(r10.A07);
                C14630mc[] r02 = r10.A09;
                if (r02 != null) {
                    bundle3.putParcelableArray("android.support.remoteInputs", C14570mV.A01(r02));
                }
                C14630mc[] r03 = r10.A08;
                if (r03 != null) {
                    bundle3.putParcelableArray("android.support.dataRemoteInputs", C14570mV.A01(r03));
                }
                bundle3.putBoolean("android.support.allowGeneratedReplies", r10.A04);
                list.add(bundle3);
            }
        }
        Bundle bundle4 = r15.A0D;
        if (bundle4 != null) {
            this.A03.putAll(bundle4);
        }
        if (Build.VERSION.SDK_INT < 20) {
            if (r15.A0S) {
                this.A03.putBoolean("android.support.localOnly", true);
            }
            String str = r15.A0K;
            if (str != null) {
                this.A03.putString("android.support.groupKey", str);
                if (r15.A0R) {
                    this.A03.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.A03.putBoolean("android.support.useSideChannel", true);
                }
            }
            String str2 = r15.A0M;
            if (str2 != null) {
                this.A03.putString("android.support.sortKey", str2);
            }
        }
        this.A01 = r15.A0E;
        if (Build.VERSION.SDK_INT >= 19) {
            this.A02.setShowWhen(r15.A0U);
            if (Build.VERSION.SDK_INT < 21) {
                ArrayList arrayList = r15.A0P;
                if (!arrayList.isEmpty()) {
                    this.A03.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.A02.setLocalOnly(r15.A0S).setGroup(r15.A0K).setGroupSummary(r15.A0R).setSortKey(r15.A0M);
            this.A00 = r15.A01;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.A02.setCategory(r15.A0I).setColor(r15.A00).setVisibility(r15.A06).setPublicVersion(r15.A08).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = r15.A0P.iterator();
            while (it2.hasNext()) {
                this.A02.addPerson((String) it2.next());
            }
            if (r15.A0O.size() > 0) {
                Bundle bundle5 = r15.A03().getBundle("android.car.EXTENSIONS");
                bundle5 = bundle5 == null ? new Bundle() : bundle5;
                Bundle bundle6 = new Bundle();
                int i5 = 0;
                while (true) {
                    ArrayList arrayList2 = r15.A0O;
                    if (i5 >= arrayList2.size()) {
                        break;
                    }
                    bundle6.putBundle(Integer.toString(i5), C14570mV.A00((C14550mT) arrayList2.get(i5)));
                    i5++;
                }
                bundle5.putBundle("invisible_actions", bundle6);
                r15.A03().putBundle("android.car.EXTENSIONS", bundle5);
                this.A03.putBundle("android.car.EXTENSIONS", bundle5);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setExtras(r15.A0D).setRemoteInputHistory(null);
            RemoteViews remoteViews = r15.A0E;
            if (remoteViews != null) {
                this.A02.setCustomContentView(remoteViews);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.A02.setBadgeIconType(0).setShortcutId(r15.A0L).setTimeoutAfter(0).setGroupAlertBehavior(r15.A01);
            if (!TextUtils.isEmpty(r15.A0J)) {
                this.A02.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.A02.setAllowSystemGeneratedContextualActions(true);
            this.A02.setBubbleMetadata(null);
        }
    }

    public static final void A00(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }
}
