package X;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.17J  reason: invalid class name */
public class AnonymousClass17J implements Handler.Callback {
    public static AnonymousClass17J A0D;
    public static final Status A0E = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0F = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0G = new Object();
    public long A00 = 5000;
    public long A01 = 120000;
    public long A02 = 10000;
    public AnonymousClass261 A03 = null;
    public final Context A04;
    public final Handler A05;
    public final AnonymousClass0LP A06;
    public final AnonymousClass180 A07;
    public final Map A08 = new ConcurrentHashMap(5, 0.75f, 1);
    public final Set A09 = new AnonymousClass03V(0);
    public final Set A0A = new AnonymousClass03V(0);
    public final AtomicInteger A0B = new AtomicInteger(1);
    public final AtomicInteger A0C = new AtomicInteger(0);

    public AnonymousClass17J(Context context, Looper looper, AnonymousClass0LP r8) {
        this.A04 = context;
        this.A05 = new HandlerC04640Ld(looper, this);
        this.A06 = r8;
        this.A07 = new AnonymousClass180(r8);
        Handler handler = this.A05;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static AnonymousClass17J A00(Context context) {
        AnonymousClass17J r3;
        synchronized (A0G) {
            r3 = A0D;
            if (r3 == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                r3 = new AnonymousClass17J(context.getApplicationContext(), handlerThread.getLooper(), AnonymousClass0LP.A00);
                A0D = r3;
            }
        }
        return r3;
    }

    public final void A01(AnonymousClass173 r4) {
        C237017e r2 = r4.A07;
        Map map = this.A08;
        C457125z r1 = (C457125z) map.get(r2);
        if (r1 == null) {
            r1 = new C457125z(this, r4);
            map.put(r2, r1);
        }
        if (r1.A04.AMw()) {
            this.A0A.add(r2);
        }
        r1.A00();
    }

    public final void A02(AnonymousClass261 r4) {
        synchronized (A0G) {
            if (this.A03 != r4) {
                this.A03 = r4;
                this.A09.clear();
            }
            this.A09.addAll(r4.A01);
        }
    }

    public final boolean A03(C34661ix r7, int i) {
        PendingIntent activity;
        AnonymousClass0LP r4 = this.A06;
        Context context = this.A04;
        if (r7.A01()) {
            activity = r7.A02;
        } else {
            Intent A012 = r4.A01(context, r7.A01, null);
            if (A012 == null) {
                return false;
            }
            activity = PendingIntent.getActivity(context, 0, A012, 134217728);
        }
        if (activity == null) {
            return false;
        }
        int i2 = r7.A01;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        r4.A05(context, i2, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    public boolean handleMessage(Message message) {
        Object[] objArr;
        Status status;
        int i = message.what;
        int i2 = 0;
        long j = 300000;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.A02 = j;
                Handler handler = this.A05;
                handler.removeMessages(12);
                for (Object obj : this.A08.keySet()) {
                    handler.sendMessageDelayed(handler.obtainMessage(12, obj), this.A02);
                }
                break;
            case 2:
                C237117f r4 = (C237117f) message.obj;
                Iterator it = ((C06050Rn) r4.A02.keySet()).iterator();
                while (true) {
                    C06070Rp r1 = (C06070Rp) it;
                    if (!r1.hasNext()) {
                        break;
                    } else {
                        C237017e r6 = (C237017e) r1.next();
                        C457125z r5 = (C457125z) this.A08.get(r6);
                        if (r5 == null) {
                            r4.A00(r6, new C34661ix(13), null);
                            break;
                        } else if (r5.A04.isConnected()) {
                            r4.A00(r6, C34661ix.A04, r5.A04.A6D());
                        } else {
                            C001801b.A1L(r5.A0C.A05);
                            if (r5.A00 != null) {
                                C001801b.A1L(r5.A0C.A05);
                                r4.A00(r6, r5.A00, null);
                            } else {
                                C001801b.A1L(r5.A0C.A05);
                                r5.A0B.add(r4);
                                r5.A00();
                            }
                        }
                    }
                }
            case 3:
                for (C457125z r12 : this.A08.values()) {
                    C001801b.A1L(r12.A0C.A05);
                    r12.A00 = null;
                    r12.A00();
                }
                break;
            case 4:
            case 8:
            case 13:
                C236617a r42 = (C236617a) message.obj;
                Map map = this.A08;
                C457125z r2 = (C457125z) map.get(r42.A01.A07);
                if (r2 == null) {
                    AnonymousClass173 r0 = r42.A01;
                    A01(r0);
                    r2 = (C457125z) map.get(r0.A07);
                }
                if (!r2.A04.AMw() || this.A0C.get() == r42.A00) {
                    r2.A08(r42.A02);
                    return true;
                }
                r42.A02.A01(A0E);
                r2.A04();
                return true;
            case 5:
                int i3 = message.arg1;
                C34661ix r43 = (C34661ix) message.obj;
                for (C457125z r7 : this.A08.values()) {
                    if (r7.A02 == i3) {
                        AnonymousClass0LP r13 = this.A06;
                        int i4 = r43.A01;
                        if (r13 != null) {
                            String A002 = C34661ix.A00(i4);
                            String str = r43.A03;
                            r7.A07(new Status(17, AnonymousClass008.A09(AnonymousClass008.A00(str, AnonymousClass008.A00(A002, 69)), "Error resolution was canceled by the user, original error message: ", A002, ": ", str)));
                            return true;
                        }
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder(76);
                sb.append("Could not find API instance ");
                sb.append(i3);
                sb.append(" while trying to fail enqueued calls.");
                Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                return true;
            case 6:
                Context context = this.A04;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C008405a.A00((Application) context.getApplicationContext());
                    ComponentCallbacks2C008405a r62 = ComponentCallbacks2C008405a.A04;
                    C34961jV r22 = new C34961jV(this);
                    synchronized (r62) {
                        r62.A01.add(r22);
                    }
                    AtomicBoolean atomicBoolean = r62.A03;
                    if (!atomicBoolean.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            r62.A02.set(true);
                        }
                    }
                    if (!r62.A02.get()) {
                        this.A02 = 300000;
                        return true;
                    }
                }
                break;
            case 7:
                A01((AnonymousClass173) message.obj);
                return true;
            case 9:
                Map map2 = this.A08;
                if (map2.containsKey(message.obj)) {
                    C457125z r14 = (C457125z) map2.get(message.obj);
                    C001801b.A1L(r14.A0C.A05);
                    if (r14.A01) {
                        r14.A00();
                        return true;
                    }
                }
                break;
            case 10:
                Set<Object> set = this.A0A;
                for (Object obj2 : set) {
                    ((C457125z) this.A08.remove(obj2)).A04();
                }
                set.clear();
                return true;
            case 11:
                Map map3 = this.A08;
                if (map3.containsKey(message.obj)) {
                    C457125z r44 = (C457125z) map3.get(message.obj);
                    AnonymousClass17J r52 = r44.A0C;
                    Handler handler2 = r52.A05;
                    C001801b.A1L(handler2);
                    boolean z = r44.A01;
                    if (z) {
                        if (z) {
                            C237017e r15 = r44.A07;
                            handler2.removeMessages(11, r15);
                            handler2.removeMessages(9, r15);
                            r44.A01 = false;
                        }
                        if (r52.A06.A00(r52.A04, 12451000) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        r44.A07(status);
                        r44.A04.A3k();
                        return true;
                    }
                }
                break;
            case 12:
                Map map4 = this.A08;
                if (map4.containsKey(message.obj)) {
                    C457125z r45 = (C457125z) map4.get(message.obj);
                    C001801b.A1L(r45.A0C.A05);
                    AbstractC34701j2 r23 = r45.A04;
                    if (r23.isConnected() && r45.A09.size() == 0) {
                        AnonymousClass17S r16 = r45.A05;
                        if (!r16.A00.isEmpty() || !r16.A01.isEmpty()) {
                            r45.A05();
                            return true;
                        }
                        r23.A3k();
                        return true;
                    }
                }
                break;
            case 14:
                throw null;
            case 15:
                AnonymousClass17I r24 = (AnonymousClass17I) message.obj;
                Map map5 = this.A08;
                if (map5.containsKey(r24.A01)) {
                    C457125z r17 = (C457125z) map5.get(r24.A01);
                    if (r17.A08.contains(r24) && !r17.A01) {
                        if (!r17.A04.isConnected()) {
                            r17.A00();
                            return true;
                        }
                        r17.A03();
                        return true;
                    }
                }
                break;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                AnonymousClass17I r25 = (AnonymousClass17I) message.obj;
                Map map6 = this.A08;
                if (map6.containsKey(r25.A01)) {
                    C457125z r10 = (C457125z) map6.get(r25.A01);
                    if (r10.A08.remove(r25)) {
                        Handler handler3 = r10.A0C.A05;
                        handler3.removeMessages(15, r25);
                        handler3.removeMessages(16, r25);
                        C34671iy r8 = r25.A00;
                        Queue<AnonymousClass17U> queue = r10.A0A;
                        ArrayList arrayList = new ArrayList(queue.size());
                        for (AnonymousClass17U r9 : queue) {
                            if (r9 instanceof AbstractC34981jX) {
                                AbstractC34981jX r26 = (AbstractC34981jX) r9;
                                if (!(r26 instanceof AnonymousClass298)) {
                                    objArr = null;
                                } else {
                                    r10.A09.get(((AnonymousClass298) r26).A00);
                                    objArr = null;
                                }
                                if (objArr != null) {
                                    int length = objArr.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < length) {
                                            if (!AnonymousClass05S.A0H(objArr[i5], r8)) {
                                                i5++;
                                            } else if (i5 >= 0) {
                                                arrayList.add(r9);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            AnonymousClass17U r18 = (AnonymousClass17U) obj3;
                            queue.remove(r18);
                            r18.A04(new AnonymousClass17E(r8));
                        }
                        break;
                    }
                }
                break;
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Unknown message id: ");
                sb2.append(i);
                Log.w("GoogleApiManager", sb2.toString());
                return false;
        }
        return true;
    }
}
