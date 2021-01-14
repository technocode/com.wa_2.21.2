package java.lang;

import X.AbstractC003401r;
import X.AbstractC007503q;
import X.AbstractC08640bT;
import X.ActivityC004702f;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass029;
import X.AnonymousClass02H;
import X.AnonymousClass02N;
import X.AnonymousClass0AY;
import X.AnonymousClass0BB;
import X.AnonymousClass0C4;
import X.AnonymousClass0EB;
import X.AnonymousClass0H4;
import X.AnonymousClass0K9;
import X.AnonymousClass0PK;
import X.AnonymousClass0PW;
import X.AnonymousClass0Yz;
import X.AnonymousClass0ZJ;
import X.AnonymousClass22I;
import X.AnonymousClass22N;
import X.AnonymousClass33A;
import X.AnonymousClass33J;
import X.AnonymousClass33L;
import X.AnonymousClass33N;
import X.AnonymousClass3R6;
import X.AnonymousClass3R9;
import X.AnonymousClass3U7;
import X.AnonymousClass3ZP;
import X.C002001d;
import X.C002101e;
import X.C014308b;
import X.C02360Br;
import X.C03570Gt;
import X.C03580Gu;
import X.C03610Gy;
import X.C03620Gz;
import X.C04080Iy;
import X.C04230Jo;
import X.C05150Nj;
import X.C05180Nm;
import X.C08700bZ;
import X.C09200cS;
import X.C09250cY;
import X.C29241Xq;
import X.C48522Mp;
import X.C53032cI;
import X.C666535g;
import X.C71753Qe;
import X.C74213aM;
import X.C74223aN;
import android.content.ContentValues;
import android.database.Cursor;
import android.location.LocationListener;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.util.MarqueeToolbar;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallParticipantJid;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.Voip;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.whispersystems.jobqueue.Job;

