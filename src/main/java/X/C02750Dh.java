package X;

import android.content.ContentValues;
import android.content.Intent;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.service.MDSyncService;
import com.whatsapp.util.Log;

/* renamed from: X.0Dh  reason: invalid class name and case insensitive filesystem */
public class C02750Dh {
    public static volatile C02750Dh A0G;
    public final C000300f A00;
    public final AnonymousClass0DX A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass00D A04;
    public final AnonymousClass01Q A05;
    public final AnonymousClass0AP A06;
    public final AnonymousClass095 A07;
    public final AnonymousClass0CF A08;
    public final C03130Ex A09;
    public final AnonymousClass0DR A0A;
    public final C02760Di A0B;
    public final AnonymousClass0EI A0C;
    public final AnonymousClass0C5 A0D;
    public final AnonymousClass0BB A0E;
    public final AnonymousClass00T A0F;

    public C02750Dh(AnonymousClass00G r2, AnonymousClass00S r3, AnonymousClass00T r4, AnonymousClass095 r5, C000300f r6, AnonymousClass0CF r7, C02760Di r8, AnonymousClass0C5 r9, AnonymousClass0AP r10, AnonymousClass0DX r11, AnonymousClass0BB r12, AnonymousClass0DR r13, AnonymousClass00D r14, AnonymousClass01Q r15, AnonymousClass0EI r16, C03130Ex r17) {
        this.A02 = r3;
        this.A03 = r2;
        this.A0F = r4;
        this.A07 = r5;
        this.A00 = r6;
        this.A08 = r7;
        this.A0B = r8;
        this.A0D = r9;
        this.A06 = r10;
        this.A01 = r11;
        this.A0E = r12;
        this.A0A = r13;
        this.A04 = r14;
        this.A05 = r15;
        this.A0C = r16;
        this.A09 = r17;
    }

    public static C02750Dh A00() {
        if (A0G == null) {
            synchronized (C02750Dh.class) {
                if (A0G == null) {
                    A0G = new C02750Dh(AnonymousClass00G.A01, AnonymousClass00S.A00(), C002101e.A00(), AnonymousClass095.A00(), C000300f.A00(), AnonymousClass0CF.A00(), C02760Di.A00(), AnonymousClass0C5.A00(), AnonymousClass0AP.A00(), AnonymousClass0DX.A00(), AnonymousClass0BB.A00(), AnonymousClass0DR.A00(), AnonymousClass00D.A00(), AnonymousClass01Q.A00(), AnonymousClass0EI.A00(), C03130Ex.A00());
                }
            }
        }
        return A0G;
    }

    public long A01(int i) {
        int A062;
        if (i == 2) {
            A062 = this.A00.A06(AbstractC000400g.A3Q);
        } else if (i == 3) {
            A062 = this.A00.A06(AbstractC000400g.A3N);
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0F("Unexpected sync type ", i));
        }
        return (long) A062;
    }

    public final void A02(DeviceJid deviceJid, int i) {
        StringBuilder sb = new StringBuilder("history-sync-manager/activate sync phase ");
        sb.append(i);
        sb.append(" for ");
        sb.append(deviceJid);
        Log.i(sb.toString());
        C03130Ex r2 = this.A09;
        if (r2 != null) {
            AnonymousClass00E.A00();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", "1");
            int A002 = r2.A01.A9x().A00("msg_history_sync", contentValues, "device_id=?  AND sync_type=?", new String[]{deviceJid.getRawString(), String.valueOf(i)}, "MessageHistorySyncStore.activateSync");
            r2.A02(deviceJid);
            if (A002 > 0) {
                this.A0D.A03(this.A03.A00, MDSyncService.class, new Intent("com.whatsapp.service.MDSyncService.START_HISTORY_SYNC"));
                return;
            }
            return;
        }
        throw null;
    }
}
