package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.BulkGetPreKeyJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Kt  reason: invalid class name and case insensitive filesystem */
public class C04540Kt {
    public static volatile C04540Kt A08;
    public boolean A00;
    public boolean A01;
    public final Handler A02;
    public final AnonymousClass01J A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass0CZ A05 = new AnonymousClass0CZ(10, 610);
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();

    public C04540Kt(AnonymousClass00S r7, AnonymousClass01J r8) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A04 = r7;
        this.A02 = handler;
        this.A03 = r8;
    }

    public static C04540Kt A00() {
        if (A08 == null) {
            synchronized (C04540Kt.class) {
                if (A08 == null) {
                    A08 = new C04540Kt(AnonymousClass00S.A00(), AnonymousClass01J.A00());
                }
            }
        }
        return A08;
    }

    public synchronized void A01() {
        if (this.A01) {
            this.A01 = false;
            this.A00 = false;
            this.A05.A02();
            A02();
        }
    }

    public final synchronized void A02() {
        DeviceJid[] deviceJidArr;
        Map map = this.A07;
        if (!map.isEmpty()) {
            long A042 = this.A04.A04();
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                if (((Boolean) entry.getValue()).booleanValue()) {
                    arrayList2.add(entry.getKey());
                }
                this.A06.put(entry.getKey(), Pair.create(Long.valueOf(A042), entry.getValue()));
            }
            AnonymousClass01J r5 = this.A03;
            DeviceJid[] deviceJidArr2 = (DeviceJid[]) arrayList.toArray(new DeviceJid[0]);
            if (arrayList2.isEmpty()) {
                deviceJidArr = null;
            } else {
                deviceJidArr = (DeviceJid[]) arrayList2.toArray(new DeviceJid[0]);
            }
            r5.A00.A01(new BulkGetPreKeyJob(deviceJidArr2, deviceJidArr, 9));
            map.clear();
            this.A00 = false;
        }
    }

    public synchronized void A03(DeviceJid[] deviceJidArr, boolean z, int i) {
        DeviceJid[] deviceJidArr2;
        StringBuilder sb = new StringBuilder();
        sb.append("prekeysmanager/getprekeys request for jids:");
        sb.append(Arrays.toString(deviceJidArr));
        Log.i(sb.toString());
        AnonymousClass00S r5 = this.A04;
        long A042 = r5.A04();
        Map map = this.A06;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Pair) ((Map.Entry) it.next()).getValue()).first).longValue() + 60000 < A042) {
                it.remove();
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long A043 = r5.A04();
        for (DeviceJid deviceJid : deviceJidArr) {
            if (!map.containsKey(deviceJid)) {
                arrayList.add(deviceJid);
                map.put(deviceJid, Pair.create(Long.valueOf(A043), Boolean.valueOf(z)));
                if (z) {
                    arrayList2.add(deviceJid);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            AnonymousClass01J r3 = this.A03;
            DeviceJid[] deviceJidArr3 = (DeviceJid[]) arrayList.toArray(new DeviceJid[0]);
            if (arrayList2.isEmpty()) {
                deviceJidArr2 = null;
            } else {
                deviceJidArr2 = (DeviceJid[]) arrayList2.toArray(new DeviceJid[0]);
            }
            r3.A00.A01(new BulkGetPreKeyJob(deviceJidArr3, deviceJidArr2, i));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("prekeysmanager/sending getprekeys for jids:");
            sb2.append(Arrays.toString(deviceJidArr));
            Log.i(sb2.toString());
        }
        A01();
    }
}