public class RunnableEBaseShape4S0200000_I0_3 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape4S0200000_I0_3(AnonymousClass0EB r2) {
        this.A02 = 24;
        this.A01 = r2;
    }

    public RunnableEBaseShape4S0200000_I0_3(AnonymousClass0PK r2, Handler handler) {
        this.A02 = 18;
        this.A01 = r2;
        this.A00 = handler;
    }

    public RunnableEBaseShape4S0200000_I0_3(C08700bZ r2, Object obj) {
        this.A02 = 17;
        this.A01 = r2;
        this.A00 = new C666535g(obj);
    }

    public RunnableEBaseShape4S0200000_I0_3(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void run() {
        C74213aM r0;
        C74213aM r02;
        AnonymousClass3R6 r03;
        C74223aN r2;
        CallInfo callInfo;
        switch (this.A02) {
            case 0:
                Object obj = this.A01;
                AnonymousClass3ZP r3 = ((SearchFragment) this.A00).A0A;
                if (r3 != null) {
                    ArrayList arrayList = new ArrayList(r3.A0c);
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (obj.equals(((AbstractC08640bT) arrayList.get(i)).A01)) {
                            r3.A02(i);
                        }
                    }
                    return;
                }
                return;
            case 1:
                SearchFragment searchFragment = (SearchFragment) this.A00;
                searchFragment.A03.A0X(((Number) this.A01).intValue());
                searchFragment.A0p();
                return;
            case 2:
                ((AnonymousClass0BB) this.A00).A0H.A05((AnonymousClass02N) this.A01);
                return;
            case 3:
                AnonymousClass0K9 r4 = (AnonymousClass0K9) this.A00;
                AbstractC007503q r32 = (AbstractC007503q) this.A01;
                if (!r4.A02.A01()) {
                    return;
                }
                if (!(r32 instanceof AnonymousClass0ZJ)) {
                    r4.A01.post(new RunnableEBaseShape4S0200000_I0_3(r4, r32, 4));
                    return;
                }
                String str = ((AnonymousClass0ZJ) r32).A00;
                if (str != null) {
                    r4.A01.post(new RunnableEBaseShape0S1100000_I0(r4, str, 9));
                    return;
                }
                return;
            case 4:
                AnonymousClass0K9 r42 = (AnonymousClass0K9) this.A00;
                AbstractC007503q r33 = (AbstractC007503q) this.A01;
                Map map = r42.A03;
                String str2 = r33.A0n.A01;
                if (!map.containsKey(str2)) {
                    map.put(str2, r33);
                    r42.A04();
                    return;
                }
                return;
            case 5:
                ((AnonymousClass33J) this.A00).AKV((List) this.A01);
                return;
            case 6:
                C04230Jo r5 = (C04230Jo) this.A00;
                C29241Xq r43 = (C29241Xq) this.A01;
                String str3 = r43.A0A;
                if (str3 != null) {
                    r5.A05(new AnonymousClass33A(str3, r5.A05.A00(str3), r43));
                    r5.A01.A02.post(new RunnableEBaseShape4S0100000_I0_4(r5.A06, 25));
                    C02360Br r34 = r5.A04;
                    String A1v = C002001d.A1v(r5.A0D(false));
                    String str4 = r43.A0A;
                    if (r34.A0D.A03()) {
                        r34.A0B.A09(Message.obtain(null, 0, 242, 0, new AnonymousClass22I(A1v, str4)));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Collection<C29241Xq> collection = (Collection) this.A01;
                C03620Gz r04 = ((C03570Gt) this.A00).A0G;
                if (r04 != null) {
                    AnonymousClass00E.A01();
                    Iterator it = ((AbstractC003401r) r04).A00.iterator();
                    while (true) {
                        AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                        if (r1.hasNext()) {
                            AnonymousClass33L r12 = (AnonymousClass33L) r1.next();
                            if (r12 instanceof AnonymousClass3R9) {
                                AnonymousClass3R6 r05 = ((AnonymousClass3R9) r12).A00.A02;
                                if (!(r05 == null || (r0 = r05.A0B) == null)) {
                                    r0.A01();
                                }
                            } else if (r12 instanceof C71753Qe) {
                                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = ((C71753Qe) r12).A00;
                                ((ActivityC004702f) stickerStorePackPreviewActivity).A0F.A06(R.string.sticker_starred_snackbar_message, 1);
                                if (stickerStorePackPreviewActivity.A0N != null) {
                                    for (C29241Xq r06 : collection) {
                                        stickerStorePackPreviewActivity.A0N.add(r06.A0A);
                                    }
                                }
                            } else if (r12 instanceof C53032cI) {
                                C48522Mp r13 = ((C53032cI) r12).A00;
                                r13.A07(collection, true);
                                r13.A0X.A0A();
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    throw null;
                }
            case 8:
                C03570Gt r52 = (C03570Gt) this.A00;
                Collection<C29241Xq> collection2 = (Collection) this.A01;
                for (C29241Xq r07 : collection2) {
                    String str5 = r07.A0A;
                    C03580Gu r22 = r52.A0N;
                    if (r22.A02(str5)) {
                        r52.A04.A08(str5);
                        if (r22 != null) {
                            AnonymousClass00E.A00();
                            r22.A01();
                            C03610Gy r14 = r22.A01;
                            r14.A02(str5, r14.A00(str5));
                            r22.A02.A01(str5);
                            C02360Br r23 = r52.A0D;
                            String A1u = C002001d.A1u(r52.A0E());
                            if (r23.A0D.A03()) {
                                r23.A0B.A09(Message.obtain(null, 0, 244, 0, new AnonymousClass22N(A1u, str5)));
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                r52.A03.A02.post(new RunnableEBaseShape4S0200000_I0_3(r52, collection2, 9));
                return;
            case 9:
                Collection<C29241Xq> collection3 = (Collection) this.A01;
                C03620Gz r08 = ((C03570Gt) this.A00).A0G;
                if (r08 != null) {
                    AnonymousClass00E.A01();
                    Iterator it2 = ((AbstractC003401r) r08).A00.iterator();
                    while (true) {
                        AnonymousClass0AY r15 = (AnonymousClass0AY) it2;
                        if (r15.hasNext()) {
                            AnonymousClass33L r16 = (AnonymousClass33L) r15.next();
                            if (r16 instanceof AnonymousClass3R9) {
                                AnonymousClass3R6 r09 = ((AnonymousClass3R9) r16).A00.A02;
                                if (!(r09 == null || (r02 = r09.A0B) == null)) {
                                    r02.A01();
                                }
                            } else if (r16 instanceof C71753Qe) {
                                StickerStorePackPreviewActivity stickerStorePackPreviewActivity2 = ((C71753Qe) r16).A00;
                                ((ActivityC004702f) stickerStorePackPreviewActivity2).A0F.A06(R.string.sticker_unstarred_snackbar_message, 1);
                                if (stickerStorePackPreviewActivity2.A0N != null) {
                                    for (C29241Xq r010 : collection3) {
                                        stickerStorePackPreviewActivity2.A0N.remove(r010.A0A);
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    throw null;
                }
            case 10:
                ((C03570Gt) this.A00).A0L((Collection) this.A01, true);
                return;
            case 11:
                AnonymousClass33N r44 = (AnonymousClass33N) this.A01;
                C03620Gz r011 = ((AnonymousClass0H4) this.A00).A03;
                AnonymousClass00E.A01();
                Iterator it3 = ((AbstractC003401r) r011).A00.iterator();
                while (true) {
                    AnonymousClass0AY r17 = (AnonymousClass0AY) it3;
                    if (r17.hasNext()) {
                        AnonymousClass33L r18 = (AnonymousClass33L) r17.next();
                        if (!(!(r18 instanceof AnonymousClass3R9) || (r03 = ((AnonymousClass3R9) r18).A00.A02) == null || (r2 = (C74223aN) r03.A0E.get(r44.A0D)) == null)) {
                            r2.A04 = r44;
                            r2.A00().A08(r44.A04);
                            r2.A01();
                        }
                    } else {
                        return;
                    }
                }
            case 12:
                ((View) this.A01).setSelected(true);
                ((MarqueeToolbar) this.A00).A00 = null;
                return;
            case 13:
                ((AnonymousClass02H) this.A00).execute((Runnable) this.A01);
                return;
            case 14:
                AnonymousClass02H r53 = (AnonymousClass02H) this.A00;
                Runnable runnable = (Runnable) this.A01;
                try {
                    r53.A05 = Thread.currentThread().getId();
                    synchronized (r53.A02) {
                        runnable.run();
                    }
                    return;
                } finally {
                    r53.A05 = -1;
                    r53.A01();
                }
            case 15:
                Process.setThreadPriority(((AnonymousClass029) this.A00).A00);
                ((Runnable) this.A01).run();
                return;
            case GlVideoRenderer.CAP_RENDER_I420:
                ((C002101e) this.A00).ANF((Runnable) this.A01);
                return;
            case 17:
                C666535g r19 = (C666535g) this.A00;
                C04080Iy r45 = r19.A00;
                if (!r45.A03()) {
                    C08700bZ r24 = (C08700bZ) this.A01;
                    Object A20 = r24.A01.A20(r19);
                    if (!r45.A03()) {
                        r24.A02.A08(A20);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                AnonymousClass0PK r46 = (AnonymousClass0PK) this.A01;
                synchronized (r46) {
                    r46.A08.put((Handler) this.A00, Boolean.FALSE);
                }
                return;
            case 19:
                C09200cS r25 = (C09200cS) this.A00;
                C09250cY r54 = (C09250cY) this.A01;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (UserJid userJid : r54.A04.keySet()) {
                    linkedHashMap.put(userJid, r25.A0G.A06(userJid));
                }
                Message obtain = Message.obtain(null, 0, new C09250cY(r54.A03, linkedHashMap, r54.A05, r54.A02, r54.A01, r54.A06));
                r25.A0K.A00.obtainMessage(1, new AnonymousClass0Yz("start_call", null, obtain)).sendToTarget();
                return;
            case AnonymousClass0PW.A01:
                Message obtain2 = Message.obtain(null, 0, this.A01);
                ((C09200cS) this.A00).A0K.A00.obtainMessage(1, new AnonymousClass0Yz("start_from_call_log", null, obtain2)).sendToTarget();
                return;
            case 21:
                AnonymousClass3U7 r55 = (AnonymousClass3U7) this.A00;
                UserJid userJid2 = (UserJid) this.A01;
                int inviteToGroupCall = Voip.inviteToGroupCall(new CallParticipantJid(userJid2, (DeviceJid[]) r55.A1f.A06(userJid2).toArray(new DeviceJid[0])));
                if (!(inviteToGroupCall == 0 || inviteToGroupCall == 670021 || inviteToGroupCall == 670038)) {
                    C014308b r7 = r55.A1T;
                    AnonymousClass01A r8 = r55.A1S;
                    String A04 = r7.A04(r8.A0A(userJid2));
                    AnonymousClass01X r47 = r55.A1a;
                    String A0D = r47.A0D(R.string.unable_to_add_participant_to_group_call, A04);
                    if (inviteToGroupCall == 670033 && (callInfo = Voip.getCallInfo()) != null && !callInfo.isGroupCall) {
                        A0D = r47.A0D(R.string.voip_peer_group_call_not_supported, r7.A04(r8.A0A(callInfo.peerJid)));
                    }
                    Message.obtain(r55.A0J, 26, A0D).sendToTarget();
                    return;
                }
                return;
            case 22:
                ((AnonymousClass0C4) this.A00).A09.A06((LocationListener) this.A01);
                return;
            case 23:
                try {
                    Job job = (Job) this.A01;
                    if (job.parameters.isPersistent) {
                        C05180Nm r26 = ((AnonymousClass0EB) this.A00).A04;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("item", r26.A02.A00(job));
                        contentValues.put("encrypted", (Boolean) false);
                        job.A01(r26.A03.getWritableDatabase().insert("queue", null, contentValues));
                    }
                    AnonymousClass0EB r27 = (AnonymousClass0EB) this.A00;
                    r27.A03.A00(r27.A00, job);
                    job.A02();
                    C05150Nj r110 = r27.A02;
                    synchronized (r110) {
                        r110.A00.add(job);
                        r110.A03.A00.open();
                    }
                    return;
                } catch (IOException e) {
                    Log.w("JobManager", e);
                    ((Job) this.A01).A00();
                    return;
                }
            case 24:
                AnonymousClass0EB r82 = (AnonymousClass0EB) this.A01;
                C05180Nm r72 = r82.A04;
                LinkedList linkedList = new LinkedList();
                Cursor cursor = null;
                try {
                    Cursor query = r72.A03.getReadableDatabase().query("queue", null, "encrypted = 0", null, null, null, "_id ASC", null);
                    while (query.moveToNext()) {
                        long j = query.getLong(query.getColumnIndexOrThrow("_id"));
                        String string = query.getString(query.getColumnIndexOrThrow("item"));
                        boolean z = true;
                        if (query.getInt(query.getColumnIndexOrThrow("encrypted")) != 1) {
                            z = false;
                        }
                        try {
                            Job A012 = r72.A02.A01(null, z, string);
                            A012.A01(j);
                            r72.A01.A00(r72.A00, A012);
                            linkedList.add(A012);
                        } catch (IOException e2) {
                            Log.w("PersistentStore", e2);
                            r72.A03.getWritableDatabase().delete("queue", "_id = ?", new String[]{String.valueOf(j)});
                        }
                    }
                    query.close();
                    C05150Nj r111 = r82.A02;
                    synchronized (r111) {
                        r111.A00.addAll(linkedList);
                        r111.A03.A00.open();
                    }
                    return;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            default:
                return;
        }
    }
}
