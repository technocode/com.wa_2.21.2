package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.AbstractCollection;
import java.util.concurrent.Callable;

/* renamed from: X.2Rl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49642Rl implements Callable {
    public final /* synthetic */ DeviceJid A00;
    public final /* synthetic */ SendE2EMessageJob A01;
    public final /* synthetic */ C007303n A02;
    public final /* synthetic */ AbstractC007503q A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ CallableC49642Rl(SendE2EMessageJob sendE2EMessageJob, C007303n r2, AbstractC007503q r3, DeviceJid deviceJid, boolean z) {
        this.A01 = sendE2EMessageJob;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = deviceJid;
        this.A04 = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AnonymousClass02X r10;
        AnonymousClass1UG r9;
        int A06;
        SendE2EMessageJob sendE2EMessageJob = this.A01;
        C007303n r4 = this.A02;
        AbstractC007503q r8 = this.A03;
        DeviceJid deviceJid = this.A00;
        if (this.A04) {
            AnonymousClass02N r102 = r4.A00;
            if (r102 instanceof AnonymousClass02X) {
                r10 = (AnonymousClass02X) r102;
            } else {
                r10 = null;
            }
            if (r10 != null) {
                AnonymousClass01I r1 = sendE2EMessageJob.A01;
                r1.A04();
                DeviceJid deviceJid2 = r1.A02;
                if (deviceJid2 != null) {
                    AnonymousClass0OE r3 = new AnonymousClass0OE(sendE2EMessageJob.jid, C001801b.A0A(deviceJid2));
                    C001000o r42 = sendE2EMessageJob.A05;
                    byte[] A09 = sendE2EMessageJob.A0H.A09();
                    r42.A0H.A00();
                    if (r42.A0I.A0E(189)) {
                        AnonymousClass05C r43 = r42.A01;
                        JniBridge jniBridge = r43.A03;
                        String str = r3.A01;
                        AnonymousClass0E6 r12 = r3.A00;
                        String str2 = r12.A01;
                        long j = (long) r12.A00;
                        AnonymousClass0y4 r13 = new AnonymousClass0y4((NativeHolder) JniBridge.jvidispatchOIOOO(1, j, str, str2, jniBridge.getWajContext()));
                        JniBridge.getInstance();
                        NativeHolder nativeHolder = r13.A00;
                        JniBridge.getInstance();
                        int i = new AnonymousClass1UM((byte[]) JniBridge.jvidispatchOIO(0, (long) 39, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 41, nativeHolder)).A00;
                        if (i != 0) {
                            StringBuilder A0S = AnonymousClass008.A0S("wamsys/encryptForGroup createSenderKeyDistributionMessage returned status=");
                            A0S.append(i);
                            A0S.append("; address=");
                            A0S.append(r3);
                            Log.e(A0S.toString());
                        }
                        AnonymousClass0y0 r14 = new AnonymousClass0y0((NativeHolder) JniBridge.jvidispatchOIOOOO(0, j, str, str2, r43.A03.getWajContext(), A09));
                        JniBridge.getInstance();
                        NativeHolder nativeHolder2 = r14.A00;
                        JniBridge.getInstance();
                        JniBridge.getInstance();
                        r9 = new AnonymousClass1UG((byte[]) JniBridge.jvidispatchOIO(0, (long) 34, nativeHolder2), (int) JniBridge.jvidispatchIIO(1, (long) 35, nativeHolder2), (int) JniBridge.jvidispatchIIO(1, (long) 36, nativeHolder2));
                    } else {
                        AnonymousClass05B r44 = r42.A00;
                        new AnonymousClass1Ys(r44.A00.A02).A00(C002001d.A2L(r3));
                        try {
                            r9 = new AnonymousClass1UG(new AnonymousClass1Yr(r44.A00.A02, C002001d.A2L(r3)).A00(AnonymousClass05B.A03(A09)), 3, 0);
                        } catch (C29361Ye unused) {
                            r9 = new AnonymousClass1UG(null, 0, -1002);
                        } catch (C29411Yj unused2) {
                            r9 = new AnonymousClass1UG(null, 0, -1008);
                        }
                    }
                    AnonymousClass0AH r7 = sendE2EMessageJob.A02;
                    int i2 = sendE2EMessageJob.retryCount;
                    int i3 = r9.A01;
                    if (i3 == 0) {
                        A06 = 0;
                    } else {
                        AnonymousClass01I r15 = sendE2EMessageJob.A01;
                        r15.A04();
                        A06 = sendE2EMessageJob.A06(r15.A02) + 1;
                    }
                    r7.A0B(r8, r9, r10, null, i2, A06);
                    if (i3 == -1002) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("sende2emessagejob/group cipher has invalid sender key");
                        A0S2.append(sendE2EMessageJob.A0B());
                        Log.w(A0S2.toString());
                        C001000o r45 = sendE2EMessageJob.A05;
                        String str3 = sendE2EMessageJob.jid;
                        AnonymousClass01I r16 = sendE2EMessageJob.A01;
                        r16.A04();
                        r45.A0S(new AnonymousClass0OE(str3, C001801b.A0A(r16.A02)));
                        sendE2EMessageJob.A08.A03(sendE2EMessageJob.A08.A01(r10));
                    } else if (!(i3 == 0 || i3 == -1008)) {
                        throw new AssertionError(AnonymousClass008.A0F("Error when calling signalCoordinator.encryptForGroup(); status=", i3));
                    }
                    return r9;
                }
                throw null;
            }
            throw null;
        } else if (!(!deviceJid.isPrimary()) || ((AbstractCollection) sendE2EMessageJob.A0A.A03(r4)).contains(deviceJid)) {
            UserJid of = UserJid.of(r4.A00);
            C02840Dr A092 = sendE2EMessageJob.A09(r4, deviceJid, sendE2EMessageJob.A0H);
            if (of == null) {
                of = deviceJid.userJid;
            }
            return sendE2EMessageJob.A07(deviceJid, sendE2EMessageJob.A08(of, A092), r8);
        } else {
            StringBuilder sb = new StringBuilder("sende2emessagejob/");
            sb.append(deviceJid);
            sb.append(" identity has changed, dropping the message");
            Log.w(sb.toString());
            return null;
        }
    }
}
